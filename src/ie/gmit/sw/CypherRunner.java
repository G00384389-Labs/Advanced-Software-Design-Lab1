package ie.gmit.sw;

public class CypherRunner {
	
	public static void main(String[] args) throws CypherException {
		CaesarCypher cc = new CaesarCypher();
		CypherKey ck = cc.new CaesarCypherKeyImpl();
		ck.setKey("7");
		cc.setKey(ck, cc);
		
		String s = "Happy Days!";
		String t = cc.encrypt(s);
		
		System.out.println(t);
		System.out.println(cc.decrypt(t));
		
		
		
		
		
		
	}
}
