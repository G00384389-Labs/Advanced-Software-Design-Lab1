package ie.gmit.sw;

import java.util.Iterator;

public class VernamCypher extends AbstractCypher implements Cypherable{

	
	
	@Override
	public byte[] doCypher(byte[] bytes, boolean encrypt) throws CypherException {
		String key = super.getCypherKey().getPatternKey();
		
		for (int i = 0; i < bytes.length; i++) {
			bytes[i] = (byte) (bytes[i]^key.charAt(i));
		}
		
		return bytes;
	}

}
