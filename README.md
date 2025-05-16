# ✈️ Sistema de Reservas de Passagens Aéreas

![Java](https://img.shields.io/badge/Java-17%2B-blue?logo=openjdk)
![Status](https://img.shields.io/badge/Status-Concluído-success)
![Licença](https://img.shields.io/badge/Licença-MIT-green)

Projeto desenvolvido para o **Desafio Hackathon** da FATEC PG, orientado pelo professor Alessandro Ferreira.  
Sistema completo para gestão de reservas aéreas, com cadastro de clientes, aeroportos e voos.

---------------------------------------------------------------------------------------------------------------------

## 🚀 Funcionalidades Principais

- **Cadastro de Aeroportos**: Registre aeroportos com detalhes como código IATA e localização.
- **Gestão de Clientes**: Armazene informações de passageiros (nome, CPF, contato).
- **Controle de Voos**: Defina rotas, horários e status de voos.
- **Sistema de Reservas**: Realize reservas de passagens vinculadas a clientes e voos.
- **Persistência de Dados**: Armazenamento em arquivo `.txt` para simular um banco de dados simples.

---------------------------------------------------------------------------------------------------------------------

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Java 17+
- **Ferramentas**: 
  - IDE: IntelliJ IDEA ou Eclipse
  - Controle de Versão: Git
- **Padrão de Projeto**: Orientação a Objetos (POO)

---------------------------------------------------------------------------------------------------------------------

## 📂 Estrutura do Projeto
PassagemAerea/
└── src/
└── passagem/
└── cadastros/
├── Aeroporto.java # Classe para modelar aeroportos
├── Cliente.java # Classe para representar clientes
├── Reserva.java # Lógica de reservas de passagens
├── Voos.java # Definição de voos e rotas
├── Main.java # Ponto de entrada do sistema
└── vco.txt # Arquivo de dados persistidos

---------------------------------------------------------------------------------------------------------------------

## 👥 Equipe de Desenvolvimento
- **Evily Maria**
- **Ellen**
- **Gabriela**
- **Anna Isabelle**

*Desenvolvido durante o Hackathon da FATEC PG - 2023.*

---------------------------------------------------------------------------------------------------------------------

## ⚡ Como Executar

1. **Pré-requisitos**:
   - JDK 17+ instalado.
   - Git para clonar o repositório.

2. **Clonar e Compilar**:
   ```bash
   git clone https://github.com/illY0701/Sistema_Aereo.git
   cd Sistema_Aereo/PassagemAerea/src/
   javac passagem/cadastros/*.java
