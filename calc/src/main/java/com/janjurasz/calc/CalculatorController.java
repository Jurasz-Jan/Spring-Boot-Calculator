package com.janjurasz.calc;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/add")
    public double add(@RequestParam double num1, @RequestParam double num2) {
        return calculatorService.add(num1, num2);
    }

    @PostMapping("/subtract")
    public double subtract(@RequestParam double num1, @RequestParam double num2) {
        return calculatorService.subtract(num1, num2);
    }

    @PostMapping("/multiply")
    public double multiply(@RequestParam double num1, @RequestParam double num2) {
        return calculatorService.multiply(num1, num2);
    }

    @PostMapping("/divide")
    public double divide(@RequestParam double num1, @RequestParam double num2) {
        return calculatorService.divide(num1, num2);
    }
}
