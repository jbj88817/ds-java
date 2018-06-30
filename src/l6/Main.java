package l6;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {5, 3, 6, 8, 4, 2};
        for (int num : nums) {
            bst.add(num);
        }

//        bst.preOrder();
//        System.out.println();
//        bst.preOrderNR();
//        System.out.println();
//        bst.inOrder();
//        System.out.println();
//        bst.inOrderNR();
//        System.out.println();
        bst.postOrder();
        System.out.println();
        bst.postOrderNR();
//        System.out.println(bst);
    }
}
