package model;

// Classe abstrata para herança de atributos comuns
public abstract class Entidade {
    protected int id;
    protected String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

