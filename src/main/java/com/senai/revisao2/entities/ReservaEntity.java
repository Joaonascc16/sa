package com.senai.revisao2.entities;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Entity
@Table(name = "reserva")
public class ReservaEntity {

    private Long id;

    @ManyToOne
    @JoinColumn(name = "colaborador_id")
    private UsuarioEntity colaborador;

    @OneToOne
    @JoinColumn(name = "recurso_id")
    private RecursoEntity recurso;

    private LocalDate dataReserva;

    private LocalDate horaInicial;

    private LocalDate horaFinal;

    private LocalDate dataCancelamento;

    private String observacao;

    public RecursoEntity getRecurso() {
        return recurso;
    }

    public void setRecurso(RecursoEntity recurso) {
        this.recurso = recurso;
    }

    public UsuarioEntity getColaborador() {
        return colaborador;
    }

    public void setColaborador(UsuarioEntity colaborador) {
        this.colaborador = colaborador;
    }


}
