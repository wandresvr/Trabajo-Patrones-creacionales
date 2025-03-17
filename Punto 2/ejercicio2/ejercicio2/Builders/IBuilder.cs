using ejercicio2.Products;

namespace ejercicio2.Builders
{
    public interface IBuilder
{
    IBuilder SetTitle(string title); 
    IBuilder AddTable(string tableData);
    IBuilder AddColumn(string column);
    IBuilder ApplyStyle(string style);
    DocumentFile Build(); 
}
}
