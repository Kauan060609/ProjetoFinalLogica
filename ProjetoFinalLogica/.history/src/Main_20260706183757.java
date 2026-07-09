import java.util.ArrayList;
import java.util.Scanner;

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

        while(escolhaInicial != 10){

            System.out.println("1-Equipamentos\n2-Técnicos\n3-Manutenções");
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("===MENU EQUIPAMENTOS===");
                    System.out.println("1-Cadastrar Equipamento\n2-Consultar por Código\n3-Alterar Informações\n4-Excluir Equipamento\n5-Listar Equipamentos");
                    int escolhaEquipamento = sc.nextInt();
                    sc.nextLine();

                    switch (escolhaEquipamento) {
                        case 1:
                            System.out.println("Código:  ");
                            int codigo = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Nome: ");
                            String nome = sc.nextLine();
                            System.out.println();
                            break;

                        case 2:
                            
                            break;

                        case 3:
                            
                            break;
                        
                        case 4:
                            
                            break;

                        case 5:
                            
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

                default:
                    System.out.println("Escolha Inválida!");
                    break;


            }
        }
    }
}
