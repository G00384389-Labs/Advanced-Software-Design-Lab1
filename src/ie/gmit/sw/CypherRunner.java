package ie.gmit.sw;

public class CypherRunner {
	
	public static void main(String[] args) throws CypherException {
		Cypherable cc = new VernamCypher();
//		Cypherable cc = new CaesarCypher();		 Caesar Cypher	
//		CypherKey ck = new StringCypherKey("4"); Caesar Cypher		
		CypherKey ck = new StringCypherKey("EFIUIUGWGEFIUWgefiwqufiqwufifweifugwefiguwefi");		
		cc.setCypherKey(ck);
		
		String s = "Happy Days!";
		String t = cc.encrypt(s);
		
		System.out.println(t);
		System.out.println(cc.decrypt(t));
		
		
		
		
		
		
	}
}
