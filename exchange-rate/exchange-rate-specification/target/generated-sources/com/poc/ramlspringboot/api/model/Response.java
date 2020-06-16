
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
    "rates",
    "base",
    "date"
})
public class Response {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rates")
    @Valid
    @NotNull
    private Rates rates;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base")
    @NotNull
    private String base;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    @NotNull
    private String date;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rates")
    public Rates getRates() {
        return rates;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("rates")
    public void setRates(Rates rates) {
        this.rates = rates;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
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
        return new ToStringBuilder(this).append("rates", rates).append("base", base).append("date", date).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(date).append(additionalProperties).append(rates).append(base).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return new EqualsBuilder().append(date, rhs.date).append(additionalProperties, rhs.additionalProperties).append(rates, rhs.rates).append(base, rhs.base).isEquals();
    }

}
