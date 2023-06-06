package com.omprakash.apimodelclass.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class LineItem {

    private Integer id;

    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;

    @SerializedName("fulfillable_quantity")
    private Integer fulfillableQuantity;

    @SerializedName("fulfillment_service")
    private String fulfillmentService;

    @SerializedName("fulfillment_status")
    private String fulfillmentStatus;

    @SerializedName("gift_card")
    private Boolean giftCard;

    private Integer grams;

    private String name;

    @SerializedName("origin_location")
    private OriginalLocation originLocation;

    @SerializedName("pre_tax_price")
    private String preTaxPrice;

    @SerializedName("pre_tax_price_set")
    private PriceSet pre_tax_price_set;

    private String price;

    @SerializedName("price_set")
    private PriceSet priceSet;

    @SerializedName("product_exists")
    private Boolean productExists;

    @SerializedName("product_id")
    private Integer productId;

    private ArrayList<String> properties;

    private Integer quantity;

    @SerializedName("requires_shipping")
    private Boolean requiresShipping;

    private String sku;

    @SerializedName("tax_code")
    private String taxCode;

    private Boolean taxable;

    private String title;

    @SerializedName("total_discount")
    private String totalDiscount;

    @SerializedName("total_discount_set")
    private PriceSet totalDiscountSet;

    @SerializedName("variant_id")
    private Integer variantId;

    @SerializedName("variant_inventory_management")
    private String variantInventoryManagement;

    @SerializedName("variant_title")
    private String variantTitle;

    private String vendor;

    @SerializedName("tax_lines")
    private ArrayList<TaxLine> taxLines;

    private ArrayList<String> duties;

    @SerializedName("discount_allocations")
    private ArrayList<String> discountAllocations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    public void setAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
    }

    public Integer getFulfillableQuantity() {
        return fulfillableQuantity;
    }

    public void setFulfillableQuantity(Integer fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
    }

    public String getFulfillmentService() {
        return fulfillmentService;
    }

    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public Boolean getGiftCard() {
        return giftCard;
    }

    public void setGiftCard(Boolean giftCard) {
        this.giftCard = giftCard;
    }

    public Integer getGrams() {
        return grams;
    }

    public void setGrams(Integer grams) {
        this.grams = grams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OriginalLocation getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(OriginalLocation originLocation) {
        this.originLocation = originLocation;
    }

    public String getPreTaxPrice() {
        return preTaxPrice;
    }

    public void setPreTaxPrice(String preTaxPrice) {
        this.preTaxPrice = preTaxPrice;
    }

    public PriceSet getPre_tax_price_set() {
        return pre_tax_price_set;
    }

    public void setPre_tax_price_set(PriceSet pre_tax_price_set) {
        this.pre_tax_price_set = pre_tax_price_set;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public PriceSet getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(PriceSet priceSet) {
        this.priceSet = priceSet;
    }

    public Boolean getProductExists() {
        return productExists;
    }

    public void setProductExists(Boolean productExists) {
        this.productExists = productExists;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public ArrayList<String> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<String> properties) {
        this.properties = properties;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Boolean getRequiresShipping() {
        return requiresShipping;
    }

    public void setRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public PriceSet getTotalDiscountSet() {
        return totalDiscountSet;
    }

    public void setTotalDiscountSet(PriceSet totalDiscountSet) {
        this.totalDiscountSet = totalDiscountSet;
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public String getVariantInventoryManagement() {
        return variantInventoryManagement;
    }

    public void setVariantInventoryManagement(String variantInventoryManagement) {
        this.variantInventoryManagement = variantInventoryManagement;
    }

    public String getVariantTitle() {
        return variantTitle;
    }

    public void setVariantTitle(String variantTitle) {
        this.variantTitle = variantTitle;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public ArrayList<TaxLine> getTaxLines() {
        return taxLines;
    }

    public void setTaxLines(ArrayList<TaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public ArrayList<String> getDuties() {
        return duties;
    }

    public void setDuties(ArrayList<String> duties) {
        this.duties = duties;
    }

    public ArrayList<String> getDiscountAllocations() {
        return discountAllocations;
    }

    public void setDiscountAllocations(ArrayList<String> discountAllocations) {
        this.discountAllocations = discountAllocations;
    }
}
