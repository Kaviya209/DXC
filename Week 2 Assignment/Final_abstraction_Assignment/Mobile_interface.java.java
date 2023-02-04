package Aassignment;

interface Testable{
	 boolean testCompatibility();
	
	}
	class Mobile {
	 private String name;
	 private String brand;
	 private String operatingSystemNmae;
	 private String operatingSystemVersion;
	
	    public Mobile(String name, String brand, String operatingSystemNmae, String operatingSystemVersion)
	    {
		
		this.name = name;
		this.brand = brand;
		this.operatingSystemNmae = operatingSystemNmae;
		this.operatingSystemVersion = operatingSystemVersion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOperatingSystemNmae() {
		return operatingSystemNmae;
	}

	public void setOperatingSystemNmae(String operatingSystemNmae) {
		this.operatingSystemNmae = operatingSystemNmae;
	}

	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}
	 
	}
	class SmartPhone extends Mobile implements Testable{
		private String networkGeneration;
		
		 public SmartPhone(String name, String brand, String operatingSystemNmae, String operatingSystemVersion,
				 String networkGeneration) {
				  super(name,brand,operatingSystemNmae,operatingSystemVersion);
	             this.networkGeneration = networkGeneration;
	}
		public String getNetWorkGeneration() {
			return  getNetWorkGeneration();
		}
		
		 public void steNetworkGeneration(String networkGeneration) {
		 this.networkGeneration=networkGeneration;
		 }
		 
		 public boolean testCompatibility() {
			 if(super.getOperatingSystemNmae().equals("Saturn")) {
				 if(networkGeneration.equals("3G")) {
					 if(super.getOperatingSystemVersion().equals("1.1")||
					    super.getOperatingSystemVersion().equals("1.2")||
						super.getOperatingSystemVersion().equals("1.3"))
						 return true;
					 }
				 }
			 else  if(networkGeneration.equals("4G")) {
				 if(  super.getOperatingSystemVersion().equals("1.2")||
					 super.getOperatingSystemVersion().equals("1.3")) {
							 return true;
					 }
			     }
		 else if(networkGeneration.equals("5G")) {
				 if(super.getOperatingSystemVersion().equals("1.3")) {
							 return true;
					 }
			     }
			 
		 if(super.getOperatingSystemNmae().equals("Gara")) {
			 if(networkGeneration.equals("3G")) {
				 if(super.getOperatingSystemVersion().equals("EXRT.1")||
				    super.getOperatingSystemVersion().equals("EXRT.2")||
					super.getOperatingSystemVersion().equals("EXRU.1")) {
					 return true;
				 }
			 }
		 else  if(networkGeneration.equals("4G")) {
			 if(  super.getOperatingSystemVersion().equals("EXRT.2")||
				 super.getOperatingSystemVersion().equals("EXRU.1")) {
						 return true;
				 }
		     }
	 else if(networkGeneration.equals("5G")) {
			 if(super.getOperatingSystemVersion().equals("EXRU.1")) {
						 return true;
				 }
		     }
		 }
	return false;
	 
		 }
	}
	class TesterPhone {
	public static void main(String args[]){
	SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
	if(smartPhone.testCompatibility())
	 System.out.println("The mobile OS is compatible with the network generation!");
	else
	 System.out.println("The mobile OS is not compatible with the network generation!");
	//Create more objects for testing your code
	}
	}
	
