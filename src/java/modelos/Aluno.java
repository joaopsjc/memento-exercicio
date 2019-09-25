/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import implementadores.*;
import interfaces.AlunoEstado;

/**
 *
 * @author ice
 */
public class Aluno {
    public String nome;
    public AlunoEstado estado;
    public Aluno()
    {
        estado = new AlunoEstadoAtivo();
    }
    public String getNome() {
        return nome;
    }

    public AlunoEstado getEstado() {
        return estado;
    }
    
    public String getNomeEstado() {
        return estado.getEstado();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(AlunoEstado estado) {
        this.estado = estado;
    }
    
    public AlunoMemento saveToMemento()
    {
        return new AlunoMemento(estado);
    }
    public void restoreFromMemento(AlunoMemento memento)
    {
        estado = memento.getEstadoSalvo();
    }
}
