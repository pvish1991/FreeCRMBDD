$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/QA/Selenium_WorkSpace/FreeCrmBDDFrameWork/src/main/java/Features/dealsmap.feature");
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
  "name": "Deal data Creation",
  "description": "",
  "id": "deal-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 22,
  "name": "Free CRM Create a new deal scenario",
  "description": "",
  "id": "deal-data-creation;free-crm-create-a-new-deal-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user is already on login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "user clicks on login link",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 28
    },
    {
      "cells": [
        "pvish1991@gmail.com",
        "Test@123"
      ],
      "line": 29
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "user moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "user clicks on create button",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "user enters deal details",
  "rows": [
    {
      "cells": [
        "title",
        "probability",
        "amount",
        "commission"
      ],
      "line": 36
    },
    {
      "cells": [
        "test deal1",
        "50",
        "1000",
        "100"
      ],
      "line": 37
    },
    {
      "cells": [
        "test deal2",
        "60",
        "3000",
        "500"
      ],
      "line": 38
    },
    {
      "cells": [
        "test deal3",
        "80",
        "2000",
        "300"
      ],
      "line": 39
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 4434956200,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 2019199900,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_clicks_on_login_link()"
});
formatter.result({
  "duration": 4178036100,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 150424100,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 3055230800,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 3019287100,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_hits_on_contact_page()"
});
formatter.result({
  "duration": 288039100,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_clicks_on_create_button()"
});
formatter.result({
  "duration": 2141328400,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.user_enters_contacts_details(DataTable)"
});
formatter.result({
  "duration": 8264099400,
  "status": "passed"
});
formatter.match({
  "location": "DealsStepWithMapDefinition.Close_the_browser()"
});
formatter.result({
  "duration": 897202700,
  "status": "passed"
});
});