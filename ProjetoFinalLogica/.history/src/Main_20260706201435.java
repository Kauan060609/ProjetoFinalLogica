import java.util.ArrayList;
import java.util.Scanner;

import exception.CodigoDuplicadoException;
import exception.CodigoNaoExisteException;
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

        while(escolhaInicial != 4){

            System.out.println("1-Equipamentos\n2-Técnicos\n3-Manutenções\n4-Sair");
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
                            if(listaEquipamentos.stream().anyMatch(e -> e.getCodigo() == codigo) == true){
                                throw new CodigoDuplicadoException("O código já existe na base de dados!");
                            }
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

                            Equipamento e1 = new Equipamento(codigo, nome, categoria, fabricante, modelo, setorInstalado, dataInstalacao, status);
                            listaEquipamentos.add(e1);
                            System.out.println("Cadastro Concluído!");
                            }catch(CodigoDuplicadoException erro){
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
                        }
                            break;
                        
                        case 4:
                            System.out.println("Digite o código do equipamento que deseja remover: ");
                            int codigoRemover = sc.nextInt();
                            sc.nextLine();
                            listaEquipamentos.removeIf(e -> e.getCodigo() == codigoRemover);
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
                            if(listaTecnicos.stream().anyMatch(t -> t.getCodigo() == codigo) == true){
                                throw new CodigoDuplicadoException("O código já existe na base de dados!");
                            }
                            System.out.println("Nome: ");
                            String nome = sc.nextLine();
                            System.out.println("Matrícula: ");
                            int matricula = sc.nextInt();
                            System.out.println("Setor: ");
                            String setor = sc.nextLine();
                            System.out.println("Telefone: ");
                            String telefone = sc.nextLine();

                            Tecnico t1 = new Tecnico(codigo, nome, matricula, setor, telefone);
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

                            if(listaTecnicos.stream().anyMatch(t -> t.getCodigo() == codigoAlterar) == true){
                                for(Tecnico t : listaTecnicos){
                                    t.mostrarTecnico();
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

                            listaTecnicos.removeIf(t -> t.getCodigo() == codigoRemover);
                            break;

                        case 5:
                            int contador = 0;

                            for(Tecnico t : listaTecnicos){
                                contador++:
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
                                throw new 
                            }
                            System.out.println("Código equipamento relacionado: ");
                            int codigoEquipamentoRelacionado = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Código técnico responsável: ");
                            int codigoTecnicoRelacionado = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Data Abertura: ");
                            String dataAbertura = sc.nextLine();
                            System.out.println("Data Encerramento: ");
                            String dataEncerramento = sc.nextLine();
                            System.out.println("Tipo da Manutenção(Preventiva ou Corretiva): ");
                            String tipo = sc.nextLine();
                            System.out.println("Descrição: ");
                            String descricao = sc.nextLine();
                            System.out.println("Situação(Aberta, Em andamento ou Finalizada):");
                            String situacao = sc.nextLine();

                            Manutencao m1 = new Manutencao(codigo, codigoEquipamentoRelacionado, codigoTecnicoRelacionado, dataAbertura, dataEncerramento, tipo, descricao, situacao);
                            listaManutencaos.add(m1);    
                        }catch(CodigoDuplicadoException erro){
                            System.out.println("Erro - " + erro.getMessage());
                        }                       
                            break;

                        case 2:
                            
                            break;

                        case 3:
                            
                            break;

                        case 4:
                            
                            break;

                        case 5:
                            
                            break;

                        case 6:
                            
                            break;
                    
                        default:
                            System.out.println("Escolha Inválida!");
                            break;
                    }
                }

                    
                    break;


                case 4:
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
