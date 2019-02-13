class myIFImp implements myIF {
	public int getUserID() {
	 return 100;
	}
}

class DefaultMethodDemo {
	public static void main (String args[]) {

	myIFImp obj = new myIFImp();

	System.out.println("User ID is " + obj.getUserID());

	System.out.println("Administrator ID is " + obj.getAdminID());
 }
}