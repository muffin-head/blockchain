package noobchain;
import java.util.ArrayList;

import com.google.gson.GsonBuilder;
public class noobchain {
	public static int difficulty=5;
	public static ArrayList<block> blockchain=new ArrayList<block>();
public static void main(String args[]) {
	
	blockchain.add(new block("hi this is my first block","0"));
	System.out.println("Trying to mine block one...");
	blockchain.get(0).mineblock(difficulty);
	blockchain.add(new block("hi this is my second block",blockchain.get(blockchain.size()-1).hash));
	System.out.println("Trying to mine block two...");
	blockchain.get(1).mineblock(difficulty);
	blockchain.add(new block("hi this is my third block",blockchain.get(blockchain.size()-1).hash));
	System.out.println("Trying to mine block three...");
	blockchain.get(2).mineblock(difficulty);
	System.out.println("\n Blockchain is valid:"+ ischainvalid());
	String blockchainjson=new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
	System.out.println("\n blockchain is ");
	System.out.println(blockchainjson);
	
	
}
public static Boolean ischainvalid() {
	block currentblock;
	block previousblock;
	String hashtarget=new String(new char[difficulty]).replace('\0','0');
	for(int i=1;i<blockchain.size();i++) {
		currentblock=blockchain.get(i);
		previousblock=blockchain.get(i-1);
		if(!currentblock.hash.equals(currentblock.calculatehash())) {
			System.out.println("current hashes arent equals");
			return false;
		}
		if(!previousblock.hash.equals(previousblock.calculatehash())) {
			System.out.println("current hashes arent equals");
			return false;
		
	}
		if(!currentblock.hash.substring(0,difficulty).equals(hashtarget)) {
			System.out.println("current hashes arent equals");
			return false;
}}
	return true;
}
}