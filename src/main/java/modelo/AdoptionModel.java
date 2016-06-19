package modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: AdoptionModel
 *
 */
@Entity

public class AdoptionModel implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_adoption")
	private Long id;

	private String namePerson;
	private String cpfPerson;
	private String emailPerson;
	private String telephonePerson;
	private String celphonePerson;

	private String nameAnimal;
	private String descriptionAnimal;
	private String speciesAnimal;
	private String weightAnimal;
	private String sizetAnimal;
	private String genderAnimal;
	private String ageAnimal;
	private String breedAnimal;
	private String castratedAnimal;

	private String registrationDate;
	private String linkVideo;

	private String cityName;
	private String stateName;

	public AdoptionModel() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public String getCpfPerson() {
		return cpfPerson;
	}

	public void setCpfPerson(String cpfPerson) {
		this.cpfPerson = cpfPerson;
	}

	public String getEmailPerson() {
		return emailPerson;
	}

	public void setEmailPerson(String emailPerson) {
		this.emailPerson = emailPerson;
	}

	public String getTelephonePerson() {
		return telephonePerson;
	}

	public void setTelephonePerson(String telephonePerson) {
		this.telephonePerson = telephonePerson;
	}

	public String getCelphonePerson() {
		return celphonePerson;
	}

	public void setCelphonePerson(String celphonePerson) {
		this.celphonePerson = celphonePerson;
	}

	public String getNameAnimal() {
		return nameAnimal;
	}

	public void setNameAnimal(String nameAnimal) {
		this.nameAnimal = nameAnimal;
	}

	public String getDescriptionAnimal() {
		return descriptionAnimal;
	}

	public void setDescriptionAnimal(String descriptionAnimal) {
		this.descriptionAnimal = descriptionAnimal;
	}

	public String getSpeciesAnimal() {
		return speciesAnimal;
	}

	public void setSpeciesAnimal(String speciesAnimal) {
		this.speciesAnimal = speciesAnimal;
	}

	public String getWeightAnimal() {
		return weightAnimal;
	}

	public void setWeightAnimal(String weightAnimal) {
		this.weightAnimal = weightAnimal;
	}

	public String getSizetAnimal() {
		return sizetAnimal;
	}

	public void setSizetAnimal(String sizetAnimal) {
		this.sizetAnimal = sizetAnimal;
	}

	public String getGenderAnimal() {
		return genderAnimal;
	}

	public void setGenderAnimal(String genderAnimal) {
		this.genderAnimal = genderAnimal;
	}

	public String getAgeAnimal() {
		return ageAnimal;
	}

	public void setAgeAnimal(String ageAnimal) {
		this.ageAnimal = ageAnimal;
	}

	public String getBreedAnimal() {
		return breedAnimal;
	}

	public void setBreedAnimal(String breedAnimal) {
		this.breedAnimal = breedAnimal;
	}

	public String getCastratedAnimal() {
		return castratedAnimal;
	}

	public void setCastratedAnimal(String castratedAnimal) {
		this.castratedAnimal = castratedAnimal;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getLinkVideo() {
		return linkVideo;
	}

	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
