package practice24.Task3;

public class CreateTextDocument implements ICreateDocument {

    public IDocument createNew() {
        System.out.println("Создан новый текстовый документ");
        return new TextDocument();
    }


    public IDocument createOpen() {
        System.out.println("Открыт существующий текстовый документ");
        return new TextDocument();
    }
}