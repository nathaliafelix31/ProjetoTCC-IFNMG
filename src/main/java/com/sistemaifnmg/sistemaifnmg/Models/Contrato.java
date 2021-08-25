package com.sistemaifnmg.sistemaifnmg.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="Contratos")
public class Contrato implements Serializable {

    private static  final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String anoOrigem;

    @Column(length = 70)
    private String contrato;

    @Column(length = 70)
    private String processo;

    @Column(length = 250)
    private String objeto;

    @Column(precision = 8, scale = 2)
    private BigDecimal valor;

    @Column(length = 250)
    private String empContratada;

    private String dataAssinatura;
    private String inicioVigencia;
    private String finalVigencia;
    private String publiDou;

    @Column(length = 250)
    private String obs;

    @Column(length = 250)
    private String fiscal;

    @Column(length = 250)
    private String vigenciaGarantia;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnoOrigem() {
        return anoOrigem;
    }

    public void setAnoOrigem(String anoOrigem) {
        this.anoOrigem = anoOrigem;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getProcesso() {
        return processo;
    }

    public void setProcesso(String processo) {
        this.processo = processo;
    }

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getEmpContratada() {
        return empContratada;
    }

    public void setEmpContratada(String empContratada) {
        this.empContratada = empContratada;
    }

    public String getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(String dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public String getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(String inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public String getFinalVigencia() {
        return finalVigencia;
    }

    public void setFinalVigencia(String finalVigencia) {
        this.finalVigencia = finalVigencia;
    }

    public String getPubliDou() {
        return publiDou;
    }

    public void setPubliDou(String publiDou) {
        this.publiDou = publiDou;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getFiscal() {
        return fiscal;
    }

    public void setFiscal(String fiscal) {
        this.fiscal = fiscal;
    }

    public String getVigenciaGarantia() {
        return vigenciaGarantia;
    }

    public void setVigenciaGarantia(String vigenciaGarantia) {
        this.vigenciaGarantia = vigenciaGarantia;
    }
}
