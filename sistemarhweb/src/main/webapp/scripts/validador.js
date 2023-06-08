
 /** Validação de usuário */

	  document.addEventListener("DOMContentLoaded", function() {
      var urlParams = new URLSearchParams(window.location.search);
      var erroParam = urlParams.get("erro");

      if (erroParam === "1") {
        var mensagem = document.getElementById("mensagem");
        mensagem.textContent = "Usuário não encontrado.";
        mensagem.style.display = "block";
        mensagem.style.position = "absolute";}    
    });
 

/** Validação de formulário */

 function validar(){
	 let nome = frmFuncionario.nome.value
	let cpf = frmFuncionario.cpf.value

	if(nome === ""){
		alert ('Preencha o campo nome')
		frmFuncionario.nome.focus()
		return false
	}else if(cpf === ""){
		alert ('Preencha o campo cpf')
		frmFuncionario.cpf.focus()
		return false
	 }else{
		 document.forms["frmFuncionario"].submit()
	 }
 }