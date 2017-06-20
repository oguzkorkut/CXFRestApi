package com.okorkut.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.okorkut.rest.DTO.KullaniciDTO;

@Path("/user/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserResource {

	public UserResource() {
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

	@POST
	@Path("/kaydet")
	public KullaniciDTO kaydet(KullaniciDTO kullaniciDTO) {

		KullaniciDTO dto = new KullaniciDTO();

		dto.setId(1);
		dto.setAdi("Oğuz");
		dto.setSoyadi("Korkut");
		dto.setePosta("oguz.korkut@32bit.com.tr");

		return dto;
	}

	@PUT
	@Path("/guncelle")
	public KullaniciDTO guncelle(KullaniciDTO kullaniciDTO) {

		KullaniciDTO dto = new KullaniciDTO();

		dto.setId(1);
		dto.setAdi("Oğuz");
		dto.setSoyadi("Korkut");
		dto.setePosta("oguz.korkut@32bit.com.tr");

		return dto;
	}

	@DELETE
	@Path("/sil/{id}")
	public boolean guncelle(@PathParam("id") int id) {

		return true;
	}


}
