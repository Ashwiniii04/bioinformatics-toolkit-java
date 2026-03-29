# 🧬 DNA Analyzer

A Java-based bioinformatics toolkit for reading and analyzing DNA sequences in FASTA format. This project provides core utilities for common DNA analysis tasks including GC content calculation and reverse complement generation.

---

## 📁 Project Structure

```
DNAAnalyzer/
├── DNAAnalyzer.java        # Main entry point — orchestrates the analysis pipeline
├── FastaReader.java        # Parses FASTA-format sequence files
├── GCContent.java          # Calculates GC content of DNA sequences
└── ReverseComplement.java  # Generates the reverse complement of a DNA strand
```

---

## ✨ Features

- **FASTA File Parsing** — Reads standard `.fasta` / `.fa` files with support for multi-sequence files
- **GC Content Analysis** — Computes the percentage of Guanine (G) and Cytosine (C) bases in a sequence
- **Reverse Complement** — Returns the reverse complementary strand (A↔T, G↔C) of any DNA sequence
- **Modular Design** — Each utility is a standalone class, easy to extend or reuse

---

## 🚀 Getting Started

### Prerequisites

- Java 8 or higher
- A terminal / command prompt

### Compilation

```bash
javac *.java
```

### Usage

```bash
java DNAAnalyzer <path-to-fasta-file>
```

**Example:**
```bash
java DNAAnalyzer sample.fasta
```

---

## 📄 Sample FASTA Input

```
>sequence_1
ATGCGTACGTTAGCTAGCTAGCTA
>sequence_2
GCTAGCTAGCTAGCTAGCTAGCTA
```

---

## 📊 Sample Output

```
Sequence: sequence_1
  GC Content     : 47.83%
  Reverse Complement: TAGCTAGCTAGCTAGCTAGCTAGCTA

Sequence: sequence_2
  GC Content     : 52.17%
  Reverse Complement: TAGCTAGCTAGCTAGCTAGCTAGC
```

---

## 🔬 Module Details

### `FastaReader.java`
Reads a `.fasta` file and returns a map of sequence IDs to their nucleotide strings. Handles multi-line sequences and ignores comment lines.

### `GCContent.java`
Takes a nucleotide string and returns the GC percentage:
```
GC% = (count of G + count of C) / total bases × 100
```

### `ReverseComplement.java`
Reverses the sequence and applies Watson-Crick base pairing:
| Base | Complement |
|------|------------|
| A    | T          |
| T    | A          |
| G    | C          |
| C    | G          |

### `DNAAnalyzer.java`
The main driver class. Ties all modules together — reads input, runs analysis, and prints results.

---

## 🛠️ Extending the Project

You can add more analysis modules by following the same pattern:
1. Create a new `.java` class with a static `analyze(String sequence)` method
2. Call it from `DNAAnalyzer.java`

Possible extensions:
- Codon frequency analysis
- ORF (Open Reading Frame) finder
- Sequence alignment (Needleman-Wunsch / Smith-Waterman)
- Melting temperature calculator

---

## 👤 Author

**Ashwiniii04**  
[GitHub Profile](https://github.com/Ashwiniii04)

---

## 📜 License

This project is open source .
