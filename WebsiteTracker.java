import java.math.BigInteger;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class WebsiteTracker {

  public static String getHashOfUrl(byte[] bytes) throws NoSuchAlgorithmException {
    if( bytes == null) return "";
    MessageDigest md = MessageDigest.getInstance("SHA-1");
    md.update(bytes);
    byte[] digest = md.digest();
    
    // convert it to the hexadecimal 
    BigInteger bi = new BigInteger(digest);
    return bi.toString(16);
}
  public static void main(String[] args) {
    String simplehash = null;
    try {
      simplehash = getHashOfUrl("https://itachi-uchiha-013.000webhostapp.com/".getBytes());
    } catch (NoSuchAlgorithmException e) {
      
      e.printStackTrace();
    }
    System.out.println(simplehash);
  }
  
}
