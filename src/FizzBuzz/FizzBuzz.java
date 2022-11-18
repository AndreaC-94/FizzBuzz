package FizzBuzz;

public class FizzBuzz {
    
    public String standard(int num){
        if(num%3!=0 && num%5!=0) return Integer.toString(num);
        else return word(num);
    }

    public String word(int num){
        String result = "";
        if(num%3==0) result = "fizz ";
        if(num%5==0) result += "buzz ";
        return result;
    }

    public String sevenVariation(int num){
        String result = standard(num);
        if(!(result.equals("fizz ") || result.equals("buzz ") || result.equals("fizz buzz "))) result = "";
        if(num%7==0) result += "pop ";
        return result;
    }

    public String customVariation(int num, int fizz, int buzz){
        String result = "";
        if(num%fizz!=0 && num%buzz!=0) return Integer.toString(num);
        else{
            if(num%fizz==0) result = "fizz ";
            if(num%buzz==0) result += "buzz";
            return result;
        }
    }
}
