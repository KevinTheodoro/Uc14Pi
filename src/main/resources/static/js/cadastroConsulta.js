$("#formConsulta").validate({
    rules: {
        data: {
            required: true,
            date: true
        },
        hora: {
            required: true,
            minlength: 5
        },
        observacoes: {
            required: true
        }
    },
    messages: {
        data: {
            required: "Campo Data é obrigatório",
            date: "A data precisa ser valida"
        },
        hora: {
            required: "Campo hora é obrigatório",
            minlength: "A hora precisa ser valida"
        },
        observacoes: {
            required: "O campo observações é obrigatório"
        }
    }
});
