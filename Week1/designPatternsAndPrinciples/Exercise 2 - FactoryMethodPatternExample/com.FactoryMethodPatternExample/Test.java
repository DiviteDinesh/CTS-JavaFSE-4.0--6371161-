public class Test {
    public static void main(String[] args) {
        DocsFactory factory = new DocsFactory();
        
        Docs excel = factory.createDocument("excel document");
        System.out.print("Type of Excel : ");
        excel.type();
        
        Docs pdf = factory.createDocument("pdf document");
        System.out.print("Type of Pdf : ");
        pdf.type();
        
        Docs word = factory.createDocument("word document");
        System.out.print("Type of Word : ");
        word.type();
    }
}
