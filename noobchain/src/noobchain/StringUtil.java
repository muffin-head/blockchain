package noobchain;
import java.security.MessageDigest;

public class StringUtil {
	public static String applySHA256(String input) {
		try {
			MessageDigest digest=MessageDigest.getInstance("SHA-256");
			byte[] hash=digest.digest(input.getBytes("UTF-8"));
			StringBuffer hexstring=new StringBuffer();
			for(int i=0;i<hash.length;i++) {
				String hex=Integer.toHexString(0xff & hash[i]);
				if(hex.length()==1) hexstring.append('0');
				hexstring.append(hex);
				
			}
			return hexstring.toString();
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
}

