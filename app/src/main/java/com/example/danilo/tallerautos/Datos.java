package com.example.danilo.tallerautos;

import java.util.ArrayList;

/**
 * Created by Danilo on 10/05/2017.
 */

public class Datos {
    private static ArrayList<Carros> carros = new ArrayList<>();

    public static void guardar (Carros c){
        carros.add(c);
    }

    public static ArrayList<Carros> getCarros(){
        return carros;
    }
}

