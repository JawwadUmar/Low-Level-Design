package CreationalDesignPattern.FactoryDesignPattern;

public class DocumentFactory {

    public static Document createDocument(String doc){
        doc = doc.toLowerCase();

        return switch (doc) {
            case "pdf" -> new PdfDoc();
            case "word" -> new WordDoc();
            case "html" -> new HtmlDoc();
            default -> throw new IllegalArgumentException("Invalid doc type");
        };
    }
}
