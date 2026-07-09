package model;

import java.util.ArrayList;

import exception.CampoVazioException;
import exception.CodigoDuplicadoException;
import exception.MatriculaInvalidaException;

public class Tecnico {
    
     private int codigo;
     private String nome;
     private int matricula;
     private String setor;
     private String telefone;
     private boolean responsavel;

     public void mostrarTecnico(){
        System.out.println("Código - " + this.codigo);
        System.out.println("Nome - " +this.nome);
        System.out.println("Matrícula - " + this.matricula);
        System.out.println("Setor - " + this.setor);
        System.out.println("Telefone - " + this.telefone);
     }

     public Tecnico(int codigo, String nome, int matricula, String setor, String telefone, ArrayList<Tecnico> listaTecnicos) throws CodigoDuplicadoException, MatriculaInvalidaException, CampoVazioException {
        
        if(codigo == 0 || nome == null || matricula == 0 || setor == null || telefone == null){
            throw new CampoVazioException("Nenhum dos campos pode estar vazio!");
        }
        if(listaTecnicos.stream().anyMatch(t -> t.getCodigo() == codigo) == true){
             throw new CodigoDuplicadoException("O código já existe na base de dados!");
           }
        this.codigo = codigo;
        this.nome = nome;
        if(listaTecnicos.stream().anyMatch(t -> t.getMatricula() == matricula) == true){
            throw new MatriculaInvalidaException("Essa  matrícula já está cadastrada!");
        }
        this.matricula = matricula;
        this.setor = setor;
        this.telefone = telefone;
        this.responsavel = false;
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

     public void setMatricula(int matricula) throws Mai {
        if(listaTecnicos.stream().anyMatch(t -> t.getMatricula() == matricula) == true){
            throw new MatriculaInvalidaException("Essa  matrícula já está cadastrada!");
        }
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

     public void setCodigo(int codigo) {
         this.codigo = codigo;
     }

     public boolean isResponsavel() {
         return responsavel;
     }

     public void setResponsavel(boolean responsavel) {
         this.responsavel = responsavel;
     }

     public void responsabilizar(){
        if(this.responsavel == false){
            this.responsavel = true;
        } else{
            System.out.println("Esse técnico já está em manutenção!");
        }
    }

    public void manutencaoFechada(){
        if(this.responsavel == true){
            this.responsavel = false;
        } else{
            System.out.println("Esse técnico não está em manutenção");
        }
    }
     
     
}
