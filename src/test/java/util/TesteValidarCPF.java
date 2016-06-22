package util;

import org.junit.Assert;
import org.junit.Test;

import util.ValidarCPF;

public class TesteValidarCPF {
	ValidarCPF validarCPF = new ValidarCPF();

	// Verificar CPF valido
	@Test
	public void testarCPF() {
		Assert.assertEquals(true, validarCPF.validacpf("88532410987"));
	}
}
