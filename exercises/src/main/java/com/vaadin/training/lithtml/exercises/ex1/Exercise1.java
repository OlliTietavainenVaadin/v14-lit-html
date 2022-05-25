package com.vaadin.training.lithtml.exercises.ex1;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.training.lithtml.exercises.MainLayout;

@Route(value = Exercise1.ROUTE, layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class Exercise1 extends VerticalLayout {

    private static final long serialVersionUID = 1L;

    public static final String ROUTE = "ex1";
    public static final String TITLE = "Exercise 1";

    public Exercise1() {
        add(new Span("This text is created on the server, the next one is a MyComponent"));
        add(new MyComponent());
    }

}