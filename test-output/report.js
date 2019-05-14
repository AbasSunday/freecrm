$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/MainPage.feature");
formatter.feature({
  "name": "Pet Insurance",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Main Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens sub page \"details\" in the quote page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters pets details",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "Input name",
        "Value"
      ]
    },
    {
      "cells": [
        "Pet name",
        "Matt"
      ]
    },
    {
      "cells": [
        "Pet type",
        "Cat"
      ]
    },
    {
      "cells": [
        "Pet breed",
        "Pedigree"
      ]
    },
    {
      "cells": [
        "Pet\u0027s Dominant Breed",
        "Aidi"
      ]
    },
    {
      "cells": [
        "is vaxinated",
        "true"
      ]
    }
  ]
});
formatter.step({
  "name": "User gets quote",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "NameofPet"
      ]
    },
    {
      "cells": [
        "Monday"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Main Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User opens sub page \"details\" in the quote page",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.userOpensSubPageInTheQuotePage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters pets details",
  "rows": [
    {
      "cells": [
        "Input name",
        "Value"
      ]
    },
    {
      "cells": [
        "Pet name",
        "Matt"
      ]
    },
    {
      "cells": [
        "Pet type",
        "Cat"
      ]
    },
    {
      "cells": [
        "Pet breed",
        "Pedigree"
      ]
    },
    {
      "cells": [
        "Pet\u0027s Dominant Breed",
        "Aidi"
      ]
    },
    {
      "cells": [
        "is vaxinated",
        "true"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "QuoteDetailsSteps.userEntersPetsDetails(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User gets quote",
  "keyword": "Then "
});
formatter.match({
  "location": "QuoteDetailsSteps.userGetsQuote()"
});
formatter.result({
  "status": "passed"
});
});