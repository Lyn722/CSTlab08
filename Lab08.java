
package lab08;


public class Lab08 {

    public static void main(String[] args) {
       
      User user01 = new User("Evelyn", "Chicago");
        user01.tweet("Hi everyone!, This is my first tweet!").display();
       
        
        User user02 = new User("Joe");
       user02.tweet ("HI! this is Joe!").display();
       
       
        User user03 = new User("Emily" , "NYC");
        user03.tweet("Such a pretty day in New York Today!").display();
        
        user02.tweet("I wish I could get some pizza right now").display();
        
        
        
        
        
    }
    
}
