




class roman_to_int
{
    public static void main(String args[])
    {
        String s = "CXXIX";
        System.out.println(romanToInt(s));
    }
/*Create a function getInteger() to return the value of a single 
roman character passed to it using switch cases */

    static int getInteger(char c)
    {
        switch(c)
        {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return -1;
        }
    }

//Store the integer value of last character of the string in prev
/*Initialize result equal to prev
Store integer value of current character as current
If current is less than prev
Subtract current from result, 
that is, result -= current
Else Add current to result, that is, 
result += current */

static int romanToInt(String s)
    {
        int n = s.length();

        int prev = getInteger(s.charAt(n - 1)) , result = prev , current;
       
//Iterate from i = N – 2 until i >= 0:

        for(int i = n - 2 ; i >= 0 ; i--)
        {
            current = getInteger(s.charAt(i));
            if(current < prev)
                result -= current;
            else
                result += current;
            prev = current;
        }
        return result;
    }
}
