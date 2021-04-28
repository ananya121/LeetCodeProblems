import java.util.ArrayList;
import java.util.List;

public class OrderedStream {
	
	    int size;
	    String st[];
	    static int i=0;
	    public OrderedStream(int n) {
	        size=n;
	        st=new String[n];
	    }
	    
	    public List<String> insert(int idKey, String value) 
	    {
	    	System.out.println(size);
	    	System.out.println(st.length);
	        List<String> out=new ArrayList<String>();
	        st[idKey-1]=value;
	        
	        int pt=i;
	        while(st[pt]!=null && pt<size)
	        {
	            out.add(st[pt]);
	            pt++;
	            
	        }
	        
	        while(st[i]!=null)
	            i++;
	        return out;
	    }
	

	/**
	 * Your OrderedStream object will be instantiated and called as such:
	 * OrderedStream obj = new OrderedStream(n);
	 * List<String> param_1 = obj.insert(idKey,value);
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 OrderedStream obj = new OrderedStream(5);
		 List<String> param_1 = obj.insert(3,"cccc");
		 System.out.println(param_1);
	}

}
