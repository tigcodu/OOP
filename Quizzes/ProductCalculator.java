public class ProductCalculator {

    public static void main(String[] args) {
        final int T = 3;
        final int R = 8;
        final int C = 2;

        float[][][] objProduct = new float[T][R][C];

        float[][] prices = {
            {503302f, 2.75f}, {503303f, 1.25f}, {503304f, 2.0f},
            {503305f, 3.89f}, {503309f, 9.0f},  {504401f, 2.25f},
            {504402f, 4.3f},  {504403f, 1.4f}
        };

        float[][] quantities = {
            {503305f, 10f}, {503302f, 22f}, {503305f, 15f},
            {503303f, 5f},  {503304f, 40f}, {503303f, 10f},
            {503309f, 10f}, {503303f, 12f}
        };

        for (int i = 0; i < R; i++) {
            objProduct[0][i][0] = prices[i][0];
            objProduct[0][i][1] = prices[i][1];
            objProduct[1][i][0] = prices[i][0];
            objProduct[1][i][1] = 0f;
        }

        for (int i = 0; i < R; i++) {
            float current_code = quantities[i][0];
            float current_qty = quantities[i][1];

            for (int j = 0; j < R; j++) {
                if (objProduct[1][j][0] == current_code) {
                    objProduct[1][j][1] += current_qty;
                    break;
                }
            }
        }

        for (int i = 0; i < R; i++) {
            float price = objProduct[0][i][1];
            float total_quantity = objProduct[1][i][1];
            objProduct[2][i][0] = objProduct[0][i][0];
            objProduct[2][i][1] = price * total_quantity;
        }

        System.out.println("Table 3");
        System.out.println("Product Code      Amount (Price x Total Quantity)");
        System.out.println("----------------  -------------------------------");

        for (int i = 0; i < R; i++) {
            int productCode = (int) objProduct[2][i][0];
            float amount = objProduct[2][i][1];
            System.out.println(productCode + "       " + amount);
        }
    }
}