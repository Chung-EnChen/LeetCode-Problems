class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)                           //如果陣列內容為0，回傳0
            return 0;
        else if (nums.length == 1)                      //如果陣列內容只有一個元素，回傳1
            return 1;
        else{
            int count = 1;                              //令一個整數為1(因為至少有兩個不同的數字，但是陣列從0開始算)，負責儲存目前有幾個不同的數字
            for (int i = 1; i < nums.length ; i++){
                if (nums[i] != nums[i - 1]){            //如果陣列的當前元素與上一個不同
                    nums[count] = nums[i];              //陣列中的索引值取當前紀錄的長度，令該索引值內的元素等於當前的元素
                    count++;                            //不同數字+1
                }
            }
            return count;                               //把最後算到有幾個不同數字的值回傳
        }
    }
}
