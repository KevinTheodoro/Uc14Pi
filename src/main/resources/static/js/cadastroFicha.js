$("#formFicha").validate({
    rules: {
        data: {
            required: true,
            date: true
        },
        conteudoFicha: {
            required: true
        }
    },
    messages: {
        data: {
            required: "Campo Data é obrigatório",
            date: "A data precisa ser valida"
        },
        conteudoFicha: {
            required: "O campo ficha é obrigatório"
        }
    }
});
