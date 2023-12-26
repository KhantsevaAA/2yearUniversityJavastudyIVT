package org.example.lab3.task1;

//import com.sun.tools.javac.util.List;

import java.util.List;

class useServiceStrategy {
    public static void main(String [] args) {
        StrategyService strategyService = new StrategyServiceImpl(new CommaSeparatedStrategy());
        System.out.println(strategyService.exec(List.of("Hello", "World")));

        strategyService.setStrategy(new SemicolonSeparatedStrategy());
        System.out.println(strategyService.exec(List.of("Hello", "World"))); // Output: Hello;World
    }
}
