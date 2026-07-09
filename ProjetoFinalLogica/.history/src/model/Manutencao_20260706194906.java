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
        System.out.println("Código Técnico Relacionado - " + this.);
    }
}
