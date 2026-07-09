import java.util.ArrayList;
import java.util.Scanner;

import exception.CodigoDuplicladoException;
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
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("===MENU EQUIPAMENTOS===");
                    System.out.println("1-Cadastrar Equipamento\n2-Consultar por Código\n3-Alterar Informações\n4-Excluir Equipamento\n5-Listar Equipamentos\n6-Sair");
                    int escolhaEquipamento = sc.nextInt();
                    sc.nextLine();

                    switch (escolhaEquipamento) {

                        
                        case 1:
                            
                        try{
                            System.out.println("Código:  ");
                            int codigo = sc.nextInt();
                            sc.nextLine();
                            if(listaEquipamentos.stream().anyMatch(e -> e.getCodigo() == codigo) == true){
                                throw new CodigoDuplicladoException("O código já está cadastrado na base de dados!");
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
                         }catch(CodigoDuplicladoException erro){
                            System.out.println("Erro - " + erro.getMessage());
                         }
                        
                            Equipamento e1 = new Equipamento(codigo, nome, categoria, fabricante, modelo, setorInstalado, dataInstalacao, status);
                            listaEquipamentos.add(e1);
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
                    break;
                    
                case 2:
                    System.out.println("===MENU TÉCNICOS===");
                    break;
                
                case 3:
                    System.out.println("===MENU MANUTENÇÕES===");
                    break;

                    
                case 4:
                    System.out.println("SAINDO...");
                    break;

                default:
                    System.out.println("Escolha Inválida!");
                    break;


            }
        }
    }
}
