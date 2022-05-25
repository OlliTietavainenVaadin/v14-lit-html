package com.vaadin.training.lithtml.exercises;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.training.lithtml.exercises.ex1.Exercise1;


@CssImport("styles/shared-styles.css")
public class MainLayout extends AppLayout {

    public MainLayout() {
        addToNavbar(new DrawerToggle());
        addToNavbar(new H2("lit-html exercise"));

        final VerticalLayout menuBar = new VerticalLayout();
        menuBar.setId("menuBar");
        menuBar.add(new RouterLink(Exercise1.TITLE, Exercise1.class));
        addToDrawer(menuBar);
    }
}
