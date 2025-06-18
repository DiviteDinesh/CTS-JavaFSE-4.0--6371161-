class DocsFactory{
    public Docs createDocument(String doctype){
        if(doctype.equalsIgnoreCase("excel document"))
            return new ExcelDocument();
        if(doctype.equalsIgnoreCase("pdf document"))
            return new PdfDocument();
        if(doctype.equalsIgnoreCase("word document"))
            return new WordDocument();
        return new WordDocument(); // default type
    }
}