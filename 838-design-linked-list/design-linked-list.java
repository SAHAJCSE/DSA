class MyLinkedList {

    ListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if(index < 0 || index >= size) return -1;

        ListNode curr = head;

        for(int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr.val;
    }

    public void addAtHead(int val) {
        ListNode ele = new ListNode(val);

        ele.next = head;
        head = ele;

        size++;
    }

    public void addAtTail(int val) {
        ListNode ele = new ListNode(val);

        if(head == null) {
            head = ele;
        } else {
            ListNode curr = head;

            while(curr.next != null) {
                curr = curr.next;
            }

            curr.next = ele;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size) return;

        if(index == 0) {
            addAtHead(val);
            return;
        }

        ListNode ele = new ListNode(val);
        ListNode curr = head;

        for(int i = 0; i < index - 1; i++) {
            curr = curr.next;
        }

        ele.next = curr.next;
        curr.next = ele;

        size++;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;

        if(index == 0) {
            head = head.next;
        } else {
            ListNode curr = head;

            for(int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }

            curr.next = curr.next.next;
        }

        size--;
    }
}