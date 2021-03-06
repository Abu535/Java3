/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author T-107
 */
@Entity
@Table(name = "usauario")
public class Usauario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;

    public Usauario() {//sirve para buscar todos
    }

    public Usauario(Integer idUsuario) {//borrar,actualizar y buscar por id
        this.idUsuario = idUsuario;
    }

    public Usauario(String login, String password) {//insertar
        this.login = login;
        this.password = password;
    }
    

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usauario)) {
            return false;
        }
        Usauario other = (Usauario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

  /*  @Override
    public String toString() {
        return "model.Usauario[ idUsuario=" + idUsuario + " ]";
    }*/

    @Override
    public String toString() {
        return "Usauario{" + "idUsuario=" + idUsuario + ", login=" + login + ", password=" + password + '}';
    }
    
    
}
