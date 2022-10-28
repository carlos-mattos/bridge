public class Celular extends ItemVenda{

    private float precoFinal;

    public Celular(float precoNormal) {
        super(precoNormal);
    }

    public float ajustePreco() {
        this.precoFinal = this.precoNormal * (1 + this.dataEspecial.ajuste());
        return this.precoFinal;
    }

    public String mensagemAnuncio() {
        return this.dataEspecial.mensagemAnuncio() + " Celular por apenas " + precoFinal + " reais.";
    }

}
