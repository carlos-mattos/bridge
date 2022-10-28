import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenisTest {

    @Test
    void deveRetornarReajusteDoPrecoTenisNoNatal() {
        DataEspecial dataEspecial = new Natal();
        Tenis tenis = new Tenis(300);
        tenis.setDataEspecial(dataEspecial);

        assertEquals(390.0, tenis.ajustePreco());
        assertEquals("Venha celebrar este Natal conosco! Tenis por apenas 390.0 reais.", tenis.mensagemAnuncio());
    }

    @Test
    void deveRetornarReajusteDoPrecoTenisNaBlackFriday () {
        DataEspecial dataEspecial = new BlackFriday();
        Tenis tenis = new Tenis(300);
        tenis.setDataEspecial(dataEspecial);

        assertEquals(210.0, tenis.ajustePreco());
        assertEquals("Aproveite o desconto de 30% nessa Black Friday! Tenis por apenas 210.0 reais.", tenis.mensagemAnuncio());
    }
}