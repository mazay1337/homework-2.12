package proskycalculator.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
    public String welcome();
    Integer sum(Integer num1, Integer num2);

    Integer subtract(Integer num1, Integer num2);

    Integer multiply(Integer num1, Integer num2);

    Integer divide(Integer num1, Integer num2);
}
