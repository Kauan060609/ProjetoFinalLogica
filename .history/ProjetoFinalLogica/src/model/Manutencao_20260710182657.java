package model;

import java.time.LocalDate;
import java.util.ArrayList;

import exception.CampoVazioException;
import exception.CodigoDuplicadoException;
import exception.CodigoNaoExisteException;
import exception.ManutencaoAbertaException;
import exception.SituacaoInvalidaException;

public class Manutencao {
    
    private int codigo;
    private int codigoEquipamentoRelacionado;
    private int codigoTecnicoRelacionado;
    private String dataAbertura;
    private LocalDate dataEncerramento;
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

    public void setCodigo(int codigo) throws CampoVazioException {
        if(codigo == 0 ){
            throw new CampoVazioException("O código não pode estar vazio!");
        }
        this.codigo = codigo;
    }

    public int getCodigoEquipamentoRelacionado() {
        return codigoEquipamentoRelacionado;
    }

    public void setCodigoEquipamentoRelacionado(int codigoEquipamentoRelacionado) throws CampoVazioException{
        if(codigoEquipamentoRelacionado == 0){
            throw new CampoVazioException("O código do equipamento não pode estar vazio!");
        }
        this.codigoEquipamentoRelacionado = codigoEquipamentoRelacionado;
    }

    public int getCodigoTecnicoRelacionado() {
        return codigoTecnicoRelacionado;
    }

    public void setCodigoTecnicoRelacionado(int codigoTecnicoRelacionado)throws CampoVazioException {
        if(codigoTecnicoRelacionado == 0){
            throw new CampoVazioException();
        }
        this.codigoTecnicoRelacionado = codigoTecnicoRelacionado;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) throws CampoVazioException {
        if(dataAbertura.isEmpty()){
            throw new CampoVazioException("A data de abertura não pode estar vazia!");
        }
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(LocalDate dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public String getTipoManutencao() {
        return tipoManutencao;
    }

    public void setTipoManutencao(String tipoManutencao) throws CampoVazioException{
        if(tipoManutencao.isEmpty()){
            throw new CampoVazioException("O tipo da manutenção não pode estar vazio!");
        }
        this.tipoManutencao = tipoManutencao;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) throws CampoVazioException{
        if(descricaoProblema.isEmpty()){
            throw new CampoVazioException("A descrição do problema não pode estar vazia!");
        }
        this.descricaoProblema = descricaoProblema;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao)throws SituacaoInvalidaException, CampoVazioException {
        if(situacao.equalsIgnoreCase("Aberta") == false && situacao.equalsIgnoreCase("Em andamento") == false && situacao.equalsIgnoreCase("Finalizada") ==  false){
             throw new SituacaoInvalidaException("Situação Inválida inserida!");
          }
        if(situacao.isEmpty()){
            throw new CampoVazioException("A situação não pode estar vazia!");
        }
        this.situacao = situacao;
    }

    public Manutencao(int codigo, int codigoEquipamentoRelacionado, int codigoTecnicoRelacionado, String dataAbertura,
            LocalDate dataEncerramento, String tipoManutencao, String descricaoProblema, String situacao, ArrayList<Manutencao> listaManutencaos, ArrayList<Equipamento> listaEquipamentos, ArrayList<Tecnico> listaTecnicos) throws SituacaoInvalidaException,CodigoDuplicadoException, CodigoNaoExisteException,ManutencaoAbertaException {
                if(codigo == 0 || )
                for(Equipamento e : listaEquipamentos){
                    if(e.getCodigo() == codigoEquipamentoRelacionado){
                        if(e.isEmManutencao()){
                            throw new ManutencaoAbertaException("O equipamento já possui uma manutenção em andamento!");
                        }
                    }
                }

                for(Tecnico t : listaTecnicos){
                    if(t.getCodigo() == codigoTecnicoRelacionado){
                        if(t.isResponsavel()){
                            throw new ManutencaoAbertaException("O técnico já possui uma manutenção em andamento!");
                        }
                    }
                }

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
        if(situacao.equalsIgnoreCase("Aberta") == false && situacao.equalsIgnoreCase("Em andamento") == false && situacao.equalsIgnoreCase("Finalizada") ==  false){
             throw new SituacaoInvalidaException("Situação Inválida inserida!");
                          }
        this.situacao = situacao;
    }

    
    
}
