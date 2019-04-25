$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/skeleton/Casestudy.feature");
formatter.feature({
  "name": "TestMeApp Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "LoginScenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "URL of the TestMeApp",
  "keyword": "Given "
});
formatter.match({
  "location": "Casestudypagedef.url_of_the_TestMeApp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the data for Login",
  "keyword": "When "
});
formatter.match({
  "location": "Casestudypagedef.user_enters_the_data_for_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is Login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Casestudypagedef.user_is_Login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});