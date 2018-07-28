class Solution {
    public boolean isValid(String s) {
        Stack<Character> list = new Stack<Character>();                  //利用stack來判斷括號順序
        char[] temp = s.toCharArray();                                   //把字串轉成char陣列
        for (int i = 0; i < temp.length; i++){                           //利用FOR迴圈走訪整個char陣列
            if(temp[i] == '(')                                           //如果有遇到左括號的就先把對應的右括號放進stack
                list.push(')');
            else if (temp[i] == '{')
                list.push('}');
            else if (temp[i] == '[')
                list.push(']');
            else if (list.isEmpty() || list.pop() != temp[i])            //放完後再慢慢POP出來，如果POP出來的括號不對，回傳FALSE
                return false;
        }
        return list.isEmpty();                                           //全部元素POP出來沒有問題，最後stack如果是空的，回傳true
    }
}
