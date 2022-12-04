public class WindowButton implements Button{
    public void render() {
        System.out.println("Window Button has successfully rendered!");
    }

    public void onClick(String x) {
        System.out.println(x);
    }
}
