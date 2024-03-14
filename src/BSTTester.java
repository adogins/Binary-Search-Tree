public class BSTTester {
    public static void main (String[] args) {
        int num1, num2, num3, num4, num5, num6, num7, num8, num9;
        num1 = 8;
        num2 = 3;
        num3 = 10;
        num4 = 14;
        num5 = 1;
        num6 = 6;
        num7 = 13;
        num8 = 7;
        num9 = 4;
        String str = num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6 + ", " + num7 + ", " + num8 + ", " + num9;
        System.out.println("Numbers entered: " + str);
        runTests();
        } // main
        public static void runTests() {
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            insertTest();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            preorderTest();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            postorderTest();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            inorderTest();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest2();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest3();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest4();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            insertTest2();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest5();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest6();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
        } // runTests
        public static void insertTest() {
            BST list = new BST();
            int num1 = 8;
            int num2 = 3;
            int num3 = 10;
            int num4 = 14;
            int num5 = 1;
            int num6 = 6;
            int num7 = 13;
            int num8 = 7;
            int num9 = 4;
            list.insert(num1);
            list.insert(num2);
            list.insert(num3);
            list.insert(num4);
            list.insert(num5);
            list.insert(num6);
            list.insert(num7);
            list.insert(num8);
            list.insert(num9);
            if (list.size() == 9) {
                System.out.println("insertTest: PASSED");
            } else {
                System.out.println("insertTest: FAILED");
            } // if
        } // insertTest
        public static void deleteTest() {
            BST list = new BST();
            int num1 = 8;
            int num2 = 3;
            int num3 = 10;
            int num4 = 14;
            int num5 = 1;
            int num6 = 6;
            int num7 = 13;
            int num8 = 7;
            int num9 = 4;
            list.insert(num1);
            list.insert(num2);
            list.insert(num3);
            list.insert(num4);
            list.insert(num5);
            list.insert(num6);
            list.insert(num7);
            list.insert(num8);
            list.insert(num9);
            list.delete(num5);
            if (list.size() == 8) {
                System.out.println("deleteTest: PASSED");
            } else {
                System.out.println("deleteTest: FAILED");
            } // if
        } // deleteTest
        public static void preorderTest() {
            BST list = new BST();
            int num1 = 8;
            int num2 = 3;
            int num3 = 10;
            int num4 = 14;
            int num5 = 1;
            int num6 = 6;
            int num7 = 13;
            int num8 = 7;
            int num9 = 4;
            list.insert(num1);
            list.insert(num2);
            list.insert(num3);
            list.insert(num4);
            list.insert(num5);
            list.insert(num6);
            list.insert(num7);
            list.insert(num8);
            list.insert(num9);
            System.out.println("Preorder");
            list.preorder();
        } // preorderTest
        public static void postorderTest() {
            BST list = new BST();
            int num1 = 8;
            int num2 = 3;
            int num3 = 10;
            int num4 = 14;
            int num5 = 1;
            int num6 = 6;
            int num7 = 13;
            int num8 = 7;
            int num9 = 4;
            list.insert(num1);
            list.insert(num2);
            list.insert(num3);
            list.insert(num4);
            list.insert(num5);
            list.insert(num6);
            list.insert(num7);
            list.insert(num8);
            list.insert(num9);
            System.out.println("Postorder");
            list.postorder();
        } // postorderTest
        public static void inorderTest() {
            BST list = new BST();
            int num1 = 8;
            int num2 = 3;
            int num3 = 10;
            int num4 = 14;
            int num5 = 1;
            int num6 = 6;
            int num7 = 13;
            int num8 = 7;
            int num9 = 4;
            list.insert(num1);
            list.insert(num2);
            list.insert(num3);
            list.insert(num4);
            list.insert(num5);
            list.insert(num6);
            list.insert(num7);
            list.insert(num8);
            list.insert(num9);
            System.out.println("Inorder");
            list.inorder();
        } // inorderTest
        // Removing an element
        public static void deleteTest2() {
            BST list = new BST();
            int num1 = 8;
            int num2 = 3;
            int num3 = 10;
            int num4 = 14;
            int num5 = 1;
            int num6 = 6;
            int num7 = 13;
            int num8 = 7;
            int num9 = 4;
            list.insert(num1);
            list.insert(num2);
            list.insert(num3);
            list.insert(num4);
            list.insert(num5);
            list.insert(num6);
            list.insert(num7);
            list.insert(num8);
            list.insert(num9);
            list.delete(num6);
            System.out.println("Delete Test 2");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // deleteTest2
        // Removing more than one element
        public static void deleteTest3() {
            BST list = new BST();
            int num1 = 8;
            int num2 = 3;
            int num3 = 10;
            int num4 = 14;
            int num5 = 1;
            int num6 = 6;
            int num7 = 13;
            int num8 = 7;
            int num9 = 4;
            list.insert(num1);
            list.insert(num2);
            list.insert(num3);
            list.insert(num4);
            list.insert(num5);
            list.insert(num6);
            list.insert(num7);
            list.insert(num8);
            list.insert(num9);
            list.delete(num6);
            list.delete(num4);
            System.out.println("Delete Test 3");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // deleteTest3
        public static void deleteTest4() {
            BST list = new BST();
            int num1 = 8;
            int num2 = 3;
            int num3 = 10;
            int num4 = 14;
            int num5 = 1;
            int num6 = 6;
            int num7 = 13;
            int num8 = 7;
            int num9 = 4;
            list.insert(num1);
            list.insert(num2);
            list.insert(num3);
            list.insert(num4);
            list.insert(num5);
            list.insert(num6);
            list.insert(num7);
            list.insert(num8);
            list.insert(num9);
            list.delete(num1);
            list.delete(num3);
            list.delete(num7);
            System.out.println("Delete Test 4");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // deleteTest4
        public static void insertTest2() {
            BST list = new BST();
            int num1 = 789;
            int num2 = 153;
            int num3 = 808;
            int num4 = 180;
            int num5 = 91;
            int num6 = 328;
            int num7 = 774;
            int num8 = 57;
            int num9 = 694;
            int num10 = 320;
            list.insert(num1);
            list.insert(num2);
            list.insert(num3);
            list.insert(num4);
            list.insert(num5);
            list.insert(num6);
            list.insert(num7);
            list.insert(num8);
            list.insert(num9);
            list.insert(num10);
            System.out.println("Insert Test 2");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // insertTest2
        public static void deleteTest5() {
            BST list = new BST();
            int num1 = 8;
            int num2 = 3;
            int num3 = 10;
            int num4 = 14;
            int num5 = 1;
            int num6 = 6;
            int num7 = 13;
            int num8 = 7;
            int num9 = 4;
            list.insert(num1);
            list.insert(num2);
            list.insert(num3);
            list.insert(num4);
            list.insert(num5);
            list.insert(num6);
            list.insert(num7);
            list.insert(num8);
            list.insert(num9);
            list.delete(num1);
            list.delete(num3);
            list.delete(num7);
            list.delete(num4);
            System.out.println("Delete Test 5");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // deleteTest5
        public static void deleteTest6() {
            BST list = new BST();
            int num1 = 378;
            int num2 = 749;
            int num3 = 582;
            int num4 = 509;
            int num5 = 298;
            list.insert(num1);
            list.insert(num2);
            list.insert(num3);
            list.insert(num4);
            list.insert(num5);
            System.out.println("Deleting a number that doesn't exist.");
            list.delete(365);
            list.delete(num4);
            System.out.println("Delete Test 6");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // deleteTest6
} // BSTTester
