package com.fullcycle.admin.catolog.infrastructure;

import com.fullcycle.admin.catolog.application.UseCase;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(new UseCase().execute());
    }
}