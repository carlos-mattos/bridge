public abstract class ItemVenda {

    protected DataEspecial dataEspecial;
    protected float precoNormal;

    public ItemVenda (float precoNormal) {
        this.precoNormal = precoNormal;
    }

    public DataEspecial getDataEspecial() {
        return dataEspecial;
    }

    public void setDataEspecial(DataEspecial dataEspecial) {
        this.dataEspecial = dataEspecial;
    }

    public abstract float ajustePreco();
    public abstract String mensagemAnuncio();
}
