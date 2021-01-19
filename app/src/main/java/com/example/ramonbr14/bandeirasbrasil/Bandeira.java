package com.example.ramonbr14.bandeirasbrasil;

/**
 * Created by Aluno on 23/04/2018.
 */

public class        Bandeira{
    private int imagemResource;
    private String nome;

    Bandeira (int imagemResource, String nome) {
        this.imagemResource = imagemResource;
        this.nome = nome;
    }

    public int getImagemResource(){
        return imagemResource;
    }

    public String getNome(){
        return nome;
    }



}