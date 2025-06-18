public class Product {
    private int procutId;
    private String productName;
    private String category;
    public int getProcutId() {
        return procutId;
    }
    public void setProcutId(int procutId) {
        this.procutId = procutId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Product(int procutId, String productName, String category) {
        this.procutId = procutId;
        this.productName = productName;
        this.category = category;
    }
}
