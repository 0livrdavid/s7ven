package br.com.application.s7ven.model;

public class Users {
    protected String email;
    protected String senha;
    protected String nome;
    private int id;
    private int registroAcademico;
    private int cpf;

    public Users(int id, int registroAcademico, String email, String senha, String nome, int cpf) {
        this.id = id;
        this.registroAcademico = registroAcademico;
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() { return id; }
    public int getRegistroAcademico() { return registroAcademico; }
    public String getEmail() { return email; }
    public String getSenha() { return senha; }
    public String getNome() { return nome; }
    public int getCpf() { return cpf;}

    public void setId(int id) { this.id = id; }
    public void setRegistroAcademico(int registroAcademico) { this.registroAcademico = registroAcademico; }
    public void setEmail(String email) { this.email = email; }
    public void setSenha(String senha) { this.senha = senha; }
    public void setNome(String nome) { this.nome = nome; }
    public void setCpf(int cpf) { this.cpf = cpf; }
}
