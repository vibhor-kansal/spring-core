package com.capgemini;

import com.capgemini.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.registerShutdownHook();

        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.getName());
        System.out.println(employee.getId());
        System.out.println(employee.getAddress());

        /*Address address = context.getBean(Address.class);
        address.setCity("Pune");
        System.out.println(address.getCity());

        Address address1 = context.getBean(Address.class);
        System.out.println(address1.getCity());*/
    }
}