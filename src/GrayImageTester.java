public class GrayImageTester
{
    public static void main(String[] args)
    {
        System.out.println("---- TESTING PART A ----");
        int[][] values = {{255, 184, 178, 84, 135},
                {84, 255, 255, 130, 84},
                {78, 255, 0, 0, 78},
                {84, 130, 255, 130, 84}};

        GrayImage image = new GrayImage(values);

        System.out.println("white count should be 5 and is: " + image.countWhitePixels());

        System.out.println("\n---- TESTING PART B ----");
        System.out.println("BEFORE processing image:");

        // print imate
        image.printValues();

        // process image
        image.processImage();

        System.out.println();
        System.out.println("AFTER process image:");

        // print processed image
        image.printValues();
    }
}