package com.filipe.ProjetoLocadora.domain;


import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;


@Entity
public class Filme implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String titulo;
  private Integer anoDeLanc;
  private String genero;
  private String sinopse;
  private String nomeDiretor;
  private Boolean disponibilidade;
  private String urlImagem;


  public Filme(){}
  public Filme(Integer anoDeLanc, Boolean disponibilidade, String genero, Long id, String nomeDiretor, String sinopse, String titulo, String urlImagem) {
        this.anoDeLanc = anoDeLanc;
        this.disponibilidade = disponibilidade;
        this.genero = genero;
        this.id = id;
        this.nomeDiretor = nomeDiretor;
        this.sinopse = sinopse;
        this.titulo = titulo;
        this.urlImagem = urlImagem;
    }

    public Integer getAnoDeLanc() {
        return anoDeLanc;
    }

    public void setAnoDeLanc(Integer anoDeLanc) {
        this.anoDeLanc = anoDeLanc;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }
}
