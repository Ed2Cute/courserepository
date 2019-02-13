public interface myIF {
	int getUserID();
	default int getAdminID() {
	 return 1;
	}
}
