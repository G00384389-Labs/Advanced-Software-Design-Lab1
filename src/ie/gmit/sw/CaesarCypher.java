package ie.gmit.sw;

public class CaesarCypher extends AbstractCypher {
	public byte[] doCypher(byte[] bytes, boolean encrypt) throws CypherException {
		int k = Integer.parseInt(key.getKey());
		for(int i = 0; i < bytes.length; i++) {
			if(encrypt) {
				bytes[i] += k;
			}else {
				bytes[i] -= k;
			}
			
		}
	 return bytes;
	}

	@SuppressWarnings("deprecation")
	@Override
	protected void finalize() throws Throwable {
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
