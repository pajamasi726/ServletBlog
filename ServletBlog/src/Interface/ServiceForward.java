package Interface;

public class ServiceForward {
	
	private String path; // �̵��� �ּ�
	private boolean isRedirect; // �����̷�Ʈ ���� ( true = redirect / false = forward )
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}

}
