public class ItemGridTester
{
    public static void main(String[] args)
    {
        System.out.println("Setting everything up...");

        // set up sample grid shown in Exploration
        Item item0_0 = new Item("acorn", 7);
        Item item0_1 = new Item("book", 10);
        Item item0_2 = new Item("carrot", 8);
        Item item0_3 = new Item("desk", 9);
        Item item1_0 = new Item("egg", 5);
        Item item1_1 = new Item("flag", 8);
        Item item1_2 = new Item("globe", 8);
        Item item1_3 = new Item("harp", 9);
        Item item2_0 = new Item("island", 7);
        Item item2_1 = new Item("jacket", 19);
        Item item2_2 = new Item("kale", 8);
        Item item2_3 = new Item("lunch", 16);

        Item[][] gridOfItems = {{item0_0, item0_1, item0_2, item0_3},
                {item1_0, item1_1, item1_2, item1_3},
                {item2_0, item2_1, item2_2, item2_3}};

        // create test itemGrid object
        ItemGrid ig = new ItemGrid(gridOfItems);

        // TEST PART A
        System.out.println("\n---- TESTING PART A ----");

        String test1 = ig.mostValuableNeighbor(0, 2);
        String test2 = ig.mostValuableNeighbor(1, 1);
        String test3 = ig.mostValuableNeighbor(2, 0);
        String test4 = ig.mostValuableNeighbor(2, 3);

        boolean partBtests = test1.equals("book") && (test2.equals("flag") || test2.equals("globe")) &&
                test3.equals("jacket") && test4.equals("lunch");

        if (partBtests)
        {
            System.out.println("Tesing Part A PASSED!");
        }
        else
        {
            System.out.println("*** Tesing Part A FAILED! ***");
            System.out.println("*** test1 should be book and is: " + test1);
            System.out.println("*** test2 should be flag or globe and is: " + test2);
            System.out.println("*** test3 should be jacket and is: " + test3);
            System.out.println("*** test4 should be lunch and is: " + test4);
        }

        // TEST PART B
        System.out.println("\n---- TESTING PART B ----");

        double actualAverage = ig.findAverage();
        double expectedAverage = 9.5;

        if (actualAverage == expectedAverage)
        {
            System.out.println("Tesing Part B PASSED!");
        }
        else
        {
            System.out.println("*** Tesing Part B FAILED! ***");
            System.out.println("*** findAverage() should return " + expectedAverage + " but returned: " + actualAverage);
        }

    }

}