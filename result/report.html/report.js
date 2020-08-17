$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/rediff.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Login",
  "description": "various scenarios for login",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "login with invalid uis and password",
  "description": "",
  "id": "login;login-with-invalid-uis-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User is on rediff login page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user enters invalid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user is displayed with error",
  "keyword": "Then "
});
formatter.match({
  "location": "RediffTest.user_is_on_rediff_login_page()"
});
formatter.result({
  "duration": 9787783110,
  "status": "passed"
});
formatter.match({
  "location": "RediffTest.user_enters_invalid_credentials()"
});
formatter.result({
  "duration": 5267320165,
  "status": "passed"
});
formatter.match({
  "location": "RediffTest.user_is_displayed_with_error()"
});
formatter.result({
  "duration": 53912685,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "navigates to registration",
  "description": "",
  "id": "login;navigates-to-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "User is on rediff login page",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "user clicks on create new account",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "user is navigated to registarion page",
  "keyword": "Then "
});
formatter.match({
  "location": "RediffTest.user_is_on_rediff_login_page()"
});
formatter.result({
  "duration": 641765203,
  "status": "passed"
});
formatter.match({
  "location": "RediffTest.user_clicks_on_create_new_account()"
});
formatter.result({
  "duration": 2648254432,
  "status": "passed"
});
formatter.match({
  "location": "RediffTest.user_is_navigated_to_registarion_page()"
});
formatter.result({
  "duration": 137277,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "Register with valid credentials",
  "description": "",
  "id": "login;register-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 35,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "User is on rediff login page",
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "User is directed to registraion page",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user enters valid data",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user is registred",
  "keyword": "Then "
});
formatter.match({
  "location": "RediffTest.user_is_on_rediff_login_page()"
});
formatter.result({
  "duration": 397206733,
  "status": "passed"
});
formatter.match({
  "location": "RediffTest.user_is_directed_to_registraion_page()"
});
formatter.result({
  "duration": 1217435344,
  "status": "passed"
});
formatter.match({
  "location": "RediffTest.user_enters_valid_data()"
});
formatter.result({
  "duration": 202212342,
  "status": "passed"
});
formatter.match({
  "location": "RediffTest.user_is_registred()"
});
formatter.result({
  "duration": 124447,
  "status": "passed"
});
});