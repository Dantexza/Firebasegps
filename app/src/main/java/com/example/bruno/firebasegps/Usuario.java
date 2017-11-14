package com.example.bruno.firebasegps;

/**
 * Created by Bruno on 14/11/2017.
 */

public class Usuario {
    private String id;
    private String nome;
    private double latitude;
    private double longitude;

    public Usuario(String id,String n,double la,double lo){
        this.setId(id);
        this.setNome(n);
        this.setLatitude(la);
        this.setLongitude(lo);

    }
    public String toString(){
        return getNome();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
