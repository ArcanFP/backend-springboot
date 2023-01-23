package it.open1.patient.manager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.regex.Pattern;

@Entity
public class Patient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String imageUrl;
    private Long imei;
    private String status;
    @Column(nullable = false, updatable = false)
    private String patientCode;


    public Patient() {
    }

    public Patient(String name, String email, String phone, String imageUrl, Long imei, String status, String patientCode) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.imei = imei;
        this.status = status;
        this.patientCode = patientCode;
    }

    public Patient(Long id, String name, String email, String phone, String imageUrl, Long imei, String status, String patientCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.imei = imei;
        this.status = status;
        this.patientCode = patientCode;
    }


    //___________________________________________________________________________

    public Long getId() {
        return id;
    }

    public  String getName() {
        return name;
    }

    public  String getEmail() {
        return email;
    }

    public  String getPhone() {
        return phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public  Long getImei() {
        return imei;
    }

    public String getStatus() {
        return status;
    }

    public String getPatientCode() {
        return patientCode;
    }

    //________________________________________________________________________

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setImei(Long imei) {
        this.imei = imei;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

//___________________________________________________________________
    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", imei='" + imei + '\'' +
                ", status='" + status + '\'' +
                ", patientCode='" + patientCode + '\'' +
                '}';
    }








}
