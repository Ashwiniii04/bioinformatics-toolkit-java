
/**
 * FastaReader.java
 * Reads sequence from FASTA file
 */

import java.io.*;

public class FastaReader {

    public static String readFasta(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        StringBuilder sequence = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            if (!line.startsWith(">")) {
                sequence.append(line.trim());
            }
        }

        br.close();
        return sequence.toString();
    }

    public static void main(String[] args) {
        String filePath = args.length > 0 ? args[0] : "data/sample.fasta";

        try {
            String seq = readFasta(filePath);

            System.out.println("📄 FASTA Reader");
            System.out.println("------------------------");
            System.out.println("File: " + filePath);
            System.out.println("Sequence Length: " + seq.length());
            System.out.println("Sequence Preview: " + seq.substring(0, Math.min(50, seq.length())) + "...");
        } catch (Exception e) {
            System.out.println("❌ Error reading file: " + e.getMessage());
        }
    }
}