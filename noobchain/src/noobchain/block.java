package noobchain;
import java.util.Date;
public class block {
	public String hash;
	public String previoushash;
	private String data;
	private long timeStamp;
	private int nounce;
	
	public block(String data,String previoushash) {
		this.data=data;
		this.previoushash=previoushash;
		this.timeStamp=timeStamp;
		this.hash=calculatehash();
		
	}
	public String calculatehash() {
		String calculatedhash=StringUtil.applySHA256(previoushash+Long.toString(timeStamp)
														+Integer.toString(nounce)
														+data);
		return calculatedhash;
	}
	void mineblock(int difficulty) {
		
		String target=new String(new char[difficulty]).replace('\0','0');
		while(!hash.substring(0,difficulty).equals(target)) {
			nounce++;
			hash=calculatehash();
		}
		System.out.println("blocked mine!!:"+hash);
	}

}
