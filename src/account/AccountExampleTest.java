package account;

public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount= new String[]{"123ab","_abc123", "_______"};
    public static final String[] invalid= new String[]{".@", "12345","123"};
    public static void main(String[] args) {
accountExample=new AccountExample();
        for (String account: validAccount
             ) {
            boolean isvalid= accountExample.validate(account);
            System.out.println("Account is "+account+" is valid: "+isvalid);
        }
        for (String account:invalid
             ) {
            boolean isvalid =accountExample.validate(account);
            System.out.println("Account is "+account+" is valid:"+isvalid);
        }
    }
}
