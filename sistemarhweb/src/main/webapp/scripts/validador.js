/**
 * Validação de formulário
 */

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