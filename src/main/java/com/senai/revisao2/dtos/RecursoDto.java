package com.senai.revisao2.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

public class RecursoDto {

    private Long id;

    private String descricao;

    private String tipo;

    private String diasSemanaDisponivel;

    private LocalDate dataInicialAgendamento;

    private LocalDate dataFinalAgendamento;

    private LocalTime horaInicialAgendamento;

    private LocalTime horaFinalAgendamento;

    public RecursoDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDiasSemanaDisponivel() {
        return diasSemanaDisponivel;
    }

    public void setDiasSemanaDisponivel(String diasSemanaDisponivel) {
        this.diasSemanaDisponivel = diasSemanaDisponivel;
    }

    public LocalDate getDataInicialAgendamento() {
        return dataInicialAgendamento;
    }

    public void setDataInicialAgendamento(LocalDate dataInicialAgendamento) {
        this.dataInicialAgendamento = dataInicialAgendamento;
    }

    public LocalDate getDataFinalAgendamento() {
        return dataFinalAgendamento;
    }

    public void setDataFinalAgendamento(LocalDate dataFinalAgendamento) {
        this.dataFinalAgendamento = dataFinalAgendamento;
    }

    public LocalTime getHoraInicialAgendamento() {
        return horaInicialAgendamento;
    }

    public void setHoraInicialAgendamento(LocalTime horaInicialAgendamento) {
        this.horaInicialAgendamento = horaInicialAgendamento;
    }

    public LocalTime getHoraFinalAgendamento() {
        return horaFinalAgendamento;
    }

    public void setHoraFinalAgendamento(LocalTime horaFinalAgendamento) {
        this.horaFinalAgendamento = horaFinalAgendamento;
    }
}
