package calculator

import java.awt.event.ActionEvent

class CalculatorController {
    def model

    void calculate(ActionEvent evt = null) {
        double number1 = Double.parseDouble(model.number1)
        double number2 = Double.parseDouble(model.number2)
        model.result = number1 + number2
    }
}