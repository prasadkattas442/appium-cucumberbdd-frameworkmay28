#@test
#Feature: Login scenarios
#
#  Scenario Outline: Login with invalid user name
#    When User enter username as "<username>"
#    And User enter password as "<password>"
#    And User click on login button
#    Then login should fail with an error "<err>"
#    Examples:
#      | username | password | err |
#      | invalidUsername | secret_sauce | Username and password do not match any user in this service. |
#
#  Scenario Outline: Login with invalid password
#    When User enter username as "<username>"
#    And User enter password as "<password>"
#    And User click on login button
#    Then login should fail with an error "<err>"
#    Examples:
#      | username | password | err |
#      | standard_user | invalidPassword | Username and password do not match any user in this service. |
#
#  Scenario Outline: Login with valid user name and password
#    When User enter username as "<username>"
#    And User enter password as "<password>"
#    And User click on login button
#    Then Validate Products page with title "<title>"
#    Examples:
#      | username | password | title |
#      | standard_user | secret_sauce | PRODUCTS |