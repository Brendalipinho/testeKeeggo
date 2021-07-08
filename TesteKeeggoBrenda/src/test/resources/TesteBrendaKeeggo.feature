
@tag
Feature: Test

@Test

  Scenario: validar funcionalidades de cadastro
    Given que eu esteja no site "https://www.advantageonlineshopping.com/#/"
    And clique na funcionalidade de login
    When eu clicar na funcionalidade de criar nova conta
    And preencher os dados solicitados
    Then valide o cadastro
    
   
 # Scenario: validar funcionalidades de login
  #  Given que eu esteja no site "https://www.advantageonlineshopping.com/#/"
   # And clique na funcionalidade de login
  # When eu clicar na funcionalidade de criar nova conta
   # Then valide os campos de username e passoword com o login cadastrado anteriormente 
    
   

