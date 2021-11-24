// interface Addable {
//     double add(int a, int b);
// }

// public class ContohLab{
//     public static void main(String[] args){
//         Addable add1= (a,b) -> (a+b/3);
//         System.out.println(add1.add(10,20));
        
//         Addable add2= (a,b) -> (a*b/6);
//         System.out.println(add2.add(100,2));
//     }
// }
interface Addable {
    double add(int a, int b);
}

public class ContohLab{
    public static void main(String[] args){
        Addable add1= (a,b) -> (a+b/3);
        System.out.println("hasil add1:"+add1.add(10,20));
        
        Addable add2= (a,b) -> (a*b/6);
        System.out.println("hasil add2:"+add2.add(100,2));
        
        ContohLab2 tes = new ContohLab2();
        System.out.println("ini add3:" + tes.add3.add(10,20));
    }
}v