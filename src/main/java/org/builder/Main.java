package org.builder;

import org.builder.domain.Address;
import org.builder.domain.Contact;
import org.builder.domain.Phone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee.EmployeeBuilder()
                .setAge(24)
                .setName("Ramiro")
                .setGender("Male")
                .setAddress(new Address("Calle 9","Ayacucho","Perú","0500"))
                .setAddress("Las Malvinas","Huamanga","Perú","0500")
                .setPhone(new Phone("977454564","051","Fijo"))
                .setPhone("00023564","null","Celular")
                .setContact(new Contact("Emily", new Phone("00023564","null","Celular"),new Address("Las Malvinas","Huamanga","Perú","0500")))
                .build();
        System.out.println("employee = " + employee);

    }
}