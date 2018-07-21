class Solution {
    public int reverse(int x) {
        if (x == 0)
            return 0;
        else if (x == Integer.MIN_VALUE)
            return 0;
        else{
            int sign = x / Math.abs(x);
            int num = Math.abs(x);
            
            int power = String.valueOf(num).length() - 1;
            long revNum = 0;
            
            while (num != 0){
                if (num % 10 == 0){
                    num = num / 10;
                    power--;
                }
                int digit = num % 10;
                revNum = revNum + digit * (long)Math.pow(10, power);
                num = num / 10;
                power--;
            }
            
            if (sign == 1 && revNum > Integer.MAX_VALUE)
                return 0;
            else if (sign == -1 && -revNum < Integer.MIN_VALUE)
                return 0;
            else
                return (int) (sign*revNum);  
        }  
    }
}
