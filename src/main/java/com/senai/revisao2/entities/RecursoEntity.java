package com.senai.revisao2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "recurso")
public class RecursoEntity {

    private Long id;

    private String descricao;

    private String tipo;

    private String diasSemanaDisponivel;

    private LocalDate dataInicialAgendamento;

    private LocalDate dataFinalAgendamento;

    private LocalDate horaInicialAgendamento;

    private LocalDate horaFinalAgendamento;

    public RecursoEntity() {
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

    public LocalDate getHoraInicialAgendamento() {
        return horaInicialAgendamento;
    }

    public void setHoraInicialAgendamento(LocalDate horaInicialAgendamento) {
        this.horaInicialAgendamento = horaInicialAgendamento;
    }

    public LocalDate getHoraFinalAgendamento() {
        return horaFinalAgendamento;
    }

    public void setHoraFinalAgendamento(LocalDate horaFinalAgendamento) {
        this.horaFinalAgendamento = horaFinalAgendamento;
    }
}
