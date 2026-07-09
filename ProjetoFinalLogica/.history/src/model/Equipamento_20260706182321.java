package model;

public  class Equipamento {

    private int codigo;
    private String nome;
    private String categoria;
    private String fabricante;
    private String modelo;
    private String setorInstalado;
    private String dataInstalacao;
    private boolean status;
    
    public  void mostrarEquipamento(){
        System.out.println("Código - " + this.codigo);
        System.out.println();
    };
}
