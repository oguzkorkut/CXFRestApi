package com.okorkut.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/main/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MainResource {

	public MainResource() {
	}
	@GET
	@Path("/bul")
	public String getVersion() {

		return "v1.0";
	}

	@GET
	@Path("/getKullaniciById")
	public KullaniciDTO getKullaniciById(@QueryParam("id") int id) {

		KullaniciDTO kullaniciDTO = new KullaniciDTO();

		kullaniciDTO.setId(1);
		kullaniciDTO.setAdi("Oğuz");
		kullaniciDTO.setSoyadi("Korkut");
		kullaniciDTO.setePosta("oguz.korkut@32bit.com.tr");

		return kullaniciDTO;
	}

}
