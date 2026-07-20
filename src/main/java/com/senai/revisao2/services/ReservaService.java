package com.senai.revisao2.services;

import com.senai.revisao2.dtos.ReservaDto;
import com.senai.revisao2.entities.ReservaEntity;
import com.senai.revisao2.repositories.ReservaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReservaService {

    private final ReservaRepository repository;

    public ReservaService(ReservaRepository repository) {
        this.repository = repository;
    }

    public List<ReservaDto> obterListaReservas(){

        List<ReservaDto> listaDto = new ArrayList<>();
        List<ReservaEntity> listaReserva = repository.findAll();

        for (ReservaEntity reservaEntity : listaReserva){
            listaDto.add(converterEntityParaDto(reservaEntity));
        }

        return listaDto;
    }

    public void reservaInserir(ReservaDto reservaDto){
        repository.save(converterDtoParaEntity(reservaDto));
    }

    public ReservaDto obterReservaPorId(Long id){
        return repository.findById(id)
                .map(this::converterEntityParaDto)
                .orElse(new ReservaDto());
    }

    public void reservaCancelar(Long id){
        repository.findById(id).ifPresent(reserva -> {
            reserva.setDataCancelamento(LocalDate.now());
            repository.save(reserva);
        });
    }

    private ReservaDto converterEntityParaDto(ReservaEntity reserva){
        ReservaDto reservaDto = new ReservaDto();
        reservaDto.setId(reserva.getId());
        reservaDto.setUsuario(reserva.getColaborador());
        reservaDto.setRecurso(reserva.getRecurso());
        reservaDto.setDataReserva(reserva.getDataReserva());
        reservaDto.setHoraInicial(reserva.getHoraInicial());
        reservaDto.setHoraFinal(reserva.getHoraFinal());
        reservaDto.setDataCancelamento(reserva.getDataCancelamento());
        reservaDto.setObservacao(reserva.getObservacao());
        return reservaDto;
    }

    private ReservaEntity converterDtoParaEntity(ReservaDto reservaDto){
        ReservaEntity reserva = new ReservaEntity();
        reserva.setId(reservaDto.getId());
        reserva.setColaborador(reservaDto.getUsuario());
        reserva.setRecurso(reservaDto.getRecurso());
        reserva.setDataReserva(reservaDto.getDataReserva());
        reserva.setHoraInicial(reservaDto.getHoraInicial());
        reserva.setHoraFinal(reservaDto.getHoraFinal());
        reserva.setDataCancelamento(reservaDto.getDataCancelamento());
        reserva.setObservacao(reservaDto.getObservacao());
        return reserva;
    }
}
