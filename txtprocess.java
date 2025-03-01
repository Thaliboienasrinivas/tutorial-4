public class TextProcessing {
    public static void concatenateStrings() {
        String str = "";
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) str += "Hello";
        long end = System.nanoTime();
        System.out.println("String Concatenation Time: " + (end - start) + "ns");

        StringBuilder sb = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) sb.append("Hello");
        end = System.nanoTime();
        System.out.println("StringBuilder Concatenation Time: " + (end - start) + "ns");

        StringBuffer sf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) sf.append("Hello");
        end = System.nanoTime();
        System.out.println("StringBuffer Concatenation Time: " + (end - start) + "ns");
    }

    public static void reverseStrings(String text) {
        StringBuilder sb = new StringBuilder(text);
        long start = System.nanoTime();
        sb.reverse();
        long end = System.nanoTime();
        System.out.println("StringBuilder Reverse: " + sb + " | Time: " + (end - start) + "ns");

        StringBuffer sf = new StringBuffer(text);
        start = System.nanoTime();
        sf.reverse();
        end = System.nanoTime();
        System.out.println("StringBuffer Reverse: " + sf + " | Time: " + (end - start) + "ns");
    }

    public static void replaceStrings(String text, String target, String replacement) {
        long start = System.nanoTime();
        String str = text.replace(target, replacement);
        long end = System.nanoTime();
        System.out.println("String Replacement: " + str + " | Time: " + (end - start) + "ns");

        StringBuilder sb = new StringBuilder(text);
        start = System.nanoTime();
        int index;
        while ((index = sb.indexOf(target)) != -1) sb.replace(index, index + target.length(), replacement);
        end = System.nanoTime();
        System.out.println("StringBuilder Replacement: " + sb + " | Time: " + (end - start) + "ns");

        StringBuffer sf = new StringBuffer(text);
        start = System.nanoTime();
        while ((index = sf.indexOf(target)) != -1) sf.replace(index, index + target.length(), replacement);
        end = System.nanoTime();
        System.out.println("StringBuffer Replacement: " + sf + " | Time: " + (end - start) + "ns");
    }

    public static void main(String[] args) {
        concatenateStrings();
        reverseStrings("JavaProgramming");
        replaceStrings("JavaJavaJava", "Java", "Python");
    }
}
