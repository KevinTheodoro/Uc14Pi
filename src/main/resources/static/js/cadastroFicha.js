$("#formFicha").validate({
    rules: {
        data: {
            required: true,
            date: true
        },
        ficha: {
            required: true
        }
    },
    messages: {
        data: {
            required: "Campo Data é obrigatório",
            date: "A data precisa ser valida"
        },
        ficha: {
            required: "O campo ficha é obrigatório"
        }
    }
});
