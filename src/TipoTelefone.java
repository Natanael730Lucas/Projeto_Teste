public enum TipoTelefone {
    COMERCIAL("comercial"),
    CELULAR("celular"),
    RESIDENCIAL("residencial");

    private final String descricao;

    TipoTelefone(String descricao){
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }
}
