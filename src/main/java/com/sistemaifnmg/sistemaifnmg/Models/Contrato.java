package com.sistemaifnmg.sistemaifnmg.Models;

        import java.io.Serializable;
        import java.math.BigDecimal;
        import java.util.Date;
        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;
        import javax.persistence.ManyToOne;
        import javax.persistence.Table;
        import javax.persistence.Temporal;
        import javax.persistence.TemporalType;
        import javax.persistence.Version;
        import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="Contratos")
public class Contrato implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Temporal(TemporalType.DATE)
    private Date anoOrigem;


    @Column(length = 70, nullable = true)
    private String contrato;

    @Column(length = 70, nullable = true)
    private String processo;

    @Column(length = 250, nullable = true)
    private String objeto;

    @Column(precision = 8, scale = 2)
    private BigDecimal valor;

    @Column(length = 250, nullable = true)
    private String empContratada;

    @Temporal(TemporalType.DATE)
    private Date dataAssinatura;

    @Temporal(TemporalType.DATE)
    private Date inicioVigencia;

    @Temporal(TemporalType.DATE)
    private Date finalVigencia;

    @Temporal(TemporalType.DATE)
    private Date publiDou;

    @Column(length = 250)
    private String obs;

    @Column(length = 250)
    private String vigenciaGarantia;



    @Column(length = 250, nullable = true)
    private String fiscal;

    @Version
    private long version;



    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }


    public Date getAnoOrigem() {
        return anoOrigem;
    }

    public void setAnoOrigem(Date anoOrigem) {
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

    public Date getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(Date dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public Date getFinalVigencia() {
        return finalVigencia;
    }

    public void setFinalVigencia(Date finalVigencia) {
        this.finalVigencia = finalVigencia;
    }

    public Date getPubliDou() {
        return publiDou;
    }

    public void setPubliDou(Date publiDou) {
        this.publiDou = publiDou;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getVigenciaGarantia() {
        return vigenciaGarantia;
    }

    public void setVigenciaGarantia(String vigenciaGarantia) {
        this.vigenciaGarantia = vigenciaGarantia;
    }

    public String getFiscal() {
        return fiscal;
    }

    public void setFiscal(String fiscal) {
        this.fiscal = fiscal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
