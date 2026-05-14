package com.clinica.service;

import com.clinica.model.Consulta;
import java.util.Scanner;

public class ConfirmacaoService {

    private Scanner scanner = new Scanner(System.in);
    private NotificacaoService notificacaoService = new NotificacaoService();

    public void processarConfirmacao(Consulta consulta) {
        if (!notificacaoService.deveNotificar(consulta)) {
            return;
        }

        String mensagem = notificacaoService.gerarMensagem(consulta);
        System.out.println("\n------------------------------------------");
        System.out.println(mensagem);
        System.out.print("Resposta: ");

        String resposta = lerResposta();

        if (resposta.equals("sim")) {
            consulta.setStatus("CONFIRMADO");
            System.out.println("✔ Consulta confirmada com sucesso!");
        } else {
            consulta.setStatus("CANCELADO");
            System.out.println("✘ Consulta cancelada.");
        }
        System.out.println("------------------------------------------");
    }

    private String lerResposta() {
        String resposta = "";
        while (!resposta.equals("sim") && !resposta.equals("não") && !resposta.equals("nao")) {
            resposta = scanner.nextLine().trim().toLowerCase();
            if (!resposta.equals("sim") && !resposta.equals("não") && !resposta.equals("nao")) {
                System.out.print("Por favor digite 'sim' ou 'não': ");
            }
        }
        return resposta.equals("sim") ? "sim" : "não";
    }
}