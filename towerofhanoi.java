public class towerofhanoi {
    public static void printNumb(int n, String src, String helper, String dest){
        if(n==1){
            System.err.println(("transfer element" + n + "from" + src + " to " +dest));
            return;
        }
        printNumb(n-1, src,dest, helper);
        System.out.println("transfer element" + n + "from" + src + " to " +dest);
        printNumb(n-1, helper, src, dest);
    }
    public static void main(String args[]){
    int n=1;

printNumb(n, "S", "H", "D"+ " ");
    }
}