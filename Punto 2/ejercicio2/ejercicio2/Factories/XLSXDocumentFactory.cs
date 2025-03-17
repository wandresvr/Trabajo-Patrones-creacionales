using ejercicio2.Products;

namespace ejercicio2.Factories
{
    //Fabrica para Excel
public class XLSXDocumentFactory : DocumentFileFactory
    {
        public override DocumentFile CreateDocumentFile(String filename)
        {
            return new XLSXDocumentFile(filename);
        }
    }
}
