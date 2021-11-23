package br.com.application.s7ven.model;

public class Users {
    // ATRIBUTOS
    private String id;
    private String email;
    private String senha;
    private String login_portal;
    private String senha_portal;

    // CONSTRUTOR
    public Users(){
    }

    public Users(String id, String email, String senha) {
        this.id = id;
        this.email = email;
        this.senha = senha;
    }

    public Users(String id, String email, String senha, String login_portal, String senha_portal) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.login_portal = login_portal;
        this.senha_portal = senha_portal;
    }

    // METODO: GET
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public String getLogin_portal() {
        return login_portal;
    }
    public String getSenha_portal() {
        return senha_portal;
    }


    // METODO: SET
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setLogin_portal(String login_portal) {
        this.login_portal = login_portal;
    }
    public void setSenha_portal(String senha_portal) {
        this.senha_portal = senha_portal;
    }
}
