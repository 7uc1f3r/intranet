package br.gov.conter.intranet.intranet.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "perfil_acesso")
public class PerfilAcesso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(max = 150)
    private String nome;
    @NotNull
    @Size(max = 300)
    @JoinColumn(name = "desc")
    private String descricao;
    @NotNull
    @Column(name = "dt_inicio")
    private Date dtInicio;
    @Column(name = "dt_fim")
    private Date dtFim;

    public PerfilAcesso() {
    }

    public PerfilAcesso(@NotNull @Size(max = 150) String nome, @NotNull @Size(max = 300) String descricao, @NotNull Date dtInicio, Date dtFim) {
        this.setId(this.id);
        this.nome = nome;
        this.descricao = descricao;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
