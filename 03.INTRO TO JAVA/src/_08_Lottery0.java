public class _08_Lottery0 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i1 = 1; i1 <= 8; i1++){
            for (int i2 = i1 + 1; i2 <= 9; i2++){
                for (int i3 = i2 + 1; i3 <= 10; i3++){
                    builder.append(String.format("%d %d %d%n", i1, i2, i3));
                }
            }
        }
        System.out.printf(builder.toString());
    }
}
