package model;

import java.io.Serializable;

public class Academico implements Serializable{
 
	private int id;
	 
	private String nome;
	 
	private String telefone;
	 
	private Curso tipoClinico;

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Curso getTipoClinico() {
        return tipoClinico;
    }

    public void setTipoClinico(Curso tipoClinico) {
        this.tipoClinico = tipoClinico;
    }
	 
        
}
 
