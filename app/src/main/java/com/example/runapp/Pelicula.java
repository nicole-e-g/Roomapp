package com.example.runapp;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Pelicula {
    @PrimaryKey(autoGenerate= true)
    public int id;

    public String titulo;
    public String descripcion;
    public String genero;
    public String director;

}
