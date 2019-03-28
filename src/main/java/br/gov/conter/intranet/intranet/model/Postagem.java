package br.gov.conter.intranet.intranet.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "postagem")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "id_tipo_postagem")
    private TipoPostagem tipoPostagem;
    @NotNull
    private String titulo;
    @NotNull
    @Column(name = "dsc",columnDefinition = "LONGTEXT")
    private String texto;
    @NotNull
    @Column(name = "dt_inicio")
    private Date dtInicio;
    @Column(name = "dt_fim")
    private Date dtFim;

    public Postagem() {
    }

    public Postagem(@NotNull Usuario usuario, @NotNull TipoPostagem tipoPostagem, @NotNull String titulo, @NotNull String texto, @NotNull Date dtInicio, Date dtFim) {
        this.setId(this.id);
        this.usuario = usuario;
        this.tipoPostagem = tipoPostagem;
        this.titulo = titulo;
        this.texto = texto;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoPostagem getTipoPostagem() {
        return tipoPostagem;
    }

    public void setTipoPostagem(TipoPostagem tipoPostagem) {
        this.tipoPostagem = tipoPostagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }
}
