package model;

import java.util.ArrayList;

import exception.CampoVazioException;
import exception.CodigoDuplicadoException;
import exception.SituacaoInvalidaException;

public  class Equipamento {

    private int codigo;
    private String nome;
    private String categoria;
    private String fabricante;
    private String modelo;
    private String setorInstalado;
    private String dataInstalacao;
    private String status;
    private boolean emManutencao;
    
    public  void mostrarEquipamento() {
        System.out.println("Código - " + this.codigo);
        System.out.println("Nome - " + this.nome);
        System.out.println("Categoria - " + this.categoria);
        System.out.println("Fabricante - " + this.fabricante);
        System.out.println("Modelo - " + this.modelo);
        System.out.println("Setor Instalado - " + this.setorInstalado);
        System.out.println("Data Instalação - " + this.dataInstalacao);
        System.out.println("Status - " + this.status);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo, ArrayList<Equipamento> listaEquipamentos) throws CodigoDuplicadoException{
        if(listaEquipamentos.stream().anyMatch(e -> e.getCodigo() == codigo) == true){
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSetorInstalado() {
        return setorInstalado;
    }

    public void setSetorInstalado(String setorInstalado) {
        this.setorInstalado = setorInstalado;
    }

    public String getDataInstalacao() {
        return dataInstalacao;
    }

    public void setDataInstalacao(String dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }

    

    public Equipamento(int codigo, String nome, String categoria, String fabricante, String modelo,
            String setorInstalado, String dataInstalacao, String status, ArrayList<Equipamento> listaEquipamentos) throws SituacaoInvalidaException, CodigoDuplicadoException, CampoVazioException{
    
        if(codigo == 0 || nome == null || categoria == null || categoria == null || fabricante == null || modelo == null || setorInstalado == null || dataInstalacao == null || status == null){
            throw new CampoVazioException("Nenhum dos campos pode estar vazio!");
        }
        if(listaEquipamentos.stream().anyMatch(e -> e.getCodigo() == codigo) == true){
                   throw new CodigoDuplicadoException("O código já existe na base de dados!");
                 }
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.setorInstalado = setorInstalado;
        this.dataInstalacao = dataInstalacao;

        if(status.equals("Operando") == false && status.equals("Em Manutenção") == false && status.equals("Inativa")== false){
            throw new SituacaoInvalidaException("O Status deve ser: Operando, Em Manutenção ou Finalizada");
        }
        this.status = status;
        this.emManutencao = false;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws SituacaoInvalidaException{
        if(status.equals("Operando") == false && status.equals("Em Manutenção") == false && status.equals("Finalizada")== false){
            throw new SituacaoInvalidaException("O Status deve ser: Operando, Em Manutenção ou Finalizada");
        }
        this.status = status;
    };

    public void manutencao(){
        if(this.emManutencao == false){
            this.emManutencao = true;
        } else{
            System.out.println("Esse equipamento já está em manutenção!");
        }
    }

    public void encerrarManutencao(){
        if(this.emManutencao == true){
            this.emManutencao = false;
        } else{
            System.out.println("Esse equipamento não está em manutenção");
        }
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isEmManutencao() {
        return emManutencao;
    }

    public void setEmManutencao(boolean emManutencao) {
        this.emManutencao = emManutencao;
    }
    
}
