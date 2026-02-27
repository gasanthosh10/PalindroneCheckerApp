import java.util.Deque;
class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindroneCheckerApp {

    // head of linked list
    static Node head = null;

    // insert at end
    static void insert(char data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // reverse a linked list
    static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    // palindrome check
    static boolean isPalindrome() {

        if(head == null || head.next == null)
            return true;

        // Step 1: find middle (fast & slow pointer)
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: reverse second half
        Node secondHalf = reverse(slow.next);

        // Step 3: compare halves
        Node firstHalf = head;

        while(secondHalf != null) {
            if(firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // convert string to linked list
        for(int i = 0; i < word.length(); i++) {
            insert(word.charAt(i));
        }

        // check palindrome
        if(isPalindrome()) {
            System.out.println("The string \"" + word + "\" is a PALINDROME.");
        } else {
            System.out.println("The string \"" + word + "\" is NOT a palindrome.");
        }
    }
}