// interface Addable {
//     double add(int a, int b, String c);
// }
// public class ContohLab2{
//     public static void main(String[] args){
//         Addable add1= (a,b,c) -> (
//             for(int i = 0; i< 3; i++ ){
//                 a[i] = a[i]+i+*2;
//             }
            
//             );
//         System.out.println("hasil add1:"+add1.add(10,20));
        
//         Addable add2= (a,b) -> (a*b/6);
//         System.out.println("hasil add2:"+add2.add(100,2));
//     }
// }
interface Addable2 {
    double add(int a, int b);
}
public class ContohLab2{
    Addable2 add3= (a,b) ->{ 
        System.out.println("hasil add3:");
    return (a*b/4);
    };
    
    Addable2 add4= (a,b) -> {
        System.out.println("hasil add4:");
    return (a*b+4/4-2);
    };

}
