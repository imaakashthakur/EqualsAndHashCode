public class Account {
    private String account;
    private double balance;

    public Account(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }
@Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }

        if(this.getClass() != obj.getClass()){
            return false;
        }

        final Account other = (Account) obj;

        return this.account.equals(other.account) && this.balance == other.balance; //equals used here compares String Account.
    }

@Override
public int hashCode(){
    int result = 17;
    result = 31 * result + this.account.hashCode();
    result = 31 * result + (int) this.balance;
    return result;
    }


}
