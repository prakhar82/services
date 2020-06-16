
package com.poc.ramlspringboot.api.model;

import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "store-id",
    "store-country",
    "store-location",
    "product-category",
    "product-id",
    "discount",
    "MRP",
    "CP",
    "SP",
    "transaction-date"
})
public class StoreDetailsRequest {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("store-id")
    @NotNull
    private String storeId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("store-country")
    @NotNull
    private String storeCountry;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("store-location")
    @NotNull
    private String storeLocation;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product-category")
    @NotNull
    private String productCategory;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product-id")
    @NotNull
    private Float productId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discount")
    @NotNull
    private String discount;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("MRP")
    @NotNull
    private String mRP;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CP")
    @NotNull
    private String cP;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("SP")
    @NotNull
    private String sP;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transaction-date")
    @NotNull
    private String transactionDate;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("store-id")
    public String getStoreId() {
        return storeId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("store-id")
    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("store-country")
    public String getStoreCountry() {
        return storeCountry;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("store-country")
    public void setStoreCountry(String storeCountry) {
        this.storeCountry = storeCountry;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("store-location")
    public String getStoreLocation() {
        return storeLocation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("store-location")
    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product-category")
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product-category")
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product-id")
    public Float getProductId() {
        return productId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("product-id")
    public void setProductId(Float productId) {
        this.productId = productId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discount")
    public String getDiscount() {
        return discount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("discount")
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("MRP")
    public String getMRP() {
        return mRP;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("MRP")
    public void setMRP(String mRP) {
        this.mRP = mRP;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CP")
    public String getCP() {
        return cP;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("CP")
    public void setCP(String cP) {
        this.cP = cP;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("SP")
    public String getSP() {
        return sP;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("SP")
    public void setSP(String sP) {
        this.sP = sP;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transaction-date")
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("transaction-date")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("storeId", storeId).append("storeCountry", storeCountry).append("storeLocation", storeLocation).append("productCategory", productCategory).append("productId", productId).append("discount", discount).append("mRP", mRP).append("cP", cP).append("sP", sP).append("transactionDate", transactionDate).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(storeCountry).append(storeLocation).append(productId).append(discount).append(mRP).append(additionalProperties).append(storeId).append(transactionDate).append(cP).append(sP).append(productCategory).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StoreDetailsRequest) == false) {
            return false;
        }
        StoreDetailsRequest rhs = ((StoreDetailsRequest) other);
        return new EqualsBuilder().append(storeCountry, rhs.storeCountry).append(storeLocation, rhs.storeLocation).append(productId, rhs.productId).append(discount, rhs.discount).append(mRP, rhs.mRP).append(additionalProperties, rhs.additionalProperties).append(storeId, rhs.storeId).append(transactionDate, rhs.transactionDate).append(cP, rhs.cP).append(sP, rhs.sP).append(productCategory, rhs.productCategory).isEquals();
    }

}
