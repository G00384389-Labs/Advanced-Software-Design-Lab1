package ie.gmit.sw;

public class StringCypherKey implements CypherKey {		
		private String key;

		@Override
		public void setPatternKey(String key) throws CypherException {
//			CaesarCypher.this.key = 7;
			this.key = key;

		}

		@Override
		public String getPatternKey() {
			return "" + key;
		}

		public StringCypherKey(String key) {
			super();
			this.key = key;
		}

	}