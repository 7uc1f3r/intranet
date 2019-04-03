package br.gov.conter.intranet.intranet.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "id_departamento")
    private Departamento departamento;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "id_perfil_acesso")
    private PerfilAcesso perfilAcesso;
    @NotNull
    @Size(max = 200)
    @Column(name = "nome_usuario")
    private String nome;
    @NotNull
    @Size(max = 50)
    @Column(name = "login_usuario")
    private String login;
    @NotNull
    @Size(max = 250)
    @Column(name = "senha_usuario")
    private String senha;
    @NotNull
    @Column(name = "dt_nascimento")
    private Date dataNasc;
    @Column(name = "url_foto")
    @Size(max = 400)
    private String urlFoto;
    @NotNull
    @CreationTimestamp
    @Column(name = "dt_inicio")
    private Date dtInicio;
    @Column(name = "dt_fim")
    private Date dtFim;

    public Usuario() {
    }

    public Usuario(@NotNull Cargo cargo, Departamento departamento, PerfilAcesso perfilAcesso, @NotNull @Size(max = 200) String nome, @NotNull @Size(max = 50) String login, @NotNull @Size(max = 250) String senha, @NotNull Date dataNasc, @Size(max = 400) String urlFoto, @NotNull Date dtInicio, Date dtFim) {
        this.setId(this.id);
        this.cargo = cargo;
        this.departamento = departamento;
        this.perfilAcesso = perfilAcesso;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.dataNasc = dataNasc;
        this.urlFoto = urlFoto;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public PerfilAcesso getPerfilAcesso() {
        return perfilAcesso;
    }

    public void setPerfilAcesso(PerfilAcesso perfilAcesso) {
        this.perfilAcesso = perfilAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
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
