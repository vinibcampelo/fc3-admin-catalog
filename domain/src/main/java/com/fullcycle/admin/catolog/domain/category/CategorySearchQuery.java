package com.fullcycle.admin.catolog.domain.category;

public record CategorySearchQuery(
        int Page,
        int PerPage,
        String terms,
        String sort,
        String direction
) {
}
