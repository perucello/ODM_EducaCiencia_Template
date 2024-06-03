/*********************************************************
******* EDUCACIENCIA FASTCODE ****************************
******* IBM ODM               ****************************
**********************************************************/

/*********************************************************
*************** TESTE 01 *********************************
**********************************************************/
String segmento = "";
String subSegmento = "";
int prazoCurto = 0; 
int prazoMinimo = 0; 
int prazoOpCredito = 0; 
int prazoTitulo = 0;
String dataEmissao = "2024-04-01";
String produto = "Caucao";
String destinoAutomaticoTitulo = "";
double valorTitulo = 0.00;
int qtdDiasProrrogarTitulo = 0;
String clientecnpjCpf = "";
String clienteTipoPessoa = "";
boolean clienteImpedido = true;
boolean clientePermitido = true;
int clienteTempoRelacionamento = 0;
String clienteScore = "";
Double liquidezClienteAteVencto = 0.00;
Double liquidezClienteAposVencto = 0.00;
String fiadorCnpjCpf = "";
String fiadorTipoPessoa = "";
boolean fiadorImpedido = true;
boolean fiadorPermitido = true;
int fiadorTempoRelacionamento = 0;
String fiadorScore = "";
Double liquidezFiadorAteVencto = 0.00;
Double liquidezFiadorAposVencto = 0.00;
br.com.educaciencia.request.Solicitacao_ODM result = new br.com.educaciencia.request.Solicitacao_ODM(new br.com.educaciencia.request.Classificacao(segmento,subSegmento),new br.com.educaciencia.request.Prazos(prazoCurto,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.educaciencia.request.Emissao(dataEmissao),produto,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogarTitulo,clientecnpjCpf,clienteTipoPessoa, clienteImpedido, clientePermitido,clienteTempoRelacionamento,clienteScore,liquidezClienteAteVencto, liquidezClienteAposVencto,fiadorCnpjCpf, fiadorTipoPessoa,fiadorImpedido, fiadorPermitido,fiadorTempoRelacionamento, fiadorScore, liquidezFiadorAteVencto,liquidezFiadorAposVencto);
return result;
/* OUTPUT */
****************************************
****************************************
**** TESTE EDUCACIENCIA FASTCODE *******
****************************************
****************************************
Produto teste: Caucao
****************************************
**** Tabela 1 **************************
Status: rejeitar, 
Código: 1, 
Motivo: motivo Tabela01
Linha: 1
status de Status: rejeitar
********** final ***********
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
Tabela 2: Valida_Fluxo_Aprovado é valida add aprovado lista é false 
****************************************
Valida_Fluxo_Aprovado é valida add aprovado lista é falso 
Produto teste: Caucao
****************************************
**** Tabela 2 **************************
Status: rejeitar, 
Código: 1, 
Motivo: motivo Tabela02
Linha: 1
Tabela 3: Valida_Fluxo_Aprovado é valida add aprovado lista é false 
****************************************
Valida_Fluxo_Aprovado é valida add aprovado lista é falso 
****************************************
************ FIM ***********************
****************************************
****   Lista  **************************
Regra: Regra Tabela01 - Caucao
Status: rejeitar, 
Código: 1, 
Motivo: motivo Tabela01
******************
Regra: Regra Tabela02 - Caucao
Status: rejeitar, 
Código: 1, 
Motivo: motivo Tabela02
******************
****************************************
****   Lista  Aprovados ****
****************************************
****************************************


/*********************************************************
*************** TESTE 02 *********************************
**********************************************************/
String segmento = "";
String subSegmento = "";
int prazoCurto = 0; 
int prazoMinimo = 0; 
int prazoOpCredito = 0; 
int prazoTitulo = 0;
String dataEmissao = "2024-04-01";
String produto = "Duplited";
String destinoAutomaticoTitulo = "";
double valorTitulo = 0.00;
int qtdDiasProrrogarTitulo = 0;
String clientecnpjCpf = "";
String clienteTipoPessoa = "";
boolean clienteImpedido = true;
boolean clientePermitido = true;
int clienteTempoRelacionamento = 0;
String clienteScore = "";
Double liquidezClienteAteVencto = 0.00;
Double liquidezClienteAposVencto = 0.00;
String fiadorCnpjCpf = "";
String fiadorTipoPessoa = "";
boolean fiadorImpedido = true;
boolean fiadorPermitido = true;
int fiadorTempoRelacionamento = 0;
String fiadorScore = "";
Double liquidezFiadorAteVencto = 0.00;
Double liquidezFiadorAposVencto = 0.00;
br.com.educaciencia.request.Solicitacao_ODM result = new br.com.educaciencia.request.Solicitacao_ODM(new br.com.educaciencia.request.Classificacao(segmento,subSegmento),new br.com.educaciencia.request.Prazos(prazoCurto,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.educaciencia.request.Emissao(dataEmissao),produto,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogarTitulo,clientecnpjCpf,clienteTipoPessoa, clienteImpedido, clientePermitido,clienteTempoRelacionamento,clienteScore,liquidezClienteAteVencto, liquidezClienteAposVencto,fiadorCnpjCpf, fiadorTipoPessoa,fiadorImpedido, fiadorPermitido,fiadorTempoRelacionamento, fiadorScore, liquidezFiadorAteVencto,liquidezFiadorAposVencto);
return result;
/* OUTPUT */
****************************************
****************************************
**** TESTE EDUCACIENCIA FASTCODE *******
****************************************
****************************************
Produto teste: Duplited
****************************************
**** Tabela 1 **************************
Status: manual, 
Código: 1, 
Motivo: motivo Tabela01
Linha: 2
status de Status: manual
********** final ***********
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
Tabela 2: Valida_Fluxo_Aprovado é valida add aprovado lista é false 
****************************************
Valida_Fluxo_Aprovado é valida add aprovado lista é falso 
Produto teste: Duplited
****************************************
**** Tabela 2 **************************
Tabela 3: Valida_Fluxo_Aprovado é valida add aprovado lista é true 
****************************************
Valida_Fluxo_Aprovado é valida add aprovado lista é verdadeiro
Status: Aprovado, 
Regra: Regra: regra 02 de CondicaoAceite_Aprovado
Regra: aprovado regra 2 - ação
Status: Aprovado, 
Regra: Regra: regra 02 de CondicaoAceite_Aprovado
******************
****************************************
************ FIM ***********************
****************************************
****   Lista  **************************
Regra: Regra Tabela01 - Duplited
Status: manual, 
Código: 1, 
Motivo: motivo Tabela01
******************
****************************************
****   Lista  Aprovados ****
Regra: aprovado regra 2 - ação
Status: Aprovado, 
Regra: Regra: regra 02 de CondicaoAceite_Aprovado
******************
****************************************
****************************************


/*********************************************************
*************** TESTE 03 *********************************
**********************************************************/
String segmento = "";
String subSegmento = "";
int prazoCurto = 0; 
int prazoMinimo = 0; 
int prazoOpCredito = 0; 
int prazoTitulo = 0;
String dataEmissao = "2024-04-01";
String produto = "DuplitedES";
String destinoAutomaticoTitulo = "";
double valorTitulo = 0.00;
int qtdDiasProrrogarTitulo = 0;
String clientecnpjCpf = "";
String clienteTipoPessoa = "";
boolean clienteImpedido = true;
boolean clientePermitido = true;
int clienteTempoRelacionamento = 0;
String clienteScore = "";
Double liquidezClienteAteVencto = 0.00;
Double liquidezClienteAposVencto = 0.00;
String fiadorCnpjCpf = "";
String fiadorTipoPessoa = "";
boolean fiadorImpedido = true;
boolean fiadorPermitido = true;
int fiadorTempoRelacionamento = 0;
String fiadorScore = "";
Double liquidezFiadorAteVencto = 0.00;
Double liquidezFiadorAposVencto = 0.00;
br.com.educaciencia.request.Solicitacao_ODM result = new br.com.educaciencia.request.Solicitacao_ODM(new br.com.educaciencia.request.Classificacao(segmento,subSegmento),new br.com.educaciencia.request.Prazos(prazoCurto,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.educaciencia.request.Emissao(dataEmissao),produto,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogarTitulo,clientecnpjCpf,clienteTipoPessoa, clienteImpedido, clientePermitido,clienteTempoRelacionamento,clienteScore,liquidezClienteAteVencto, liquidezClienteAposVencto,fiadorCnpjCpf, fiadorTipoPessoa,fiadorImpedido, fiadorPermitido,fiadorTempoRelacionamento, fiadorScore, liquidezFiadorAteVencto,liquidezFiadorAposVencto);
return result;
/* OUTPUT */
****************************************
****************************************
**** TESTE EDUCACIENCIA FASTCODE *******
****************************************
****************************************
Produto teste: DuplitedES
****************************************
**** Tabela 1 **************************
status de Status: 
********** final ***********
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
Tabela 2: Valida_Fluxo_Aprovado é valida add aprovado lista é true 
****************************************
Valida_Fluxo_Aprovado é valida add aprovado lista é verdadeiro
Status: Aprovado, 
Regra: Regra: regra 01 de CondicaoAceite_Aprovado
Regra: aprovado regra 1 - ação
Status: Aprovado, 
Regra: Regra: regra 01 de CondicaoAceite_Aprovado
******************
Produto teste: DuplitedES
****************************************
**** Tabela 2 **************************
Tabela 3: Valida_Fluxo_Aprovado é valida add aprovado lista é true 
****************************************
Valida_Fluxo_Aprovado é valida add aprovado lista é verdadeiro
Status: Aprovado, 
Regra: Regra: regra 02 de CondicaoAceite_Aprovado
Regra: aprovado regra 1 - ação
Status: Aprovado, 
Regra: Regra: regra 01 de CondicaoAceite_Aprovado
******************
Regra: aprovado regra 2 - ação
Status: Aprovado, 
Regra: Regra: regra 02 de CondicaoAceite_Aprovado
******************
****************************************
************ FIM ***********************
****************************************
****   Lista  **************************
****************************************
****   Lista  Aprovados ****
Regra: aprovado regra 1 - ação
Status: Aprovado, 
Regra: Regra: regra 01 de CondicaoAceite_Aprovado
******************
Regra: aprovado regra 2 - ação
Status: Aprovado, 
Regra: Regra: regra 02 de CondicaoAceite_Aprovado
******************
****************************************
****************************************


/*########################################################
######### DADOS INVALIDOS ################################
##########################################################*/
String segmento = "";
String subSegmento = "";
int prazoCurto = 0; 
int prazoMinimo = 0; 
int prazoOpCredito = 0; 
int prazoTitulo = 0;
String dataEmissao = "2024-04-01";
String produto = "Caucao";
String destinoAutomaticoTitulo = "";
double valorTitulo = 0.00;
int qtdDiasProrrogarTitulo = 0;
String clientecnpjCpf = "";
String clienteTipoPessoa = "";
boolean clienteImpedido = true;
boolean clientePermitido = true;
int clienteTempoRelacionamento = 0;
String clienteScore = "";
Double liquidezClienteAteVencto = 0.00;
Double liquidezClienteAposVencto = 0.00;
String fiadorCnpjCpf = "";
String fiadorTipoPessoa = "";
boolean fiadorImpedido = true;
boolean fiadorPermitido = true;
int fiadorTempoRelacionamento = 0;
String fiadorScore = "";
Double liquidezFiadorAteVencto = 0.00;
Double liquidezFiadorAposVencto = 0.00;
br.com.educaciencia.request.Solicitacao_ODM result = new br.com.educaciencia.request.Solicitacao_ODM(new br.com.educaciencia.request.Classificacao(segmento,subSegmento),new br.com.educaciencia.request.Prazos(prazoCurto,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.educaciencia.request.Emissao(dataEmissao),produto,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogarTitulo,clientecnpjCpf,clienteTipoPessoa, clienteImpedido, clientePermitido,clienteTempoRelacionamento,clienteScore,liquidezClienteAteVencto, liquidezClienteAposVencto,fiadorCnpjCpf, fiadorTipoPessoa,fiadorImpedido, fiadorPermitido,fiadorTempoRelacionamento, fiadorScore, liquidezFiadorAteVencto,liquidezFiadorAposVencto);
return result;
/* OUTPUT */
******  dados de requisição NÃO são validos ****** 



/*########################################################
######### DADOS VALIDOS ##################################
##########################################################*/
String segmento = "";
String subSegmento = "";
int prazoCurto = 0; 
int prazoMinimo = 0; 
int prazoOpCredito = 0; 
int prazoTitulo = 0;
String dataEmissao = "2024-04-01";
String produto = "Caucao";
String destinoAutomaticoTitulo = "";
double valorTitulo = 0.00;
int qtdDiasProrrogarTitulo = 0;
String clientecnpjCpf = "String";
String clienteTipoPessoa = "";
boolean clienteImpedido = true;
boolean clientePermitido = true;
int clienteTempoRelacionamento = 0;
String clienteScore = "";
Double liquidezClienteAteVencto = 0.00;
Double liquidezClienteAposVencto = 0.00;
String fiadorCnpjCpf = "";
String fiadorTipoPessoa = "";
boolean fiadorImpedido = true;
boolean fiadorPermitido = true;
int fiadorTempoRelacionamento = 0;
String fiadorScore = "";
Double liquidezFiadorAteVencto = 0.00;
Double liquidezFiadorAposVencto = 0.00;
br.com.educaciencia.request.Solicitacao_ODM result = new br.com.educaciencia.request.Solicitacao_ODM(new br.com.educaciencia.request.Classificacao(segmento,subSegmento),new br.com.educaciencia.request.Prazos(prazoCurto,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.educaciencia.request.Emissao(dataEmissao),produto,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogarTitulo,clientecnpjCpf,clienteTipoPessoa, clienteImpedido, clientePermitido,clienteTempoRelacionamento,clienteScore,liquidezClienteAteVencto, liquidezClienteAposVencto,fiadorCnpjCpf, fiadorTipoPessoa,fiadorImpedido, fiadorPermitido,fiadorTempoRelacionamento, fiadorScore, liquidezFiadorAteVencto,liquidezFiadorAposVencto);
return result;
/* OUTPUT */
****** dados de requisição são validos ****** 





/*########################################################
######### DATA <=30     ##################################
##########################################################*/
String segmento = "";
String subSegmento = "";
int prazoCurto = 0; 
int prazoMinimo = 0; 
int prazoOpCredito = 0; 
int prazoTitulo = 0;
String dataEmissao = "2024-04-01";
String produto = "Caucao";
String destinoAutomaticoTitulo = "";
double valorTitulo = 0.00;
int qtdDiasProrrogarTitulo = 0;
String clientecnpjCpf = "String";
String clienteTipoPessoa = "";
boolean clienteImpedido = true;
boolean clientePermitido = true;
int clienteTempoRelacionamento = 0;
String clienteScore = "";
Double liquidezClienteAteVencto = 0.00;
Double liquidezClienteAposVencto = 0.00;
String fiadorCnpjCpf = "";
String fiadorTipoPessoa = "";
boolean fiadorImpedido = true;
boolean fiadorPermitido = true;
int fiadorTempoRelacionamento = 0;
String fiadorScore = "";
Double liquidezFiadorAteVencto = 0.00;
Double liquidezFiadorAposVencto = 0.00;
br.com.educaciencia.request.Solicitacao_ODM result = new br.com.educaciencia.request.Solicitacao_ODM(new br.com.educaciencia.request.Classificacao(segmento,subSegmento),new br.com.educaciencia.request.Prazos(prazoCurto,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.educaciencia.request.Emissao(dataEmissao),produto,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogarTitulo,clientecnpjCpf,clienteTipoPessoa, clienteImpedido, clientePermitido,clienteTempoRelacionamento,clienteScore,liquidezClienteAteVencto, liquidezClienteAposVencto,fiadorCnpjCpf, fiadorTipoPessoa,fiadorImpedido, fiadorPermitido,fiadorTempoRelacionamento, fiadorScore, liquidezFiadorAteVencto,liquidezFiadorAposVencto);
return result;
/* OUTPUT */
****************************************
****************************************
**** FLUXO EDUCACIENCIA FASTCODE *******
****************************************
****************************************
Produto teste: Caucao
****************************************
**** valida dados **********************
****** dados de requisição são validos ****** 
status de Status: 
********** final ***********
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
****************************************
**** Dias Relacionamento ***************
data_request_calculo: 2024-04-01
data_hoje: 2024-04-26
Diferença de dias: 25
dias >= regra: true
Status: rejeitar, 
Código: 1, 
Motivo: Relacionamento menor que 30 dias
Linha: 06-1 | 001
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
****************************************
**** xxxxxxxxxxxx **********************
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
****************************************
**** Valida Regras Aprovadas ***********
Status: aprovado, 
Regra: Regra 02 - sem motivos
Linha: Regra 02 Aprovada
Status: aprovado, 
Regra: Regra 03 - sem motivos
Linha: Regra 03 Aprovada
Status: aprovado, 
Regra: Regra 04 - sem motivos
Linha: Regra 04 Aprovada
Status: aprovado, 
Regra: Regra 05 - sem motivos
Linha: Regra 05 Aprovada
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
-----------------------------------------
--------------- FIM ---------------------
-----------------------------------------
------------ Lista Exceção --------------
Regra: 01
Status: rejeitar, 
Código: 1, 
Motivo: Relacionamento menor que 30 dias
******************
-----------------------------------------

-----------------------------------------
------------ Lista  Aprovados -----------
Regra: regra 02 - Condicao Aprovada
Status: aprovado, 
Regra: Regra 02 - sem motivos
******************
Regra: regra 03 - Condicao Aprovada
Status: aprovado, 
Regra: Regra 03 - sem motivos
******************
Regra: regra 04 - Condicao Aprovada
Status: aprovado, 
Regra: Regra 04 - sem motivos
******************
Regra: regra 05 - Condicao Aprovada
Status: aprovado, 
Regra: Regra 05 - sem motivos
******************
-----------------------------------------
-----------------------------------------



/*########################################################
######### DATA > 30     ##################################
##########################################################*/
String segmento = "";
String subSegmento = "";
int prazoCurto = 0; 
int prazoMinimo = 0; 
int prazoOpCredito = 0; 
int prazoTitulo = 0;
String dataEmissao = "2024-01-01";
String produto = "Caucao";
String destinoAutomaticoTitulo = "";
double valorTitulo = 0.00;
int qtdDiasProrrogarTitulo = 0;
String clientecnpjCpf = "String";
String clienteTipoPessoa = "";
boolean clienteImpedido = true;
boolean clientePermitido = true;
int clienteTempoRelacionamento = 0;
String clienteScore = "";
Double liquidezClienteAteVencto = 0.00;
Double liquidezClienteAposVencto = 0.00;
String fiadorCnpjCpf = "";
String fiadorTipoPessoa = "";
boolean fiadorImpedido = true;
boolean fiadorPermitido = true;
int fiadorTempoRelacionamento = 0;
String fiadorScore = "";
Double liquidezFiadorAteVencto = 0.00;
Double liquidezFiadorAposVencto = 0.00;
br.com.educaciencia.request.Solicitacao_ODM result = new br.com.educaciencia.request.Solicitacao_ODM(new br.com.educaciencia.request.Classificacao(segmento,subSegmento),new br.com.educaciencia.request.Prazos(prazoCurto,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.educaciencia.request.Emissao(dataEmissao),produto,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogarTitulo,clientecnpjCpf,clienteTipoPessoa, clienteImpedido, clientePermitido,clienteTempoRelacionamento,clienteScore,liquidezClienteAteVencto, liquidezClienteAposVencto,fiadorCnpjCpf, fiadorTipoPessoa,fiadorImpedido, fiadorPermitido,fiadorTempoRelacionamento, fiadorScore, liquidezFiadorAteVencto,liquidezFiadorAposVencto);
return result;
/* OUTPUT */
****************************************
****************************************
**** FLUXO EDUCACIENCIA FASTCODE *******
****************************************
****************************************
Produto teste: Caucao
****************************************
**** valida dados **********************
****** dados de requisição são validos ****** 
status de Status: 
********** final ***********
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
****************************************
**** Dias Relacionamento ***************
data_request_calculo: 2024-01-01
data_hoje: 2024-04-26
Diferença de dias: 116
dias <= regra: false
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
****************************************
**** Valida Regras Aprovadas ***********
Status: aprovado, 
Regra: Regra 01 - sem motivos
Linha: Regra 01 Aprovada
Status: aprovado, 
Regra: Regra 02 - sem motivos
Linha: Regra 02 Aprovada
Status: aprovado, 
Regra: Regra 03 - sem motivos
Linha: Regra 03 Aprovada
Status: aprovado, 
Regra: Regra 04 - sem motivos
Linha: Regra 04 Aprovada
Status: aprovado, 
Regra: Regra 05 - sem motivos
Linha: Regra 05 Aprovada
xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
-----------------------------------------
--------------- FIM ---------------------
-----------------------------------------
------------ Lista Exceção --------------
-----------------------------------------

-----------------------------------------
------------ Lista  Aprovados -----------
Regra: regra 01 - Condicao Aprovada
Status: aprovado, 
Regra: Regra 01 - sem motivos
******************
Regra: regra 02 - Condicao Aprovada
Status: aprovado, 
Regra: Regra 02 - sem motivos
******************
Regra: regra 03 - Condicao Aprovada
Status: aprovado, 
Regra: Regra 03 - sem motivos
******************
Regra: regra 04 - Condicao Aprovada
Status: aprovado, 
Regra: Regra 04 - sem motivos
******************
Regra: regra 05 - Condicao Aprovada
Status: aprovado, 
Regra: Regra 05 - sem motivos
******************
-----------------------------------------
-----------------------------------------



/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */


/*########################################################
######### XXXXXXXXXXXXX ##################################
##########################################################*/

/* OUTPUT */












