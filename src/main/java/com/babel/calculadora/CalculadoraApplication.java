package com.babel.calculadora;

import com.babel.calculadora.applications.CalculadoraApp;
import com.babel.calculadora.configuration.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CalculadoraApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		CalculadoraApp calculadoraApp = context.getBean(CalculadoraApp.class);

		calculadoraApp.run();
	}

}
