package com.neranjana.cameltryout.filecopy;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

/**
 * Created by Neranjana Karunaratne on 16/11/2017.
 */
public class FileCopier {

    public static void main(String[] args) {

        CamelContext context = new DefaultCamelContext();

        try {

            context.addRoutes(new RouteBuilder() {
                @Override
                public void configure() throws Exception {

                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
