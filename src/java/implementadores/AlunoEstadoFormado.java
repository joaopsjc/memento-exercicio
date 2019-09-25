/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementadores;

import interfaces.AlunoEstado;

/**
 *
 * @author ice
 */
public class AlunoEstadoFormado implements AlunoEstado{
    public String getEstado()
    {
        return "Formado";
    }
    public String matricular()
    {
        return "Matricula não pode ser realizada";
    }
}
