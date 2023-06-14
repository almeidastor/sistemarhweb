
 /** Validação de usuário */

	  document.addEventListener("DOMContentLoaded", function() {
      var urlParams = new URLSearchParams(window.location.search);
      var erroParam = urlParams.get("erro");

      if (erroParam === "1") {
        var mensagem = document.getElementById("mensagem");
        mensagem.textContent = "Usuário não encontrado.";
        mensagem.style.display = "block";
        mensagem.style.position = "absolute";
    	mensagem.style.color = "#FF0000";
    	
    	var telaDeLogin = document.getElementById("teladelogin");
    telaDeLogin.classList.add("tremor");
    	}    
    });
 

/** Manter conectado*/
const manterConectadoCheckbox = document.getElementById("manterConectado");
if (manterConectadoCheckbox.checked) {
  localStorage.setItem("loginStatus", "loggedIn");
}

const loginStatus = localStorage.getItem("loginStatus");
if (loginStatus === "loggedIn") {
	  window.location.href = "main.jsp";
}

/** Validação de formulário */

 function validar(){
	 let nome = frmFuncionario.nome.value
	let senha = frmFuncionario.senha.value

	if(nome === ""){
		alert ('Preencha o usuário')
		frmFuncionario.nome.focus()
		return false
	}else if(senha === ""){
		alert ('Coloque sua senha')
		frmFuncionario.cpf.focus()
		return false
	 }else{
		 document.forms["frmFuncionario"].submit()
	 }
 }

/** Menu Drop Down */
	 

	 function ocultarExibir() {

	    document.getElementById("divmailsent").style.display = 'block';
	    closeocex();
	  }

	  function closeocex() {
	  	var inputmailfooter = $("#inputemail-footer");
	 	var inputtextfooter = $("#inputtext-footer");
    	setInterval(() => {
    	document.getElementById("divmailsent").style.display = 'none';
    }, 500);
    	console.log(inputmailfooter.val(""));
	    console.log(inputtextfooter.val(""));
	}
	

 