package com.fullcycle.admin.catolog.domain.validation;

import java.util.List;

public interface ValidationHandler {

    ValidationHandler append(Error anError);

    ValidationHandler append(ValidationHandler anHandler);

    ValidationHandler validate(Validation aValidation);

    default boolean hasErrors() {
        return getErrors() != null && !(getErrors().isEmpty());
    }

    List<Error> getErrors();
    public interface Validation {
        void validate();
    }
}
