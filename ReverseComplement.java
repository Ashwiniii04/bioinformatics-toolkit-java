/**
 * ReverseComplement.java
 * Generates reverse complement of DNA sequence
 */

public class ReverseComplement {

    public static String getReverseComplement(String seq) {
        StringBuilder revComp = new StringBuilder();

        for (int i = seq.length() - 1; i >= 0; i--) {
            char base = Character.toUpperCase(seq.charAt(i));

            switch (base) {
                case 'A': revComp.append('T'); break;
                case 'T': revComp.append('A'); break;
                case 'G': revComp.append('C'); break;
                case 'C': revComp.append('G'); break;
                default: revComp.append('N');
            }
        }

        return revComp.toString();
    }

    public static void main(String[] args) {
        String seq = args.length > 0 ? args[0] : "ATGC";

        System.out.println("🔁 Reverse Complement Tool");
        System.out.println("--------------------------");
        System.out.println("Input: " + seq);
        System.out.println("Reverse Complement: " + getReverseComplement(seq));
    }
}