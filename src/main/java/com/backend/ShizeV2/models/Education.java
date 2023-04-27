package com.backend.ShizeV2.models;

import jakarta.persistence.*;

@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEdu;
    private String tituloEdu;
    private int fechaEdu;
    private int fechaFin;
    @Column(length = 1024)
    private String descEdu;
    private String imagenEdu;
    private String tituloUrl;


    //CONSTRUCTOR VACIO//

    public Education() {
    }

    //CONSTRUCTOR PARAMETRIZADO//

    public Education(Long idEdu, String tituloEdu, int fechaEdu, int fechaFin, String descEdu, String imagenEdu, String tituloUrl) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEdu = fechaEdu;
        this.fechaFin = fechaFin;
        this.descEdu = descEdu;
        this.imagenEdu = imagenEdu;
        this.tituloUrl = tituloUrl;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public int getFechaEdu() {
        return fechaEdu;
    }

    public void setFechaEdu(int fechaEdu) {
        this.fechaEdu = fechaEdu;
    }

    public int getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(int fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImagenEdu() {
        return imagenEdu;
    }

    public void setImagenEdu(String imagenEdu) {
        this.imagenEdu = imagenEdu;
    }

    public String getTituloUrl() {
        return tituloUrl;
    }

    public void setTituloUrl(String tituloUrl) {
        this.tituloUrl = tituloUrl;
    }

}
