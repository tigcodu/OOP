public class DerechoJimson {

    public static void main(String[] args) {
        int T = 3;
        int R = 8;
        int C = 2;

        float[][][] objProduct = new float[T][R][C];

        float[][] productPrices = {
            {503302f, 2.75f}, {503303f, 1.25f}, {503304f, 2.0f},
            {503305f, 3.89f}, {503309f, 9.0f},  {504401f, 2.25f},
            {504402f, 4.3f},  {504403f, 1.4f}
        };

        int[][] productQuantities = {
            {503305, 10}, {503302, 22}, {503305, 15},
            {503303, 5},  {503304, 40}, {503303, 10},
            {503309, 10}, {503303, 12}
        };

        for (int i = 0; i < R; i++) {
            objProduct[0][i][0] = productPrices[i][0];
            objProduct[0][i][1] = productPrices[i][1];
            objProduct[1][i][0] = productPrices[i][0];
            objProduct[1][i][1] = 0f;
        }

        for (int i = 0; i < R; i++) {
            float currentCode = productQuantities[i][0];
            float currentQty = productQuantities[i][1];

            for (int j = 0; j < R; j++) {
                if (objProduct[1][j][0] == currentCode) {
                    objProduct[1][j][1] += currentQty;
                    break;
                }
            }
        }

        for (int i = 0; i < R; i++) {
            float priceList = objProduct[0][i][1];
            float totalQuantity = objProduct[1][i][1];
            objProduct[2][i][0] = objProduct[0][i][0];
            objProduct[2][i][1] = priceList * totalQuantity;
        }

        System.out.println("Table 3");
        System.out.println("Product Code      Amount (Price x Total Quantity)");
        System.out.println("----------------  -------------------------------");

        for (int i = 0; i < R; i++) {
            int productCode = (int) objProduct[2][i][0];
            float productAmount = objProduct[2][i][1];
            System.out.println(productCode + "             " + productAmount);
        }
    }
}