package jump.to.java.chap6;

public class FactorialTest { 
    
    public static void main(String[] args) {        
        
        String myAddress="Korea Seoul Mapo-gu (03922)";        
        String[] content = myAddress.split(" ");
        
        String country = content[0], city = content[1], address = content[2];
        int code = Integer.parseInt(content[3].substring(1, 6));
        
        System.out.println("Country: "+country);
        System.out.println("City: "+city);
        System.out.println("Address: "+address);
        System.out.println("Code: "+code);               
        
    }
    
    int factorial(int i) {   
        if (i == 1) return 1;
        
        return i + factorial(i - 1);
    }
    
}

