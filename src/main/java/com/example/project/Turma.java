package com.example.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Turma {
    
    List<Double> lista = new ArrayList<>();
    
    
    public void addNota(double nota) {
        lista.add(nota);
    }

    public int getQuantidadeNotas() {
        return lista.size();
    }

    public double getMediaDasNotas() {
        Double totalida = 0.0;
        
        for (Double nota : lista) {
            totalida += nota;
        }
        return totalida / lista.size();
    }

    public int getQuantidadeNotasMeioresQueAMedia() {
        Double media = this.getMediaDasNotas();
      
        int contador = 0;
      
      
        for (Double nota : lista) {
            if(nota < media){
                contador++;
            }
        }
        
        return contador;
    }
}