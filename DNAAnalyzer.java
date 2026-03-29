/**
 * DNAAnalyzer.java
 * A tool to analyze DNA sequences
 */

import java.util.HashMap;

public class DNAAnalyzer {

    // Calculate GC Content
    public static double gcContent(String seq) {
        int g = 0, c = 0;

        for (char base : seq.toUpperCase().toCharArray()) {
            if (base == 'G') g++;
            else if (base == 'C') c++;
        }

        return ((double) (g + c) / seq.length()) * 100;
    }

    // Generate Reverse Complement
    public static String reverseComplement(String seq) {
        StringBuilder revComp = new StringBuilder();

        for (int i = seq.length() - 1; i >= 0; i--) {
            char base = Character.toUpperCase(seq.charAt(i));

            switch (base) {
                case 'A': revComp.append('T'); break;
                case 'T': revComp.append('A'); break;
                case 'G': revComp.append('C'); break;
                case 'C': revComp.append('G'); break;
                default: revComp.append('N'); // unknown base
            }
        }

        return revComp.toString();
    }

    // Count Bases
    public static HashMap<Character, Integer> baseCount(String seq) {
        HashMap<Character, Integer> count = new HashMap<>();

        for (char base : seq.toUpperCase().toCharArray()) {
            count.put(base, count.getOrDefault(base, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        String dna = args.length > 0 ? args[0] : "ATGCGTACGTAGCTAG";

        System.out.println("🧬 DNA Analyzer");
        System.out.println("------------------------");
        System.out.println("Sequence: " + dna);
        System.out.println("Length: " + dna.length());
        System.out.println("GC Content: " + gcContent(dna) + "%");
        System.out.println("AT Content: " + (100 - gcContent(dna)) + "%");
        System.out.println("Reverse Complement: " + reverseComplement(dna));
        System.out.println("Base Count: " + baseCount(dna));
    }
}