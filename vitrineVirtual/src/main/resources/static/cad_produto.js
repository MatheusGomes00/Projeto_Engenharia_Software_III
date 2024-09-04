const formulario = document.querySelector("form")
const inNomeProd = document.querySelector(".nome_prod")
const inDescProd = document.querySelector(".desc_prod")
const inPrecoProd = document.querySelector(".preco_prod")
const inSetorProd = document.querySelector(".setor_prod")

function cadastrar_produto(){

    fetch("http://localhost:8080/produto/salvar",
        {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify({
                    nome_prod: inNomeProd.value,
                    desc_prod: inDescProd.value,
                    preco_prod: inPreco.value,
                    setor_prod: inSetorProd.value
            })
        })
        .then(function (res) {console.log(res)})
        .catch(function (res) {console.log(res)})
};

function limpar (){
    inNome.value = "";
    inDescProd.value = "";
    inPreco.value = "";
    inSetorProd.value = "";
};

formulario.addEventListener('submit', function (event){
    event.preventDefault();

    cadastrar();
    limpar();

});