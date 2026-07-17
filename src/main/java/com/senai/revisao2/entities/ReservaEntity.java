package com.senai.revisao2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "reserva")
public class ReservaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "colaborador_id")
    private UsuarioEntity colaborador;

    @ManyToOne
    @JoinColumn(name = "recurso_id")
    private RecursoEntity recurso;

    private LocalDate dataReserva;

    private LocalDate horaInicial;

    private LocalDate horaFinal;

    private LocalDate dataCancelamento;

    private String observacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UsuarioEntity getColaborador() {
        return colaborador;
    }

    public void setColaborador(UsuarioEntity colaborador) {
        this.colaborador = colaborador;
    }

    public RecursoEntity getRecurso() {
        return recurso;
    }

    public void setRecurso(RecursoEntity recurso) {
        this.recurso = recurso;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public LocalDate getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(LocalDate horaInicial) {
        this.horaInicial = horaInicial;
    }

    public LocalDate getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(LocalDate horaFinal) {
        this.horaFinal = horaFinal;
    }

    public LocalDate getDataCancelamento() {
        return dataCancelamento;
    }

    public void setDataCancelamento(LocalDate dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
