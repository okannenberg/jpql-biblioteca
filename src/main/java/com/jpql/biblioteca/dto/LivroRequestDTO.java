package com.jpql.biblioteca.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public record LivroRequestDTO(
        String titulo,
        String isbn,
        BigDecimal preco,
        LocalDate dataPublicacao,
        String categoria,
        Long editoraId,
        List<Long> autoresId
) {
}
