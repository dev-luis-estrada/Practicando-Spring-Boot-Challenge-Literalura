package com.alura.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;

public record LibroRecord(
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<AutorRecord> autores,
        @JsonAlias("languages") List<String> idiomas,
        @JsonAlias("download_count") Integer numeroDeDescargas
) {
}
