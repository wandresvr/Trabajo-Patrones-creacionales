using ejercicio2.Products;

namespace ejercicio2.Factories
{
    //Fabrica para XML
public class XMLDocumentFactory : DocumentFileFactory
    {
        public override DocumentFile CreateDocumentFile(String filename)
        {
            return new XMLDocumentFile(filename);
        }
    }
}
