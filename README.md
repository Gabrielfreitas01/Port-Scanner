# Port Scanner

Um scanner de portas desenvolvido em **Java**, com o objetivo de identificar portas abertas em um determinado endereço IP ou hostname.

O projeto busca explorar conceitos fundamentais de redes de computadores e programação, oferecendo uma aplicação simples para compreender como funciona o processo de verificação de portas em dispositivos conectados a uma rede.

## Sobre o projeto

O **Port Scanner** é uma ferramenta de linha de comando que permite ao usuário informar um endereço de destino e definir um intervalo de portas para análise.

A aplicação realiza a verificação das portas especificadas e apresenta os resultados encontrados, permitindo identificar quais estão disponíveis para conexão.

O projeto também tem como objetivo aplicar conceitos de engenharia de software, organização de código e comunicação em redes.

## Funcionalidades

- **Definição do destino:** permite informar um endereço IP ou hostname para análise.
- **Intervalo personalizado:** possibilita definir a porta inicial e final da verificação.
- **Identificação de portas abertas:** verifica quais portas estão aceitando conexões.
- **Interface interativa:** disponibiliza uma experiência de utilização por meio do terminal.
- **Organização modular:** separa as responsabilidades da aplicação em componentes distintos.

## Tecnologias utilizadas

- **Java:** linguagem utilizada no desenvolvimento da aplicação.
- **Programação orientada a objetos (POO):** organização e estruturação dos componentes.
- **Redes de computadores:** conceitos de comunicação e conexões TCP/IP.

## Estrutura do projeto

O projeto está organizado em uma arquitetura de camadas, sendo dividida em três pacotes principais, cada um responsável por uma parte da aplicação:

| Pacote | Responsabilidade |
|---|---|
| `ui` | Gerencia a interação com o usuário por meio do terminal. |
| `model` | Organiza os dados e elementos utilizados pela aplicação. |
| `scanner` | Concentra a lógica responsável pela verificação das portas. |

Essa divisão busca manter as responsabilidades separadas, facilitando a manutenção, a compreensão e a evolução do código.

## Como utilizar

Ao iniciar a aplicação, o usuário é apresentado a uma interface interativa no terminal.

O processo de utilização consiste em:

1. Informar o endereço IP ou hostname que deseja analisar.
2. Definir a porta inicial do intervalo.
3. Definir a porta final do intervalo.
4. Aguardar a execução da verificação.
5. Consultar os resultados apresentados no terminal.

## Uso responsável

Esta ferramenta possui finalidade educacional e deve ser utilizada exclusivamente em ambientes próprios, laboratórios ou sistemas para os quais exista autorização explícita para realização de testes.

O usuário é responsável por garantir que qualquer verificação seja realizada dentro de um escopo autorizado.
