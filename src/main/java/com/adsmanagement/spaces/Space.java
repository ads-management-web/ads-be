package com.adsmanagement.spaces;

import com.adsmanagement.districts.District;
import com.adsmanagement.wards.Ward;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "spaces")
public class Space {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "address")
    private String address;

    @Column(name = "long")
    private Float longitude;

    @Column(name = "lat")
    private Float lat;

    @Column(name = "type")
    private String type;

    @Column(name = "format")
    private String format;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "is_planned")
    private boolean isPlanned;

    @ManyToOne
    @JoinColumn(name="ward_id")
    private Ward ward;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    public Space(Integer id, String address, Float longitude, Float lat, String type, String format, String imgUrl, boolean isPlanned, Ward ward, Date createdAt, Date updatedAt) {
        this.id = id;
        this.address = address;
        this.longitude = longitude;
        this.lat = lat;
        this.type = type;
        this.format = format;
        this.imgUrl = imgUrl;
        this.isPlanned = isPlanned;
        this.ward = ward;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Space() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public boolean isPlanned() {
        return isPlanned;
    }

    public void setPlanned(boolean planned) {
        isPlanned = planned;
    }

    public Ward getWard() {
        return ward;
    }

    public void setWard(Ward ward) {
        this.ward = ward;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
