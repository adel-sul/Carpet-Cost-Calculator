package com.cybertek;

import com.cybertek.calculator.Calculator;
import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import com.cybertek.services.floor.Bedroom;
import com.cybertek.services.floor.Kitchen;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarpetCostCalculatorApplication {

    public static void main(String[] args) {

        ApplicationContext container = SpringApplication.run(CarpetCostCalculatorApplication.class, args);
        Calculator calculator = container.getBean("calculator", Calculator.class);
        System.out.println(calculator.getTotalPrice(City.DALLAS));

    }
}
