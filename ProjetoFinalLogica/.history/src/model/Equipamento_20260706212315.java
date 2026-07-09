package model;

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

    public void setCodigo(int codigo) {
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
            String setorInstalado, String dataInstalacao, String status) throws SituacaoInvalidaException{
    
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.setorInstalado = setorInstalado;
        this.dataInstalacao = dataInstalacao;
        if(status.equals("Operando") || status.equals("Em Manutenção") || status.equals("Finalizada")){
            throw new SituacaoInvalidaException("O Status deve ser: Operando, Em Manutenção ou Finalizada");
        }
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) throws SituacaoInvalidaException{
        if(status.equals("Operando") || status.equals("Em Manutenção") || status.equals("Finalizada")){
            throw new SituacaoInvalidaException("O Status deve ser: Operando, Em Manutenção ou Finalizada");
        }
        this.status = status;
    };

    
    
}
