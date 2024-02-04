package proskycalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import proskycalculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String sumNumbers(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);
    }

    @GetMapping("/minus")
    public String subtractNumbers(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " − " + num2 + " = " + calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplyNumbers(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divideNumbers(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num2 == 0) {
            return "Ошибка: деление на 0 невозможно";
        }
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}
