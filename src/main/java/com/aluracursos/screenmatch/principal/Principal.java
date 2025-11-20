package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.service.ConsumoAPI;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=ba29c8e";


    public void muestraElMenu() {
        System.out.println("Por favor escribe el nombre de la serie que deseas buscar");
        var nombreSerie = teclado.nextLine();
        var json = consumoApi.obtenerDatos("https://www.omdbapi.com/?t=bones&apikey=ba29c8e");

    }
}
