

/**
 * defangIPAddress
 */
public class defangIPAddress {
    public static String defangIPAddress(String address){
        address = address.replaceAll("\\.", "[.]");
        return address;
    }

    
public static void main(String[] args) {
    String input = "1.1.1.1";
    String result = defangIPAddress(input);
    System.out.println(result);
}
    
}