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
public class AlunoEstadoTrancado implements AlunoEstado{
    public String getEstado()
    {
        return "Trancado";
    }
    public String matricular()
    {
        return "Matricula não pode ser realizada";
    }
}