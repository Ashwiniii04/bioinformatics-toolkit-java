/**
 * GCContent.java
 * Calculates GC percentage of DNA sequence
 */

public class GCContent {

    public static double calculateGC(String seq) {
        int gc = 0;

        for (char base : seq.toUpperCase().toCharArray()) {
            if (base == 'G' || base == 'C') {
                gc++;
            }
        }

        return ((double) gc / seq.length()) * 100;
    }

    public static void main(String[] args) {
        String seq = args.length > 0 ? args[0] : "ATGC";

        System.out.println("📊 GC Content Calculator");
        System.out.println("------------------------");
        System.out.println("Sequence: " + seq);
        System.out.println("GC Content: " + calculateGC(seq) + "%");
    }
}
