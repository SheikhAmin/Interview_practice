package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    // getters and setter for manipulating private
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.name = "apna college";
        account.email = "apnacollege@gmail.com";
        account.setPassword("abcd");
        System.out.println(account.getPassword());
    }

}
