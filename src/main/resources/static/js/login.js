$("#formLogin").validate({
    rules: {
        login: {
            required: true
        },
        senha: {
            required: true,
            minlength: 6,
            maxlength: 18
        }
    },
    messages: {
        login: {
            required: "Campo login é obrigatório"
        },
        senha: {
            required: "Campo senha é obrigatório",
            minlength: "A senha deve ter ao menos 6 caracteres",
            maxlength: "A senha deve ter no máximo 18 caracteres"
        }
    }
});