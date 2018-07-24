class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)                                             //如果陣列為0回傳空字串
            return "";
        String result = strs[0];                                          //初始化一個字串用來儲存目前相同的prefix
        for (int i = 0; i < strs.length; i++){                            //用for迴圈走訪整個陣列
            while (result.length() > 0){                                  //當結果的字串大於零進入迴圈
                if (strs[i].startsWith(result))                           //使用stratsWith方法找出相同的prefix
                    break;                                                //若相同跳出迴圈
                else
                    result = result.substring(0, result.length() - 1);    //不相同則使原本的結果字串捨去最後一個位置的字元
            }
        }
        return result;
    }
}
