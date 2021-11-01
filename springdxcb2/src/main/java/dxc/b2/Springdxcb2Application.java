package dxc.b2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Springdxcb2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdxcb2Application.class, args);
		ApplicationContext vehiclesFactory = new ClassPathXmlApplicationContext("settingsconfig.xml");

		Vehicle1 vehicle1 = (Vehicle1) vehiclesFactory.getBean("car");
		vehicle1.drive();



		System.out.println("Hello Spring!!");
	}

}
