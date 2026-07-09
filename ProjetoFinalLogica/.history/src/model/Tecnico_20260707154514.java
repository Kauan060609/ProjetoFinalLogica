package model;

import java.util.ArrayList;

import exception.CodigoDuplicadoException;
import exception.MatriculaInvalidaException;

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

     public Tecnico(int codigo, String nome, int matricula, String setor, String telefone, ArrayList<Tecnico> listaTecnicos) throws CodigoDuplicadoException, MatriculaInvalidaException {
        if(listaTecnicos.stream().anyMatch(t -> t.getCodigo() == codigo) == true){
             throw new CodigoDuplicadoException("O código já existe na base de dados!");
           }
        this.codigo = codigo;
        this.nome = nome;
        if(listaTecnicos.stream().anyMatch(t -> t.getMatricula() == matricula) == true){
            throw new MatriculaInvalidaException("Essa  matr");
        }
        this.matricula = matricula;
        this.setor = setor;
        this.telefone = telefone;
     }

     public int getCodigo() {
         return codigo;
     }

     public void setCodigo(int codigo,ArrayList<Tecnico> listaTecnicos) throws CodigoDuplicadoException{
        if(listaTecnicos.stream().anyMatch(t -> t.getCodigo() == codigo) == true){
             throw new CodigoDuplicadoException("O código já existe na base de dados!");
           }
         this.codigo = codigo;
     }

     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public int getMatricula() {
         return matricula;
     }

     public void setMatricula(int matricula) {
         this.matricula = matricula;
     }

     public String getSetor() {
         return setor;
     }

     public void setSetor(String setor) {
         this.setor = setor;
     }

     public String getTelefone() {
         return telefone;
     }

     public void setTelefone(String telefone) {
         this.telefone = telefone;
     }
     
     
}
