package proskycalculator.service;

import proskycalculator.exception.NullParameterException;
import proskycalculator.exception.ZeroDivideException;

public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public boolean isNullConfirmed(Integer num1, Integer num2) {
        return num1 != null || num2 != null;
    }


    @Override
    public Integer sum(Integer num1, Integer num2) {
        if (isNullConfirmed(num1, num2)) {
            return num1 + num2;
        } else {
            throw new NullParameterException();
        }
    }

    @Override
    public Integer subtract(Integer num1, Integer num2) {
        if (isNullConfirmed(num1, num2)) {
            return num1 - num2;
        } else {
            throw new NullParameterException();
        }
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        if (isNullConfirmed(num1, num2)) {
            return num1 * num2;
        } else {
            throw new NullParameterException();
        }
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (isNullConfirmed(num1, num2)) {
            if (num2 == 0) {
                throw new ZeroDivideException();
            }
            return num1 / num2;
        } else {
            throw new NullParameterException();
        }
    }
}
