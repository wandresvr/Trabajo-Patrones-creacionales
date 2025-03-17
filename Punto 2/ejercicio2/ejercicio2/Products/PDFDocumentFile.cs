namespace ejercicio2.Products
{
    public class PDFDocumentFile
    {
        String FileName;
        
        public PDFDocumentFile(string fileName) {
            FileName = fileName;
        }

        public string RetrieveContent() {
            return "Contenido PDF";
        }
        
        // Método estático para simular la generación real del PDF a partir de un DocumentFile
        public static PDFDocumentFile GeneratePdf(DocumentFile document) {
            PDFDocumentFile pdf = new PDFDocumentFile(document.FileName);
            Console.WriteLine("PDF Generado.");
            return pdf;
        }
    }
}