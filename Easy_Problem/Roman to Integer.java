class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        if (s.length() == 0)                                //如果字串為空的回傳0
            return 0;
        for (int i = 0; i < s.length() - 1; i++){           //for迴圈跑整個字串至倒數第二位
            int first = romanTable(s.charAt(i));            //字串的位置i為first
            int second = romanTable(s.charAt(i + 1));       //字串的位置i+1為second
            if (first < second)                             //如果first小於second
                sum = sum - first;                          //直接減去該數字
            else
                sum =  sum + first;                         //其他狀況直接加該數字
        }
        return sum + romanTable(s.charAt(s.length()-1));    //目前總合加上字串最後的字元
    }
    public int romanTable(char c){                          //建立對照表對應羅馬的數字
        switch(c){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        throw new IllegalStateException();                  //如不符合以上case丟錯誤訊息
    }
}
