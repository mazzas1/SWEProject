
public class DataStorePrototype {

	public void prototype(DataStore apiToCall) {
		
		InputConfig inputConfig = new InputConfig() {

		};
		
		OutputConfig outputConfig = null;

		Iterable<Integer> loadedData = apiToCall.read(inputConfig);
		
		for (int i : loadedData) {
			String result = "" + i;
			
			WriteResult writeResult = apiToCall.appendSingleResult(outputConfig, result);
			
			if (writeResult.getStatus() != WriteResult.WriteResultStatus.SUCCESS) {
				System.out.println("Oh no.");
			}
		}
	}
}
