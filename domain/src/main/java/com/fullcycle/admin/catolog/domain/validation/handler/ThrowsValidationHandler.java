package com.fullcycle.admin.catolog.domain.validation.handler;

import com.fullcycle.admin.catolog.domain.exceptions.DomainException;
import com.fullcycle.admin.catolog.domain.validation.Error;
import com.fullcycle.admin.catolog.domain.validation.ValidationHandler;

import java.util.List;

public class ThrowsValidationHandler implements ValidationHandler {
    @Override
    public ValidationHandler append(final Error anError) {
        throw DomainException.with(List.of(anError));
    }

    @Override
    public ValidationHandler append(final ValidationHandler anHandler) {
        throw DomainException.with(anHandler.getErrors());
    }

    @Override
    public ValidationHandler validate(Validation aValidation) {
        try {
            aValidation.validate();
        } catch (final Exception ex) {
            throw DomainException.with(List.of(new Error(ex.getMessage())));
        }

        return this;
    }

    @Override
    public boolean hasErrors() {
        return ValidationHandler.super.hasErrors();
    }

    @Override
    public List<Error> getErrors() {
        return List.of();
    }
}
