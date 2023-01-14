package desafio_neomind.relogio.servicetest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.filipe.relogio.service.RelogioService;

class RelogioTest {

	RelogioService relogioService;

	@BeforeEach
	void initialize() {
		relogioService = new RelogioService();
	}

	@Test
	void deveriaRetornarValorPositivoQuandoInformadoDoisNumerosInteiros() {

		assertEquals(90, relogioService.retornaAnguloRelogio(0, 15));

	}

	@Test
	void deveriaRetornarZeroQuandoInformadoValorNegativo() {

		assertEquals(0, relogioService.retornaAnguloRelogio(-5, 15));

	}

	@Test
	void deveriaRetornareroQuandoTodosValoresInformadosZero() {

		assertEquals(0, relogioService.retornaAnguloRelogio(0, 0));

	}
	
	@Test
	void deveriaRetornarNoventaGraus() {

		assertEquals(90, relogioService.retornaAnguloRelogio(15, 0));

	}
	
	@Test
	void deveriaRetornarCentoEOitentaGraus() {

		assertEquals(180, relogioService.retornaAnguloRelogio(18, 0));

	}

	@Test
	void deveriaRetornarCentoEOitentaGrausComFormatoDozeHoras() {

		assertEquals(180, relogioService.retornaAnguloRelogio(6, 0));

	}
	



	
}
