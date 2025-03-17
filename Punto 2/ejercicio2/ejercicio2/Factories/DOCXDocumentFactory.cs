using ejercicio2.Products;

namespace ejercicio2.Factories
{
    //Fabrica para Word
public class DOCXDocumentFactory : DocumentFileFactory
    {
        public override DocumentFile CreateDocumentFile(String filename)
        {
            return new DOCXDocumentFile(filename);
        }
    }
}
