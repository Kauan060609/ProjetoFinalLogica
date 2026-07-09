# Sistema de Gestão de Manutenção de Equipamentos 🛠️
 
Projeto final da disciplina de Lógica de Programação. Um sistema de linha de comando em Java para gerenciar o cadastro de equipamentos, técnicos e ordens de manutenção de um setor industrial/técnico.
 
## 📋 Funcionalidades
 
O sistema é organizado em um menu principal com 4 módulos:
 
### 1. Equipamentos
- Cadastrar equipamento (código, nome, categoria, fabricante, modelo, setor instalado, data de instalação, status)
- Consultar por código
- Alterar informações
- Excluir equipamento
- Listar todos os equipamentos
### 2. Técnicos
- Cadastrar técnico (código, nome, matrícula, setor, telefone)
- Consultar técnico
- Alterar informações
- Excluir técnico
- Listar todos os técnicos
### 3. Manutenções
- Registrar manutenção (vinculada a um equipamento e a um técnico)
- Consultar manutenção
- Alterar situação (aberta/finalizada)
- Finalizar manutenção
- Listar todas as manutenções
### 4. Relatórios
- Total de equipamentos, técnicos e manutenções cadastrados
- Equipamentos ativos/inativos
- Manutenções abertas/finalizadas
- Manutenções por equipamento
## 🧱 Estrutura do projeto
 
```
ProjetoFinalLogica/
├── src/
│   ├── Main.java              # Menu principal e toda a lógica de interação
│   ├── model/
│   │   ├── Equipamento.java
│   │   ├── Tecnico.java
│   │   └── Manutencao.java
│   └── exception/
│       ├── CampoVazioException.java
│       ├── CodigoDuplicadoException.java
│       ├── CodigoNaoExisteException.java
│       ├── MatriculaInvalidaException.java
│       ├── SituacaoInvalidaException.java
│       ├── ManutencaoAbertaException.java
│       └── JaFinalizadaException.java
└── bin/                        # Arquivos .class compilados
```
 
## ⚙️ Conceitos aplicados
 
- **Programação Orientada a Objetos** (classes de modelo, encapsulamento)
- **Exceções customizadas** para validação de regras de negócio (campo vazio, código duplicado, matrícula inválida, manutenção já aberta/finalizada, etc.)
- **Coleções** (`ArrayList`) para armazenar os dados em memória
- **Menus interativos** via `Scanner` no console
## 🚀 Como executar
 
1. Clone o repositório:
```bash
   git clone https://github.com/Kauan060609/ProjetoFinalLogica.git
```
2. Compile os arquivos-fonte:
```bash
   javac -d bin -sourcepath src src/Main.java
```
3. Execute:
```bash
   java -cp bin Main
```
 
Ou simplesmente abra a pasta no VS Code (com a extensão Java) e rode `Main.java` direto pelo botão "Run".
 
## 🎯 Objetivo
 
Aplicar, em um projeto prático completo, os principais conceitos de lógica de programação e orientação a objetos vistos ao longo do curso: estruturas de repetição, condicionais, coleções, classes, encapsulamento e tratamento de exceções.
 
