CREATE DATABASE siga 
USE siga
GO
CREATE TABLE aluno(
ra			INT		        NOT NULL,
nome	    VARCHAR(100)	NOT NULL
PRIMARY KEY(ra)
)
GO
CREATE TABLE disciplina(
codigo			INT		        NOT NULL,
nome			VARCHAR(100)	NOT NULL,
sigla			VARCHAR(5)	    NOT NULL,
turno			VARCHAR(20)	    NOT NULL,
numAulas		INT		        NOT NULL
PRIMARY KEY(codigo)
)
GO
CREATE TABLE avaliacao(
codigo			INT		       NOT NULL,
tipo			VARCHAR(20)	   NOT NULL
PRIMARY KEY(codigo)
)
GO
CREATE TABLE faltas(
raAluno		    INT		        NOT NULL,
codigoDisciplina	INT		    NOT NULL,
data			    DATE		NOT NULL,
presenca		    VARCHAR(4)	NOT NULL
PRIMARY KEY (raAluno, codigoDisciplina, data),
FOREIGN KEY (raAluno) REFERENCES aluno(ra),
FOREIGN KEY (codigoDisciplina) REFERENCES disciplina(codigo)
)
GO
CREATE TABLE notas(
raAluno		        INT		                NOT NULL,
codigoDisciplina	INT		                NOT NULL,
codigoAvaliacao	    INT		                NOT NULL,
nota			    DECIMAL(7,2)			NOT NULL
PRIMARY KEY (raAluno, codigoDisciplina, codigoAvaliacao),
FOREIGN KEY (raAluno) REFERENCES aluno(ra),
FOREIGN KEY (codigoDisciplina) REFERENCES disciplina(codigo),
FOREIGN KEY (codigoAvaliacao) REFERENCES avaliacao(codigo)
)
GO
INSERT INTO aluno VALUES 
(1110482001, 'Abigail Almeida'),
(1110482002, 'Bianca Barbosa'),
(1110482003, 'Catarina Castro'),
(1110482004, 'Daniela Duarte'),
(1110482005, 'Eva Ferreira'),
(1110482006, 'Flávia Gomes'),
(1110482007, 'Helena Henriques'),
(1110482008, 'Isabela Lima'),
(1110482009, 'Júlia Mendes'),
(1110482010, 'Larissa Nunes'),
(1110482011, 'Mariana Oliveira'),
(1110482012, 'Natália Pereira'),
(1110482013, 'Olivia Ribeiro'),
(1110482014, 'Paloma Santos'),
(1110482015, 'Raquel Silva'),
(1110482016, 'Sofia Sousa'),
(1110482017, 'Tatiana Torres'),
(1110482018, 'Úrsula Varela'),
(1110482019, 'Valentina Vargas'),
(1110482020, 'Yasmin Zanetti')

SELECT * FROM aluno 

GO
INSERT INTO disciplina VALUES 
(4203010, 'Arquitetura e Organização de Computadores', 'AOC', 'T', 0),--1
(4203020, 'Arquitetura e Organização de Computadores', 'AOC', 'N', 0),--1
(4208010, 'Laboratório de Hardware', 'LH', 'T', 0),--1
(4226004, 'Banco de Dados', 'BD', 'T', 0),--1
(4213003, 'Sistemas Operacionais I', 'SOI', 'T', 0),--2
(4213013, 'Sistemas Operacionais I', 'SOI', 'N', 0),--2
(4233005, 'Laboratório de Banco de Dados', 'LBD', 'T', 0),--3
(5005220, 'Métodos Para a Produção de Conhecimento', 'MPPC', '-', 0)--4

SELECT * FROM disciplina

GO
INSERT INTO faltas VALUES
(1110482001, 4203010, '12/06/2023', 'pppp'),
(1110482001, 4203020, '12/06/2023', 'pppp'),
(1110482001, 4208010, '13/06/2023', 'pppp'),
(1110482001, 4226004, '15/06/2023', 'pppp'),
(1110482001, 4213003, '14/06/2023', 'pppp'),
(1110482001, 4213013, '14/06/2023', 'pppp'),
(1110482001, 4233005, '16/06/2023', 'pppp'),
(1110482001, 5005220, '13/06/2023', 'pppp'),
(1110482002, 4203010, '12/06/2023', 'pppp'),
(1110482002, 4203020, '12/06/2023', 'pppp'),
(1110482002, 4208010, '13/06/2023', 'pppp'),
(1110482002, 4226004, '15/06/2023', 'pppp'),
(1110482002, 4213003, '14/06/2023', 'pppp'),
(1110482002, 4213013, '14/06/2023', 'pppp'),
(1110482002, 4233005, '16/06/2023', 'pppp'),
(1110482002, 5005220, '13/06/2023', 'pppp'),
(1110482003, 4203010, '12/06/2023', 'pppp'),
(1110482003, 4203020, '12/06/2023', 'pppp'),
(1110482003, 4208010, '13/06/2023', 'pppp'),
(1110482003, 4226004, '15/06/2023', 'pppp'),
(1110482003, 4213003, '14/06/2023', 'pppp'),
(1110482003, 4213013, '14/06/2023', 'pppp'),
(1110482003, 4233005, '16/06/2023', 'pppp'),
(1110482003, 5005220, '13/06/2023', 'pppp'), 
(1110482004, 4203010, '12/06/2023', 'pppp'),
(1110482004, 4203020, '12/06/2023', 'pppp'),
(1110482004, 4208010, '13/06/2023', 'pppp'),
(1110482004, 4226004, '15/06/2023', 'pppp'),
(1110482004, 4213003, '14/06/2023', 'pppp'),
(1110482004, 4213013, '14/06/2023', 'pppp'),
(1110482004, 4233005, '16/06/2023', 'pppp'),
(1110482004, 5005220, '13/06/2023', 'pppp'),
(1110482005, 4203010, '12/06/2023', 'pppp'),
(1110482005, 4203020, '12/06/2023', 'pppp'),
(1110482005, 4208010, '13/06/2023', 'pppp'),
(1110482005, 4226004, '15/06/2023', 'pppp'),
(1110482005, 4213003, '14/06/2023', 'pppp'),
(1110482005, 4213013, '14/06/2023', 'pppp'),
(1110482005, 4233005, '16/06/2023', 'pppp'),
(1110482005, 5005220, '13/06/2023', 'pppp'),
(1110482006, 4203010, '12/06/2023', 'pppp'),
(1110482006, 4203020, '12/06/2023', 'pppp'),
(1110482006, 4208010, '13/06/2023', 'pppp'),
(1110482006, 4226004, '15/06/2023', 'pppp'),
(1110482006, 4213003, '14/06/2023', 'pppp'),
(1110482006, 4213013, '14/06/2023', 'pppp'),
(1110482006, 4233005, '16/06/2023', 'pppp'),
(1110482006, 5005220, '13/06/2023', 'pppp'), 
(1110482007, 4203010, '12/06/2023', 'pppp'),
(1110482007, 4203020, '12/06/2023', 'pppp'),
(1110482007, 4208010, '13/06/2023', 'pppp'),
(1110482007, 4226004, '15/06/2023', 'pppp'),
(1110482007, 4213003, '14/06/2023', 'pppp'),
(1110482007, 4213013, '14/06/2023', 'pppp'),
(1110482007, 4233005, '16/06/2023', 'pppp'),
(1110482007, 5005220, '13/06/2023', 'pppp'),
(1110482008, 4203010, '12/06/2023', 'pppp'),
(1110482008, 4203020, '12/06/2023', 'pppp'),
(1110482008, 4208010, '13/06/2023', 'pppp'),
(1110482008, 4226004, '15/06/2023', 'pppp'),
(1110482008, 4213003, '14/06/2023', 'pppp'),
(1110482008, 4213013, '14/06/2023', 'pppp'),
(1110482008, 4233005, '16/06/2023', 'pppp'),
(1110482008, 5005220, '13/06/2023', 'pppp'),
(1110482009, 4203010, '12/06/2023', 'pppp'),
(1110482009, 4203020, '12/06/2023', 'pppp'),
(1110482009, 4208010, '13/06/2023', 'pppp'),
(1110482009, 4226004, '15/06/2023', 'pppp'),
(1110482009, 4213003, '14/06/2023', 'pppp'),
(1110482009, 4213013, '14/06/2023', 'pppp'),
(1110482009, 4233005, '16/06/2023', 'pppp'),
(1110482009, 5005220, '13/06/2023', 'pppp'), 
(1110482010, 4203010, '12/06/2023', 'pppp'),
(1110482010, 4203020, '12/06/2023', 'pppp'),
(1110482010, 4208010, '13/06/2023', 'pppp'),
(1110482010, 4226004, '15/06/2023', 'pppp'),
(1110482010, 4213003, '14/06/2023', 'pppp'),
(1110482010, 4213013, '14/06/2023', 'pppp'),
(1110482010, 4233005, '16/06/2023', 'pppp'),
(1110482010, 5005220, '13/06/2023', 'pppp'),
(1110482011, 4203010, '12/06/2023', 'pppp'),
(1110482011, 4203020, '12/06/2023', 'pppp'),
(1110482011, 4208010, '13/06/2023', 'pppp'),
(1110482011, 4226004, '15/06/2023', 'pppp'),
(1110482011, 4213003, '14/06/2023', 'pppp'),
(1110482011, 4213013, '14/06/2023', 'pppp'),
(1110482011, 4233005, '16/06/2023', 'pppp'),
(1110482011, 5005220, '13/06/2023', 'pppp'),
(1110482012, 4203010, '12/06/2023', 'pppp'),
(1110482012, 4203020, '12/06/2023', 'pppp'),
(1110482012, 4208010, '13/06/2023', 'pppp'),
(1110482012, 4226004, '15/06/2023', 'pppp'),
(1110482012, 4213003, '14/06/2023', 'pppp'),
(1110482012, 4213013, '14/06/2023', 'pppp'),
(1110482012, 4233005, '16/06/2023', 'pppp'),
(1110482012, 5005220, '13/06/2023', 'pppp'), 
(1110482013, 4203010, '12/06/2023', 'pppp'),
(1110482013, 4203020, '12/06/2023', 'pppp'),
(1110482013, 4208010, '13/06/2023', 'pppp'),
(1110482013, 4226004, '15/06/2023', 'pppp'),
(1110482013, 4213003, '14/06/2023', 'pppp'),
(1110482013, 4213013, '14/06/2023', 'pppp'),
(1110482013, 4233005, '16/06/2023', 'pppp'),
(1110482013, 5005220, '13/06/2023', 'pppp'),
(1110482014, 4203010, '12/06/2023', 'pppp'),
(1110482014, 4203020, '12/06/2023', 'pppp'),
(1110482014, 4208010, '13/06/2023', 'pppp'),
(1110482014, 4226004, '15/06/2023', 'pppp'),
(1110482014, 4213003, '14/06/2023', 'pppp'),
(1110482014, 4213013, '14/06/2023', 'pppp'),
(1110482014, 4233005, '16/06/2023', 'pppp'),
(1110482014, 5005220, '13/06/2023', 'pppp'),
(1110482015, 4203010, '12/06/2023', 'pppp'),
(1110482015, 4203020, '12/06/2023', 'pppp'),
(1110482015, 4208010, '13/06/2023', 'pppp'),
(1110482015, 4226004, '15/06/2023', 'pppp'),
(1110482015, 4213003, '14/06/2023', 'pppp'),
(1110482015, 4213013, '14/06/2023', 'pppp'),
(1110482015, 4233005, '16/06/2023', 'pppp'),
(1110482015, 5005220, '13/06/2023', 'pppp'), 
(1110482016, 4203010, '12/06/2023', 'pppp'),
(1110482016, 4203020, '12/06/2023', 'pppp'),
(1110482016, 4208010, '13/06/2023', 'pppp'),
(1110482016, 4226004, '15/06/2023', 'pppp'),
(1110482016, 4213003, '14/06/2023', 'pppp'),
(1110482016, 4213013, '14/06/2023', 'pppp'),
(1110482016, 4233005, '16/06/2023', 'pppp'),
(1110482016, 5005220, '13/06/2023', 'pppp'),
(1110482017, 4203010, '12/06/2023', 'pppp'),
(1110482017, 4203020, '12/06/2023', 'pppp'),
(1110482017, 4208010, '13/06/2023', 'pppp'),
(1110482017, 4226004, '15/06/2023', 'pppp'),
(1110482017, 4213003, '14/06/2023', 'pppp'),
(1110482017, 4213013, '14/06/2023', 'pppp'),
(1110482017, 4233005, '16/06/2023', 'pppp'),
(1110482017, 5005220, '13/06/2023', 'pppp'),
(1110482018, 4203010, '12/06/2023', 'pppp'),
(1110482018, 4203020, '12/06/2023', 'pppp'),
(1110482018, 4208010, '13/06/2023', 'pppp'),
(1110482018, 4226004, '15/06/2023', 'pppp'),
(1110482018, 4213003, '14/06/2023', 'pppp'),
(1110482018, 4213013, '14/06/2023', 'pppp'),
(1110482018, 4233005, '16/06/2023', 'pppp'),
(1110482018, 5005220, '13/06/2023', 'pppp'),
(1110482019, 4203010, '12/06/2023', 'pppp'),
(1110482019, 4203020, '12/06/2023', 'pppp'),
(1110482019, 4208010, '13/06/2023', 'pppp'),
(1110482019, 4226004, '15/06/2023', 'pppp'),
(1110482019, 4213003, '14/06/2023', 'pppp'),
(1110482019, 4213013, '14/06/2023', 'pppp'),
(1110482019, 4233005, '16/06/2023', 'pppp'),
(1110482019, 5005220, '13/06/2023', 'pppp'),
(1110482020, 4203010, '12/06/2023', 'pppp'),
(1110482020, 4203020, '12/06/2023', 'pppp'),
(1110482020, 4208010, '13/06/2023', 'pppp'),
(1110482020, 4226004, '15/06/2023', 'pppp'),
(1110482020, 4213003, '14/06/2023', 'pppp'),
(1110482020, 4213013, '14/06/2023', 'pppp'),
(1110482020, 4233005, '16/06/2023', 'pppp'),
(1110482020, 5005220, '13/06/2023', 'pppp')

SELECT * FROM faltas

GO
INSERT INTO avaliacao VALUES
(11, 1),
(12, 2),
(13, 3),
(21, 1),
(22, 2),
(23, 3),
(24, 4),
(31, 1),
(32, 2),
(33, 3),
(41, 1),
(42, 2)

SELECT * FROM avaliacao

SELECT * FROM notas

--Atualiza notas
GO
CREATE PROCEDURE sp_atualiza_nota (@nota INT, @ra INT, @codigo INT, @avaliacao INT, @saida VARCHAR(100) OUTPUT)
AS 
	UPDATE notas SET nota = @nota WHERE raAluno = @ra
	AND codigoDisciplina = @codigo
	AND codigoAvaliacao = @avaliacao
	SET @saida = 'Nota atualizada!'

DECLARE @out VARCHAR(40)
EXEC sp_atualiza_nota 10, 1, 1, 1, @out OUTPUT 
PRINT @out


--Atualiza falta
GO 
CREATE PROCEDURE sp_atualiza_faltas (@presenca VARCHAR(5), @ra INT, @codigo INT, @data DATE, @saida VARCHAR(100) OUTPUT)
AS 
	UPDATE faltas SET presenca = @presenca WHERE raAluno = @ra
	AND codigoDisciplina = @codigo
	AND data = @data
	SET @saida = 'Faltas atualizadas!'

DECLARE @out VARCHAR(40)
EXEC sp_atualiza_faltas 'ffpp', 1, 1, '2023-06-12', @out OUTPUT 
PRINT @out

GO
CREATE PROCEDURE sp_notas2 (@ra INT, @codigo INT , @nota DECIMAL(7,2), @saida VARCHAR(50) OUTPUT)
	AS
		DECLARE @query VARCHAR(MAX), @erro VARCHAR(MAX), @codigoAvaliacao INT

		--pegar certinho que tipo de avaliação vai ser com base no codigo da disciplina
		
		IF (@codigo = 4213003 OR @codigo = 4213013)
		BEGIN
			SET @codigoAvaliacao = 21
			SET @codigoAvaliacao = @codigoAvaliacao + (SELECT COUNT(raAluno) FROM notas WHERE @ra = raAluno AND codigoDisciplina = @codigo)
			IF (@codigoAvaliacao = 23)
			BEGIN
				RAISERROR('Erro no armazenamento do produto', 16, 1)
			END
		END
		ELSE IF (@codigo = 4233005)
		BEGIN
			SET @codigoAvaliacao = 31
			SET @codigoAvaliacao = @codigoAvaliacao + (SELECT COUNT(raAluno) FROM notas WHERE @ra = raAluno AND codigoDisciplina = @codigo)
			IF (@codigoAvaliacao = 33)
			BEGIN
				RAISERROR('Erro no armazenamento do produto', 16, 1)
			END
		END
		ELSE IF (@codigo = 5005220)
		BEGIN
			SET @codigoAvaliacao = 41
			SET @codigoAvaliacao = @codigoAvaliacao + (SELECT COUNT(raAluno) FROM notas WHERE @ra = raAluno AND codigoDisciplina = @codigo)
			IF (@codigoAvaliacao = 42)
			BEGIN
				RAISERROR('Erro no armazenamento do produto', 16, 1)
			END
		END
		ELSE IF (@codigo = 4203010 OR @codigo = 4203020 OR @codigo = 4208010 OR @codigo = 4226004)
		BEGIN
			SET @codigoAvaliacao = 11
			SET @codigoAvaliacao = @codigoAvaliacao + (SELECT COUNT(raAluno) FROM notas WHERE @ra = raAluno AND codigoDisciplina = @codigo)
			IF (@codigoAvaliacao = 13)
			BEGIN
				RAISERROR('Erro no armazenamento do produto', 16, 1)
			END
		END
		
		SET @query = 'INSERT INTO notas VALUES ('+CAST(@ra AS VARCHAR(10))+', '+CAST(@codigo AS VARCHAR(7))+',
		'+CAST(@codigoAvaliacao AS VARCHAR(2))+', '+CAST(@nota AS VARCHAR(6))+')'

		BEGIN TRY
			EXEC (@query)
			SET @saida = 'Entrada inserida com sucesso'
		END TRY
		BEGIN CATCH
			SET @erro = ERROR_MESSAGE()
			IF (@erro LIKE '%primary%')
			BEGIN
				RAISERROR('Id duplicado', 16, 1)
			END
			ELSE
			BEGIN
				RAISERROR('Erro no armazenamento do produto', 16, 1)
			END
		END CATCH

		DECLARE @out3 VARCHAR(20)
		EXEC sp_notas2 1110482016, 4203010,10, @out3 OUTPUT
		PRINT @out3

		SELECT * FROM notas
		DROP PROCEDURE sp_notas2
		DELETE notas 

GO
CREATE FUNCTION	fn_atribui_notas (@codigoDisciplina INT)
RETURNS @tabela TABLE(
raAluno				INT,
nomeAluno				VARCHAR(100),
nota1					DECIMAL(7,2),
nota2					DECIMAL(7,2),
nota3					DECIMAL(7,2),
nota4					DECIMAL(7,2),
mediaFinal				DECIMAL(7,2),
situacao				VARCHAR(50)
)
AS
BEGIN
	DECLARE @nome VARCHAR(100),
			@numAulas INT,
			@codigoAvali INT,
			@tipoAvali INT,
			@raAlu INT,
			@disci INT,
			@nota DECIMAL(7,2),
			@nota1 DECIMAL(7,2),
			@nota2 DECIMAL(7,2),
			@nota3 DECIMAL(7,2),
			@nota4 DECIMAL(7,2),
			@media DECIMAL(7,2),
			@situacao VARCHAR(50)

	SELECT @numAulas = numAulas FROM disciplina WHERE disciplina.codigo = @codigoDisciplina

	INSERT INTO @tabela SELECT aluno.ra, aluno.nome, 0, 0, 0, 0, 0, null 
	FROM aluno, notas, disciplina, avaliacao
	WHERE aluno.ra = notas.raAluno
		AND disciplina.codigo = notas.codigoDisciplina
		AND notas.codigoAvaliacao = avaliacao.codigo
		AND disciplina.codigo = @codigoDisciplina
	GROUP BY aluno.ra, aluno.nome

	DECLARE cursor_notas CURSOR
	FOR SELECT aluno.ra, aluno.nome, disciplina.codigo, avaliacao.codigo, notas.nota
	FROM notas, aluno, disciplina, avaliacao
	WHERE notas.raAluno = aluno.ra
		AND notas.codigoDisciplina = disciplina.codigo
		AND notas.codigoAvaliacao = avaliacao.codigo
		AND notas.codigoDisciplina = @codigoDisciplina
	ORDER BY aluno.ra, avaliacao.codigo
	OPEN cursor_notas
	FETCH NEXT FROM cursor_notas INTO @raAlu, @nome, @disci, @codigoAvali, @nota

	WHILE @@FETCH_STATUS = 0
		BEGIN

		SET @nota1 = 0
		SET @nota2 = 0
		SET @nota3 = 0
		SET @nota4 = 0
		SET @media = 0

		SET @codigoAvali = (SELECT DISTINCT SUBSTRING(CONVERT(varchar(2), codigoAvaliacao), 1, 1)FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina)

		IF(@codigoAvali = 1)
		BEGIN
			SET @nota1 = (0.3 *(SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 11))
			SET @nota2 = (0.5 *(SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 12))
			SET @nota3 = (0.2 *(SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 13))
			SET @media = @nota1 + @nota2 + @nota3
		END
		ELSE IF(@codigoAvali = 2)
		BEGIN
			SET @nota1 = (0.35 *(SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 21))
			SET @nota2 = (0.35 *(SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 22))
			SET @nota3 = (0.3 *(SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 23))
			IF(@media >= 3 AND @media <= 6)
			BEGIN
				SET @nota4 = (0.2 *(SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 24))
				SET @media = @nota1 + @nota2 + @nota3 + @nota4
			END 
			ELSE
			BEGIN
				SET @media = @nota1 + @nota2 + @nota3
			END
		END 
		ELSE IF(@codigoAvali = 3)
		BEGIN
			SET @nota1 = (SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 31)
			SET @nota2 = (SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 32)
			SET @nota3 = (SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 33)
			SET @media = (@nota1 + @nota2 + @nota3) / 3
		END
		ELSE IF(@codigoAvali = 4)
		BEGIN
			SET @nota1 = (0.8 *(SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 41))
			SET @nota2 = (0.2 *(SELECT nota FROM notas WHERE @raAlu = raAluno AND @disci = codigoDisciplina AND codigoAvaliacao = 42))
		END

		IF(@media < 6)
		BEGIN
			SET @situacao = 'REPROVADO'
		END 
		ELSE
		BEGIN
			SET @situacao = 'APROVADO'
		END 

		UPDATE @tabela SET nota1 = @nota1, nota2 = @nota2, nota3 = @nota3, nota4 = @nota4, mediaFinal = @media, situacao = @situacao WHERE raAluno = @raAlu
		FETCH NEXT FROM cursor_notas INTO @raAlu, @nome, @disci, @codigoAvali, @nota
	END
	CLOSE cursor_notas
	DEALLOCATE cursor_notas
	RETURN
END

--DROP FUNCTION fn_atribui_notas
SELECT * FROM fn_atribui_notas(4203010)
DROP FUNCTION fn_atribui_notas

GO
CREATE FUNCTION faltas_turma(@codigoDisciplina INT) 
	RETURNS @tabela TABLE(
	raAluno CHAR(13),
	nomeAluno VARCHAR(100), 
	data1 VARCHAR(4), 
	data2 VARCHAR(4),
	data3 VARCHAR(4),
	data4 VARCHAR(4),
	data5 VARCHAR(4),
	data6 VARCHAR(4),
	data7 VARCHAR(4),
	data8 VARCHAR(4), 
	data9 VARCHAR(4), 
	data10 VARCHAR(4), 
	data11 VARCHAR(4), 
	data12 VARCHAR(4), 
	data13 VARCHAR(4), 
	data14 VARCHAR(4), 
	data15 VARCHAR(4), 
	data16 VARCHAR(4), 
	data17 VARCHAR(4), 
	data18 VARCHAR(4), 
	data19 VARCHAR(4), 
	data20 VARCHAR(4), 
	totalFaltas INT)
AS
BEGIN
	DECLARE @ra INT,
			@nome VARCHAR (100),
			@data DATE,
			@presenca INT,
			@numAulas INT,
			@inter1 INT,
			@inter2 INT,
			@inter3 VARCHAR(4)

	SELECT @numAulas = numAulas FROM disciplina WHERE disciplina.codigo = @codigoDisciplina
		
	INSERT INTO @tabela SELECT faltas.raAluno, aluno.nome, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 
	NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, @numAulas
		FROM aluno, disciplina, faltas
		WHERE faltas.raAluno = aluno.ra
			AND faltas.codigoDisciplina = disciplina.codigo
			AND faltas.codigoDisciplina = @codigoDisciplina
		GROUP BY faltas.raAluno, aluno.nome

	DECLARE c_faltas CURSOR 
		FOR SELECT faltas.raAluno, aluno.nome, faltas.data, faltas.presenca 
			FROM faltas, aluno, disciplina
			WHERE faltas.raAluno = aluno.ra 
				AND faltas.codigoDisciplina = disciplina.codigo
				AND faltas.codigoDisciplina = 4203010
			ORDER BY faltas.raAluno, faltas.data

	OPEN c_faltas

	FETCH NEXT FROM c_faltas INTO @ra, @nome, @data, @presenca

	WHILE @@FETCH_STATUS = 0
	BEGIN
		SET @inter1 = 1
		SELECT @inter2 = COUNT(raAluno) FROM faltas WHERE raAluno = @ra
		WHILE @inter1 <= @inter2 AND @@FETCH_STATUS = 0
			BEGIN
			
			IF @presenca = 0
			BEGIN
				SET @inter3 = 'FFFF'
			END
			IF @presenca = 1
			BEGIN
				SET @inter3 = 'PFFF'
			END
			IF @presenca = 2
			BEGIN
				SET @inter3 = 'PPFF'
			END
			IF @presenca = 3
			BEGIN
				SET @inter3 = 'PPPF'
			END
			IF @presenca = 4
			BEGIN
				SET @inter3 = 'PPPP'
			END

			IF @inter1 = 1
			BEGIN
				UPDATE @tabela SET data1 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 2
			BEGIN
				UPDATE @tabela SET data2 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 3
			BEGIN
				UPDATE @tabela SET data3 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 4
			BEGIN
				UPDATE @tabela SET data4 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 5
			BEGIN
				UPDATE @tabela SET data5 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 6
			BEGIN
				UPDATE @tabela SET data6 = @inter3 WHERE raAluno= @ra
			END
			IF @inter1 = 7
			BEGIN
				UPDATE @tabela SET data7 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 8
			BEGIN
				UPDATE @tabela SET data8 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 9
			BEGIN
				UPDATE @tabela SET data9 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 10
			BEGIN
				UPDATE @tabela SET data10 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 11
			BEGIN
				UPDATE @tabela SET data11 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 12
			BEGIN
				UPDATE @tabela SET data12 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 13
			BEGIN
				UPDATE @tabela SET data13 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 14
			BEGIN
				UPDATE @tabela SET data14 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 15
			BEGIN
				UPDATE @tabela SET data15 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 16
			BEGIN
				UPDATE @tabela SET data16 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 17
			BEGIN
				UPDATE @tabela SET data17 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 18
			BEGIN
				UPDATE @tabela SET data18 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 19
			BEGIN
				UPDATE @tabela SET data19 = @inter3 WHERE raAluno = @ra
			END
			IF @inter1 = 20
			BEGIN
				UPDATE @tabela SET data20 = @inter3 WHERE raAluno = @ra
			END
			UPDATE @tabela SET totalFaltas = totalFaltas - @presenca WHERE raAluno= @ra
			FETCH NEXT FROM c_faltas INTO @ra, @nome, @data, @presenca
			SET @inter1 = @inter1 + 1
			END
	END

	RETURN

END

SELECT * FROM faltas_turma(4203010)
SELECT * FROM faltas
DROP FUNCTION faltas_turma