/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplo.diez.modelo;

import java.util.Objects;

/**
 *
 * @author samanthasuquilandaquilli
 */
public class Telefono {
    private String numero;
    private TipoTelefono tipo;
    private Persona unaPersona;
    private OperadoraTelefonica unaOperadoraTelefonica;

    public Telefono() {
    }
    
    public Telefono(String numero, TipoTelefono tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoTelefono getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefono tipo) {
        this.tipo = tipo;
    }

    public Persona getUnaPersona() {
        return unaPersona;
    }

    public void setUnaPersona(Persona unaPersona) {
        this.unaPersona = unaPersona;
    }

    public OperadoraTelefonica getUnaOperadoraTelefonica() {
        return unaOperadoraTelefonica;
    }

    public void setUnaOperadoraTelefonica(OperadoraTelefonica unaOperadoraTelefonica) {
        this.unaOperadoraTelefonica = unaOperadoraTelefonica;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Telefono other = (Telefono) obj;
        return Objects.equals(this.numero, other.numero);
    }

    @Override
    public String toString() {
        return "Telefono{" + "numero=" + numero + ", tipo=" + tipo + ", unaPersona=" + unaPersona + ", unaOperadoraTelefonica=" + unaOperadoraTelefonica + '}';
    }
    
}
