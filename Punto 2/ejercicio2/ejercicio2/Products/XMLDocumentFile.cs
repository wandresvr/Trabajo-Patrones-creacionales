using ejercicio2.Prototypes;

namespace ejercicio2.Products
{
    public class XMLDocumentFile : DocumentFile
    {
        public XMLDocumentFile(string fileName)
        {
            FileName = fileName;
        }

        public override void AddColumn(string column)
        {
            Console.WriteLine(String.Format("Añadiendo la columna {0}...",column));
            Columns.Add("<Column>" + column + "</Column>");
        }
        
        public override void AddTable(string tableData)
        {
            Console.WriteLine(String.Format("Añadiendo la tabla {0}...",tableData));
            Tables.Add("<Table>" + tableData + "</Table>");
        }
        
        public override void SetTitle(string title)
        {
            Console.WriteLine(String.Format("Añadiendo el titulo {0}...",title));
            Title = "<Title>" + title + "</Title>";
        }
        
        public override string RetrieveContent()
        {
            Console.WriteLine("Archivo XML");
            Console.WriteLine(String.Format("Titulo: {0}", Title));
            Console.WriteLine(String.Format("Columnas: {0}", String.Join(",", Columns)));
            Console.WriteLine(String.Format("Tablas: {0}", String.Join(",", Tables)));
            return "Contenido del archivo...";
        }

        public override IPrototype Clone()
        {
            return new XMLDocumentFile(this.FileName);
        }
    }
}
