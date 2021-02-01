public class Main {
    public static void main(String[] args) {
        Account myAcc = new Account("Aakash", 1230.5);
        Account myAcc1 = new Account("Aakash", 1230.5);



        if(myAcc.equals(myAcc1)){
            System.out.println("Equal!");
        }

        else {
            System.out.println("Not Equal!");
        }

        System.out.println("Hash Code of myAcc: "+myAcc.hashCode());
        System.out.println("Hash Code of myAcc1: "+ myAcc1.hashCode());

    }
}
