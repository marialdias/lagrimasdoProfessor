package com.lagrimasdoprof.lagrimasdoprof.model;

import com.lagrimasdoprof.lagrimasdoprof.enums.PedidoStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity

public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String endereco;

    private PedidoStatus PedidoStatus;



    @OneToMany
    List<Pedido> pedidoList;

    public long getID() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;

}
}
