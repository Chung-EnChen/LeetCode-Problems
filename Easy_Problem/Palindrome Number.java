class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)                                                             //負數一定不為palindrome number
            return false;
        else{
            String temp = String.valueOf(x);                                  //將數字轉成字串
            for (int i = 0; i < temp.length() / 2; i++){                      //利用迴圈跑整個字串的一半
                if (temp.charAt(i) != temp.charAt(temp.length() - (i + 1))){  //如果有不相同的字就回傳false
                    return false;
                }
            }
            return true;                                                      //跑完沒有遇到不合的就回傳true
        }
    }
}
