package br.com.alura.loja.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.alura.loja.conf.AppWebConfiguration;

public class ServeletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {AppWebConfiguration.class,JPAConfiguration.class} ;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
