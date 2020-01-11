package data;

import static java.lang.Character.isDigit;

final public class ProductID {
    private final String productUPC;

    public ProductID(String code){
        this.productUPC = code;
    }

    public String getProductID() throws Exception{
        if(!checkCode())
            throw new Exception("The code is not valid. \n");
        return productUPC;
    }

    private Boolean checkCode(){

        if (productUPC == null)
            return false;

        char [] codeArray = productUPC.toCharArray();
        if (productUPC.length() != 12)
            return false;

        for (int i = 0; i < 12; i++){
            if (!isDigit(codeArray[i]))
                return false;
        }
        return true;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ProductID product = (ProductID) o;
        return productUPC.equals(product.productUPC);
    }

    @Override
    public int hashCode() { return productUPC.hashCode(); }

    @Override
    public String toString() {
        return "ProductID{" + "product code='" + productUPC + '\'' + '}';
    }

}
