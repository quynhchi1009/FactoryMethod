public class HTMLButton implements Button {
    public void render() {
        System.out.println("HTML Button has successfully rendered!");
    }

    public void onClick(String x) {
        System.out.println(x);
    }
}
