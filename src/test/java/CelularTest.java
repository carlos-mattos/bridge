import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CelularTest {

    @Test
    void deveRetornarReajusteDoPrecoCelularNoNatal() {
        DataEspecial dataEspecial = new Natal();
        Celular celular = new Celular(2000);
        celular.setDataEspecial(dataEspecial);

        assertEquals(2600.0, celular.ajustePreco());
        assertEquals("Venha celebrar este Natal conosco! Celular por apenas 2600.0 reais.", celular.mensagemAnuncio());
    }

    @Test
    void deveRetornarReajusteDoPrecoCelularNaBlackFriday () {
        DataEspecial dataEspecial = new BlackFriday();
        Celular celular = new Celular(2000);
        celular.setDataEspecial(dataEspecial);

        assertEquals(1400, celular.ajustePreco());
        assertEquals("Aproveite o desconto de 30% nessa Black Friday! Celular por apenas 1400.0 reais.", celular.mensagemAnuncio());
    }
}