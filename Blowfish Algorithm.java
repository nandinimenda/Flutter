import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
public class BlowfishAlgorithm
{
    public static SecretKey generateKey() throws Exception
    {
        KeyGenerator keyGen = KeyGenerator.getInstance("Blowfish");
        keyGen.init(128);
        return keyGen.generateKey();
    }
    public static String encrypt( String plainText,SecretKey key) throws Exception
    {
        Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE,key);
        byte[] encryptedBytes = cipher.doFinal(plainText.getBytes("UTF-8"));
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
    public static String decrypt(String cipherText,SecretKey key) throws Exception
    {
        Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5padding");
        cipher.init(Cipher.DECRYPT_MODE,key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(decryptedBytes,"UTF-8");
    }
    public static void main(String[]args)
    {
        try
        {
            String plainText = "Cryptography and Network Security";
            System.out.println("Original Text : "+ plainText);
            SecretKey secretkey = generateKey();
            System.out.println("Blowfish Key(Base64) : "+ Base64.getEncoder().encodeToString(secretkey.getEncoded()));
            String encrypted = encrypt(plainText, secretkey);
            System.out.println("Encrypted Text : "+ encrypted);
            String decrypted = decrypt(encrypted, secretkey);
            System.out.println("Decrypted Text : "+ decrypted);
        }
        catch(Exception e)
        {
            System.out.println("Error: "+ e.getMessage());
            e.printStackTrace();
        }
    }
}
