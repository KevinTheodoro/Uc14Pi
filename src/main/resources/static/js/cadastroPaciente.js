$("#formPaciente").validate({
    rules: {
        nome: {
            required: true,
            minlength: 3
        },
        dataNasc: {
            required: true,
            date: true
        },
        sexo: {
            required: true
            //focusInvalid: false
        },
        cpf: {
            required: true,
            minlength: 14
        }
    },
    messages: {
        nome: {
            required: "Campo nome é obrigatório",
            minlength: "O nome deve ter ao menos 3 caracteres"
        },
        dataNasc: {
            required: "Campo Data Nascimento é obrigatório",
            date: "A data precisa ser valida"
        },
        sexo: {
            required: "Selecione o sexo do paciente"
        },
        cpf: {
            required: "Campo CPF é obrigatório",
            minlength: "O CPF precisa ser valido"
        }
    },
    errorPlacement: function(error, element) {
        if (element.is(":radio")) {
            error.insertAfter("#cadastrarPaciente");
        }else {
            error.insertAfter(element);
        }
    }
});

$('#cpf').mask('000.000.000-00');
