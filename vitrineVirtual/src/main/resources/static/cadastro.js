const formulario = document.querySelector("form");
const inNome = document.querySelector(".nome")
const inCpf = document.querySelector(".cpf")
const inEndereco = document.querySelector(".endereco")
const inTelefone = document.querySelector(".telefone")
const inSenha = document.querySelector(".senha")

function cadastrar(){

    fetch("http://localhost:8080/clientes/salvar",
        {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify({
                    nome: inNome.value,
                    cpf: inCpf.value,
                    endereco: inEndereco.value,
                    telefone: inTelefone.value,
                    senha: inSenha.value
            })
        })
        .then(function (res) {console.log(res)})
        .catch(function (res) {console.log(res)})
};

function limpar (){
    inNome.value = "";
    inCpf.value = "";
    inEndereco.value = "";
    inTelefone.value = "";
    inSenha.value = "";
};

formulario.addEventListener('submit', function (event){
    event.preventDefault();

    cadastrar();
    limpar();

});