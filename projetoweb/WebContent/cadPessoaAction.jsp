<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Pessoa</title>
</head>
<body>
<header>
		<h1> Cadastro de Pessoa</h1>
		<hr>
	</header>
	
	<main>
		<fieldset>
			<legend>Cadastro</legend>
			<div>
				<form action="pessoa" method="post">
					<ul style="list-style: none;">
						<li>
							<label>Nome:</label>
							<input type="text" name="nome" placeholder="Informe um nome...">
							<span id="nomeValidate"></span>
						</li>
						<li>
							<label>Nascimento:</label>
							<input type="date" name="dataNascimento" placeholder="01/01/2000">
							<span id="dateNascValidate"></span>
						</li>
						<li>
							<label>Sexo:</label>
							<input type="radio" name="sexo" value="M"> Masc
							<input type="radio" name="sexo" value="F"> Fem
							<span id="dateNascValidate"></span>
						</li>
						<li>
							<input type="submit" value="Cadastrar">
						</li>
					</ul>
				</form>
			</div>
		</fieldset>
	</main>

</body>
</html>