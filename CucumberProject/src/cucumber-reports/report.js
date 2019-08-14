$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/login.feature");
formatter.feature({
  "name": "Login feature file",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "A valid login scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the URL of demo web shop application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSetupDefinition.the_URL_of_demo_web_shop_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters kannan1@gmail.com as username",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSetupDefinition.user_enters_kannan_gmail_com_as_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters test1234 as password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSetupDefinition.user_enters_test_as_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in valid page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSetupDefinition.user_is_in_valid_page()"
});
formatter.result({
  "status": "passed"
});
});