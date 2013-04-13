package model;

import java.util.Calendar;

public class Paciente {
 
	private int id;
	 
	private String nome;
	 
	private String profissao;
	 
	private boolean sexo;
	 
	private Calendar dataNascimento;
	 
	private String rg;
	 
	private String cpf;
	 
	private String cartaoSus;
	 
	private String endereco;
	 
	private String bairro;
	 
	private String cidade;
	 
	private String cep;
	 
	private String telefone;
	 
	private String celular;
	 
	private String email;
	 
	private String observacoes;
	 
	private Avaliacao avaliacao;

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

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nome=" + nome + ", profissao=" + profissao + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento.getTime() + ", rg=" + rg + ", cpf=" + cpf + ", cartaoSus=" + cartaoSus + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", observacoes=" + observacoes + ", avaliacao=" + avaliacao + '}';
    }
	 
}
 
