package br.com.application.s7ven.model;

public class Disciplinas {
    // ATRIBUTOS
    private int id_disciplina;
    protected String nome;
    protected int periodo;
    protected float nota1;
    protected float nota2;
    protected float mediaSemestre;
    protected float mediaFinal;

    // CONSTRUTOR
    public Disciplinas(){
    }

    public Disciplinas(int id_disciplina, String nome, int periodo, float nota1, float nota2) {
        this.id_disciplina = id_disciplina;
        this.nome = nome;
        this.periodo = periodo;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // METODOS: GET
    public int getId_disciplina() { return id_disciplina; }
    public String getNome() { return nome; }
    public int getPeriodo() { return periodo; }
    public float getNota1() { return nota1; }
    public float getNota2() { return nota2; }
    public float getMediaSemestre() { return mediaSemestre; }
    public float getMediaFinal() { return mediaFinal; }

    // METODOS: SET
    public void setId_disciplina(int id_disciplina) { this.id_disciplina = id_disciplina; }
    public void setNome(String nome) { this.nome = nome; }
    public void setPeriodo(int periodo) { this.periodo = periodo; }
    public void setNota1(float nota1) { this.nota1 = nota1; }
    public void setNota2(float nota2) { this.nota2 = nota2; }
    public void setMediaSemestre(float mediaSemestre) { this.mediaSemestre = mediaSemestre; }
    public void setMediaFinal(float mediaFinal) { this.mediaFinal = mediaFinal; }

    public float calcularMediaSemestre(float nota1, float nota2) {
        return ((nota1*2)+(nota2*3))/5;
    }

    public float calcularMediaFinal(float mediaSemestre) {
        return (250-(mediaSemestre*3))/2;
    }
}
