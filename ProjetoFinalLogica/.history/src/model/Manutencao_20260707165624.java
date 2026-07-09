package model;

import java.util.ArrayList;

import exception.CodigoDuplicadoException;
import exception.CodigoNaoExisteException;
import exception.SituacaoInvalidaException;

public class Manutencao {
    
    private int codigo;
    private int codigoEquipamentoRelacionado;
    private int codigoTecnicoRelacionado;
    private String dataAbertura;
    private String dataEncerramento;
    private String tipoManutencao;
    private String descricaoProblema;
    private String situacao;

    public void mostrarManutencao(){
        System.out.println("Código - " + this.codigo);
        System.out.println("Equipamento Relacionado - " + this.codigoEquipamentoRelacionado);
        System.out.println("Código Técnico Relacionado - " + this.codigoTecnicoRelacionado);
        System.out.println("Data Abertura - " + this.dataAbertura);
        System.out.println("Data Encerramento - " + this.dataEncerramento);
        System.out.println("Tipo Manutenção -  " + this.tipoManutencao);
        System.out.println("Descrição Problema - " + this.descricaoProblema);
        System.out.println("Situação - " + this.situacao);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoEquipamentoRelacionado() {
        return codigoEquipamentoRelacionado;
    }

    public void setCodigoEquipamentoRelacionado(int codigoEquipamentoRelacionado) {
        this.codigoEquipamentoRelacionado = codigoEquipamentoRelacionado;
    }

    public int getCodigoTecnicoRelacionado() {
        return codigoTecnicoRelacionado;
    }

    public void setCodigoTecnicoRelacionado(int codigoTecnicoRelacionado) {
        this.codigoTecnicoRelacionado = codigoTecnicoRelacionado;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(String dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) {
        this.tipoManutencao = tipoManutencao;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao)throws SituacaoInvalidaException {
        if(situacao.equals("Aberta") == false && situacao.equals("Em andamento") == false && situacao.equals("Finalizada") ==  false){
             throw new SituacaoInvalidaException("Situação Inválida inserida!");
          }
        this.situacao = situacao;
    }

    public Manutencao(int codigo, int codigoEquipamentoRelacionado, int codigoTecnicoRelacionado, String dataAbertura,
            String dataEncerramento, String tipoManutencao, String descricaoProblema, String situacao, ArrayList<Manutencao> listaManutencaos, ArrayList<Equipamento> listaEquipamentos, ArrayList<Tecnico> listaTecnicos) throws SituacaoInvalidaException,CodigoDuplicadoException, CodigoNaoExisteException {
                if(codigoEquipamentoRelacionado)
                if(listaManutencaos.stream().anyMatch(t -> t.getCodigo() == codigo) == true){
                    throw new CodigoDuplicadoException("Este código já está cadastrado!");
             }
        this.codigo = codigo;
        if(listaEquipamentos.stream().anyMatch(e -> e.getCodigo() == codigoEquipamentoRelacionado) == false){
                throw new CodigoNaoExisteException("O código do Equipamento não está cadastrado!");
            }
        this.codigoEquipamentoRelacionado = codigoEquipamentoRelacionado;
        if(listaTecnicos.stream().anyMatch(t -> t.getCodigo() == codigoTecnicoRelacionado) == false){
                throw new CodigoNaoExisteException("O código do Técnico não está cadastrado!");
            }
        this.codigoTecnicoRelacionado = codigoTecnicoRelacionado;
        this.dataAbertura = dataAbertura;
        this.dataEncerramento = dataEncerramento;
        this.tipoManutencao = tipoManutencao;
        this.descricaoProblema = descricaoProblema;
        if(situacao.equals("Aberta") == false && situacao.equals("Em andamento") == false && situacao.equals("Finalizada") ==  false){
             throw new SituacaoInvalidaException("Situação Inválida inserida!");
                          }
        this.situacao = situacao;
    }

    
    
}
