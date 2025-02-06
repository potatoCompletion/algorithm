class Main {
    static int count = 0;

    public static void main(String[] args) {
        int[] numbers = new int[]{4, 1, 2, 1};
        int target = 4;

        plusOrMinus_DFS(numbers, target, 0, 0);
        System.out.println(count);
    }

    public static void plusOrMinus_DFS(int[] numbers, int target, int currentSum, int currentIndex) {
        if (currentIndex >= numbers.length) {
            if (currentSum == target) {
                count++;
            }
            return;
        }

        plusOrMinus_DFS(numbers, target, currentSum + numbers[currentIndex], currentIndex + 1);
        plusOrMinus_DFS(numbers, target, currentSum - numbers[currentIndex], currentIndex + 1);
    }
}

