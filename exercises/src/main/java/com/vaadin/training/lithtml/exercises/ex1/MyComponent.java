package com.vaadin.training.lithtml.exercises.ex1;

import com.vaadin.flow.component.ClientCallable;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;

import java.util.UUID;

@Tag("my-component")
@JsModule("./ex1/my-component.ts")
public class MyComponent extends LitTemplate {


    public MyComponent() {
        getElement().setProperty("name", UUID.randomUUID().toString());
    }

    @ClientCallable
    private void myMethod(double value) {
        System.out.println("Value from client: " + value);
        getElement().setProperty("value", value + 1);
    }


}
