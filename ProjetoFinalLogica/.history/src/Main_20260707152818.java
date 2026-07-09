import java.util.ArrayList;
import java.util.Scanner;

import exception.CodigoDuplicadoException;
import exception.CodigoNaoExisteException;
import exception.SituacaoInvalidaException;
import model.Equipamento;
import model.Manutencao;
import model.Tecnico;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        ArrayList <Equipamento> listaEquipamentos = new ArrayList<>();
        ArrayList <Tecnico> listaTecnicos = new ArrayList<>();
        ArrayList <Manutencao> listaManutencaos = new ArrayList<>();
        int escolhaInicial = 0;

        while(escolhaInicial != 5){

            System.out.println("===MENU===");
            System.out.println("1-Equipamentos\n2-Técnicos\n3-Manutenções\n4-Relatórios\n5-Sair");
            escolhaInicial = sc.nextInt();
            sc.nextLine();

            switch (escolhaInicial) {
                case 1:
                    int escolhaEquipamento = 0;

                    while(escolhaEquipamento != 6){
                    System.out.println("===MENU EQUIPAMENTOS===");
                    System.out.println("1-Cadastrar Equipamento\n2-Consultar por Código\n3-Alterar Informações\n4-Excluir Equipamento\n5-Listar Equipamentos\n6-Sair");
                    escolhaEquipamento = sc.nextInt();
                    sc.nextLine();

                    switch (escolhaEquipamento) {

                       
                        case 1:
                            try{
                            System.out.println("Código:  ");
                            int codigo = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Nome: ");
                            String nome = sc.nextLine();
                            System.out.println("Categoria: ");
                            String categoria = sc.nextLine();
                            System.out.println("Fabricante: ");
                            String fabricante = sc.nextLine();
                            System.out.println("Modelo:  ");
                            String modelo = sc.nextLine();
                            System.out.println("Setor instalado: ");
                            String setorInstalado = sc.nextLine();
                            System.out.println("Data Instalação: ");
                            String dataInstalacao = sc.nextLine();
                            System.out.println("Status(Operando, Em manutenção ou Inativo): ");
                            String status = sc.nextLine();

                            Equipamento e1 = new Equipamento(codigo, nome, categoria, fabricante, modelo, setorInstalado, dataInstalacao, status, listaEquipamentos);
                            listaEquipamentos.add(e1);
                            System.out.println("Cadastro Concluído!");
                            }catch(CodigoDuplicadoException erro){
                                System.out.println("Erro - " + erro.getMessage());
                            }catch(SituacaoInvalidaException erro){
                                System.out.println("Erro - " + erro.getMessage());
                            }
                            break;

                        case 2:
                            try{
                            System.out.println("Código Buscado: ");
                            int codigoProcurado = sc.nextInt();
                            sc.nextLine();

                            if(listaEquipamentos.stream().anyMatch(e -> e.getCodigo() == codigoProcurado) == true){  
                            for(Equipamento e : listaEquipamentos){
                                if(codigoProcurado == e.getCodigo()){
                                    e.mostrarEquipamento();
                                }
                            }
                        }else{
                            throw new CodigoNaoExisteException("O código não existe na base de dados!");
                        }
                    }catch(CodigoNaoExisteException erro){
                        System.out.println("Erro - " + erro.getMessage());
                    }

                            break;

                        case 3:
                            try{
                            System.out.println("Código para alterar: ");
                            int codigoAlterar = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Nome: ");
                            String nome = sc.nextLine();
                            System.out.println("Categoria: ");
                            String categoria = sc.nextLine();
                            System.out.println("Fabricante: ");
                            String fabricante = sc.nextLine();
                            System.out.println("Modelo:  ");
                            String modelo = sc.nextLine();
                            System.out.println("Setor instalado: ");
                            String setorInstalado = sc.nextLine();
                            System.out.println("Data Instalação: ");
                            String dataInstalacao = sc.nextLine();
                            System.out.println("Status(Operando, Em manutenção ou Inativo): ");
                            String status = sc.nextLine();

                            if(listaEquipamentos.stream().anyMatch(e -> e.getCodigo() == codigoAlterar) == false){
                                throw new CodigoNaoExisteException();
                            }else{
                                for(Equipamento e : listaEquipamentos){
                                    if(e.getCodigo() == codigoAlterar){
                                        e.setNome(nome);
                                        e.setCategoria(categoria);
                                        e.setFabricante(fabricante);
                                        e.setModelo(modelo);
                                        e.setSetorInstalado(setorInstalado);
                                        e.setDataInstalacao(dataInstalacao);
                                        e.setStatus(status);
                                        System.out.println("Equipamento Atualizado Com Sucesso!");
                                    }
                                }
                            
                            }
                        }catch(CodigoNaoExisteException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }catch(SituacaoInvalidaException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }
                            break;
                        
                        case 4:
                            try{
                            System.out.println("Digite o código do equipamento que deseja remover: ");
                            int codigoRemover = sc.nextInt();
                            sc.nextLine();
                            if(listaEquipamentos.stream().anyMatch(e -> e.getCodigo() == codigoRemover) == true){
                                listaEquipamentos.removeIf(e -> e.getCodigo() == codigoRemover);
                            }else{
                                throw new CodigoNaoExisteException("O código não está cadastrado na base de dados!");
                            }
                            
                        }catch(CodigoNaoExisteException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }
                            break;

                        case 5:
                            int contador = 0;
                            for(Equipamento e : listaEquipamentos){
                                contador++;
                                System.out.println("===Equipamento " + contador + "===");
                                e.mostrarEquipamento();
                            }
                            break;

                        case 6:
                            System.out.println("Saindo..");
                            break;
                    
                        default:
                            System.out.println("Escolha Inválida!");
                            break;
                    }
                }
                    break;
                    
                case 2:
                    int escolhaTecnico = 0;

                    while ((escolhaTecnico != 6)) {
                        
                    System.out.println("===MENU TÉCNICOS===");
                    System.out.println("1-Cadastrar Técnico\n2-Consultar Técnico\n3-Alterar informações\n4-Excluir Técnico\n5-Listar Técnicos\n6-Sair");
                    escolhaTecnico = sc.nextInt();
                    sc.nextLine();

                    switch (escolhaTecnico) {
                        case 1:
                            try{
                            System.out.println("Código: ");
                            int codigo = sc.nextInt();
                            System.out.println("Nome: ");
                            String nome = sc.nextLine();
                            System.out.println("Matrícula: ");
                            int matricula = sc.nextInt();
                            System.out.println("Setor: ");
                            String setor = sc.nextLine();
                            System.out.println("Telefone: ");
                            String telefone = sc.nextLine();
                            Tecnico t1 = new Tecnico(codigo, nome, matricula, setor, telefone, listaTecnicos);
                            listaTecnicos.add(t1);
                            System.out.println("Cadastro Concluído!");
                            }catch(CodigoDuplicadoException erro){
                                System.out.println("Erro - " + erro.getMessage());
                            }
                            
                            break;

                        case 2:

                        try{
                            System.out.println("Código consultar: ");
                            int codigoConsultar = sc.nextInt();
                            sc.nextLine();
                            
                            if(listaTecnicos.stream().anyMatch(t -> t.getCodigo() == codigoConsultar) == true){
                            for(Tecnico t : listaTecnicos){
                                if(codigoConsultar == t.getCodigo()){
                                    t.mostrarTecnico();
                                }
                            }
                        }else{
                            throw new CodigoNaoExisteException("O código não existe na base de dados!");
                        }
                    }catch(CodigoNaoExisteException erro){
                        System.out.println("Erro - " + erro.getMessage());
                    }
                            break;

                        case 3:
                        try{
                            System.out.println("Digite o código do Técnico que desejar alterar as informações: ");
                            int codigoAlterar = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Código: ");
                            int codigo = sc.nextInt();
                            System.out.println("Nome: ");
                            String nome = sc.nextLine();
                            System.out.println("Matrícula: ");
                            int matricula = sc.nextInt();
                            System.out.println("Setor: ");
                            String setor = sc.nextLine();
                            System.out.println("Telefone: ");
                            String telefone = sc.nextLine();

                            if(listaTecnicos.stream().anyMatch(t -> t.getCodigo() == codigoAlterar) == true){
                            for(Tecnico t : listaTecnicos){
                                if(t.getCodigo() == codigoAlterar){
                                    t.setCodigo(codigo, listaTecnicos);
                                    t.setNome(nome);
                                    t.setMatricula(matricula);
                                    t.setSetor(setor);
                                    t.setTelefone(telefone);
                                }
                            }
                            
                            }else{
                                throw new CodigoNaoExisteException("O código não existe na base de dados!");
                            }
                        }catch(CodigoNaoExisteException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }

                            break;

                        case 4:
                            System.out.println("Código para remover: " );
                            int codigoRemover = sc.nextInt();
                            sc.nextLine();

                            if(listaTecnicos.stream().anyMatch(t -> t.getCodigo() == codigoRemover) == true){

                            listaTecnicos.removeIf(t -> t.getCodigo() == codigoRemover);
                            break;

                        case 5:
                            int contador = 0;

                            for(Tecnico t : listaTecnicos){
                                contador++;
                                System.out.println("===TÉCNICO " +contador + "===" );
                                t.mostrarTecnico();
                            }
                            break;

                        case 6:
                            System.out.println("Saindo...");
                            break;
                    
                        default:
                            System.out.println("Escolha Inválida!");
                            break;
                    }
                 }
                    break;
                
                case 3:
                    int escolhaManutencao = 0;
                 
                    while (escolhaManutencao != 6) { 
                    System.out.println("===MENU MANUTENÇÕES===");
                    System.out.println("1-Registrar Manutenção\n2-Consultar Manuteção\n3-Alterar Situação\n4-Finalizar Manutenção\n5-Listar Manutenções\n6-Sair");
                    escolhaManutencao = sc.nextInt();
                    sc.nextLine();

                    switch (escolhaManutencao) {
                        case 1:
                        try{
                            System.out.println("Código Manutenção: ");
                            int codigo = sc.nextInt();
                            sc.nextLine();
                            if(listaManutencaos.stream().anyMatch(t -> t.getCodigo() == codigo) == true){
                                throw new CodigoDuplicadoException("Este código já está cadastrado!");
                            }
                            System.out.println("Código equipamento relacionado: ");
                            int codigoEquipamentoRelacionado = sc.nextInt();
                            sc.nextLine();
                            if(listaEquipamentos.stream().anyMatch(e -> e.getCodigo() == codigoEquipamentoRelacionado) == false){
                                throw new CodigoNaoExisteException("O código do Equipamento não está cadastrado!");
                            }
                            System.out.println("Código técnico responsável: ");
                            int codigoTecnicoRelacionado = sc.nextInt();
                            sc.nextLine();
                            if(listaTecnicos.stream().anyMatch(t -> t.getCodigo() == codigoTecnicoRelacionado) == false){
                                throw new CodigoNaoExisteException("O código do Técnico não está cadastrado!");
                            }
                            System.out.println("Data Abertura: ");
                            String dataAbertura = sc.nextLine();
                            System.out.println("Tipo da Manutenção(Preventiva ou Corretiva): ");
                            String tipo = sc.nextLine();
                            System.out.println("Descrição: ");
                            String descricao = sc.nextLine();
                            System.out.println("Situação(Aberta, Em andamento ou Finalizada):");
                            String situacao = sc.nextLine();

                            Manutencao m1 = new Manutencao(codigo, codigoEquipamentoRelacionado, codigoTecnicoRelacionado, dataAbertura,null, tipo, descricao, situacao);
                            listaManutencaos.add(m1);    
                        }catch(CodigoDuplicadoException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }catch(CodigoNaoExisteException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }catch(SituacaoInvalidaException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }     
                            break;

                        case 2:

                        try{
                            System.out.println("Código consultar: ");
                            int codigoConsultar = sc.nextInt();
                            sc.nextLine();

                            if(listaManutencaos.stream().anyMatch(m -> m.getCodigo() == codigoConsultar) == true){

                                
                                for(Manutencao m : listaManutencaos){

                                    if(m.getCodigo() == codigoConsultar){
                                    System.out.println("===Máquina===");
                                    m.mostrarManutencao();

                                for(Tecnico t : listaTecnicos){
                                    if(t.getCodigo() == m.getCodigoTecnicoRelacionado()){
                                        System.out.println("===Técnico Responsável===");
                                            t.mostrarTecnico();
                                            }
                                        }
                                for(Equipamento e : listaEquipamentos){
                                    if(e.getCodigo() == m.getCodigoEquipamentoRelacionado()){
                                        System.out.println("===Equipamento Relacionado===");
                                            e.mostrarEquipamento();
                                   }
                                }       
                                    }

                                }
                            }else{
                                throw new CodigoNaoExisteException("O código não está cadastrado!");
                            }
                        }catch(CodigoNaoExisteException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }
                            break;

                        case 3:

                        try{
                            System.out.println("Código para alterar situação: ");
                            int codigoAlterar = sc.nextInt();

                            if(listaManutencaos.stream().anyMatch(m -> m.getCodigo() == codigoAlterar) == true){
                                for(Manutencao m : listaManutencaos){
                                    if(m.getCodigo() == codigoAlterar){
                                        System.out.println("Digite a situação nova(Aberta, Em andamento ou Finalizada):");
                                        String situacao = sc.nextLine();

                                    if(situacao.equals("Aberta") == false && situacao.equals("Em andamento") == false && situacao.equals("Finalizada") ==  false){
                                        throw new SituacaoInvalidaException("Situação Inválida inserida!");
                                     }
                                m.setSituacao(situacao);
                                    }
                                }
                            }else{
                                throw new CodigoNaoExisteException("O código dado não está cadastrado!");
                            }
                        }catch(CodigoNaoExisteException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }catch(SituacaoInvalidaException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }
                            break;

                        case 4:
                        try{
                            System.out.println("Digite o código da manutenção que deseja finalizar: ");
                            int codigoFinalizar = sc.nextInt();
                            sc.nextLine();

                            if(listaManutencaos.stream().anyMatch(m -> m.getCodigo() == codigoFinalizar) == true){
                                System.out.println("Digite o dia do encerramento da manutenção: ");
                                String encerramento = sc.nextLine();
                                for(Manutencao m : listaManutencaos){
                                    if(m.getCodigo() == codigoFinalizar){
                                        m.setDataEncerramento(encerramento);
                                    }
                                }
                            }else{
                                throw new CodigoNaoExisteException();
                            }
                        }catch(CodigoNaoExisteException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }
                            break;

                        case 5:
                            int contador = 0;
                            for(Manutencao m : listaManutencaos){
                                contador++;
                                System.out.println("===MÁQUINA " + contador + "===");
                                m.mostrarManutencao();
                            }
                            break;

                        case 6:
                            System.out.println("Saindo...");
                            break;
                    
                        default:
                            System.out.println("Escolha Inválida!");
                            break;
                    }
                }     
                    break;


                case 4:
                    int escolhaRelatorio = 0;
                    while (escolhaRelatorio != 5) {
                        
                    
                    System.out.println("====RELATÓRIOS===");
                    System.out.println("1-Total Cadastrados\n2-Equipamentos Ativos/Inativos\n3-Manutenções Abertas/Finalizadas\n4-Manutenções por equipamento\n5-Sair");
                    escolhaRelatorio = sc.nextInt();
                    sc.nextLine();

                    switch (escolhaRelatorio) {
                        case 1:
                            int eCadastrados = 0 , tCadastrados = 0; 

                            for(Equipamento e : listaEquipamentos){
                                eCadastrados++;
                            }

                            for(Tecnico t : listaTecnicos){
                                tCadastrados++;
                            }
                            System.out.println("Equipamentos Cadastrados - " + eCadastrados + "\nTécnicos Cadastrados - " + tCadastrados);
                            break;

                        case 2:
                            int quantAtivo = 0,quantInativo = 0;

                            for(Equipamento e : listaEquipamentos){
                                if(e.getStatus().equals("Operando")){
                                    quantAtivo++;
                                }else if(e.getStatus().equals("Inativo")){
                                    quantInativo++;
                                }
                            }
                            System.out.println("Ativos - " + quantAtivo);
                            System.out.println("Inativos - " + quantInativo);
                            break;

                        case 3:
                            int quantAbertas = 0, quantFinal = 0;

                            for(Manutencao m : listaManutencaos){
                                if(m.getSituacao().equals("Aberta")){
                                    quantAbertas++;
                                }else if(m.getSituacao().equals("Finalizada")){
                                    quantFinal++;
                                }
                            }
                            break;

                        case 4:
                            int codigoAtual = 0;
                            

                            for(Equipamento e : listaEquipamentos){
                                int quantidadeAtual = 0;
                                codigoAtual = e.getCodigo();
                                
                                for(Manutencao m : listaManutencaos){
                                    if(m.getCodigoEquipamentoRelacionado() == codigoAtual){
                                        quantidadeAtual++;
                                    }
                                    System.out.println("O equipamento de código - " + codigoAtual + " - possui " + quantidadeAtual + " manutenções registradas.");
                                }
                            }
                            break;

                        case 5:
                            System.out.println("Saindo...");
                            break;
                    
                        default:
                            break;
                    }
                }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;


                default:
                    System.out.println("Escolha Inválida!");
                    break;


            }
        }
            sc.close();
    }

}
