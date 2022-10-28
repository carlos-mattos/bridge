public class Tenis extends ItemVenda{

    private float precoFinal;

    public Tenis(float precoNormal) {
        super(precoNormal);
    }

    public float ajustePreco() {
        this.precoFinal = this.precoNormal * (1 + this.dataEspecial.ajuste());
        return this.precoFinal;
    }

    public String mensagemAnuncio() {
        return this.dataEspecial.mensagemAnuncio() + " Tenis por apenas " + precoFinal + " reais.";
    }
}
