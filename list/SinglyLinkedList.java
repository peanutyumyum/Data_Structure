package linked_list;

public class SinglyLinkedList {
    private int data;

    /*
     * [Class] Node
     *   1) 개요
     *     - SinglyLinkedList의 data를 담는 노드
     *     - 각 노드는 다음 노드를 가리키고 있어야 함
     *     - data type은 정수라고 가정
     *   2) 필수 operation
     *     - 생성자
     *     - getData(): 현재 노드가 가지고 있는 data를 반환하는 함수
     *     - getNext(): 현재 노드가 가리키고 있는 Node를 반환하는 함수
     *     - setNext(): 현재 노드의 가리키고 있는 Node를 설정하는 함수
     */

    private static class Node {
        private int data;	// Node에서 저장하는 data
        private Node next;	// Node가 가리키고 있는 다음 노드

        /* [필수] 생성자 */
        public Node(int d) {
            data = d;
            next = null;
            // 구현
        }

        /* [필수] getData() */
        public int getData() {
            return data;
            // 구현
        }

        /* [필수] getNext() */
        public Node getNext() {
            return next;
            // 구현
        }

        /* [필수] setNext() */
        public void setNext(Node n) {
            next = n;
            // 구현
        }
    }

    /*
     * [Class] SinglyLinkedList
     *   1) 개요
     *     - LinkedList의 첫 번째 노드를 가리키는 head와 마지막 노드를 가리키는 tail이 존재
     *       -> head/tail을 dummy 노드로 만들어도 좋고, 데이터를 가진 노드로 만들어도 좋음
     *     - data를 처음/마지막에 추가, 삭제하는 함수를 만들면 됨
     *   2) 필수 operation
     *     - getFirst(): linked list의 첫 번째 노드의 data를 반환하는 함수
     *     - getLast(): linked list의 마지막 노드의 data를 반환하는 함수
     *     - addFirst(): linked list의 맨 앞에 데이터를 추가
     *     - addLast(): linked list의 맨 뒤에 데이터를 추가
     *   3) 추가 operation
     *     - removeFirst(): linked list의 맨 앞의 노드를 삭제
     *     - printList(): linked list의 모든 데이터를 출력
     */

    private Node head;	// data의 첫 부분을 가리키는 노드
    private Node tail;	// data의 마지막 부분을 가리키는 노드
    private int size;	// 리스트의 크기를 출력하는 노드 (필요시 사용)

    /* [필수] 생성자 */
    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
        // 구현
    }

    /* 필요시 구현 */
    public int size() {
        return size;
        // 구현
    }

    /* 필요시 구현 */
    public boolean isEmpty() {
        return size == 0;
        // 구현
    }

    /*
     * [필수] getFirst()
     *   - 노드가 아니라 데이터를 반환해야 함
     *   - 만약 없을 경우 -1 리턴
     */
    public int getFirst() {
        if (head == null) {
            return -1;
        } else {
            return head.getData();
        }
        // 구현
    }

    /* [필수] getLast() */
    public int getLast() {
        if (tail == null) {
            return -1;
        } else {
            return tail.getData();
        }
        // 구현
    }

    /*
     * [필수] addFirst()
     *   - 데이터를 입력받아서 추가
     */
    public void addFirst(int data) {
        Node n = new Node(data);
        if (size == 0) {
            head = n;
            tail = n;
        } else {
            n.setNext(head);
            head = n;
        }
        ++size;
    }

    /* [필수] addLast() */
    public void addLast(int data) {
        Node n = new Node(data);
        if (size == 0) {
            head = n;
            tail = n;
        } else {
            tail.setNext(n);
            tail = n;
        }
        ++size;
    }

    /*
     *  removeFirst()
     *    - 첫 번째 노드를 삭제하고 data를 반환
     *    - 만약 없을 경우 -1 리턴
     */
    public int removeFirst() {
        if (size == 0) {
            return -1;
        } else {
            Node remove_node = head;
            head = remove_node.getNext();
            int return_data = remove_node.getData();
            remove_node = null;
            --size;
            return return_data;
        }
    }

    /*
     * printList() : 재귀함수나 반복문으로 구현
     *   - 형식은 다음과 같이 구현 (마지막 개행 포함)
     *   > 1 2 3 4 5
     */
    public void printList() {
        if (size == 0) {
            return ;
        } else {
            Node print = head;
            for (int i = size; i > 0; --i) {
                System.out.println(print.getData());
                print = print.getNext();
            }
        }
        // 구현
    }
}
