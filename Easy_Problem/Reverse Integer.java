class Solution {
    public int reverse(int x) {
        if (x == 0)
            return 0;
        else if (x == Integer.MIN_VALUE)
            return 0;
        else{
            int sign = x / Math.abs(x);   //紀錄正負號
            int num = Math.abs(x);        //取絕對值
            
            int power = String.valueOf(num).length() - 1;   //取得有幾位數
            long revNum = 0;              //存取最後結果的變數，但是用long型別
            
            while (num != 0){             //執行到所有的位數都反轉
                if (num % 10 == 0){       //如果除10餘數為0直接捨去，並使位數值-1
                    num = num / 10;
                    power--;
                }
                int digit = num % 10;     //取得位數的值
                revNum = revNum + digit * (long)Math.pow(10, power);    //反轉數字
                num = num / 10;           //num的位數往前一個
                power--;                  //位數-1
            }
            
            if (sign == 1 && revNum > Integer.MAX_VALUE)  //如果反轉後的數字大於整數存取範圍且為正號，回傳0
                return 0;
            else if (sign == -1 && -revNum < Integer.MIN_VALUE)  //如果反轉後的數字小於整數存取範圍且為負號，回傳0
                return 0;
            else
                return (int) (sign*revNum);  //回傳最後結果
        }  
    }
}
