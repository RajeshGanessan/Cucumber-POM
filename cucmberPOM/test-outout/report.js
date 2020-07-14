$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Dashboard.feature");
formatter.feature({
  "line": 2,
  "name": "Performing dashboard operations",
  "description": "",
  "id": "performing-dashboard-operations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Dashboard"
    }
  ]
});
formatter.before({
  "duration": 30849185554,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "performing-dashboard-operations;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is in dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on setup",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on outlets",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "outlets page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "DashBoardSteps.user_is_in_dashboard()"
});
formatter.result({
  "duration": 767652913,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[ Overview ]\u003e but was:\u003c[InEDGE - Sign In]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat StepDefinitions.DashBoardSteps.user_is_in_dashboard(DashBoardSteps.java:22)\r\n\tat ✽.Given user is in dashboard(Dashboard.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DashBoardSteps.user_clicks_on_setup()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashBoardSteps.user_clicks_on_outlets()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DashBoardSteps.outlets_page_should_be_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Logging in with Admin",
  "description": "",
  "id": "logging-in-with-admin",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 20748587065,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": "logging-in-with-admin;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is in the Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters the email and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Clicks on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user should be on the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_in_the_Login_page()"
});
formatter.result({
  "duration": 86276111,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d71.0.3578.80)\n  (Driver info: chromedriver\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027USER-PC\u0027, ip: \u0027192.168.1.248\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.36.540470 (e522d04694c7ebea4ba8821272dbef4f9b818c91), userDataDir\u003dC:\\Users\\RAJESH~1\\AppData\\Local\\Temp\\scoped_dir11808_708}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d71.0.3578.80, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 74bfc686879b2e17028f75f81270c559\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:703)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:374)\r\n\tat StepDefinitions.LoginSteps.user_is_in_the_Login_page(LoginSteps.java:21)\r\n\tat ✽.Given user is in the Login page(Login.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginSteps.user_enters_the_email_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.clicks_on_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginSteps.user_should_be_on_the_homepage()"
});
formatter.result({
  "status": "skipped"
});
});