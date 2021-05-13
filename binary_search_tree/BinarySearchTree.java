public class BinarySearchTree {
    private static class Node {
        private int data;      // Node에서 저장하는 data
        private Node parent;    // 현재 Node의 부모를 가리킴
        private Node left;      // 현재 Node의 왼쪽 자식을 가리킴
        private Node right;     // 현재 Node의 오른쪽 자식을 가리킴
        
        /* [필수] 생성자 */
        public Node(int d) {
            data = d;
            parent = null;
            left = null;
            right = null;
        }
        
        /* [필수] getData() */
        public int getData() {
            return data;
        }
        
        /* [필수] getParent() */
        public Node getParent() {
            return parent;
        }
        
        /* [필수] getLeft() */
        public Node getLeft() {
            return  left;
        }
        
        /* [필수] getRight() */
        public Node getRight() {
            return right;
        }
        
        /* [필수] setParent() */
        public void setParent(Node n) {
            parent = n;
        }
        
        /* [필수] setLeft() */
        public void setLeft(Node n) {
            left = n;
        }
        
        /* [필수] setRight() */
        public void setRight(Node n) {
            right = n;
        }
    }
    
    /*
     * [Class] BinarySearchTree
     *   1) 개요
     *     - Tree의 맨 위를 가리키는 root가 있음
     *     - 데이터를 추가할 때는 작은값이 왼쪽, 큰값이 오른쪽으로 추가되게 해야 함
     *   2) 필수 operation
     *     - size(): BST의 크기를 나타내는 함수
     *     - getRoot(): BST의 root를 반환하는 함수
     *     - add(): BST에 data를 추가하는 함수
     *   3) 추가 operation
     *     - remove(): BST의 특정 data를 삭제하는 함수
     *     - inorder(): inorder 방식으로 tree를 순회하는 함수
     *     - preorder(): preorder 방식으로 tree를 순회하는 함수
     */
    
    private Node root;      // BST의 root
    private int size;       // BST의 size
    
    /* [필수] 생성자 */
    public BinarySearchTree() {
        root = null;
        size = 0;
    }
    
    /*
     * [필수] size()
     *  - BST의 size를 리턴
     */
    public int size() {
        return size;
    }
    
    /*
     * [필수] getRoot()
     *  - BST의 root를 리턴
     */
    public Node getRoot() {
        return root;
    }
    
    /*
     * [필수] add()
     *  - BST에 값 추가
     *  - 다음의 세 가지 경우 중 하나
     *    1) root가 없으면 root로 설정
     *    2-1) 현재 보고 있는 노드의 값보다 작으면 왼쪽으로 이동
     *    2-2) 현재 보고 있는 노드의 값보다 크면 오른쪽으로 이동
     *    3) 만약 해당 위치가 비어있으면 거기에 추가
     */
    public void add(int data) {
        if (size() == 0) {
            Node tree = new Node(data);
            root = tree;
            size++;
        }
        else {
            Node tree = new Node(data);
            if (root.getData() > data) {
                Node right_node = root.getLeft();
                if (root.getLeft() != null & root.getLeft().getData() > data) {

                }
            }
        }
    }

    public Node scan(Node n, int d) {
        if (n.getLeft() == null & n.getRight() == null) {
            return n;
        } else {
            n.getData();
        }
    }
    
    public Node rightMost(Node n) {

    }
    
    public Node leftMost(Node n) {

    }
    
    /*
     *  remove()
     *    - BST의 특정 data를 삭제하는 함수
     *      1) leaf node일 경우 그냥 삭제
     *      2) internal node일 경우 삭제하고 아래쪽 node를 올림
     *         - 왼쪽 sub-tree(작은 값들) 중에 가장 큰 값 or 오른쪽 sub-tree(큰 값들) 중에 가장 작은 값 중 하나를 올림
     *         - 왼쪽 sub-tree 중에 가장 큰 값을 우선적으로 올림
     *    - data가 없으면 -1을 return
     */
    public int remove(int data) {

    }
    
    /*
     *  preorder()
     *    - BST의 모든 데이터를 preorder 방식으로 출력
     *    - 출력 예시로 제공
     */
    public void preorder(Node n) {

    }
    
    /*
     *  inorder()
     *    - BST의 모든 데이터를 inorder 방식으로 출력
     *    - 출력 예시로 제공 (숫자가 정렬되어서 출력되는게 정상입니다)
     */
    public void inorder(Node n) {

    }
    
    /*
     *  inorder()
     *    - BST의 모든 데이터를 postorder 방식으로 출력
     *    - 형식은 preorder 참조
     *      예시) 1 2 3 4 5 
     */
    public void postorder(Node n) {

    }
}
