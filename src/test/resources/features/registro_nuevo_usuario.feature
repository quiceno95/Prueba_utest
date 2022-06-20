@UserRegistration
Feature: User registration in Utest

  As a internet user
  I want to register in Utest

  @Successfulregistration
  Scenario: successful registration process
    Given User wants to register
    When Complete registration information
      | name | lastName | email            | birthMonth | birthDay | birthYear | city     | zip    | country  | computer | version | languaje | movilDevice | modelDevice   | os         | pass              |
      | Luis | Quiceno  | Luis@quiceno.com | mayo       | 9        | 1995      | Montería | 230001 | Colombia | Windows  | 10      | Español  | Xiaomi      | Mi Note 9 pro | Android 11 | Lquicenoespitia14 |
    Then  Complete registration
      | textFinal      |
      | Complete Setup |