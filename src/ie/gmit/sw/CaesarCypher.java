package ie.gmit.sw;

public class CaesarCypher implements Cypherable {
	private CypherKey key;

	@Override
	public String encrypt(String plainText) throws CypherException {
		return new String(encrypt(plainText.getBytes()));
	}

	@Override
	public byte[] encrypt(byte[] plainText) throws CypherException {
		return doCypher(plainText, true);
	}

	@Override
	public String decrypt(String cypherText) throws CypherException {
		return new String(decrypt(cypherText.getBytes()));
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws CypherException {
		return doCypher(cypherText, false);

		return cypherText;
	}

	private byte[] doCypher(byte[] bytes, boolean encrypt) throws CypherExceptipn {
		for(int = 0; i < bytes.length; i++) {
			if(encrypt) {
				bytes[i] += Integer.parseInt(key.getKey());
			}else {
				bytes[i] -= Integer.parseInt(key.getKey());
			}
			
		}
	 return bytes;
	}

	public CypherKey getKey() {
		return key;
	}

	public void setKey(CypherKey key) {
		this.key = key;
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public class CaesarCypherKeyImpl implements CypherKey {
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
