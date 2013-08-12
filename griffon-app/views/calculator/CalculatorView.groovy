package calculator

application(title: 'calculator',
    preferredSize: [320, 240],
    pack: true,
    locationByPlatform: true,
    iconImage: imageIcon('/griffon-icon-48x48.png').image,
    iconImages: [imageIcon('/griffon-icon-48x48.png').image,
        imageIcon('/griffon-icon-32x32.png').image,
        imageIcon('/griffon-icon-16x16.png').image]) {
    gridLayout(cols: 2, rows: 3)
    label('Number1:')
    textField(columns: 20, editable: false, text: bind { model.number1 })
    label('Number2:')
    textField(columns: 20, editable: false, text: bind { model.number2 })
    label('Result:')
    textField(columns: 20, editable: false, text: bind { model.result })
}