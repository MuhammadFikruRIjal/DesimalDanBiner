
package KalkulatorTumpukan;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author L
 */
public class Tumpukan {
        
        static void showPush(Stack st, int a){
            st.push(new Integer(a));
            System.out.println("Push (" +a+ ")");
            System.out.println("Stack: "+st);                  
        }
        
        static void showPop(Stack st){
            System.out.println("Pop -> ");
            Integer a = (Integer) st.pop();
            System.out.println(a);
            System.out.println("Stack: " + st);
        }
        
        public static void main(String[] args) {
            Stack st = new Stack();
            System.out.println("Stack: "+st);
            showPush(st, 5);
            showPush(st, 10);
            showPush(st, 17);
            showPop(st);
            showPop(st);
            showPop(st);
            try{
                showPop(st);
            } catch (EmptyStackException e){
                System.out.println("Error, pesan: "+e.getMessage()); 
            }
            
    }
            
        }
    

