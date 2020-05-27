package Table.tableProject;
import java.util.*;





public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ArrayList<String> column=new ArrayList<String>();
        column.add("ID");
        column.add("Name");
        
        ArrayList<String> row1=new ArrayList<String>();
        row1.add("1");
        row1.add("A");
        
        ArrayList<String> row2=new ArrayList<String>();
        row2.add("2");
        row2.add("B");
        
        ArrayList<String> row3=new ArrayList<String>();
        row3.add("3");
        row3.add("C");
        
        //System.out.println(column);	
        
        
        //ArrayList<ArrayList<String>> table = new ArrayList<ArrayList<String>>();
        
        List<ArrayList<String>> table =new ArrayList<>(); 
        
       table.add(column);
       table.add(row1);
       table.add(row2);
       table.add(row3);
       //table.add(new ArrayList<String>());
       
        
//        List<int[]> rowList = new ArrayList<int[]>();
//        //table.add(0, column);
//        //table.add(1, row1);
//        //table.add(2, row2);
       
//        table.add(new ArrayList<String>().add("3"));
       	System.out.println(table); 
        //System.out.println(table.get(0));
        
        
        
        
        
        
        
        
        	
    }
}

