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
                    
                    break;

                case 2:
                    
                    break;
                
                case 3:
                    
                    break;

                default:
                    System.out.println("Escolha Inválida!");
                    break;

                    
            }
        }
    }
}
