public class ExcelFac extends DocFactory {
    @Override
    public Document createDoc()
    {
        return new ExcelDoc();
    }
    
}
