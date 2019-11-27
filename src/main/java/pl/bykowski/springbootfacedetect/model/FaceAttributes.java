
package pl.bykowski.springbootfacedetect.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "smile",
    "headPose",
    "gender",
    "age",
    "facialHair",
    "glasses",
    "emotion",
    "blur",
    "exposure",
    "noise",
    "makeup",
    "accessories",
    "occlusion",
    "hair"
})
public class FaceAttributes {

    @JsonProperty("smile")
    private Double smile;
    @JsonProperty("headPose")
    private HeadPose headPose;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("age")
    private Double age;
    @JsonProperty("facialHair")
    private FacialHair facialHair;
    @JsonProperty("glasses")
    private String glasses;
    @JsonProperty("emotion")
    private Emotion emotion;
    @JsonProperty("blur")
    private Blur blur;
    @JsonProperty("exposure")
    private Exposure exposure;
    @JsonProperty("noise")
    private Noise noise;
    @JsonProperty("makeup")
    private Makeup makeup;
    @JsonProperty("accessories")
    private List<Object> accessories = null;
    @JsonProperty("occlusion")
    private Occlusion occlusion;
    @JsonProperty("hair")
    private Hair hair;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("smile")
    public Double getSmile() {
        return smile;
    }

    @JsonProperty("smile")
    public void setSmile(Double smile) {
        this.smile = smile;
    }

    @JsonProperty("headPose")
    public HeadPose getHeadPose() {
        return headPose;
    }

    @JsonProperty("headPose")
    public void setHeadPose(HeadPose headPose) {
        this.headPose = headPose;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("age")
    public Double getAge() {
        return age;
    }

    @JsonProperty("age")
    public void setAge(Double age) {
        this.age = age;
    }

    @JsonProperty("facialHair")
    public FacialHair getFacialHair() {
        return facialHair;
    }

    @JsonProperty("facialHair")
    public void setFacialHair(FacialHair facialHair) {
        this.facialHair = facialHair;
    }

    @JsonProperty("glasses")
    public String getGlasses() {
        return glasses;
    }

    @JsonProperty("glasses")
    public void setGlasses(String glasses) {
        this.glasses = glasses;
    }

    @JsonProperty("emotion")
    public Emotion getEmotion() {
        return emotion;
    }

    @JsonProperty("emotion")
    public void setEmotion(Emotion emotion) {
        this.emotion = emotion;
    }

    @JsonProperty("blur")
    public Blur getBlur() {
        return blur;
    }

    @JsonProperty("blur")
    public void setBlur(Blur blur) {
        this.blur = blur;
    }

    @JsonProperty("exposure")
    public Exposure getExposure() {
        return exposure;
    }

    @JsonProperty("exposure")
    public void setExposure(Exposure exposure) {
        this.exposure = exposure;
    }

    @JsonProperty("noise")
    public Noise getNoise() {
        return noise;
    }

    @JsonProperty("noise")
    public void setNoise(Noise noise) {
        this.noise = noise;
    }

    @JsonProperty("makeup")
    public Makeup getMakeup() {
        return makeup;
    }

    @JsonProperty("makeup")
    public void setMakeup(Makeup makeup) {
        this.makeup = makeup;
    }

    @JsonProperty("accessories")
    public List<Object> getAccessories() {
        return accessories;
    }

    @JsonProperty("accessories")
    public void setAccessories(List<Object> accessories) {
        this.accessories = accessories;
    }

    @JsonProperty("occlusion")
    public Occlusion getOcclusion() {
        return occlusion;
    }

    @JsonProperty("occlusion")
    public void setOcclusion(Occlusion occlusion) {
        this.occlusion = occlusion;
    }

    @JsonProperty("hair")
    public Hair getHair() {
        return hair;
    }

    @JsonProperty("hair")
    public void setHair(Hair hair) {
        this.hair = hair;
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
        return "FaceAttributes{" +
                "smile=" + smile +
                ", headPose=" + headPose +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", facialHair=" + facialHair +
                ", glasses='" + glasses + '\'' +
                ", emotion=" + emotion +
                ", blur=" + blur +
                ", exposure=" + exposure +
                ", noise=" + noise +
                ", makeup=" + makeup +
                ", accessories=" + accessories +
                ", occlusion=" + occlusion +
                ", hair=" + hair +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
