$("#formUsuario").validate({
    rules: {
        nome: {
            required: true,
            minlength: 3
        },
        login: {
            required: true,
            minlength: 3
        },
        senha: {
            required: true,
            minlength: 6,
            maxlength: 18
        },
        email: {
            email: true
        },
        cpf: {
            minlength: 14
        }
    },
    messages: {
        nome: {
            required: "Campo nome é obrigatório",
            minlength: "O nome deve ter ao menos 3 caracteres"
        },
        login: {
            required: "Campo login é obrigatório",
            minlength: "O nome deve ter ao menos 3 caracteres"
        },
        senha: {
            required: "Campo senha é obrigatório",
            minlength: "A senha deve ter ao menos 6 caracteres",
            maxlength: "A senha deve ter no máximo 18 caracteres"
        },
        email: {
            email: "Email deve ser valido"
        },
        cpf: {
            minlength: "O CPF deve ser valido"
        }
    }
});

$('#cpf').mask('000.000.000-00');