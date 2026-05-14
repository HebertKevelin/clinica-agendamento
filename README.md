\# Clinica Agendamento



Meu primeiro projeto em Java. Construido do zero em 7 dias seguindo um roadmap de estudos.



\## Contexto e Objetivos



Escolhi Java porque quero entender como sistemas reais sao construidos por dentro. O objetivo foi sair do zero e chegar em algo funcionando e publicado no GitHub.



\## Fontes Utilizadas



\- Documentacao oficial do Java: https://docs.oracle.com/en/java/

\- Guia do Maven: https://maven.apache.org/guides/

\- Documentacao do Git: https://git-scm.com/doc



\## Engenharia de Prompts e Dificuldades



Perguntas que fiz durante o estudo e o que cada uma me ensinou:



\*\*Como configurar o Maven no Windows?\*\*

Aprendi que instalar e configurar sao coisas diferentes. O Maven estava instalado mas o Windows nao o encontrava porque o PATH apontava para o lugar errado.



\*\*O que e encapsulamento na pratica?\*\*

Aprendi que private nao e so uma palavra. E uma decisao de design que protege os dados do objeto e evita que outras partes do codigo alterem algo acidentalmente.



\*\*Como funciona o Git quando da erro no push?\*\*

Aprendi que o Git precisa saber quem voce e antes de qualquer coisa. Configurar user.name e user.email e o primeiro passo obrigatorio.



\## O que o sistema faz



Avisa os pacientes quando faltam 15 ou 7 dias para a consulta e pergunta se confirmam a presenca. No final exibe um resumo com o status de cada consulta.



\## Glossario



\*\*MVC\*\* — Organiza o codigo em tres camadas: Model cuida dos dados, Controller coordena as acoes e View exibe o resultado. Cada camada tem sua responsabilidade.



\*\*Encapsulamento\*\* — Tecnica de proteger os dados de uma classe usando private. O acesso so e permitido atraves de metodos publicos chamados getters e setters.



\*\*LocalDate\*\* — Classe do Java para trabalhar com datas de forma segura e precisa.



\*\*Maven\*\* — Ferramenta que organiza o projeto atraves do arquivo POM, que contem todas as configuracoes e dependencias necessarias para construir o software.



\*\*Git\*\* — Sistema que registra cada mudanca feita no codigo ao longo do tempo.



\*\*PATH\*\* — Lista que o Windows consulta toda vez que um comando e digitado. Se o programa nao estiver nessa lista o sistema nao o encontra.



\## Prompts Reutilizaveis



\- "Explica o que e \[conceito] em Java com exemplo pratico"

\- "Porque esta dando esse erro: \[colar o erro]"

\- "Revisa esse codigo: \[colar o codigo]"

\- "Qual a diferenca entre \[conceito A] e \[conceito B] em Java?"



\## Como rodar



```bash

git clone https://github.com/HebertKevelin/clinica-agendamento.git

cd clinica-agendamento

mvn compile

mvn exec:java -Dexec.mainClass="com.clinica.Main"

```



\## Estrutura do projeto



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



\## Tecnologias



\- Java 21

\- Maven 3.9.15

\- IntelliJ IDEA 2026

\- Git e GitHub



\---



Desenvolvido por Heber Kevelin — primeiro projeto, muitos erros, muito aprendizado.

