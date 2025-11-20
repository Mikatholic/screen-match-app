package com.aluracursos.screenmatch.model;

import java.util.List;

public record DatosTemporadas(
        Integer numero,
        List<DatosEpisodio> episodios
) {
}
