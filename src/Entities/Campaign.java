package Entities;

public class Campaign {
    private int id;
    private String CampaignName;
    private int DiscountAmount;

    public  Campaign(int id, String CampaignName, int DiscountAmont){
        super();
        this.id = id;
        this.CampaignName =CampaignName;
        this.DiscountAmount = DiscountAmont;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return CampaignName;
    }

    public void setCampaignName(String campaignName) {
        CampaignName = campaignName;
    }

    public int getDiscountAmount() {
        return DiscountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        DiscountAmount = discountAmount;
    }
}
