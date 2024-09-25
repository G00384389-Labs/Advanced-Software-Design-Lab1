package ie.gmit.sw;

public class CaesarCypher {
	private int key;

	public String encrypt(String plainText) throws CypherException{
		return new String(encrypt(plainText.getBytes()));
	}	
	
	public byte[] encrypt(byte[] plainText) throws CypherException{
		for(int i =0; i < plainText.length; i++) {
			plainText[i] +=getKey();
		}
		
		return plainText;
	}
	
	public String decrypt(String cypherText) throws CypherException{
		return new String(decrypt(cypherText.getBytes()));
	}
	
	
	public byte[] decrypt(byte[] cypherText) throws CypherException{
		for(int i = 0; i<= cypherText.length; i++) {
			cypherText[i] -= getKey();
		}
		
		return cypherText;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	public interface CypherKey{
		public void setKey(String key) throws CypherException;
		public String getKey();
	}
	
	public class CypherKeyImpl implements CypherKey {
		private int key;
		
		
		
		@Override
		public void setKey(String key) throws CypherException {
//			CaesarCypher.this.key = 7;
			this.key = Integer.parseInt(key);
			
		}

		@Override
		public String getKey() {
			return "" + key;
		}
		
	}
		
	
	
		
}
