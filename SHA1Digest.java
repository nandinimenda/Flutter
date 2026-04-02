import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class SHA1Digest
{
    public static String computeSHA1(String text) throws NoSuchAlgorithmException
    {
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] hashBytes = md.digest(text.getBytes());
        StringBuilder hexString = new StringBuilder();
        for(byte b : hashBytes)
        {
            String hex = Integer.toHexString(0xff&b);
            if(hex.length() == 1)
            {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
    public static void main(String[]args)
    {
        try
        {
        String msg = "Hello World";
        String digest = computeSHA1(msg);
        System.out.println("Input: " + msg);
        System.out.println("SHA-1: " + digest);
        System.out.println("Length: " + (digest.length() * 4) + "bits");
    }
    catch(NoSuchAlgorithmException e)
    {
        System.out.println("Error Occurred");
    }
    }
}
