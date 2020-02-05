
/**
 * Write a description of class AliceAndBobEngine here.
 *
 * @author (Kevin Romero)
 * @version (02.05.2020)
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input)
    {
        if (input.equals("Alice") || input.equals("Bob")){
         return "Hello " + input;
        } else {
            return "I DON'T KNOW YOU, YOU ARE SCARY";
        }
        
      
        //return result;
    }
}
