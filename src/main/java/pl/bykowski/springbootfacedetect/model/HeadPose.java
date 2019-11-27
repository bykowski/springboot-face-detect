
package pl.bykowski.springbootfacedetect.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pitch",
    "roll",
    "yaw"
})
public class HeadPose {

    @JsonProperty("pitch")
    private Double pitch;
    @JsonProperty("roll")
    private Double roll;
    @JsonProperty("yaw")
    private Double yaw;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pitch")
    public Double getPitch() {
        return pitch;
    }

    @JsonProperty("pitch")
    public void setPitch(Double pitch) {
        this.pitch = pitch;
    }

    @JsonProperty("roll")
    public Double getRoll() {
        return roll;
    }

    @JsonProperty("roll")
    public void setRoll(Double roll) {
        this.roll = roll;
    }

    @JsonProperty("yaw")
    public Double getYaw() {
        return yaw;
    }

    @JsonProperty("yaw")
    public void setYaw(Double yaw) {
        this.yaw = yaw;
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
        return "HeadPose{" +
                "pitch=" + pitch +
                ", roll=" + roll +
                ", yaw=" + yaw +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
