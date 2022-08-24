package com.fullcycle.admin.catolog.domain;

import com.fullcycle.admin.catolog.domain.validation.ValidationHandler;

public abstract class AggregateRoot<ID extends Identifier> extends Entity<ID> {

    protected AggregateRoot(final ID id) {
        super(id);
    }

}
