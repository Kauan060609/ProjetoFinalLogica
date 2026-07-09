package model;

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

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Manutencao(int codigo, int codigoEquipamentoRelacionado, int codigoTecnicoRelacionado, String dataAbertura,
            String dataEncerramento, String tipoManutencao, String descricaoProblema, String situacao) {
        this.codigo = codigo;
        this.codigoEquipamentoRelacionado = codigoEquipamentoRelacionado;
        this.codigoTecnicoRelacionado = codigoTecnicoRelacionado;
        this.dataAbertura = dataAbertura;
        this.dataEncerramento = dataEncerramento;
        this.tipoManutencao = tipoManutencao;
        this.descricaoProblema = descricaoProblema;
        this.situacao = situacao;
    }

    
    
}
