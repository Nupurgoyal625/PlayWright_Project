Feature: Search Element

  @regression @smoke
  Scenario: Launch the URL
    Given User launches the Chrome browser
    When User opens the URL "https://playwright.dev/"
    #Then the homepage of Playwright should be displayed

  @regression @smoke
  Scenario Outline: Search Element
    Given User hovers over "<Menu>" in the taskbar and selects Java
    When User clicks on the search icon
    And User enters "<Element>" in the search input
    Then the element should open on a new page

    Examples:
      |    Menu        | Node.js                                       |
      |    Element     | Locators                                      |

