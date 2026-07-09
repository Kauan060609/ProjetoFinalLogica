package model;

public class Tecnico {
    
     private int codigo;
     private String nome;
     private int matricula;
     private String setor;
     private String telefone;

     public void mostrarTecnico(){
        System.out.println("Código - " + this.codigo);
        System.out.println("Nome - " +this.nome);
        System.out.println("Matrícula - " + this.matricula);
        System.out.println("Setor - " + this.setor);
        System.out.println("Telefone - " + this.telefone);
     }
}
