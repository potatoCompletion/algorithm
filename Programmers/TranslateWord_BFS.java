import java.util.*;

class Main {
    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        int wordNum = begin.length();
        List<String> founded = new ArrayList<>();

        Queue<String[]> queue = new LinkedList<>();
        queue.offer(new String[]{ begin, "0" });

        while (!queue.isEmpty()) {
            String[] current = queue.poll();
            String currentStr = current[0];
            int count = Integer.parseInt(current[1]);

            if (currentStr.equals(target)) {
                System.out.println(count);
                return;
            }

            for (String word : words) {
                int diffCount = 0;
                for (int i = 0; i < wordNum; i++) {
                    if (currentStr.charAt(i) != word.charAt(i)) {
                        diffCount++;
                    }
                }

                if (diffCount == 1 && !founded.contains(word)) {
                    founded.add(word);
                    queue.offer(new String[]{ word, String.valueOf(count + 1) });
                }
            }
        }
    }
}

