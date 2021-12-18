import java.util.Arrays;
import java.util.List;

public class SortingBenchmarkTest {

    public static void main(String[] args) {
        List<Sorter> sorters = List.of(
                new BubbleSort(),
                new QuickSorter1(),
                new QuickSorter2(),
                new QuickSorter3(),
                new MergeSorter()
        );

        int[][] testCases = new int[][]{
                {9, 8, 7, 6, 5, 4, 3},
                {1, 2, 3, 4, 5, 6, 7},
                {4, 2, 3, 1, 5, 6, 7},
                {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                {7, -1, -1, 15, 6, 5, -2, 0, 1, 0, 2, 4, 11}
        };

        int testCaseNum = 1;
        for (int[] arr : testCases) {
            System.out.println("TEST CASE " + testCaseNum);
            for (Sorter sorter : sorters) {
                int[] testArr = arr.clone();
                sorter.sort(testArr);
                System.out.println("Name: " + sorter.sortingName() + " | Compare operation count: " + sorter.getCompareCount());
                System.out.println(Arrays.toString(testArr));
            }
            testCaseNum++;
        }

    }
}
