abstract class Helper
{
	String loginId;
	String password;

	public boolean checking(String loginId,String password,String inputLoginId,String inputPassword)
	{
		return (loginId.equals(inputLoginId) && password.equals(inputPassword));
	}
	abstract void signUp();
	abstract void updateInfo();
}