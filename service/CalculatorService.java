package proskycalculator.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculatorService {
    int sum(int num1, int num2);

    int subtract(int num1, int num2);

    int multiply(int num1, int num2);

    int divide(int num1, int num2);
}
