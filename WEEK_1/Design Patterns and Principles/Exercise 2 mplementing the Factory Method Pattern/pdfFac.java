public class pdfFac extends DocFactory  {
    @Override
    public Document createDoc()
    {
        return new PdfDoc();
    }
}
