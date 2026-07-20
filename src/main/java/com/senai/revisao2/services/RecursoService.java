package com.senai.revisao2.services;

import com.senai.revisao2.dtos.RecursoDto;
import com.senai.revisao2.entities.RecursoEntity;
import com.senai.revisao2.repositories.RecursoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecursoService {

    private final RecursoRepository repository;

    public RecursoService(RecursoRepository repository) {
        this.repository = repository;
    }

    public List<RecursoDto> obterListaRecursos(){

        List<RecursoDto> listaDto = new ArrayList<>();
        List<RecursoEntity> listaRecurso = repository.findAll();

        for (RecursoEntity recursoEntity : listaRecurso){
            listaDto.add(converterEntityParaDto(recursoEntity));
        }

        return listaDto;
    }

    public void recursoInserir(RecursoDto recursoDto){
        repository.save(converterDtoParaEntity(recursoDto));
    }

    private RecursoDto converterEntityParaDto(RecursoEntity recurso){
        RecursoDto recursoDto = new RecursoDto();
        recursoDto.setId(recurso.getId());
        recursoDto.setDescricao(recurso.getDescricao());
        recursoDto.setTipo(recurso.getTipo());
        recursoDto.setDiasSemanaDisponivel(recurso.getDiasSemanaDisponivel());
        recursoDto.setDataInicialAgendamento(recurso.getDataInicialAgendamento());
        recursoDto.setDataFinalAgendamento(recurso.getDataFinalAgendamento());
        recursoDto.setHoraInicialAgendamento(recurso.getHoraInicialAgendamento());
        recursoDto.setHoraFinalAgendamento(recurso.getHoraFinalAgendamento());
        return recursoDto;
    }

    private RecursoEntity converterDtoParaEntity(RecursoDto recursoDto){
        RecursoEntity recurso = new RecursoEntity();
        recurso.setId(recursoDto.getId());
        recurso.setDescricao(recursoDto.getDescricao());
        recurso.setTipo(recursoDto.getTipo());
        recurso.setDiasSemanaDisponivel(recursoDto.getDiasSemanaDisponivel());
        recurso.setDataInicialAgendamento(recursoDto.getDataInicialAgendamento());
        recurso.setDataFinalAgendamento(recursoDto.getDataFinalAgendamento());
        recurso.setHoraInicialAgendamento(recursoDto.getHoraInicialAgendamento());
        recurso.setHoraFinalAgendamento(recursoDto.getHoraFinalAgendamento());
        return recurso;
    }
}
