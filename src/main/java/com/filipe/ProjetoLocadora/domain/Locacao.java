package com.filipe.ProjetoLocadora.domain;

import jakarta.persistence.*;

import java.io.Serial;
import java.util.Date;

@Entity
public class Locacao {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long cliente_id;
    private Long filme_id;
    private Date dataAluguel;
    private Date dataDevolucao;
    private Double valor;

    public Locacao() {
    }

    public Locacao(Long id, Long cliente_id, Long filme_id, Date dataDevolucao, Date dataAluguel, Double valor) {
        this.id = id;
        this.cliente_id = cliente_id;
        this.filme_id = filme_id;
        this.dataDevolucao = dataDevolucao;
        this.dataAluguel = dataAluguel;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Long cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Date getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(Date dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public Long getFilme_id() {
        return filme_id;
    }

    public void setFilme_id(Long filme_id) {
        this.filme_id = filme_id;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
