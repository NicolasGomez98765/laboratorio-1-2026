package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    Set<Artefacto> catalogo = new HashSet<>();
    List<Artefacto> catalogoPorTipo = new ArrayList<>();
    Map<String, Integer>

    public void agregarArtefacto(Object o){
        Artefacto artefacto = (Artefacto) o;
        catalogo.add(artefacto);
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipoDeArtefacto){

        for (Artefacto e : catalogo){
            if (e.getTipoDeArtefacto().equals(tipoDeArtefacto)){
                for (Artefacto c : catalogoPorTipo){
                  if (c.getPoder()<e.getPoder()){
                      catalogoPorTipo.add(e);
                  }
                }

            }
        }
    return catalogoPorTipo;

    }

    public Map<String, Integer> contarArtefactosPorTipo(){
    return
    }

    public Artefacto obtenerArtefactoMasPoderoso(){

    }

    public Set<Artefacto> obtenerArtefactosUnicos(){
        return catalogo;
    }
}
