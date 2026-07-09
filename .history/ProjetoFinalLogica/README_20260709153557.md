# Projeto Final Lógica — Sistema de Gerenciamento de Manutenção de Equipamentos

Sistema de console (CLI) desenvolvido em **Java**, aplicado como projeto final de lógica de programação. O sistema permite gerenciar o cadastro de **equipamentos**, **técnicos** e **manutenções** de uma empresa, com validações de dados e tratamento de exceções personalizadas.

## Funcionalidades

O sistema é organizado em um menu principal com 4 módulos:

### 1. Equipamentos
- Cadastrar equipamento (código, nome, categoria, fabricante, modelo, setor instalado, data de instalação e status)
- Consultar equipamento por código
- Alterar informações de um equipamento
- Excluir equipamento (bloqueado se estiver em manutenção)
- Listar todos os equipamentos cadastrados

### 2. Técnicos
- Cadastrar técnico (código, nome, matrícula, setor e telefone)
- Consultar técnico por código
- Alterar informações de um técnico
- Excluir técnico (bloqueado se estiver responsável por uma manutenção em aberto)
- Listar todos os técnicos cadastrados

### 3. Manutenções
- Registrar manutenção, vinculando um equipamento e um técnico responsável
- Consultar manutenção por código (exibindo também o equipamento e o técnico relacionados)
- Alterar a situação de uma manutenção (Aberta, Em andamento ou Finalizada)
- Finalizar manutenção, registrando a data de encerramento
- Listar todas as manutenções cadastradas

### 4. Relatórios
- Total de equipamentos e técnicos cadastrados
- Quantidade de equipamentos por status (Operando, Inativo, Em andamento)
- Quantidade de manutenções por situação (Abertas, Finalizadas)
- Quantidade de manutenções registradas por equipamento

## Estrutura do projeto

```
ProjetoFinalLogica/
├── src/
│   ├── Main.java                # Classe principal, contém o menu e o fluxo do programa
│   ├── model/
│   │   ├── Equipamento.java     # Modelo de equipamento
│   │   ├── Tecnico.java         # Modelo de técnico
│   │   └── Manutencao.java      # Modelo de manutenção
│   └── exception/
│       ├── CampoVazioException.java
│       ├── CodigoDuplicadoException.java
│       ├── CodigoNaoExisteException.java
│       ├── JaFinalizadaException.java
│       ├── ManutencaoAbertaException.java
│       ├── MatriculaInvalidaException.java
│       └── SituacaoInvalidaException.java
└── README.md
```

## Regras de negócio e validações

O projeto foi construído com foco em **tratamento de exceções personalizadas**, garantindo a integridade dos dados:

| Exceção | Quando ocorre |
|---|---|
| `CampoVazioException` | Um campo obrigatório é deixado em branco/nulo no cadastro |
| `CodigoDuplicadoException` | Tentativa de cadastrar um código já existente |
| `CodigoNaoExisteException` | Busca, alteração ou exclusão de um código não cadastrado |
| `SituacaoInvalidaException` | Status/situação informado não está entre os valores aceitos |
| `MatriculaInvalidaException` | Matrícula de técnico inválida ou duplicada |
| `ManutencaoAbertaException` | Tentativa de excluir um equipamento ou técnico vinculado a uma manutenção em aberto |
| `JaFinalizadaException` | Tentativa de finalizar uma manutenção que já foi finalizada |

Além disso:
- O **status de um equipamento** só pode ser: `Operando`, `Em Manutenção` ou `Inativo`.
- A **situação de uma manutenção** só pode ser: `Aberta`, `Em andamento` ou `Finalizada`.
- Ao abrir uma manutenção, o equipamento relacionado passa automaticamente para `Em Manutenção` e o técnico é marcado como responsável.
- Ao finalizar uma manutenção, o equipamento volta para `Operando` e o técnico é liberado.

## Tecnologias utilizadas

- **Java** (sem dependências externas)
- Estruturas de dados: `ArrayList`
- Programação orientada a objetos (classes de modelo, encapsulamento, exceções customizadas)
- Streams (`stream().anyMatch(...)`) para validação de existência de registros

## Como executar

### Pré-requisitos
- JDK instalado (Java 8 ou superior)

### Compilando e executando via terminal

```bash
# a partir da pasta ProjetoFinalLogica
cd src
javac -d ../bin Main.java model/*.java exception/*.java
java -cp ../bin Main
```

### Executando pelo VS Code
1. Abra a pasta `ProjetoFinalLogica` no VS Code com a extensão **Extension Pack for Java** instalada.
2. Abra o arquivo `src/Main.java`.
3. Clique em **Run** (ou `F5`) para executar o programa.

## Uso

Ao iniciar, o programa exibe o menu principal:

```
===MENU===
1-Equipamentos
2-Técnicos
3-Manutenções
4-Relatórios
5-Sair
```

Basta digitar o número da opção desejada e seguir as instruções exibidas no console para cadastrar, consultar, alterar, excluir ou listar os registros.

## Autor

Projeto desenvolvido como trabalho final da disciplina de Lógica de Programação.