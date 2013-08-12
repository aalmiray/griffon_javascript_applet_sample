application {
    title = 'Calculator'
    startupGroups = ['calculator']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "calculator"
    'calculator' {
        model      = 'calculator.CalculatorModel'
        view       = 'calculator.CalculatorView'
        controller = 'calculator.CalculatorController'
    }

}
