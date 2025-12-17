package practice24.Task3;

public class MainEditor {
    public static void main(String[] args) {
        ICreateDocument factory = new CreateTextDocument();


        EditorFrame frame = new EditorFrame(factory);
        frame.setVisible(true);
        System.out.println("Окно редактора запущено!");
    }
}