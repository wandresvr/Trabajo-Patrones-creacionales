using ejercicio2.Products;
namespace ejercicio2.Builders
{
    public class DocumentBuilder : IBuilder
{
    private DocumentFile document;
    
    public DocumentBuilder(DocumentFile document) {
        this.document = document;  // Corrección: asignar el parámetro al campo de instancia.
    }
    
    public IBuilder SetTitle(string title) {
        document.SetTitle(title);
        return this;
    }
    
    public IBuilder AddColumn(string column) {
        document.AddColumn(column);
        return this;
    }
    
    public IBuilder AddTable(string tableData) {
        document.AddTable(tableData);
        return this;
    }
    
    public IBuilder ApplyStyle(string style) {
        // Implementar la aplicación de estilo si es necesario
        return this;
    }
    
    public DocumentFile Build() {
        return document;
    }
}
}
