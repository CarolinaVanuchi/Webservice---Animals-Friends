package service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import banco.DAOGenerico;
import modelo.AdoptionModel;

import modelo.MistreatmentModel;


@Path("/webService")
@ApplicationPath("/resource")
public class HelloWebService extends Application {
	AdoptionModel model = new AdoptionModel();
	MistreatmentModel mistreatment = new MistreatmentModel();
	DAOGenerico dao = new DAOGenerico();

	/**
	 * Metodo para salvar o objeto de Adoção
	 * 
	 * @param namePerson
	 * @param cpfPerson
	 * @param emailPerson
	 * @param telephonePerson
	 * @param celphonePerson
	 * @param nameAnimal
	 * @param descriptionAnimal
	 * @param speciesAnimal
	 * @param weightAnimal
	 * @param sizetAnimal
	 * @param genderAnimal
	 * @param ageAnimal
	 * @param breedAnimal
	 * @param castratedAnimal
	 * @param registrationDate
	 * @param linkVideo
	 * @param cityName
	 * @param stateName
	 */

	@POST
	@Path("/save")
	public void save(@FormParam("namePerson") String namePerson, @FormParam("cpfPerson") String cpfPerson,
			@FormParam("emailPerson") String emailPerson, @FormParam("telephonePerson") String telephonePerson,
			@FormParam("celphonePerson") String celphonePerson, @FormParam("nameAnimal") String nameAnimal,
			@FormParam("descriptionAnimal") String descriptionAnimal, @FormParam("speciesAnimal") String speciesAnimal,
			@FormParam("weightAnimal") String weightAnimal, @FormParam("sizetAnimal") String sizetAnimal,
			@FormParam("genderAnimal") String genderAnimal, @FormParam("ageAnimal") String ageAnimal,
			@FormParam("breedAnimal") String breedAnimal, @FormParam("castratedAnimal") String castratedAnimal,
			@FormParam("registrationDate") String registrationDate, @FormParam("linkVideo") String linkVideo,
			@FormParam("cityName") String cityName, @FormParam("stateName") String stateName) {
		try {
			model.setNamePerson(namePerson);
			model.setCpfPerson(cpfPerson);
			model.setEmailPerson(emailPerson);
			model.setTelephonePerson(telephonePerson);
			model.setCelphonePerson(celphonePerson);
			model.setNameAnimal(nameAnimal);
			model.setDescriptionAnimal(descriptionAnimal);
			model.setWeightAnimal(weightAnimal);
			model.setSizetAnimal(sizetAnimal);
			model.setGenderAnimal(genderAnimal);
			model.setAgeAnimal(ageAnimal);
			model.setBreedAnimal(breedAnimal);
			model.setCastratedAnimal(castratedAnimal);
			model.setRegistrationDate(registrationDate);
			model.setLinkVideo(linkVideo);
			model.setCityName(cityName);
			model.setStateName(stateName);

			dao.inserir(model);

			model = new AdoptionModel();
		} catch (Exception e) {
			System.out.println("Erro no metodo salvar de adoção " + e.getMessage());
		}
	}

	/*
	 * Metodo para retornar a lista de adoção do banco de dados
	 */
	@GET
	@Path("/listadoption")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<AdoptionModel> listaAdoption() {
		List<AdoptionModel> lista = new ArrayList<>();
		lista = dao.listar(AdoptionModel.class);
		return lista;
	}
	
	/**
	 * Metodo de salvar maus tratos
	 * @param namePerson
	 * @param specie
	 * @param description
	 * @param celphone
	 * @param state
	 * @param city
	 * @param neighborhood
	 * @param street
	 * @param longitude
	 * @param latitude
	 */
	@POST
	@Path("/mistreatmentSave")
	public void mistreatmentSave(@FormParam("namePerson") String namePerson, @FormParam("specie") String specie,
			@FormParam("description") String description, @FormParam("celphone") String celphone,
			@FormParam("state") String state, @FormParam("city") String city,
			@FormParam("neighborhood") String neighborhood, @FormParam("street") String street,
			@FormParam("longitude") String longitude, @FormParam("latitude") String latitude) {

		try {
			mistreatment.setNamePerson(namePerson);
			mistreatment.setCelphone(celphone);
			mistreatment.setCity(city);
			mistreatment.setDescription(description);
			mistreatment.setLatitude(latitude);
			mistreatment.setLongitude(longitude);
			mistreatment.setNeighborhood(neighborhood);
			mistreatment.setSpecie(specie);
			mistreatment.setState(state);
			mistreatment.setStreet(street);

			dao.inserir(mistreatment);
			mistreatment = new MistreatmentModel();
		} catch (Exception e) {
			System.out.println("Erro no metodo salvar maus tratos "+e.getMessage());
		}
	}

	/*
	 * Metodo para retornar a lista de maus tratos do banco de dados 
	 */
	@GET
	@Path("/listMistreatment")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<MistreatmentModel> listaMistreatment() {
		List<MistreatmentModel> lista = new ArrayList<>();
		lista = dao.listar(MistreatmentModel.class);
		return lista;
	}

}
