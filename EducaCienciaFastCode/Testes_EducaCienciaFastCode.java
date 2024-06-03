/*********************************************************************************************/
/*********************************************************************************************
***************** 16 - Valida Produto - Liquidez Acumulada do Sacado Cedente *****************
**********************************************************************************************/
/*********************************************************************************************/
/*
se    todas as condições seguintes são verdadeiras :          
- ( o produto virtual de  'Solicitacao' não é Duplited ) , 
então    
atribuir à 'calculo_LiqSacadoCedente' o valor ( o liquidez sacado cedente6meses ate vencto de  'Solicitacao' ) ; 
atribuir à 'define_LiqSacadoCedente' o valor falso ;    
Apresentar "Linha: " + "06-16 | 002" ;
*/
String segmento = ""; 
String subSegmento = ""; 
int prazoD0 = 0;
int prazoMinimo = 0;
int prazoOpCredito = 0;
int prazoTitulo = 0; 
String dataEmissao = "2024-04-01";
String produto = "string";
String raizCnpjCpfSacado = "stringXXXXXXXX";
String sacadoTipoPessoa = "string";
int liquidezSacadoCedente = 0; 
Double liquidezSacadoCedente6mesesAteVencto = 10.00; 
Double liquidezSacadoCedente5mesesAteVencto = 0.00;
Double liquidezSacadoCedente4mesesAteVencto = 0.00;
Double liquidezSacadoCedente3mesesAteVencto = 0.00;
Double liquidezSacadoCedente2mesesAteVencto = 0.00;
Double liquidezSacadoCedente1mesesAteVencto = 0.00;
Double liquidezSacadoCedente6mesesAposVencto = 10.00; 
Double liquidezSacadoCedente5mesesAposVencto = 0.00;
Double liquidezSacadoCedente4mesesAposVencto = 0.00;
Double liquidezSacadoCedente3mesesAposVencto = 0.00;
Double liquidezSacadoCedente2mesesAposVencto = 0.00;
Double liquidezSacadoCedente1mesesAposVencto = 0.00;
boolean sacadoImpedidoNoCedente = false;
boolean cepSacadoNaoPodeSerCobrado = false; 
boolean sacadoPermitidoNoCedente = false; 
boolean sacadoImpedidoNoBanco = false; 
String raizCnpjCpfSacador = "stringXXXXXXXXXXXXXXXXXXX"; 
boolean sacadorTipoPessoa = false; 
boolean sacadorPermitidoNoCedente = false; 
boolean sacadorImpedidoNoCedente = false; 
boolean sacadorTerceiroGarantidor = false; 
String ratingCreditoCedente = "string";
String estadoCedente = "string";
String raizCnpjCpfCedente = "string"; 
String cnaeCedente = "string";
String setorAtividadeCedente = "string"; 
String faturamentoCedente = "string";
boolean cedenteFactoring = false; 
int liquidezSacadoCedentePermitidaPCD = 0;
String destinoAutomaticoTitulo = "string";
double valorTitulo = 1000.00;
int qtdDiasProrrogadoTitulo = 0; 
boolean sacadorImpedidoNoBanco = false;
boolean checagemPrePCD = false; 
int porcentagemExigidoDuplicata = 0;
int tempoRelacionamentoCliente = 0;
String scoreSacado = "string";
String scoreCedente = "string";
double concentracaoSacadoCedente = 0.00;
double concentracaoSacadoCedentePermitidaPCD = 0.00;
br.com.abcbrasil.request.Solicitacao_ODM retorno = new br.com.abcbrasil.request.Solicitacao_ODM(new br.com.abcbrasil.request.Segmento(segmento,subSegmento),new br.com.abcbrasil.request.Prazo_D0(prazoD0,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.abcbrasil.request.Prazo_Longo(dataEmissao),produto,raizCnpjCpfSacado,sacadoTipoPessoa,liquidezSacadoCedente,liquidezSacadoCedente6mesesAteVencto,liquidezSacadoCedente5mesesAteVencto,liquidezSacadoCedente4mesesAteVencto,liquidezSacadoCedente3mesesAteVencto,liquidezSacadoCedente2mesesAteVencto,liquidezSacadoCedente1mesesAteVencto,liquidezSacadoCedente6mesesAposVencto,liquidezSacadoCedente5mesesAposVencto,liquidezSacadoCedente4mesesAposVencto,liquidezSacadoCedente3mesesAposVencto,liquidezSacadoCedente2mesesAposVencto,liquidezSacadoCedente1mesesAposVencto,sacadoImpedidoNoCedente,cepSacadoNaoPodeSerCobrado,sacadoPermitidoNoCedente,sacadoImpedidoNoBanco,raizCnpjCpfSacador,sacadorTipoPessoa,sacadorPermitidoNoCedente,sacadorImpedidoNoCedente,sacadorTerceiroGarantidor,ratingCreditoCedente,estadoCedente,raizCnpjCpfCedente,cnaeCedente,setorAtividadeCedente,faturamentoCedente,cedenteFactoring,liquidezSacadoCedentePermitidaPCD,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogadoTitulo,sacadorImpedidoNoBanco,checagemPrePCD,porcentagemExigidoDuplicata,tempoRelacionamentoCliente,scoreSacado,scoreCedente,concentracaoSacadoCedente,concentracaoSacadoCedentePermitidaPCD);
return retorno;

****************************************************************************************
****** 006-16 - Regra Liquidez - Definição **********************************************
calculo_LiqSacadoCedente: 10.0
Linha: 06-16 | 002
Produto: string
Setor de Atividade Cedente: string
liquidez sacado cedente6meses ate vencto: 10.0
liquidez sacado cedente6meses apos vencto: 10.0
calculo_LiqSacadoCedente: 10.0
****************************************************************************************

/*********************************************************************************************/
/*
se    todas as condições seguintes são verdadeiras :          
- ( o produto virtual de  'Solicitacao' é Duplited )          
- ( o setor atividade cedente virtual de  'Solicitacao' está entre { Agroindústria , Educação } ) , 
então    
atribuir à 'calculo_LiqSacadoCedente' o valor ( o liquidez sacado cedente6meses ate vencto de  'Solicitacao' + o liquidez sacado cedente6meses apos vencto de  'Solicitacao' ) ;    
atribuir à 'define_LiqSacadoCedente' o valor verdadeiro ;    
Apresentar "Linha: " + "06-16 | 001" ;
*/
String segmento = ""; 
String subSegmento = ""; 
int prazoD0 = 0;
int prazoMinimo = 0;
int prazoOpCredito = 0;
int prazoTitulo = 0; 
String dataEmissao = "2024-04-01";
String produto = "Duplited";
String raizCnpjCpfSacado = "stringXXXXXXXX";
String sacadoTipoPessoa = "string";
int liquidezSacadoCedente = 0; 
Double liquidezSacadoCedente6mesesAteVencto = 10.00; 
Double liquidezSacadoCedente5mesesAteVencto = 0.00;
Double liquidezSacadoCedente4mesesAteVencto = 0.00;
Double liquidezSacadoCedente3mesesAteVencto = 0.00;
Double liquidezSacadoCedente2mesesAteVencto = 0.00;
Double liquidezSacadoCedente1mesesAteVencto = 0.00;
Double liquidezSacadoCedente6mesesAposVencto = 10.00; 
Double liquidezSacadoCedente5mesesAposVencto = 0.00;
Double liquidezSacadoCedente4mesesAposVencto = 0.00;
Double liquidezSacadoCedente3mesesAposVencto = 0.00;
Double liquidezSacadoCedente2mesesAposVencto = 0.00;
Double liquidezSacadoCedente1mesesAposVencto = 0.00;
boolean sacadoImpedidoNoCedente = false;
boolean cepSacadoNaoPodeSerCobrado = false; 
boolean sacadoPermitidoNoCedente = false; 
boolean sacadoImpedidoNoBanco = false; 
String raizCnpjCpfSacador = "stringXXXXXXXXXXXXXXXXXXX"; 
boolean sacadorTipoPessoa = false; 
boolean sacadorPermitidoNoCedente = false; 
boolean sacadorImpedidoNoCedente = false; 
boolean sacadorTerceiroGarantidor = false; 
String ratingCreditoCedente = "string";
String estadoCedente = "string";
String raizCnpjCpfCedente = "string"; 
String cnaeCedente = "Educação";
String setorAtividadeCedente = "Educação"; 
String faturamentoCedente = "string";
boolean cedenteFactoring = false; 
int liquidezSacadoCedentePermitidaPCD = 0;
String destinoAutomaticoTitulo = "string";
double valorTitulo = 1000.00;
int qtdDiasProrrogadoTitulo = 0; 
boolean sacadorImpedidoNoBanco = false;
boolean checagemPrePCD = false; 
int porcentagemExigidoDuplicata = 0;
int tempoRelacionamentoCliente = 0;
String scoreSacado = "string";
String scoreCedente = "string";
double concentracaoSacadoCedente = 0.00;
double concentracaoSacadoCedentePermitidaPCD = 0.00;
br.com.abcbrasil.request.Solicitacao_ODM retorno = new br.com.abcbrasil.request.Solicitacao_ODM(new br.com.abcbrasil.request.Segmento(segmento,subSegmento),new br.com.abcbrasil.request.Prazo_D0(prazoD0,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.abcbrasil.request.Prazo_Longo(dataEmissao),produto,raizCnpjCpfSacado,sacadoTipoPessoa,liquidezSacadoCedente,liquidezSacadoCedente6mesesAteVencto,liquidezSacadoCedente5mesesAteVencto,liquidezSacadoCedente4mesesAteVencto,liquidezSacadoCedente3mesesAteVencto,liquidezSacadoCedente2mesesAteVencto,liquidezSacadoCedente1mesesAteVencto,liquidezSacadoCedente6mesesAposVencto,liquidezSacadoCedente5mesesAposVencto,liquidezSacadoCedente4mesesAposVencto,liquidezSacadoCedente3mesesAposVencto,liquidezSacadoCedente2mesesAposVencto,liquidezSacadoCedente1mesesAposVencto,sacadoImpedidoNoCedente,cepSacadoNaoPodeSerCobrado,sacadoPermitidoNoCedente,sacadoImpedidoNoBanco,raizCnpjCpfSacador,sacadorTipoPessoa,sacadorPermitidoNoCedente,sacadorImpedidoNoCedente,sacadorTerceiroGarantidor,ratingCreditoCedente,estadoCedente,raizCnpjCpfCedente,cnaeCedente,setorAtividadeCedente,faturamentoCedente,cedenteFactoring,liquidezSacadoCedentePermitidaPCD,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogadoTitulo,sacadorImpedidoNoBanco,checagemPrePCD,porcentagemExigidoDuplicata,tempoRelacionamentoCliente,scoreSacado,scoreCedente,concentracaoSacadoCedente,concentracaoSacadoCedentePermitidaPCD);
return retorno;

****************************************************************************************
****** 006-16 - Regra Liquidez - Definição **********************************************
calculo_LiqSacadoCedente: 20.0
Linha: 06-16 | 001
Produto: Duplited
Setor de Atividade Cedente: Educação
liquidez sacado cedente6meses ate vencto: 10.0
liquidez sacado cedente6meses apos vencto: 10.0
calculo_LiqSacadoCedente: 20.0
****************************************************************************************

/*********************************************************************************************/
/*
se    todas as condições seguintes são verdadeiras :          
- ( o produto virtual de  'Solicitacao' é Duplited )          
- ( o setor atividade cedente virtual de  'Solicitacao' está entre { Agroindústria , Educação } ) , 
então    
atribuir à 'calculo_LiqSacadoCedente' o valor ( o liquidez sacado cedente6meses ate vencto de  'Solicitacao' + o liquidez sacado cedente6meses apos vencto de  'Solicitacao' ) ;    
atribuir à 'define_LiqSacadoCedente' o valor verdadeiro ;    
Apresentar "Linha: " + "06-16 | 001" ;
*/
String segmento = ""; 
String subSegmento = ""; 
int prazoD0 = 0;
int prazoMinimo = 0;
int prazoOpCredito = 0;
int prazoTitulo = 0; 
String dataEmissao = "2024-04-01";
String produto = "Duplited";
String raizCnpjCpfSacado = "stringXXXXXXXX";
String sacadoTipoPessoa = "string";
int liquidezSacadoCedente = 0; 
Double liquidezSacadoCedente6mesesAteVencto = 10.00; 
Double liquidezSacadoCedente5mesesAteVencto = 0.00;
Double liquidezSacadoCedente4mesesAteVencto = 0.00;
Double liquidezSacadoCedente3mesesAteVencto = 0.00;
Double liquidezSacadoCedente2mesesAteVencto = 0.00;
Double liquidezSacadoCedente1mesesAteVencto = 0.00;
Double liquidezSacadoCedente6mesesAposVencto = 10.00; 
Double liquidezSacadoCedente5mesesAposVencto = 0.00;
Double liquidezSacadoCedente4mesesAposVencto = 0.00;
Double liquidezSacadoCedente3mesesAposVencto = 0.00;
Double liquidezSacadoCedente2mesesAposVencto = 0.00;
Double liquidezSacadoCedente1mesesAposVencto = 0.00;
boolean sacadoImpedidoNoCedente = false;
boolean cepSacadoNaoPodeSerCobrado = false; 
boolean sacadoPermitidoNoCedente = false; 
boolean sacadoImpedidoNoBanco = false; 
String raizCnpjCpfSacador = "stringXXXXXXXXXXXXXXXXXXX"; 
boolean sacadorTipoPessoa = false; 
boolean sacadorPermitidoNoCedente = false; 
boolean sacadorImpedidoNoCedente = false; 
boolean sacadorTerceiroGarantidor = false; 
String ratingCreditoCedente = "string";
String estadoCedente = "string";
String raizCnpjCpfCedente = "string"; 
String cnaeCedente = "Educação";
String setorAtividadeCedente = "Agroindústria"; 
String faturamentoCedente = "string";
boolean cedenteFactoring = false; 
int liquidezSacadoCedentePermitidaPCD = 0;
String destinoAutomaticoTitulo = "string";
double valorTitulo = 1000.00;
int qtdDiasProrrogadoTitulo = 0; 
boolean sacadorImpedidoNoBanco = false;
boolean checagemPrePCD = false; 
int porcentagemExigidoDuplicata = 0;
int tempoRelacionamentoCliente = 0;
String scoreSacado = "string";
String scoreCedente = "string";
double concentracaoSacadoCedente = 0.00;
double concentracaoSacadoCedentePermitidaPCD = 0.00;
br.com.abcbrasil.request.Solicitacao_ODM retorno = new br.com.abcbrasil.request.Solicitacao_ODM(new br.com.abcbrasil.request.Segmento(segmento,subSegmento),new br.com.abcbrasil.request.Prazo_D0(prazoD0,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.abcbrasil.request.Prazo_Longo(dataEmissao),produto,raizCnpjCpfSacado,sacadoTipoPessoa,liquidezSacadoCedente,liquidezSacadoCedente6mesesAteVencto,liquidezSacadoCedente5mesesAteVencto,liquidezSacadoCedente4mesesAteVencto,liquidezSacadoCedente3mesesAteVencto,liquidezSacadoCedente2mesesAteVencto,liquidezSacadoCedente1mesesAteVencto,liquidezSacadoCedente6mesesAposVencto,liquidezSacadoCedente5mesesAposVencto,liquidezSacadoCedente4mesesAposVencto,liquidezSacadoCedente3mesesAposVencto,liquidezSacadoCedente2mesesAposVencto,liquidezSacadoCedente1mesesAposVencto,sacadoImpedidoNoCedente,cepSacadoNaoPodeSerCobrado,sacadoPermitidoNoCedente,sacadoImpedidoNoBanco,raizCnpjCpfSacador,sacadorTipoPessoa,sacadorPermitidoNoCedente,sacadorImpedidoNoCedente,sacadorTerceiroGarantidor,ratingCreditoCedente,estadoCedente,raizCnpjCpfCedente,cnaeCedente,setorAtividadeCedente,faturamentoCedente,cedenteFactoring,liquidezSacadoCedentePermitidaPCD,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogadoTitulo,sacadorImpedidoNoBanco,checagemPrePCD,porcentagemExigidoDuplicata,tempoRelacionamentoCliente,scoreSacado,scoreCedente,concentracaoSacadoCedente,concentracaoSacadoCedentePermitidaPCD);
return retorno;

****************************************************************************************
****** 006-16 - Regra Liquidez - Definição **********************************************
calculo_LiqSacadoCedente: 20.0
Linha: 06-16 | 001
Produto: Duplited
Setor de Atividade Cedente: Agroindústria
liquidez sacado cedente6meses ate vencto: 10.0
liquidez sacado cedente6meses apos vencto: 10.0
calculo_LiqSacadoCedente: 20.0
****************************************************************************************

/*********************************************************************************************/

/*********************************************************************************************
***************** 17 -Executa Regra Acumulada do Sacado Cedente ATE  *************************
**********************************************************************************************/
/*********************************************************************************************/
/*
se    todas as condições seguintes são verdadeiras :          
- ( 'calculo_LiqSacadoCedente' é maior que 0 e no máximo 40 ) , 
então    
atribuir à 'calculo_Liq_Cedente_ATE_Result' o valor ( 'calculo_LiqSacadoCedente' / 100 ) ;    
atribuir o status final de  'Status' a "rejeitar" ;    'Status' .adicionarCondicaoAceite_2( "xx" , o status final de  'Status' , "xx" , "BG - Contatar gerência: sacado com baixa liquidez" ) ;    'CondicaoAceite' .adicionarMotivo( 'Motivos' ) ;    
Apresentar "--> calculo_LiqSacadoCedente: " + 'calculo_LiqSacadoCedente' ;    
Apresentar "Linha: " + "006-17 | 001" ;
*/

String segmento = ""; 
String subSegmento = ""; 
int prazoD0 = 0;
int prazoMinimo = 0;
int prazoOpCredito = 0;
int prazoTitulo = 0; 
String dataEmissao = "2024-04-01";
String produto = "QQ_COISA";
String raizCnpjCpfSacado = "stringXXXXXXXX";
String sacadoTipoPessoa = "string";
int liquidezSacadoCedente = 0; 
Double liquidezSacadoCedente6mesesAteVencto = 10.00; 
Double liquidezSacadoCedente5mesesAteVencto = 0.00;
Double liquidezSacadoCedente4mesesAteVencto = 0.00;
Double liquidezSacadoCedente3mesesAteVencto = 0.00;
Double liquidezSacadoCedente2mesesAteVencto = 0.00;
Double liquidezSacadoCedente1mesesAteVencto = 0.00;
Double liquidezSacadoCedente6mesesAposVencto = 10.00; 
Double liquidezSacadoCedente5mesesAposVencto = 0.00;
Double liquidezSacadoCedente4mesesAposVencto = 0.00;
Double liquidezSacadoCedente3mesesAposVencto = 0.00;
Double liquidezSacadoCedente2mesesAposVencto = 0.00;
Double liquidezSacadoCedente1mesesAposVencto = 0.00;
boolean sacadoImpedidoNoCedente = false;
boolean cepSacadoNaoPodeSerCobrado = false; 
boolean sacadoPermitidoNoCedente = false; 
boolean sacadoImpedidoNoBanco = false; 
String raizCnpjCpfSacador = "stringXXXXXXXXXXXXXXXXXXX"; 
boolean sacadorTipoPessoa = false; 
boolean sacadorPermitidoNoCedente = false; 
boolean sacadorImpedidoNoCedente = false; 
boolean sacadorTerceiroGarantidor = false; 
String ratingCreditoCedente = "string";
String estadoCedente = "string";
String raizCnpjCpfCedente = "string"; 
String cnaeCedente = "string";
String setorAtividadeCedente = "Educacao"; 
String faturamentoCedente = "string";
boolean cedenteFactoring = false; 
int liquidezSacadoCedentePermitidaPCD = 0;
String destinoAutomaticoTitulo = "string";
double valorTitulo = 1000.00;
int qtdDiasProrrogadoTitulo = 0; 
boolean sacadorImpedidoNoBanco = false;
boolean checagemPrePCD = false; 
int porcentagemExigidoDuplicata = 0;
int tempoRelacionamentoCliente = 0;
String scoreSacado = "string";
String scoreCedente = "string";
double concentracaoSacadoCedente = 0.00;
double concentracaoSacadoCedentePermitidaPCD = 0.00;
br.com.abcbrasil.request.Solicitacao_ODM retorno = new br.com.abcbrasil.request.Solicitacao_ODM(new br.com.abcbrasil.request.Segmento(segmento,subSegmento),new br.com.abcbrasil.request.Prazo_D0(prazoD0,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.abcbrasil.request.Prazo_Longo(dataEmissao),produto,raizCnpjCpfSacado,sacadoTipoPessoa,liquidezSacadoCedente,liquidezSacadoCedente6mesesAteVencto,liquidezSacadoCedente5mesesAteVencto,liquidezSacadoCedente4mesesAteVencto,liquidezSacadoCedente3mesesAteVencto,liquidezSacadoCedente2mesesAteVencto,liquidezSacadoCedente1mesesAteVencto,liquidezSacadoCedente6mesesAposVencto,liquidezSacadoCedente5mesesAposVencto,liquidezSacadoCedente4mesesAposVencto,liquidezSacadoCedente3mesesAposVencto,liquidezSacadoCedente2mesesAposVencto,liquidezSacadoCedente1mesesAposVencto,sacadoImpedidoNoCedente,cepSacadoNaoPodeSerCobrado,sacadoPermitidoNoCedente,sacadoImpedidoNoBanco,raizCnpjCpfSacador,sacadorTipoPessoa,sacadorPermitidoNoCedente,sacadorImpedidoNoCedente,sacadorTerceiroGarantidor,ratingCreditoCedente,estadoCedente,raizCnpjCpfCedente,cnaeCedente,setorAtividadeCedente,faturamentoCedente,cedenteFactoring,liquidezSacadoCedentePermitidaPCD,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogadoTitulo,sacadorImpedidoNoBanco,checagemPrePCD,porcentagemExigidoDuplicata,tempoRelacionamentoCliente,scoreSacado,scoreCedente,concentracaoSacadoCedente,concentracaoSacadoCedentePermitidaPCD);
return retorno;

****************************************************************************************
******* 17 -Executa Regra Acumulada do Sacado Cedente ATE ******************************
****** Regra Calculo MENOR 40% | Regra Calculo MAIOR 40% MENOR 80% -> ATÉ VENCTO *******
Valor Titulo: 1000.0
Status: rejeitar, 
Código: xx, 
Motivo: BG - Contatar gerência: sacado com baixa liquidez
--> calculo_LiqSacadoCedente: 10.0
Linha: 006-17 | 001
***********************************************************************************************
calculo_Liq_Cedente_ATE_Result: 0.1
***********************************************************************************************

/*********************************************************************************************/
/*
se    todas as condições seguintes são verdadeiras :          
- ( o setor atividade cedente virtual de  'Solicitacao' é Agroindústria )          
- ( 'calculo_LiqSacadoCedente' é maior que 40 e no máximo 70 ) , 
então    atribuir à 'calculo_Liq_Cedente_ATE_Result' o valor ( 'calculo_LiqSacadoCedente' / 100 ) ;    
atribuir o status final de  'Status' a "manual" ;    'Status' .adicionarCondicaoAceite_2( "xx" , o status final de  'Status' , "xx" , "Agro e Educação e a liquidez acumulada do sacado no cedente estiver entre 40 e 70%, " ) ;    'CondicaoAceite' .adicionarMotivo( 'Motivos' ) ;    
Apresentar "--> calculo_LiqSacadoCedente: " + 'calculo_LiqSacadoCedente' ;    
Apresentar "Linha: " + "006-17 | 002" ;
*/

String segmento = ""; 
String subSegmento = ""; 
int prazoD0 = 0;
int prazoMinimo = 0;
int prazoOpCredito = 0;
int prazoTitulo = 0; 
String dataEmissao = "2024-04-01";
String produto = "QQ_COISA";
String raizCnpjCpfSacado = "stringXXXXXXXX";
String sacadoTipoPessoa = "string";
int liquidezSacadoCedente = 0; 
Double liquidezSacadoCedente6mesesAteVencto = 41.00; 
Double liquidezSacadoCedente5mesesAteVencto = 0.00;
Double liquidezSacadoCedente4mesesAteVencto = 0.00;
Double liquidezSacadoCedente3mesesAteVencto = 0.00;
Double liquidezSacadoCedente2mesesAteVencto = 0.00;
Double liquidezSacadoCedente1mesesAteVencto = 0.00;
Double liquidezSacadoCedente6mesesAposVencto = 30.00; 
Double liquidezSacadoCedente5mesesAposVencto = 0.00;
Double liquidezSacadoCedente4mesesAposVencto = 0.00;
Double liquidezSacadoCedente3mesesAposVencto = 0.00;
Double liquidezSacadoCedente2mesesAposVencto = 0.00;
Double liquidezSacadoCedente1mesesAposVencto = 0.00;
boolean sacadoImpedidoNoCedente = false;
boolean cepSacadoNaoPodeSerCobrado = false; 
boolean sacadoPermitidoNoCedente = false; 
boolean sacadoImpedidoNoBanco = false; 
String raizCnpjCpfSacador = "stringXXXXXXXXXXXXXXXXXXX"; 
boolean sacadorTipoPessoa = false; 
boolean sacadorPermitidoNoCedente = false; 
boolean sacadorImpedidoNoCedente = false; 
boolean sacadorTerceiroGarantidor = false; 
String ratingCreditoCedente = "string";
String estadoCedente = "string";
String raizCnpjCpfCedente = "string"; 
String cnaeCedente = "string";
String setorAtividadeCedente = "Agroindústria"; 
String faturamentoCedente = "string";
boolean cedenteFactoring = false; 
int liquidezSacadoCedentePermitidaPCD = 0;
String destinoAutomaticoTitulo = "string";
double valorTitulo = 1000.00;
int qtdDiasProrrogadoTitulo = 0; 
boolean sacadorImpedidoNoBanco = false;
boolean checagemPrePCD = false; 
int porcentagemExigidoDuplicata = 0;
int tempoRelacionamentoCliente = 0;
String scoreSacado = "string";
String scoreCedente = "string";
double concentracaoSacadoCedente = 0.00;
double concentracaoSacadoCedentePermitidaPCD = 0.00;
br.com.abcbrasil.request.Solicitacao_ODM retorno = new br.com.abcbrasil.request.Solicitacao_ODM(new br.com.abcbrasil.request.Segmento(segmento,subSegmento),new br.com.abcbrasil.request.Prazo_D0(prazoD0,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.abcbrasil.request.Prazo_Longo(dataEmissao),produto,raizCnpjCpfSacado,sacadoTipoPessoa,liquidezSacadoCedente,liquidezSacadoCedente6mesesAteVencto,liquidezSacadoCedente5mesesAteVencto,liquidezSacadoCedente4mesesAteVencto,liquidezSacadoCedente3mesesAteVencto,liquidezSacadoCedente2mesesAteVencto,liquidezSacadoCedente1mesesAteVencto,liquidezSacadoCedente6mesesAposVencto,liquidezSacadoCedente5mesesAposVencto,liquidezSacadoCedente4mesesAposVencto,liquidezSacadoCedente3mesesAposVencto,liquidezSacadoCedente2mesesAposVencto,liquidezSacadoCedente1mesesAposVencto,sacadoImpedidoNoCedente,cepSacadoNaoPodeSerCobrado,sacadoPermitidoNoCedente,sacadoImpedidoNoBanco,raizCnpjCpfSacador,sacadorTipoPessoa,sacadorPermitidoNoCedente,sacadorImpedidoNoCedente,sacadorTerceiroGarantidor,ratingCreditoCedente,estadoCedente,raizCnpjCpfCedente,cnaeCedente,setorAtividadeCedente,faturamentoCedente,cedenteFactoring,liquidezSacadoCedentePermitidaPCD,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogadoTitulo,sacadorImpedidoNoBanco,checagemPrePCD,porcentagemExigidoDuplicata,tempoRelacionamentoCliente,scoreSacado,scoreCedente,concentracaoSacadoCedente,concentracaoSacadoCedentePermitidaPCD);
return retorno;

****************************************************************************************
******* 17 -Executa Regra Acumulada do Sacado Cedente ATE ******************************
****** Regra Calculo MENOR 40% | Regra Calculo MAIOR 40% MENOR 80% -> ATÉ VENCTO *******
Valor Titulo: 1000.0
Status: manual, 
Código: xx, 
Motivo: Agro e Educação e a liquidez acumulada do sacado no cedente estiver entre 40 e 70%, 
--> calculo_LiqSacadoCedente: 41.0
Linha: 006-17 | 002
Calculo 1 mes: 0.0
Calculo 2 mes: 0.0
Calculo 3 mes: 0.0
Calculo 4 mes: 0.0
Calculo 5 mes: 0.0
Calculo 6 mes: 0.0
***********************************************************************************************
calculo_Liq_Cedente_ATE_Result: 0.41
***********************************************************************************************

/*********************************************************************************************/
/*
se    todas as condições seguintes são verdadeiras :          
- ( o setor atividade cedente virtual de  'Solicitacao' é Educacao )          
- ( 'calculo_LiqSacadoCedente' é maior que 40 e no máximo 70 ) , 
então    a
tribuir à 'calculo_Liq_Cedente_ATE_Result' o valor ( 'calculo_LiqSacadoCedente' / 100 ) ;    
atribuir o status final de  'Status' a "manual" ;    'Status' .adicionarCondicaoAceite_2( "xx" , o status final de  'Status' , "xx" , "Agro e Educação e a liquidez acumulada do sacado no cedente estiver entre 40 e 70%, " ) ;    'CondicaoAceite' .adicionarMotivo( 'Motivos' ) ;    
Apresentar "--> calculo_LiqSacadoCedente: " + 'calculo_LiqSacadoCedente' ;    
Apresentar "Linha: " + "006-17 | 003" ;
*/

String segmento = ""; 
String subSegmento = ""; 
int prazoD0 = 0;
int prazoMinimo = 0;
int prazoOpCredito = 0;
int prazoTitulo = 0; 
String dataEmissao = "2024-04-01";
String produto = "QQ_COISA";
String raizCnpjCpfSacado = "stringXXXXXXXX";
String sacadoTipoPessoa = "string";
int liquidezSacadoCedente = 0; 
Double liquidezSacadoCedente6mesesAteVencto = 41.00; 
Double liquidezSacadoCedente5mesesAteVencto = 0.00;
Double liquidezSacadoCedente4mesesAteVencto = 0.00;
Double liquidezSacadoCedente3mesesAteVencto = 0.00;
Double liquidezSacadoCedente2mesesAteVencto = 0.00;
Double liquidezSacadoCedente1mesesAteVencto = 0.00;
Double liquidezSacadoCedente6mesesAposVencto = 30.00; 
Double liquidezSacadoCedente5mesesAposVencto = 0.00;
Double liquidezSacadoCedente4mesesAposVencto = 0.00;
Double liquidezSacadoCedente3mesesAposVencto = 0.00;
Double liquidezSacadoCedente2mesesAposVencto = 0.00;
Double liquidezSacadoCedente1mesesAposVencto = 0.00;
boolean sacadoImpedidoNoCedente = false;
boolean cepSacadoNaoPodeSerCobrado = false; 
boolean sacadoPermitidoNoCedente = false; 
boolean sacadoImpedidoNoBanco = false; 
String raizCnpjCpfSacador = "stringXXXXXXXXXXXXXXXXXXX"; 
boolean sacadorTipoPessoa = false; 
boolean sacadorPermitidoNoCedente = false; 
boolean sacadorImpedidoNoCedente = false; 
boolean sacadorTerceiroGarantidor = false; 
String ratingCreditoCedente = "string";
String estadoCedente = "string";
String raizCnpjCpfCedente = "string"; 
String cnaeCedente = "string";
String setorAtividadeCedente = "Educacao"; 
String faturamentoCedente = "string";
boolean cedenteFactoring = false; 
int liquidezSacadoCedentePermitidaPCD = 0;
String destinoAutomaticoTitulo = "string";
double valorTitulo = 1000.00;
int qtdDiasProrrogadoTitulo = 0; 
boolean sacadorImpedidoNoBanco = false;
boolean checagemPrePCD = false; 
int porcentagemExigidoDuplicata = 0;
int tempoRelacionamentoCliente = 0;
String scoreSacado = "string";
String scoreCedente = "string";
double concentracaoSacadoCedente = 0.00;
double concentracaoSacadoCedentePermitidaPCD = 0.00;
br.com.abcbrasil.request.Solicitacao_ODM retorno = new br.com.abcbrasil.request.Solicitacao_ODM(new br.com.abcbrasil.request.Segmento(segmento,subSegmento),new br.com.abcbrasil.request.Prazo_D0(prazoD0,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.abcbrasil.request.Prazo_Longo(dataEmissao),produto,raizCnpjCpfSacado,sacadoTipoPessoa,liquidezSacadoCedente,liquidezSacadoCedente6mesesAteVencto,liquidezSacadoCedente5mesesAteVencto,liquidezSacadoCedente4mesesAteVencto,liquidezSacadoCedente3mesesAteVencto,liquidezSacadoCedente2mesesAteVencto,liquidezSacadoCedente1mesesAteVencto,liquidezSacadoCedente6mesesAposVencto,liquidezSacadoCedente5mesesAposVencto,liquidezSacadoCedente4mesesAposVencto,liquidezSacadoCedente3mesesAposVencto,liquidezSacadoCedente2mesesAposVencto,liquidezSacadoCedente1mesesAposVencto,sacadoImpedidoNoCedente,cepSacadoNaoPodeSerCobrado,sacadoPermitidoNoCedente,sacadoImpedidoNoBanco,raizCnpjCpfSacador,sacadorTipoPessoa,sacadorPermitidoNoCedente,sacadorImpedidoNoCedente,sacadorTerceiroGarantidor,ratingCreditoCedente,estadoCedente,raizCnpjCpfCedente,cnaeCedente,setorAtividadeCedente,faturamentoCedente,cedenteFactoring,liquidezSacadoCedentePermitidaPCD,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogadoTitulo,sacadorImpedidoNoBanco,checagemPrePCD,porcentagemExigidoDuplicata,tempoRelacionamentoCliente,scoreSacado,scoreCedente,concentracaoSacadoCedente,concentracaoSacadoCedentePermitidaPCD);
return retorno;

****************************************************************************************
******* 17 -Executa Regra Acumulada do Sacado Cedente ATE ******************************
****** Regra Calculo MENOR 40% | Regra Calculo MAIOR 40% MENOR 80% -> ATÉ VENCTO *******
Valor Titulo: 1000.0
Status: manual, 
Código: xx, 
Motivo: Agro e Educação e a liquidez acumulada do sacado no cedente estiver entre 40 e 70%, 
--> calculo_LiqSacadoCedente: 41.0
Linha: 006-17 | 003
***********************************************************************************************
calculo_Liq_Cedente_ATE_Result: 0.41
***********************************************************************************************

/*********************************************************************************************/
/*
   todas as condições seguintes são verdadeiras :          
- ( o setor atividade cedente virtual de  'Solicitacao' não está entre { Agroindústria , Educacao } )          
- ( 'calculo_LiqSacadoCedente' é maior que 40 e no máximo 80 ) , 
então    
atribuir à 'calculo_Liq_Cedente_ATE_Result' o valor ( 'calculo_LiqSacadoCedente' / 100 ) ;    atribuir o status final de  'Status' a "manual" ;    'Status' .adicionarCondicaoAceite_2( "xx" , o status final de  'Status' , "xx" , "demais ramos de atividade e a liquidez acumulada do sacado no cedente estiver entre 40 e 80%, então enviar título para análise manual" ) ;    'CondicaoAceite' .adicionarMotivo( 'Motivos' ) ;    
Apresentar "--> calculo_LiqSacadoCedente: " + 'calculo_LiqSacadoCedente' ;    
Apresentar "Linha: " + "006-17 | 006" ;
*/

String segmento = ""; 
String subSegmento = ""; 
int prazoD0 = 0;
int prazoMinimo = 0;
int prazoOpCredito = 0;
int prazoTitulo = 0; 
String dataEmissao = "2024-04-01";
String produto = "QQ_COISA";
String raizCnpjCpfSacado = "stringXXXXXXXX";
String sacadoTipoPessoa = "string";
int liquidezSacadoCedente = 0; 
Double liquidezSacadoCedente6mesesAteVencto = 79.00; 
Double liquidezSacadoCedente5mesesAteVencto = 0.00;
Double liquidezSacadoCedente4mesesAteVencto = 0.00;
Double liquidezSacadoCedente3mesesAteVencto = 0.00;
Double liquidezSacadoCedente2mesesAteVencto = 0.00;
Double liquidezSacadoCedente1mesesAteVencto = 0.00;
Double liquidezSacadoCedente6mesesAposVencto = 30.00; 
Double liquidezSacadoCedente5mesesAposVencto = 0.00;
Double liquidezSacadoCedente4mesesAposVencto = 0.00;
Double liquidezSacadoCedente3mesesAposVencto = 0.00;
Double liquidezSacadoCedente2mesesAposVencto = 0.00;
Double liquidezSacadoCedente1mesesAposVencto = 0.00;
boolean sacadoImpedidoNoCedente = false;
boolean cepSacadoNaoPodeSerCobrado = false; 
boolean sacadoPermitidoNoCedente = false; 
boolean sacadoImpedidoNoBanco = false; 
String raizCnpjCpfSacador = "stringXXXXXXXXXXXXXXXXXXX"; 
boolean sacadorTipoPessoa = false; 
boolean sacadorPermitidoNoCedente = false; 
boolean sacadorImpedidoNoCedente = false; 
boolean sacadorTerceiroGarantidor = false; 
String ratingCreditoCedente = "string";
String estadoCedente = "string";
String raizCnpjCpfCedente = "string"; 
String cnaeCedente = "string";
String setorAtividadeCedente = "QQ_COISA"; 
String faturamentoCedente = "string";
boolean cedenteFactoring = false; 
int liquidezSacadoCedentePermitidaPCD = 0;
String destinoAutomaticoTitulo = "string";
double valorTitulo = 1000.00;
int qtdDiasProrrogadoTitulo = 0; 
boolean sacadorImpedidoNoBanco = false;
boolean checagemPrePCD = false; 
int porcentagemExigidoDuplicata = 0;
int tempoRelacionamentoCliente = 0;
String scoreSacado = "string";
String scoreCedente = "string";
double concentracaoSacadoCedente = 0.00;
double concentracaoSacadoCedentePermitidaPCD = 0.00;
br.com.abcbrasil.request.Solicitacao_ODM retorno = new br.com.abcbrasil.request.Solicitacao_ODM(new br.com.abcbrasil.request.Segmento(segmento,subSegmento),new br.com.abcbrasil.request.Prazo_D0(prazoD0,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.abcbrasil.request.Prazo_Longo(dataEmissao),produto,raizCnpjCpfSacado,sacadoTipoPessoa,liquidezSacadoCedente,liquidezSacadoCedente6mesesAteVencto,liquidezSacadoCedente5mesesAteVencto,liquidezSacadoCedente4mesesAteVencto,liquidezSacadoCedente3mesesAteVencto,liquidezSacadoCedente2mesesAteVencto,liquidezSacadoCedente1mesesAteVencto,liquidezSacadoCedente6mesesAposVencto,liquidezSacadoCedente5mesesAposVencto,liquidezSacadoCedente4mesesAposVencto,liquidezSacadoCedente3mesesAposVencto,liquidezSacadoCedente2mesesAposVencto,liquidezSacadoCedente1mesesAposVencto,sacadoImpedidoNoCedente,cepSacadoNaoPodeSerCobrado,sacadoPermitidoNoCedente,sacadoImpedidoNoBanco,raizCnpjCpfSacador,sacadorTipoPessoa,sacadorPermitidoNoCedente,sacadorImpedidoNoCedente,sacadorTerceiroGarantidor,ratingCreditoCedente,estadoCedente,raizCnpjCpfCedente,cnaeCedente,setorAtividadeCedente,faturamentoCedente,cedenteFactoring,liquidezSacadoCedentePermitidaPCD,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogadoTitulo,sacadorImpedidoNoBanco,checagemPrePCD,porcentagemExigidoDuplicata,tempoRelacionamentoCliente,scoreSacado,scoreCedente,concentracaoSacadoCedente,concentracaoSacadoCedentePermitidaPCD);
return retorno;

****************************************************************************************
******* 17 -Executa Regra Acumulada do Sacado Cedente ATE ******************************
****** Regra Calculo MENOR 40% | Regra Calculo MAIOR 40% MENOR 80% -> ATÉ VENCTO *******
Valor Titulo: 1000.0
Status: manual, 
Código: xx, 
Motivo: demais ramos de atividade e a liquidez acumulada do sacado no cedente estiver entre 40 e 80%, então enviar título para análise manual
--> calculo_LiqSacadoCedente: 79.0
Linha: 006-17 | 006
***********************************************************************************************
calculo_Liq_Cedente_ATE_Result: 0.79
***********************************************************************************************

/*********************************************************************************************/

/*********************************************************************************************
***************** 18 -Executa Regra Acumulada do Sacado Cedente APOS  *************************
**********************************************************************************************/
/*********************************************************************************************/
/*
se    todas as condições seguintes são verdadeiras :          
- ( 'calculo_LiqSacadoCedente' é maior que 0 e no máximo 40 ) , 
então    atribuir à 'calculo_Liq_Cedente_APOS_Result' o valor ( 'calculo_LiqSacadoCedente' / 100 ) ;    
atribuir o status final de  'Status' a "rejeitar" ;    'Status' .adicionarCondicaoAceite_2( "xx" , o status final de  'Status' , "xx" , "BG - Contatar gerência: sacado com baixa liquidez" ) ;    'CondicaoAceite' .adicionarMotivo( 'Motivos' ) ;    
Apresentar "Linha: " + "006-17 | 001" ;
*/

String segmento = ""; 
String subSegmento = ""; 
int prazoD0 = 0;
int prazoMinimo = 0;
int prazoOpCredito = 0;
int prazoTitulo = 0; 
String dataEmissao = "2024-04-01";
String produto = "Duplited";
String raizCnpjCpfSacado = "stringXXXXXXXX";
String sacadoTipoPessoa = "string";
int liquidezSacadoCedente = 0; 
Double liquidezSacadoCedente6mesesAteVencto = 10.00; 
Double liquidezSacadoCedente5mesesAteVencto = 0.00;
Double liquidezSacadoCedente4mesesAteVencto = 0.00;
Double liquidezSacadoCedente3mesesAteVencto = 0.00;
Double liquidezSacadoCedente2mesesAteVencto = 0.00;
Double liquidezSacadoCedente1mesesAteVencto = 0.00;
Double liquidezSacadoCedente6mesesAposVencto = 10.00; 
Double liquidezSacadoCedente5mesesAposVencto = 0.00;
Double liquidezSacadoCedente4mesesAposVencto = 0.00;
Double liquidezSacadoCedente3mesesAposVencto = 0.00;
Double liquidezSacadoCedente2mesesAposVencto = 0.00;
Double liquidezSacadoCedente1mesesAposVencto = 0.00;
boolean sacadoImpedidoNoCedente = false;
boolean cepSacadoNaoPodeSerCobrado = false; 
boolean sacadoPermitidoNoCedente = false; 
boolean sacadoImpedidoNoBanco = false; 
String raizCnpjCpfSacador = "stringXXXXXXXXXXXXXXXXXXX"; 
boolean sacadorTipoPessoa = false; 
boolean sacadorPermitidoNoCedente = false; 
boolean sacadorImpedidoNoCedente = false; 
boolean sacadorTerceiroGarantidor = false; 
String ratingCreditoCedente = "string";
String estadoCedente = "string";
String raizCnpjCpfCedente = "string"; 
String cnaeCedente = "string";
String setorAtividadeCedente = "Educacao"; 
String faturamentoCedente = "string";
boolean cedenteFactoring = false; 
int liquidezSacadoCedentePermitidaPCD = 0;
String destinoAutomaticoTitulo = "string";
double valorTitulo = 1000.00;
int qtdDiasProrrogadoTitulo = 0; 
boolean sacadorImpedidoNoBanco = false;
boolean checagemPrePCD = false; 
int porcentagemExigidoDuplicata = 0;
int tempoRelacionamentoCliente = 0;
String scoreSacado = "string";
String scoreCedente = "string";
double concentracaoSacadoCedente = 0.00;
double concentracaoSacadoCedentePermitidaPCD = 0.00;
br.com.abcbrasil.request.Solicitacao_ODM retorno = new br.com.abcbrasil.request.Solicitacao_ODM(new br.com.abcbrasil.request.Segmento(segmento,subSegmento),new br.com.abcbrasil.request.Prazo_D0(prazoD0,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.abcbrasil.request.Prazo_Longo(dataEmissao),produto,raizCnpjCpfSacado,sacadoTipoPessoa,liquidezSacadoCedente,liquidezSacadoCedente6mesesAteVencto,liquidezSacadoCedente5mesesAteVencto,liquidezSacadoCedente4mesesAteVencto,liquidezSacadoCedente3mesesAteVencto,liquidezSacadoCedente2mesesAteVencto,liquidezSacadoCedente1mesesAteVencto,liquidezSacadoCedente6mesesAposVencto,liquidezSacadoCedente5mesesAposVencto,liquidezSacadoCedente4mesesAposVencto,liquidezSacadoCedente3mesesAposVencto,liquidezSacadoCedente2mesesAposVencto,liquidezSacadoCedente1mesesAposVencto,sacadoImpedidoNoCedente,cepSacadoNaoPodeSerCobrado,sacadoPermitidoNoCedente,sacadoImpedidoNoBanco,raizCnpjCpfSacador,sacadorTipoPessoa,sacadorPermitidoNoCedente,sacadorImpedidoNoCedente,sacadorTerceiroGarantidor,ratingCreditoCedente,estadoCedente,raizCnpjCpfCedente,cnaeCedente,setorAtividadeCedente,faturamentoCedente,cedenteFactoring,liquidezSacadoCedentePermitidaPCD,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogadoTitulo,sacadorImpedidoNoBanco,checagemPrePCD,porcentagemExigidoDuplicata,tempoRelacionamentoCliente,scoreSacado,scoreCedente,concentracaoSacadoCedente,concentracaoSacadoCedentePermitidaPCD);
return retorno;

****************************************************************************************
******* 18 -Executa Regra Acumulada do Sacado Cedente APOS ******************************
****** Regra Calculo MENOR 40% | Regra Calculo MAIOR 40% MENOR 80% -> APOS VENCTO ******
Valor Titulo: 1000.0
Status: rejeitar, 
Código: xx, 
Motivo: BG - Contatar gerência: sacado com baixa liquidez
--> calculo_LiqSacadoCedente: 20.0
Linha: 006-18 | 001
***********************************************************************************************
calculo_Liq_Cedente_ATE_Result: 0.0
***********************************************************************************************


/*********************************************************************************************/
/*
se    todas as condições seguintes são verdadeiras :          
- ( o setor atividade cedente virtual de  'Solicitacao' é Agroindústria )          
- ( 'calculo_LiqSacadoCedente' é maior que 40 e no máximo 70 ) , 
então    
atribuir à 'calculo_Liq_Cedente_APOS_Result' o valor ( 'calculo_LiqSacadoCedente' / 100 ) ;    
atribuir o status final de  'Status' a "manual" ;    'Status' .adicionarCondicaoAceite_2( "xx" , o status final de  'Status' , "xx" , "Agro e Educação e a liquidez acumulada do sacado no cedente estiver entre 40 e 70%, " ) ;    'CondicaoAceite' .adicionarMotivo( 'Motivos' ) ;    
Apresentar "Linha: " + "006-17 | 002" ;
*/

String segmento = ""; 
String subSegmento = ""; 
int prazoD0 = 0;
int prazoMinimo = 0;
int prazoOpCredito = 0;
int prazoTitulo = 0; 
String dataEmissao = "2024-04-01";
String produto = "Duplited";
String raizCnpjCpfSacado = "stringXXXXXXXX";
String sacadoTipoPessoa = "string";
int liquidezSacadoCedente = 0; 
Double liquidezSacadoCedente6mesesAteVencto = 20.00; 
Double liquidezSacadoCedente5mesesAteVencto = 0.00;
Double liquidezSacadoCedente4mesesAteVencto = 0.00;
Double liquidezSacadoCedente3mesesAteVencto = 0.00;
Double liquidezSacadoCedente2mesesAteVencto = 0.00;
Double liquidezSacadoCedente1mesesAteVencto = 0.00;
Double liquidezSacadoCedente6mesesAposVencto = 21.00; 
Double liquidezSacadoCedente5mesesAposVencto = 0.00;
Double liquidezSacadoCedente4mesesAposVencto = 0.00;
Double liquidezSacadoCedente3mesesAposVencto = 0.00;
Double liquidezSacadoCedente2mesesAposVencto = 0.00;
Double liquidezSacadoCedente1mesesAposVencto = 0.00;
boolean sacadoImpedidoNoCedente = false;
boolean cepSacadoNaoPodeSerCobrado = false; 
boolean sacadoPermitidoNoCedente = false; 
boolean sacadoImpedidoNoBanco = false; 
String raizCnpjCpfSacador = "stringXXXXXXXXXXXXXXXXXXX"; 
boolean sacadorTipoPessoa = false; 
boolean sacadorPermitidoNoCedente = false; 
boolean sacadorImpedidoNoCedente = false; 
boolean sacadorTerceiroGarantidor = false; 
String ratingCreditoCedente = "string";
String estadoCedente = "string";
String raizCnpjCpfCedente = "string"; 
String cnaeCedente = "string";
String setorAtividadeCedente = "Agroindústria"; 
String faturamentoCedente = "string";
boolean cedenteFactoring = false; 
int liquidezSacadoCedentePermitidaPCD = 0;
String destinoAutomaticoTitulo = "string";
double valorTitulo = 1000.00;
int qtdDiasProrrogadoTitulo = 0; 
boolean sacadorImpedidoNoBanco = false;
boolean checagemPrePCD = false; 
int porcentagemExigidoDuplicata = 0;
int tempoRelacionamentoCliente = 0;
String scoreSacado = "string";
String scoreCedente = "string";
double concentracaoSacadoCedente = 0.00;
double concentracaoSacadoCedentePermitidaPCD = 0.00;
br.com.abcbrasil.request.Solicitacao_ODM retorno = new br.com.abcbrasil.request.Solicitacao_ODM(new br.com.abcbrasil.request.Segmento(segmento,subSegmento),new br.com.abcbrasil.request.Prazo_D0(prazoD0,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.abcbrasil.request.Prazo_Longo(dataEmissao),produto,raizCnpjCpfSacado,sacadoTipoPessoa,liquidezSacadoCedente,liquidezSacadoCedente6mesesAteVencto,liquidezSacadoCedente5mesesAteVencto,liquidezSacadoCedente4mesesAteVencto,liquidezSacadoCedente3mesesAteVencto,liquidezSacadoCedente2mesesAteVencto,liquidezSacadoCedente1mesesAteVencto,liquidezSacadoCedente6mesesAposVencto,liquidezSacadoCedente5mesesAposVencto,liquidezSacadoCedente4mesesAposVencto,liquidezSacadoCedente3mesesAposVencto,liquidezSacadoCedente2mesesAposVencto,liquidezSacadoCedente1mesesAposVencto,sacadoImpedidoNoCedente,cepSacadoNaoPodeSerCobrado,sacadoPermitidoNoCedente,sacadoImpedidoNoBanco,raizCnpjCpfSacador,sacadorTipoPessoa,sacadorPermitidoNoCedente,sacadorImpedidoNoCedente,sacadorTerceiroGarantidor,ratingCreditoCedente,estadoCedente,raizCnpjCpfCedente,cnaeCedente,setorAtividadeCedente,faturamentoCedente,cedenteFactoring,liquidezSacadoCedentePermitidaPCD,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogadoTitulo,sacadorImpedidoNoBanco,checagemPrePCD,porcentagemExigidoDuplicata,tempoRelacionamentoCliente,scoreSacado,scoreCedente,concentracaoSacadoCedente,concentracaoSacadoCedentePermitidaPCD);
return retorno;

****************************************************************************************
******* 18 -Executa Regra Acumulada do Sacado Cedente APOS ******************************
****** Regra Calculo MENOR 40% | Regra Calculo MAIOR 40% MENOR 80% -> APOS VENCTO ******
Valor Titulo: 1000.0
Status: manual, 
Código: xx, 
Motivo: Agro e Educação e a liquidez acumulada do sacado no cedente estiver entre 40 e 70%, 
--> calculo_LiqSacadoCedente: 41.0
Linha: 006-18 | 002
***********************************************************************************************
calculo_Liq_Cedente_ATE_Result: 0.0
***********************************************************************************************


/*********************************************************************************************/
/*
se    todas as condições seguintes são verdadeiras :          
- ( o setor atividade cedente virtual de  'Solicitacao' é Educacao )          
- ( 'calculo_LiqSacadoCedente' é maior que 40 e no máximo 70 ) , 
então    
atribuir à 'calculo_Liq_Cedente_APOS_Result' o valor ( 'calculo_LiqSacadoCedente' / 100 ) ;    
atribuir o status final de  'Status' a "manual" ;    'Status' .adicionarCondicaoAceite_2( "xx" , o status final de  'Status' , "xx" , "Agro e Educação e a liquidez acumulada do sacado no cedente estiver entre 40 e 70%, " ) ;    'CondicaoAceite' .adicionarMotivo( 'Motivos' ) ;    
Apresentar "Linha: " + "006-17 | 003" ;
*/

String segmento = ""; 
String subSegmento = ""; 
int prazoD0 = 0;
int prazoMinimo = 0;
int prazoOpCredito = 0;
int prazoTitulo = 0; 
String dataEmissao = "2024-04-01";
String produto = "Duplited";
String raizCnpjCpfSacado = "stringXXXXXXXX";
String sacadoTipoPessoa = "string";
int liquidezSacadoCedente = 0; 
Double liquidezSacadoCedente6mesesAteVencto = 20.00; 
Double liquidezSacadoCedente5mesesAteVencto = 0.00;
Double liquidezSacadoCedente4mesesAteVencto = 0.00;
Double liquidezSacadoCedente3mesesAteVencto = 0.00;
Double liquidezSacadoCedente2mesesAteVencto = 0.00;
Double liquidezSacadoCedente1mesesAteVencto = 0.00;
Double liquidezSacadoCedente6mesesAposVencto = 21.00; 
Double liquidezSacadoCedente5mesesAposVencto = 0.00;
Double liquidezSacadoCedente4mesesAposVencto = 0.00;
Double liquidezSacadoCedente3mesesAposVencto = 0.00;
Double liquidezSacadoCedente2mesesAposVencto = 0.00;
Double liquidezSacadoCedente1mesesAposVencto = 0.00;
boolean sacadoImpedidoNoCedente = false;
boolean cepSacadoNaoPodeSerCobrado = false; 
boolean sacadoPermitidoNoCedente = false; 
boolean sacadoImpedidoNoBanco = false; 
String raizCnpjCpfSacador = "stringXXXXXXXXXXXXXXXXXXX"; 
boolean sacadorTipoPessoa = false; 
boolean sacadorPermitidoNoCedente = false; 
boolean sacadorImpedidoNoCedente = false; 
boolean sacadorTerceiroGarantidor = false; 
String ratingCreditoCedente = "string";
String estadoCedente = "string";
String raizCnpjCpfCedente = "string"; 
String cnaeCedente = "string";
String setorAtividadeCedente = "Educacao"; 
String faturamentoCedente = "string";
boolean cedenteFactoring = false; 
int liquidezSacadoCedentePermitidaPCD = 0;
String destinoAutomaticoTitulo = "string";
double valorTitulo = 1000.00;
int qtdDiasProrrogadoTitulo = 0; 
boolean sacadorImpedidoNoBanco = false;
boolean checagemPrePCD = false; 
int porcentagemExigidoDuplicata = 0;
int tempoRelacionamentoCliente = 0;
String scoreSacado = "string";
String scoreCedente = "string";
double concentracaoSacadoCedente = 0.00;
double concentracaoSacadoCedentePermitidaPCD = 0.00;
br.com.abcbrasil.request.Solicitacao_ODM retorno = new br.com.abcbrasil.request.Solicitacao_ODM(new br.com.abcbrasil.request.Segmento(segmento,subSegmento),new br.com.abcbrasil.request.Prazo_D0(prazoD0,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.abcbrasil.request.Prazo_Longo(dataEmissao),produto,raizCnpjCpfSacado,sacadoTipoPessoa,liquidezSacadoCedente,liquidezSacadoCedente6mesesAteVencto,liquidezSacadoCedente5mesesAteVencto,liquidezSacadoCedente4mesesAteVencto,liquidezSacadoCedente3mesesAteVencto,liquidezSacadoCedente2mesesAteVencto,liquidezSacadoCedente1mesesAteVencto,liquidezSacadoCedente6mesesAposVencto,liquidezSacadoCedente5mesesAposVencto,liquidezSacadoCedente4mesesAposVencto,liquidezSacadoCedente3mesesAposVencto,liquidezSacadoCedente2mesesAposVencto,liquidezSacadoCedente1mesesAposVencto,sacadoImpedidoNoCedente,cepSacadoNaoPodeSerCobrado,sacadoPermitidoNoCedente,sacadoImpedidoNoBanco,raizCnpjCpfSacador,sacadorTipoPessoa,sacadorPermitidoNoCedente,sacadorImpedidoNoCedente,sacadorTerceiroGarantidor,ratingCreditoCedente,estadoCedente,raizCnpjCpfCedente,cnaeCedente,setorAtividadeCedente,faturamentoCedente,cedenteFactoring,liquidezSacadoCedentePermitidaPCD,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogadoTitulo,sacadorImpedidoNoBanco,checagemPrePCD,porcentagemExigidoDuplicata,tempoRelacionamentoCliente,scoreSacado,scoreCedente,concentracaoSacadoCedente,concentracaoSacadoCedentePermitidaPCD);
return retorno;

****************************************************************************************
******* 18 -Executa Regra Acumulada do Sacado Cedente APOS ******************************
****** Regra Calculo MENOR 40% | Regra Calculo MAIOR 40% MENOR 80% -> APOS VENCTO ******
Valor Titulo: 1000.0
Status: manual, 
Código: xx, 
Motivo: Agro e Educação e a liquidez acumulada do sacado no cedente estiver entre 40 e 70%, 
--> calculo_LiqSacadoCedente: 41.0
Linha: 006-18 | 003
***********************************************************************************************
calculo_Liq_Cedente_ATE_Result: 0.0
***********************************************************************************************

/*********************************************************************************************/
/*
se    todas as condições seguintes são verdadeiras :          
- ( o setor atividade cedente virtual de  'Solicitacao' não está entre { Agroindústria , Educacao } )          
- ( 'calculo_LiqSacadoCedente' é maior que 40 e no máximo 80 ) , 
então    
atribuir à 'calculo_Liq_Cedente_APOS_Result' o valor ( 'calculo_LiqSacadoCedente' / 100 ) ;    
atribuir o status final de  'Status' a "manual" ;    'Status' .adicionarCondicaoAceite_2( "xx" , o status final de  'Status' , "xx" , "demais ramos de atividade e a liquidez acumulada do sacado no cedente estiver entre 40 e 80%, então enviar título para análise manual" ) ;    'CondicaoAceite' .adicionarMotivo( 'Motivos' ) ;    
Apresentar "Linha: " + "006-17 | 006" ;
*/

String segmento = ""; 
String subSegmento = ""; 
int prazoD0 = 0;
int prazoMinimo = 0;
int prazoOpCredito = 0;
int prazoTitulo = 0; 
String dataEmissao = "2024-04-01";
String produto = "Duplited";
String raizCnpjCpfSacado = "stringXXXXXXXX";
String sacadoTipoPessoa = "string";
int liquidezSacadoCedente = 0; 
Double liquidezSacadoCedente6mesesAteVencto = 20.00; 
Double liquidezSacadoCedente5mesesAteVencto = 0.00;
Double liquidezSacadoCedente4mesesAteVencto = 0.00;
Double liquidezSacadoCedente3mesesAteVencto = 0.00;
Double liquidezSacadoCedente2mesesAteVencto = 0.00;
Double liquidezSacadoCedente1mesesAteVencto = 0.00;
Double liquidezSacadoCedente6mesesAposVencto = 21.00; 
Double liquidezSacadoCedente5mesesAposVencto = 0.00;
Double liquidezSacadoCedente4mesesAposVencto = 0.00;
Double liquidezSacadoCedente3mesesAposVencto = 0.00;
Double liquidezSacadoCedente2mesesAposVencto = 0.00;
Double liquidezSacadoCedente1mesesAposVencto = 0.00;
boolean sacadoImpedidoNoCedente = false;
boolean cepSacadoNaoPodeSerCobrado = false; 
boolean sacadoPermitidoNoCedente = false; 
boolean sacadoImpedidoNoBanco = false; 
String raizCnpjCpfSacador = "stringXXXXXXXXXXXXXXXXXXX"; 
boolean sacadorTipoPessoa = false; 
boolean sacadorPermitidoNoCedente = false; 
boolean sacadorImpedidoNoCedente = false; 
boolean sacadorTerceiroGarantidor = false; 
String ratingCreditoCedente = "string";
String estadoCedente = "string";
String raizCnpjCpfCedente = "string"; 
String cnaeCedente = "string";
String setorAtividadeCedente = "QQ_COISA"; 
String faturamentoCedente = "string";
boolean cedenteFactoring = false; 
int liquidezSacadoCedentePermitidaPCD = 0;
String destinoAutomaticoTitulo = "string";
double valorTitulo = 1000.00;
int qtdDiasProrrogadoTitulo = 0; 
boolean sacadorImpedidoNoBanco = false;
boolean checagemPrePCD = false; 
int porcentagemExigidoDuplicata = 0;
int tempoRelacionamentoCliente = 0;
String scoreSacado = "string";
String scoreCedente = "string";
double concentracaoSacadoCedente = 0.00;
double concentracaoSacadoCedentePermitidaPCD = 0.00;
br.com.abcbrasil.request.Solicitacao_ODM retorno = new br.com.abcbrasil.request.Solicitacao_ODM(new br.com.abcbrasil.request.Segmento(segmento,subSegmento),new br.com.abcbrasil.request.Prazo_D0(prazoD0,prazoMinimo,prazoOpCredito,prazoTitulo),new br.com.abcbrasil.request.Prazo_Longo(dataEmissao),produto,raizCnpjCpfSacado,sacadoTipoPessoa,liquidezSacadoCedente,liquidezSacadoCedente6mesesAteVencto,liquidezSacadoCedente5mesesAteVencto,liquidezSacadoCedente4mesesAteVencto,liquidezSacadoCedente3mesesAteVencto,liquidezSacadoCedente2mesesAteVencto,liquidezSacadoCedente1mesesAteVencto,liquidezSacadoCedente6mesesAposVencto,liquidezSacadoCedente5mesesAposVencto,liquidezSacadoCedente4mesesAposVencto,liquidezSacadoCedente3mesesAposVencto,liquidezSacadoCedente2mesesAposVencto,liquidezSacadoCedente1mesesAposVencto,sacadoImpedidoNoCedente,cepSacadoNaoPodeSerCobrado,sacadoPermitidoNoCedente,sacadoImpedidoNoBanco,raizCnpjCpfSacador,sacadorTipoPessoa,sacadorPermitidoNoCedente,sacadorImpedidoNoCedente,sacadorTerceiroGarantidor,ratingCreditoCedente,estadoCedente,raizCnpjCpfCedente,cnaeCedente,setorAtividadeCedente,faturamentoCedente,cedenteFactoring,liquidezSacadoCedentePermitidaPCD,destinoAutomaticoTitulo,valorTitulo,qtdDiasProrrogadoTitulo,sacadorImpedidoNoBanco,checagemPrePCD,porcentagemExigidoDuplicata,tempoRelacionamentoCliente,scoreSacado,scoreCedente,concentracaoSacadoCedente,concentracaoSacadoCedentePermitidaPCD);
return retorno;

****************************************************************************************
******* 18 -Executa Regra Acumulada do Sacado Cedente APOS ******************************
****** Regra Calculo MENOR 40% | Regra Calculo MAIOR 40% MENOR 80% -> APOS VENCTO ******
Valor Titulo: 1000.0
Status: manual, 
Código: xx, 
Motivo: demais ramos de atividade e a liquidez acumulada do sacado no cedente estiver entre 40 e 80%, então enviar título para análise manual
--> calculo_LiqSacadoCedente: 41.0
Linha: 006-18 | 006
***********************************************************************************************
calculo_Liq_Cedente_ATE_Result: 0.0
***********************************************************************************************

/*********************************************************************************************/

/*********************************************************************************************/

/*********************************************************************************************/

/*********************************************************************************************/






/*********************************************************************************************/


