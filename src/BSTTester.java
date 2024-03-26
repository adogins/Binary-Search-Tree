import java.util.ArrayList;
import java.util.Scanner;

public class BSTTester {
    public static void main (String[] args) {
        System.out.println("Test");
        /* general tester (stops when a number that can't be deleted though) */
        try {
            test1();
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Element not found!");
        } catch (Throwable e) {
            System.err.println(e);
        } // try
        //*/
        //runTests();
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
            insertTest3();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            insertTest4();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            duplicateTest();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            inputTest();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest7();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest8();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest9();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest10();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest11();
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            deleteTest12();
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
            list.insert(8);
            list.insert(3);
            list.insert(10);
            list.insert(14);
            list.insert(1);
            list.insert(6);
            list.insert(13);
            list.insert(7);
            list.insert(4);
            list.delete(8);
            list.delete(7);
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
        // Testing inserting many nodes and testing deletion of a node with one child.
        public static void insertTest3() {
            BST list = new BST();
            int num1 = 582;
            int num2 = 714;
            int num3 = 201;
            int num4 = 702;
            int num5 = 572;
            int num6 = 225;
            int num7 = 495;
            int num8 = 475;
            int num9 = 987;
            int num10 = 436;
            int num11 = 531;
            int num12 = 629;
            int num13 = 517;
            int num14 = 176;
            int num15 = 354;
            int num16 = 859;
            int num17 = 912;
            int num18 = 135;
            int num19 = 472;
            int num20 = 242;
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
            list.insert(num11);
            list.insert(num12);
            list.insert(num13);
            list.insert(num14);
            list.insert(num15);
            list.insert(num16);
            list.insert(num17);
            list.insert(num18);
            list.insert(num19);
            list.insert(num20);
            list.delete(225);
            System.out.println("Insert Test 3");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // insertTest3
        public static void insertTest4() {
            BST list = new BST();
            list.insert(916);
            list.insert(436);
            list.insert(239);
            list.insert(841);
            list.insert(10);
            list.insert(903);
            list.insert(95);
            list.insert(971);
            list.insert(342);
            list.insert(345);
            list.insert(273);
            list.insert(351);
            list.insert(549);
            list.insert(458);
            list.insert(261);
            list.insert(27);
            list.insert(4);
            list.insert(444);
            list.insert(826);
            list.insert(103);
            list.insert(138);
            list.insert(400);
            list.insert(37);
            list.insert(240);
            list.insert(53);
            list.insert(483);
            list.insert(61);
            list.insert(344);
            list.insert(934);
            list.insert(16);
            list.insert(548);
            list.insert(931);
            list.insert(340);
            list.insert(38);
            list.insert(205);
            list.insert(488);
            list.insert(70);
            list.insert(232);
            list.insert(702);
            list.insert(821);
            list.insert(850);
            list.insert(654);
            list.insert(135);
            list.insert(418);
            list.insert(231);
            list.insert(670);
            list.insert(382);
            list.insert(304);
            list.insert(960);
            list.insert(131);
            System.out.println("Insert Test 4");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // insertTest4
        public static void duplicateTest() {
            BST list = new BST();
            list.insert(1);
            list.insert(2);
            list.insert(3);
            list.insert(4);
            list.insert(5);
            list.insert(6);
            list.insert(7);
            list.insert(5);
            System.out.println("Duplicate Test");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // duplicateTest
        public static void inputTest() {
            BST list = new BST();
            list.insert(8);
            list.insert(17);
            list.insert(87);
            list.insert(-9);
            list.insert(45);
            System.out.println("Negative number test");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // inputTest
        public static void test1() {
            BST list = new BST();
            Scanner input = new Scanner(System.in);
            ArrayList<Integer> nums = new ArrayList<Integer>();
            System.out.println("Only enter non-negative integers");
            System.out.println("List the amount of numbers you're entering: ");
            int max = input.nextInt();
            for (int i = 0; i < max; i++) {
                System.out.println("Enter a number: ");
                int x = input.nextInt();
                list.insert(x);
                nums.add(x);
            } // for
            String numbers = "";
            for (int i = 0; i < nums.size(); i++) {
                numbers += "" + nums.get(i) + ", ";
            } // for
            System.out.println("Do you want to delete any numbers? (y/n): ");
            String answer = input.next();
            if (answer.equalsIgnoreCase("y")){
                System.out.println("How many elements do you want to delete?: ");
                int deleteAmt = input.nextInt();
                System.out.println("Numbers Entered: " + numbers.substring(0, numbers.length() - 2));
                System.out.println("Delete numbers from the list above only.");
                for (int i = 0; i < deleteAmt; i++) {
                    System.out.println("Enter a number in the list to delete: ");
                    int deleteElement = input.nextInt();
                    nums.remove(nums.indexOf(deleteElement));
                    list.delete(deleteElement);
                } // for
                System.out.println("Reulting Orders of the tree");
                System.out.println("Numbers Entered: " + numbers.substring(0, numbers.length() - 2));
                System.out.println("Size: " + list.size());
                System.out.println("Preorder:");
                list.preorder();
                System.out.println("Postorder: ");
                list.postorder();
                System.out.println("Inorder: ");
                list.inorder();
            } else if (answer.equalsIgnoreCase("n")) {
                System.out.println("Reulting Orders of the tree");
                System.out.println("Numbers Entered: " + numbers.substring(0, numbers.length() - 2));
                System.out.println("Size: " + list.size());
                System.out.println("Preorder:");
                list.preorder();
                System.out.println("Postorder: ");
                list.postorder();
                System.out.println("Inorder: ");
                list.inorder();
            } // if
            input.close();
        } // test1
        public static void deleteTest7() {
            BST list = new BST();
            list.insert(347);
            list.insert(190);
            list.insert(319);
            list.insert(553);
            list.insert(329);
            list.insert(705);
            list.insert(84);
            list.insert(406);
            list.insert(734);
            list.insert(169);
            list.insert(489);
            list.insert(751);
            list.insert(244);
            list.insert(442);
            list.insert(431);
            list.delete(190);
            System.out.println("Delete Test 7");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // deleteTest7
        public static void deleteTest8() {
            BST list = new BST();
            list.insert(470);
            list.insert(234);
            list.insert(458);
            list.insert(619);
            list.insert(165);
            list.insert(956);
            list.insert(998);
            list.insert(240);
            list.insert(800);
            list.insert(473);
            list.insert(777);
            list.insert(12);
            list.delete(619);
            System.out.println("Delete Test 8");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // deleteTest8
        public static void deleteTest9() {
            BST list = new BST();
            list.insert(123);
            list.insert(577);
            list.insert(6);
            list.insert(218);
            list.insert(176);
            list.insert(353);
            list.insert(876);
            list.insert(806);
            list.insert(951);
            list.insert(304);
            list.insert(834);
            list.insert(995);
            list.delete(577);
            System.out.println("Delete Test 9");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // deleteTest9
        public static void deleteTest10() {
            BST list = new BST();
            list.insert(1);
            list.insert(86);
            list.insert(42);
            list.insert(98);
            list.insert(88);
            list.insert(72);
            list.insert(94);
            list.insert(79);
            list.insert(77);
            list.insert(93);
            list.insert(65);
            list.delete(86);
            System.out.println("Delete Test 10");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // deleteTest10
        public static void deleteTest11() {
            BST list = new BST();
            list.insert(24);
            list.insert(8);
            list.insert(84);
            list.insert(70);
            list.insert(3);
            list.insert(77);
            list.insert(20);
            list.insert(80);
            list.insert(71);
            list.insert(63);
            list.insert(93);
            list.insert(5);
            list.delete(24);
            System.out.println("Delete Test 11");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // deleteTest11
        public static void deleteTest12() {
            BST list = new BST();
            list.insert(377);
            list.insert(696);
            list.insert(791);
            list.insert(28);
            list.insert(731);
            list.insert(989);
            list.insert(632);
            list.insert(528);
            list.insert(923);
            list.insert(208);
            list.insert(850);
            list.insert(128);
            list.insert(11);
            list.insert(504);
            list.insert(411);
            list.insert(184);
            list.insert(896);
            list.insert(94);
            list.insert(466);
            list.insert(881);
            list.insert(688);
            list.insert(172);
            list.insert(179);
            list.insert(612);
            list.insert(573);
            list.delete(528);
            System.out.println("Delete Test 12");
            System.out.println("Size: " + list.size());
            System.out.println("Preorder:");
            list.preorder();
            System.out.println("Postorder: ");
            list.postorder();
            System.out.println("Inorder: ");
            list.inorder();
        } // deleteTest12
} // BSTTester

