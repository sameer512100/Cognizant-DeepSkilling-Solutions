public abstract class DocumentFactory {

    // Factory Method
    public abstract Document createDocument();

    // Optional common method
    public void openDocument() {
        Document doc = createDocument();
        doc.open();
    }
}