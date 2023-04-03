import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class StringListSearchTest {
    @Test
    public void testUnorderedSearch() {
        ArrayList<String> inputItems;
        String inputTerm;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        inputTerm = "the";
        expectedOutput = 2;
        actualOutput = StringListSearch.unorderedSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);


        inputItems = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        inputTerm = "there";
        expectedOutput = 0;
        actualOutput = StringListSearch.unorderedSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);

        inputItems = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        inputTerm = "valley";
        expectedOutput = -1;
        actualOutput = StringListSearch.unorderedSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);

        inputItems = new ArrayList<>(Arrays.asList("there", "is", "the", "mountain"));
        inputTerm = "mountain";
        expectedOutput = 3;
        actualOutput = StringListSearch.unorderedSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testOrderedLinearSearch() {
        ArrayList<String> inputItems;
        String inputTerm;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList("mountain","the","there","is"));
        inputTerm = "the";
        expectedOutput = 1;
        actualOutput = StringListSearch.orderedLinearSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);


        inputItems = new ArrayList<>(Arrays.asList("mountain","the","there","is"));
        inputTerm = "there";
        expectedOutput = 2;
        actualOutput = StringListSearch.orderedLinearSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);

        inputItems = new ArrayList<>(Arrays.asList("mountain","the","there","is"));
        inputTerm = "valley";
        expectedOutput = -1;
        actualOutput = StringListSearch.orderedLinearSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);

        inputItems = new ArrayList<>(Arrays.asList("mountain","the","there","is"));
        inputTerm = "mountain";
        expectedOutput = 0;
        actualOutput = StringListSearch.orderedLinearSearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testBinarySearch() {
        ArrayList<String> inputItems;
        String inputTerm;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        inputItems = new ArrayList<>(Arrays.asList("mountain","the","there","is"));
        inputTerm = "the";
        expectedOutput = 1;
        actualOutput = StringListSearch.binarySearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);


        inputItems = new ArrayList<>(Arrays.asList("mountain","the","there","is"));
        inputTerm = "there";
        expectedOutput = 2;
        actualOutput = StringListSearch.binarySearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
        
        inputItems = new ArrayList<>(Arrays.asList("mountain","the","there","is"));
        inputTerm = "valley";
        expectedOutput = -1;
        actualOutput = StringListSearch.binarySearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
        

        inputItems = new ArrayList<>(Arrays.asList("mountain","the","there","is"));
        inputTerm = "mountain";
        expectedOutput = 0;
        actualOutput = StringListSearch.binarySearch(inputItems, inputTerm);
        assertEquals(expectedOutput, actualOutput);
    }
}
