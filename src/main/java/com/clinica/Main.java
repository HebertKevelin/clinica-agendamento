package com.clinica;

import com.clinica.controller.AgendamentoController;
import com.clinica.model.Consulta;
import com.clinica.model.Paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Criando pacientes
        Paciente p1 = new Paciente(1, "João Silva", "99999-1111");
        Paciente p2 = new Paciente(2, "Maria Souza", "99999-2222");
        Paciente p3 = new Paciente(3, "Carlos Lima", "99999-3333");
        Paciente p4 = new Paciente(4, "Ana Costa", "99999-4444");
        Paciente p5 = new Paciente(5, "Pedro Alves", "99999-5555");

        // Criando consultas com datas relativas a hoje
        List<Consulta> consultas = new ArrayList<>();
        consultas.add(new Consulta(1, p1, LocalDate.now().plusDays(15)));
        consultas.add(new Consulta(2, p2, LocalDate.now().plusDays(7)));
        consultas.add(new Consulta(3, p3, LocalDate.now().plusDays(3)));
        consultas.add(new Consulta(4, p4, LocalDate.now().plusDays(30)));
        consultas.add(new Consulta(5, p5, LocalDate.now().plusDays(15)));

        // Iniciando o controller
        AgendamentoController controller = new AgendamentoController();
        controller.processarConsultas(consultas);
    }
}