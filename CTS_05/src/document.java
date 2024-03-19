public interface document {
    void open();
    void save();

}
class TextDocument implements document{
    @Override
    public void open() {
        System.out.println("text");
    }

    @Override
    public void save() {
        System.out.println("text save");
    }
}
class ImageDocument implements document{
    @Override
    public void open() {
        System.out.println("image");
    }

    @Override
    public void save() {
        System.out.println("save image");
    }
}

interface DocumentFactory{
    document createDocument();

}
class TextDocumentFactory implements DocumentFactory{
    @Override
    public document createDocument() {
        return new TextDocument();
    }
}
class ImageDocumentFactory implements DocumentFactory{
    @Override
    public document createDocument() {
        return new ImageDocument();
    }
}
class main{
    public static void main(String[] args) {
        DocumentFactory textdoc=new TextDocumentFactory();
        document doc = textdoc.createDocument();
        doc.open();
        DocumentFactory imagedoc =new ImageDocumentFactory();
        document img =imagedoc.createDocument();
        img.open();
    }
}