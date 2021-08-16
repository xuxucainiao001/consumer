package cn.toseektech.consumer.entity;

public class Empolyee {
    private Long id;

    private String name;

    private String idendity;

    private Byte gender;

    private Boolean isQuite;

    private Integer positionType;

    private String educationDegree;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdendity() {
        return idendity;
    }

    public void setIdendity(String idendity) {
        this.idendity = idendity;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Boolean getIsQuite() {
        return isQuite;
    }

    public void setIsQuite(Boolean isQuite) {
        this.isQuite = isQuite;
    }

    public Integer getPositionType() {
        return positionType;
    }

    public void setPositionType(Integer positionType) {
        this.positionType = positionType;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }
}