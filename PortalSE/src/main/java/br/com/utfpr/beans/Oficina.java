/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utfpr.beans;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author willian
 */
@Entity
public class Oficina implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    private String nome,palestrante,horario,localDoCurso,curso,dataDeEncerramentoInscricao,
            dataRealizacao,quantidaDedeVagas; 
    
    @ManyToOne
    private Supervisor supervisor;
    
    @ManyToMany
    private List<Professor> pessoas;   
    
    @OneToMany(mappedBy = "oficina")
    private List<Chamada> chamada;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLocalDoCurso() {
        return localDoCurso;
    }

    public void setLocalDoCurso(String localDoCurso) {
        this.localDoCurso = localDoCurso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDataDeEncerramentoInscricao() {
        return dataDeEncerramentoInscricao;
    }

    public void setDataDeEncerramentoInscricao(String dataDeEncerramentoInscricao) {
        this.dataDeEncerramentoInscricao = dataDeEncerramentoInscricao;
    }

    public String getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(String dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

    public String getQuantidaDedeVagas() {
        return quantidaDedeVagas;
    }

    public void setQuantidaDedeVagas(String quantidaDedeVagas) {
        this.quantidaDedeVagas = quantidaDedeVagas;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public List<Professor> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Professor> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Chamada> getChamada() {
        return chamada;
    }

    public void setChamada(List<Chamada> chamada) {
        this.chamada = chamada;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    
}
