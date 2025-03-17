using ejercicio2.Prototypes;

namespace ejercicio2.Products
{
    public class XLSXDocumentFile : DocumentFile
    {

        public XLSXDocumentFile(string fileName)
        {
            FileName = fileName;
        }
    
        public override void AddColumn(string column)
        {
            Console.WriteLine(String.Format("Añadiendo la columna {0}...",column));
            Columns.Add(column);
        }
    
        public override void AddTable(string tableData)
        {
            Console.WriteLine(String.Format("Añadiendo la tabla {0}...",tableData));
            Tables.Add(tableData);
        }
    
        public override void SetTitle(string title)
        {
            Console.WriteLine(String.Format("Añadiendo el titulo {0}...",title));
            Title = title;
        }
    
        public override string RetrieveContent()
        {
            Console.WriteLine("Archivo Excel: ");
            Console.WriteLine(String.Format("Titulo: {0}", Title));
            Console.WriteLine(String.Format("Columnas: {0}", String.Join(",", Columns)));
            Console.WriteLine(String.Format("Tablas: {0}", String.Join(",", Tables)));
            return "Contenido del archivo...";
        }
    
        public override IPrototype Clone()
        {
            return new XLSXDocumentFile(this.FileName);
        }
    }
}
