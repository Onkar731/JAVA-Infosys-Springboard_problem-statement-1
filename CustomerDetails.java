// Customer Details class 

public class CustomerDetails {
    private String customerName;
    private long mobileNo;
    private String address;
    private int items;
    private double cost;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public void setCustomerAddress(String address) {
        this.address = address;
    }
    public void setItems(int items) {
        this.items = items;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCustomerName() {
        return customerName;
    }
    public long getCustomerMobileNo() {
        return mobileNo;
    }
    public String getCustomerAddress() {
        return address;
    }
    public int getItems() {
        return items;
    }
    public double getCost() {
        return cost;
    }
}