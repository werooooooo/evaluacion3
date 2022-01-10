Feature: Realizacion de casos ingresando nombre usuario y contraseña
Scenario: verificacion de ingreso de session
Given Abrir Chrome
When ingresar Username "juan" y Password "654321"
Then inicia session
Given Cerrar Chrome

Scenario: verificacion de ingreso de session con datos erroneos
Given Abrir Chrome
When Ingresar Username falso "jhon" y Password "123456"
Then inicia session
Given Cerrar Chrome

Scenario: verificacion de ingreso de session con datos vacios
Given Abrir Chrome
When Ingresar Username falso "" y Password ""
Then inicia session
Given Cerrar Chrome
