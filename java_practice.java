public class java_practice {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
            System.out.println(nums[i]);
        }

        String[][][] members = { { { "suzuki" }, { "165cm", "65kg" } }, { { "tanaka" }, { "170cm", "70kg" } } };
        System.out.println(members[0][1][1]);

    }
}
