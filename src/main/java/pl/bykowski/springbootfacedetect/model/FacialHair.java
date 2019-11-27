
package pl.bykowski.springbootfacedetect.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "moustache",
    "beard",
    "sideburns"
})
public class FacialHair {

    @JsonProperty("moustache")
    private Double moustache;
    @JsonProperty("beard")
    private Double beard;
    @JsonProperty("sideburns")
    private Double sideburns;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("moustache")
    public Double getMoustache() {
        return moustache;
    }

    @JsonProperty("moustache")
    public void setMoustache(Double moustache) {
        this.moustache = moustache;
    }

    @JsonProperty("beard")
    public Double getBeard() {
        return beard;
    }

    @JsonProperty("beard")
    public void setBeard(Double beard) {
        this.beard = beard;
    }

    @JsonProperty("sideburns")
    public Double getSideburns() {
        return sideburns;
    }

    @JsonProperty("sideburns")
    public void setSideburns(Double sideburns) {
        this.sideburns = sideburns;
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
        return "FacialHair{" +
                "moustache=" + moustache +
                ", beard=" + beard +
                ", sideburns=" + sideburns +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
