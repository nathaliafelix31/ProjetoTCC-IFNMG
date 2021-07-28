package com.sistemaifnmg.sistemaifnmg.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "CCCC")
@DiscriminatorValue(value = "1")
public class CCCC extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false, length = 250, unique = true)
    private String email;


    @Version
    private int version;

    public CCCC(){
        super();
        //this.setCargo(Cargo.CCCC);
        this.email = "";
        this.version = 1;
    }

    public CCCC(String nome, String email /*Cargo cargo*/){
        super();
        /*this.setCargo(Cargo.CCCC);
        this.setNome(nome);*/
        this.email = "";
        this.version = 1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
