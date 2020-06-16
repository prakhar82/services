
package com.poc.ramlspringboot.api.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "storeDetailsRequest"
})
public class CreateDataRequest {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("storeDetailsRequest")
    @Valid
    @NotNull
    private List<StoreDetailsRequest> storeDetailsRequest = new ArrayList<StoreDetailsRequest>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("storeDetailsRequest")
    public List<StoreDetailsRequest> getStoreDetailsRequest() {
        return storeDetailsRequest;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("storeDetailsRequest")
    public void setStoreDetailsRequest(List<StoreDetailsRequest> storeDetailsRequest) {
        this.storeDetailsRequest = storeDetailsRequest;
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
        return new ToStringBuilder(this).append("storeDetailsRequest", storeDetailsRequest).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(storeDetailsRequest).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateDataRequest) == false) {
            return false;
        }
        CreateDataRequest rhs = ((CreateDataRequest) other);
        return new EqualsBuilder().append(storeDetailsRequest, rhs.storeDetailsRequest).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
