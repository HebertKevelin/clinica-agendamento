# Clínica Agendamento

Esse projeto nasceu de um desafio pessoal: construir um sistema real do zero em 7 dias, sem pular etapas e sem depender de frameworks prontos. Só Java puro, lógica e vontade de aprender.

## O que ele faz

O sistema verifica as consultas agendadas e notifica automaticamente os pacientes quando faltam 15 ou 7 dias para a consulta. Durante a notificação, ele pergunta se o paciente confirma a presença e atualiza o status na hora.

No final exibe um resumo completo de todas as consultas com as cores indicando cada situação.

## Como ficou na prática

==========================================
SISTEMA DE AGENDAMENTO - CLÍNICA

Olá, João! Sua consulta está marcada para daqui a 15 dias. Deseja confirmar? (sim/não)
Resposta: sim
✔ Consulta confirmada com sucesso!
==========================================
RESUMO DAS CONSULTAS
Paciente: João Silva           | Data: 28/05/2026 | Dias:  15 | Status: CONFIRMADO
Paciente: Maria Souza          | Data: 20/05/2026 | Dias:   7 | Status: CANCELADO
Paciente: Carlos Lima          | Data: 16/05/2026 | Dias:   3 | Status: PENDENTE

## O que aprendi construindo isso

Configurar o ambiente do zero no Windows não é trivial. Maven, PATH, JDK — cada um tem seu lugar certo e quando um está errado, nada funciona. Aprendi que entender o erro é mais valioso do que só copiar o comando certo.

A arquitetura MVC fez sentido na prática. Separar o que é dado, o que é regra e o que é controle deixou o código muito mais fácil de entender e de mexer.

## Tecnologias

- Java 21
- Maven 3.9.15
- IntelliJ IDEA 2026
- Git e GitHub

## Estrutura do projeto
com.clinica
├── Main.java
├── controller
│   └── AgendamentoController.java
├── model
│   ├── Paciente.java
│   └── Consulta.java
└── service
├── NotificacaoService.java
└── ConfirmacaoService.java