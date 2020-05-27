package Table.tableProject;
import java.util.ArrayList;





public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int rownum=0;
        int colnum=0;
        ArrayList<String> column=new ArrayList<String>();
        column.add("ID");
        column.add("Name");
        
        ArrayList<String> row=new ArrayList<String>();
        row.add("1");
        row.add("A");
        
        //System.out.println(column);	
        
        
        ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
        
        table.add(0, column);
        table.add(1, row);
        
        System.out.println(table);
        
        
    }
}

