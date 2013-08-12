package calculator;

import griffon.swing.SwingApplet;

public class CalculatorApplet extends SwingApplet {
    public CalculatorApplet() {
        super(new String[0]);
    }

    public CalculatorApplet(String[] args) {
        super(args);
    }

    public Object calculateFromJava(String number1, String number2) {
        CalculatorModel model = (CalculatorModel) getModels().get("calculator");
        model.setNumber1(number1);
        model.setNumber2(number2);
        CalculatorController controller = (CalculatorController) getControllers().get("calculator");
        controller.calculate();
        return model.getResult();
    }
}
