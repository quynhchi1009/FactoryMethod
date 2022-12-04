public abstract class Dialog {
    public void render() {
        Button okButton = createButton();
        okButton.onClick("Button was onClicked!");
        okButton.render();
    }

    public abstract Button createButton();
}