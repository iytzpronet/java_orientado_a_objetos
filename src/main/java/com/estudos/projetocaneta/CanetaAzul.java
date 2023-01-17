package com.estudos.projetocaneta;

public class CanetaAzul {
    String modelo,cor;
    Float ponta;
    int carga;
    Boolean tampada;

    public CanetaAzul(String modelo, String cor, Float ponta, int carga, Boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Float getPonta() {
        return ponta;
    }

    public void setPonta(Float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Boolean getTampada() {
        return tampada;
    }

    public void setTampada(Boolean tampada) {
        this.tampada = tampada;
    }
    public void status(){
        System.out.println(" modelo :" + getModelo());
        System.out.println(" Uma Caneta :" + getCor());
        System.out.println(" PONTA " + getPonta());
        System.out.println(" CARGA " + getCarga());
        System.out.println(" Esta Tampada? " + getTampada());
    }
     public void rabiscar(){
        if (tampada == true){
            System.out.println("impossivel rabiscar com tampa");
        } else {
            System.out.println("estou rabiscando");
        }
     }

    }




