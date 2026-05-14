package com.clinica.controller;

import com.clinica.model.Consulta;
import com.clinica.service.ConfirmacaoService;
import com.clinica.service.NotificacaoService;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class AgendamentoController {

    private NotificacaoService notificacaoService = new NotificacaoService();
    private ConfirmacaoService confirmacaoService = new ConfirmacaoService();

    public void processarConsultas(List<Consulta> consultas) {
        System.out.println("==========================================");
        System.out.println("   SISTEMA DE AGENDAMENTO - CLÍNICA      ");
        System.out.println("==========================================");

        boolean algumaNoficacao = false;

        for (Consulta consulta : consultas) {
            if (notificacaoService.deveNotificar(consulta)) {
                algumaNoficacao = true;
                confirmacaoService.processarConfirmacao(consulta);
            }
        }

        if (!algumaNoficacao) {
            System.out.println("\nNenhuma consulta requer notificação hoje.");
        }

        System.out.println("\n==========================================");
        System.out.println("         RESUMO DAS CONSULTAS            ");
        System.out.println("==========================================");

        for (Consulta consulta : consultas) {
            long dias = notificacaoService.calcularDiasRestantes(consulta);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            String statusColorido;
            switch (consulta.getStatus()) {
                case "CONFIRMADO" -> statusColorido = "\u001B[32mCONFIRMADO\u001B[0m";
                case "CANCELADO"  -> statusColorido = "\u001B[31mCANCELADO\u001B[0m";
                default           -> statusColorido = "\u001B[33mPENDENTE\u001B[0m";
            }

            System.out.printf("Paciente: %-20s | Data: %s | Dias: %3d | Status: %s%n",
                    consulta.getPaciente().getNome(),
                    consulta.getData().format(formatter),
                    dias,
                    statusColorido);
        }
    }
}