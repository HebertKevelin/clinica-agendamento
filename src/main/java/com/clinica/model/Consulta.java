package com.clinica.model;

import java.time.LocalDate;

public class Consulta {

    private int id;
    private Paciente paciente;
    private LocalDate data;
    private String status;

    public Consulta(int id, Paciente paciente, LocalDate data) {
        this.id = id;
        this.paciente = paciente;
        this.data = data;
        this.status = "PENDENTE";
    }

    public int getId() { return id; }
    public Paciente getPaciente() { return paciente; }
    public LocalDate getData() { return data; }
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}