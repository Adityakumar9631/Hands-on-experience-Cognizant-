public class main {
     public static void main(String[] args) {
        DocFactory wordFactory = new WordFac();
        Document wordDoc = wordFactory.createDoc();
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        DocFactory pdfFactory = new pdfFac();
        Document pdfDoc = pdfFactory.createDoc();
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();

        DocFactory excelFactory = new ExcelFac();
        Document excelDoc = excelFactory.createDoc();
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }
}
