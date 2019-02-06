public class Ex1 {

	public static void main(String[] args) {
		
		String[] displayDescriptionKeys  =  {"GIVE_ME_NULL", "TEST_ADRESS_KEY_2", "TEST_ADRESS_KEY_3"};
		//String[] displayDescriptionKeys  =  null; //{"GIVE_ME_NULL", "TEST_ADRESS_KEY_2", "TEST_ADRESS_KEY_3"};
		
		Example selfCareProduct = new Example();
		
		if (displayDescriptionKeys != null) {
			String temp = "";
		
			for ( String key : displayDescriptionKeys ) {
				temp = temp.concat(processSelfCareDescription(key));
			}
			selfCareProduct.setDisplayDescription(temp);
		}
		
		
		
		System.out.println(selfCareProduct.getDisplayDescription());

	}
	
	public static String processSelfCareDescription(String key) {
		return "csere ";
	}
	
	public static void textProcessing() {
		
	}

}
