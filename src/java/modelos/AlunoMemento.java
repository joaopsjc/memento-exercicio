
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import interfaces.AlunoEstado;

/**
 *
 * @author ice
 */
public class AlunoMemento {
    private AlunoEstado estado;
    public AlunoMemento(AlunoEstado estadoSalvar) {
        estado = estadoSalvar;
    }

    AlunoEstado getEstadoSalvo() {
        return estado;
    }
    public String toString()
    {
        return estado.getEstado();
    }
    
}
