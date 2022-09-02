package nameclass;

import account.AccountExample;

public class ClassTest {
    public static ValidateClass classtest ;
    public static final String[] validAccount= new String[]{"C0318G"};
    public static final String[] invalid= new String[]{"M0318G","P0323A"};
    public static void main(String[] args) {
       classtest=new ValidateClass();
        for (String account: validAccount
        ) {
            boolean isvalid= classtest.validate(account);
            System.out.println("Account is "+account+" is valid: "+isvalid);
        }
        for (String account:invalid
        ) {
            boolean isvalid =classtest.validate(account);
            System.out.println("Account is "+account+" is valid:"+isvalid);
        }
    }
}
