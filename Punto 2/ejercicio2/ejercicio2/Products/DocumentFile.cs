using ejercicio2.Prototypes;

namespace ejercicio2.Products
{
    //Se añade el método para realizar el Prototype y se implementa la interfaz
public abstract class DocumentFile: IPrototype
    {
        public string FileName { get; set; } 
        public string Title { get; set; }
        public List<string> Columns { get; set; } = new List<string>();
        public List<string> Tables { get; set; } = new List<string>();
    
        public abstract void AddColumn(string column);
        public abstract void AddTable(string tableData);
        public abstract void SetTitle(string title);
        public abstract string RetrieveContent(); 

        public abstract IPrototype Clone();
    }
}
