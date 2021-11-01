package constructor.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import dxc.b2.Springdxcb2Application;

@SpringBootApplication
public class DemoConstructorInjection {
	private static final String APPLICATION_CONTEXT_XML = "fanKnob.xml";
	public static void main(String[] args) {
		SpringApplication.run(Springdxcb2Application.class, args);

		BeanFactory factory = loadContext();

		Employee employee = (Employee)factory.getBean("employee");  
		employee.show(); 
	}


	private static BeanFactory loadContext() {
		Resource resource = new ClassPathResource(APPLICATION_CONTEXT_XML);  
		BeanFactory factory = new XmlBeanFactory(resource);
		return factory;
	}
}
