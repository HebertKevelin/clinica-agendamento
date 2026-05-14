package com.clinica.service;

import com.clinica.model.Consulta;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NotificacaoService {

    public long calcularDiasRestantes(Consulta consulta) {
        LocalDate hoje = LocalDate.now();
        LocalDate dataConsulta = consulta.getData();
        return ChronoUnit.DAYS.between(hoje, dataConsulta);
    }

    public boolean deveNotificar(Consulta consulta) {
        long dias = calcularDiasRestantes(consulta);
        return dias == 15 || dias == 7;
    }

    public String gerarMensagem(Consulta consulta) {
        long dias = calcularDiasRestantes(consulta);
        String nome = consulta.getPaciente().getNome();

        if (dias == 15) {
            return "Olá, " + nome + "! Sua consulta está marcada para daqui a 15 dias. Deseja confirmar? (sim/não)";
        } else if (dias == 7) {
            return "Olá, " + nome + "! Sua consulta é em 7 dias. Por favor confirme sua presença. (sim/não)";
        }
        return null;
    }
}