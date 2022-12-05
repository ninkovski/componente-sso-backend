package com.example.demo.models;

public class SsoApiResponse {

    private Integer id;
    private String cuuid;
    private String logo;
    private String logo_sm;
    private String logo_lg;
    private String siglas;
    private String nombre;
    private String nombre_corto;
    private String entidad_nombre;
    private String arquitectura_nombre;
    private Integer sad_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCuuid() {
        return cuuid;
    }

    public void setCuuid(String cuuid) {
        this.cuuid = cuuid;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLogo_sm() {
        return logo_sm;
    }

    public void setLogo_sm(String logo_sm) {
        this.logo_sm = logo_sm;
    }

    public String getLogo_lg() {
        return logo_lg;
    }

    public void setLogo_lg(String logo_lg) {
        this.logo_lg = logo_lg;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_corto() {
        return nombre_corto;
    }

    public void setNombre_corto(String nombre_corto) {
        this.nombre_corto = nombre_corto;
    }

    public String getEntidad_nombre() {
        return entidad_nombre;
    }

    public void setEntidad_nombre(String entidad_nombre) {
        this.entidad_nombre = entidad_nombre;
    }

    public String getArquitectura_nombre() {
        return arquitectura_nombre;
    }

    public void setArquitectura_nombre(String arquitectura_nombre) {
        this.arquitectura_nombre = arquitectura_nombre;
    }

    public Integer getSad_id() {
        return sad_id;
    }

    public void setSad_id(Integer sad_id) {
        this.sad_id = sad_id;
    }
}
