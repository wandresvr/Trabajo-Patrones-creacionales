using ejercicio2.Builders;
using ejercicio2.Factories;
using ejercicio2.Products;
using ejercicio2.Prototypes;

namespace ejercicio2
{
    class Program
    {
        static void Main(string[] args)
        {
            //El usuario decidio crear un Word, se llama a la fabrica concreta
            DocumentFileFactory factory = new DOCXDocumentFactory();

            //Se crea el archivo Word
            DocumentFile file = factory.CreateDocumentFile("Notas del semestre.docx");

            //Se crea el builder para el documento
            IBuilder Mybuilder = new DocumentBuilder(file);

            //Crea un template
            DocumentFile template = Mybuilder
                .SetTitle("Notas")
                .AddColumn("Semestre 1")
                .AddTable("Promedio de notas")
                .Build();

            Console.WriteLine("Plantilla: ");
            //Contenido del template
            template.RetrieveContent();

            //Crear una copia del template
            DocumentFile myReport = (DocumentFile)template.Clone();

            Console.WriteLine("Mi archivo: ");
            //Modificar el archivo
            myReport = Mybuilder
                .SetTitle("Mis notas")
                .AddColumn("Semestre 2")
                .AddTable("Ingenieria de requisitos")
                .AddTable("Diseño de patrones")
                .Build();

            //Contenido de mi archivo
            myReport.RetrieveContent();

            //Generar archivo PDF
            PDFDocumentFile myReportPdf = PDFDocumentFile.GeneratePdf(myReport);
        }
    }
}
