/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package P1.poet;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Example program using GraphPoet.
 * <p>
 * <p>PS2 instructions: you are free to change this example class.
 */
public class Main {

    /**
     * Generate example poetry.
     *
     * @param args unused
     * @throws IOException if a poet corpus file cannot be found or read
     */
    public static void main(String[] args) throws IOException {
//        final GraphPoet nimoy = new GraphPoet(new File("src/P1/poet/mugar-omni-theater.txt"));
//        final String input = "Test the system.";
//        System.out.println(input + "\n>>>\n" + nimoy.poem(input));
        List<Integer> number = new LinkedList<>();
        number.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        for (Integer i : number) {
            if (i > 5)
                number.remove(i);
        }
        System.out.println(number.toString());
    }

}
