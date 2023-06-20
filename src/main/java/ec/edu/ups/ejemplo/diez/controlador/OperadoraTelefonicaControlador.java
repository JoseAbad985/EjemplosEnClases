/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplo.diez.controlador;

import ec.edu.ups.ejemplo.diez.idao.IOperadoraTelefonicaDAO;
import ec.edu.ups.ejemplo.diez.modelo.OperadoraTelefonica;
import java.util.List;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class OperadoraTelefonicaControlador {
    private OperadoraTelefonica operadoraTelefonica;
    private IOperadoraTelefonicaDAO operadoraTelefonicaDAO;
    
    public OperadoraTelefonicaControlador(IOperadoraTelefonicaDAO operadoraDAO) {        
        this.operadoraTelefonicaDAO = operadoraDAO;
    }
    
    public void crear(OperadoraTelefonica operadoraTelefonica){
        this.operadoraTelefonica = operadoraTelefonica;
        operadoraTelefonicaDAO.create(operadoraTelefonica);
    }

    public OperadoraTelefonica buscar(int codigo){
        this.operadoraTelefonica = operadoraTelefonicaDAO.read(codigo);
        return this.operadoraTelefonica;
    }
    public boolean eliminar(String codigo){
        OperadoraTelefonica operadoraTelefonicaEncontrada = this.buscar(operadoraTelefonica.getCodigo());
        if(operadoraTelefonicaEncontrada != null){
            operadoraTelefonicaDAO.delete(operadoraTelefonica);
            return true;
        }
        return false;
    }
    
    public boolean actualizar (OperadoraTelefonica operadoraTelefonica){
        OperadoraTelefonica operadoraTelefonicaEncontrada = this.buscar(operadoraTelefonica.getCodigo());
        if(operadoraTelefonicaEncontrada != null){
            operadoraTelefonicaDAO.update(operadoraTelefonica);
            return true;
        }
        return false;
    }
    
    public List<OperadoraTelefonica> listar(){
        return operadoraTelefonicaDAO.list();
    }
}
