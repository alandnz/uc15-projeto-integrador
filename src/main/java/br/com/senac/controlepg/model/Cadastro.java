package br.com.senac.controlepg.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

// Anotações para equivalência com a tabela no banco de dados
@Entity
@Table(name = "cadastros")
public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "programa_id", nullable = false)
    private Programa programa;
    @Column(name = "num_protocolo")
    private String protocolo;
    @Column(name = "nome_solicitante")
    private String solicitante;
    private String pcdp;
    private double diaria;
    private double passagem;
    @Column(name = "data_viagem")
    private LocalDate data;
    @Column(name = "fonte_recurso")
    private String recurso;
    @Column(name = "tipo_beneficiario")
    private String beneficiario;
    private String obs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getPcdp() {
        return pcdp;
    }

    public void setPcdp(String pcdp) {
        this.pcdp = pcdp;
    }

    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public double getPassagem() {
        return passagem;
    }

    public void setPassagem(double passagem) {
        this.passagem = passagem;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getRecurso() {
        return recurso;
    }

    public void setRecurso(String recurso) {
        this.recurso = recurso;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

}
