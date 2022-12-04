import java.util.Scanner;

public class Main {
    public static Dialog dialog;

    public static void init() throws Exception {
        System.out.print("Do you want to create a HTMLDialog or WindowDialog: ");
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        if (data.equalsIgnoreCase("WindowDialog")) {
            dialog = new WindowDialog();
        } else if (data.equalsIgnoreCase("HTMLDialog")) {
            dialog = new HTMLDialog();
        } else {
            input.close();
            throw new Exception("Error! Unknown Dialog.");
        }
        input.close();
    }
    
    public static void main(String[] args) throws Exception {
        init();
        dialog.render();
    }
}
