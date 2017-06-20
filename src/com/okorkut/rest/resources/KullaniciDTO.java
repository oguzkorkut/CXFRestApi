package com.okorkut.rest.resources;

import java.io.Serializable;

public class KullaniciDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	public int id;
	public String adi;
	public String soyadi;
	public String ePosta;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getePosta() {
		return ePosta;
	}

	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}

}
