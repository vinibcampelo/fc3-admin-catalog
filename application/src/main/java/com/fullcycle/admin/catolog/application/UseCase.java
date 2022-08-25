package com.fullcycle.admin.catolog.application;

import com.fullcycle.admin.catolog.domain.category.Category;

public abstract class UseCase<IN, OUT> {

    public abstract  OUT execute(IN anIn);
}