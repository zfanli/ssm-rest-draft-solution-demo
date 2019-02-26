package demo.ssmrestds.entity;

public class PaymentItem {

    private int uniqueId;
    private String vendor;
    private String packageName;
    private String registeredMonth;
    private String requestDeadline;
    private String payStatus;
    private String mediaName;
    private String itemName;
    private String channel;
    private String registeredStartDate;
    private String registeredEndDate;
    private int price;
    private int paidAmount;

    public int getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getRegisteredMonth() {
        return registeredMonth;
    }

    public void setRegisteredMonth(String registeredMonth) {
        this.registeredMonth = registeredMonth;
    }

    public String getRequestDeadline() {
        return requestDeadline;
    }

    public void setRequestDeadline(String requestDeadline) {
        this.requestDeadline = requestDeadline;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getRegisteredStartDate() {
        return registeredStartDate;
    }

    public void setRegisteredStartDate(String registeredStartDate) {
        this.registeredStartDate = registeredStartDate;
    }

    public String getRegisteredEndDate() {
        return registeredEndDate;
    }

    public void setRegisteredEndDate(String registeredEndDate) {
        this.registeredEndDate = registeredEndDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(int paidAmount) {
        this.paidAmount = paidAmount;
    }
}
