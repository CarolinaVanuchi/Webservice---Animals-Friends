package banco;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import modelo.AdoptionModel;


public class TesteDAOGenerico {
	AdoptionModel adoptionModel = new AdoptionModel();
	DAOGenerico dao = new DAOGenerico();
	Long auxAdoption;
	
	@Test
	public void testar(){
		adoptionModel.setAgeAnimal("3");
		adoptionModel.setBreedAnimal("golden retriever");
		adoptionModel.setCastratedAnimal("sim");
		adoptionModel.setCelphonePerson("98989898");
		dao.inserir(adoptionModel);
		
		//Variavel auxiliar para realiza��o do teste de id
		auxAdoption = adoptionModel.getId();
		
		//Verificar o tamanho da lista
		List<AdoptionModel> listAdoption = dao.listar(AdoptionModel.class);
		Assert.assertEquals(1, listAdoption.size());
		
		// Verificar se o retorno de animal castrado � o mesmo que se esperava
		Assert.assertEquals("sim", listAdoption.get(0).getCastratedAnimal());
		
		// Verificar se retorno do id � o mesmo que se espera para o objeto
		Assert.assertEquals(auxAdoption, adoptionModel.getId());
		
		// Verificar se o metodo de retorno de alterar esta sendo realizado de forma certa
		adoptionModel.setBreedAnimal("Husky siberiano");
		dao.alterar(adoptionModel);
		Assert.assertEquals("Husky siberiano", adoptionModel.getBreedAnimal());
		
	} 
	
}
