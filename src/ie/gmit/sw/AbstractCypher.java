package ie.gmit.sw;

public abstract class AbstractCypher implements Cypherable {
	protected CypherKey key;

	public AbstractCypher() {
		super();
	}

	public abstract byte[] doCypher(byte[] bytes, boolean encrypt) throws CypherException;
		
	
	public byte[] encrypt(byte[] plainText) throws CypherException {
		return doCypher(plainText, true);
	}	

	public byte[] decrypt(byte[] cypherText) throws CypherException {
		return doCypher(cypherText, false);
	}

	public CypherKey getKey() {
		return key;
	}

	public void setKey(CypherKey key, CaesarCypher caesarCypher) {
		this.key = key;
	}

}