//使用recursive解題

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)                                   //如果第一個list為空，回傳l2
            return l2;
        else if (l2 == null)                              //如果第二個list為空，回傳l1
            return l1;
        else{                                             //其餘狀況則做以下事情
            if (l1.val >= l2.val){                        //如果第一個list的物件大於第二個list的物件
                l2.next = mergeTwoLists(l1, l2.next);     //讓第二個list的該物件指向下一個mergeTowList的物件
                return l2;                                //回傳目前第二個list的內容
            }else{
                l1.next = mergeTwoLists(l1.next, l2);     //如果第二個list的物件大於第一個list的物件，則讓第一個list的物件指向下個物件
                return l1;                                //回傳目前第一個list的內容
            }
        }
    }
}
