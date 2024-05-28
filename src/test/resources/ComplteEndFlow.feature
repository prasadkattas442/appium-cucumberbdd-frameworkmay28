#@ComplteEndFlow
#Feature:Swag Labs app EndtoEnd Flow
#
#  Scenario Outline:
#    Given user unlock device
#    When User enter username as "<username>"
#    And User enter password as "<password>"
#    And User click on login button
#    Then Validate Products page with title "<title>"
#    And the product is listed with title "<title Name>" and price "<price>"
#    When I click product title "<title Name>"
#    Then I should be on product details page with title "<title>", price "<price>" and description "<description>"
#    And User click on ADD TO CART button
#    When User click on cart page
#    And user click on Checkout
#    And user enter address "<First Name>", "<Last Name>" and "<Postal Code>"
#    And click on finish button
#    And Lock the device
#
#    Examples:
#      | username      | password     | title    | title Name                        | price  | description                                                                                                                            | First Name | Last Name | Postal Code |
#      | standard_user | secret_sauce | PRODUCTS | Sauce Labs Onesie | $29.99 | carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection. | Prasad     | Katta     | 500084      |

  @EndFlow
  Feature:Swag Labs app EndtoEnd Flow

  Scenario Outline: Swag Labs app EndtoEnd Flow
    Given user unlock device
    When User enter username as "<username>"
    And User enter password as "<password>"
    And User click on login button
    Then Validate Products page with title "<title>"
    And User click on ADD TO CART button
    Then Scroll to required element "<Productele2>"
    When User click on cart page
    And user click on Checkout
    And user enter address "<First Name>", "<Last Name>" and "<Postal Code>"
    And click on finish button
#    And Lock the device

    Examples:
      | username      | password     | title    | Productele        | Productele2         | First Name | Last Name | Postal Code |
      | standard_user | secret_sauce | PRODUCTS | Sauce Labs Onesie | Sauce Labs Backpack | Prasad     | Katta     | 500084      |
