package br.gov.conter.intranet.intranet.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "midia_postagem")
public class MidiaPostagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_midia_post")
    private Long id;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "id_post")
    private Postagem postagem;
    @NotNull
    @Size(max = 400)
    @Column(name = "url_midia_post")
    private String urlMidia;
    @NotNull
    @CreationTimestamp
    @Column(name = "dt_inicio")
    private Date dtInicio;
    @Column(name = "dt_fim")
    private Date dtFim;

    public MidiaPostagem() {
    }

    public MidiaPostagem(@NotNull Postagem postagem, @NotNull String urlMidia, @NotNull Date dtInicio, Date dtFim) {
        this.setId(this.id);
        this.postagem = postagem;
        this.urlMidia = urlMidia;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Postagem getPostagem() {
        return postagem;
    }

    public void setPostagem(Postagem postagem) {
        this.postagem = postagem;
    }

    public String getUrlMidia() {
        return urlMidia;
    }

    public void setUrlMidia(String urlMidia) {
        this.urlMidia = urlMidia;
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
