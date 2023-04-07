### Hexlet tests and linter status:
[![Maintainability](https://api.codeclimate.com/v1/badges/59185a6fc79af8290879/maintainability)](https://codeclimate.com/github/hplskid/java-project-61/maintainability) 
[![Actions Status](https://github.com/hplskid/java-project-61/workflows/hexlet-check/badge.svg)](https://github.com/hplskid/java-project-61/actions)

### What is that?

"Brain Games" is a set of five console games based on the popular mobile brain-pumping apps. Each game asks questions that need to be answered correctly. After three correct answers, the game is considered completed. Incorrect answers end the game and prompt you to play it again.

### Games:

    Calculator - Arithmetic expressions to be calculated.
    Progression - Finding missing numbers in a sequence of numbers.
    Even - Determining an even number.
    GCD - Determining the largest common divisor.
    Prime - Determining a prime number.

### How to start:

    ~/Brain-Games/app$ ./gradlew installDist
    ~/Brain-Games/app$ make run-dist

### Asciinema:

[![asciicast](https://asciinema.org/a/cQSBe2Rt6nB7N5Rf694Q378Iq.svg)](https://asciinema.org/a/cQSBe2Rt6nB7N5Rf694Q378Iq)

### SBOM (Software bill of materials):

```json
{
  "bomFormat" : "CycloneDX",
  "specVersion" : "1.4",
  "serialNumber" : "urn:uuid:f85eeb4f-af7a-4c27-a504-b1be34557335",
  "version" : 1,
  "metadata" : {
    "timestamp" : "2023-04-07T13:47:12Z",
    "tools" : [
      {
        "vendor" : "CycloneDX",
        "name" : "cyclonedx-gradle-plugin",
        "version" : "1.7.4"
      }
    ],
    "component" : {
      "group" : "hexlet.code",
      "name" : "app",
      "version" : "2.0.0",
      "purl" : "pkg:maven/hexlet.code/app@1.0.1?type=jar",
      "type" : "application",
      "bom-ref" : "pkg:maven/hexlet.code/app@1.0.1?type=jar"
    }
  },
  "dependencies" : [
    {
      "ref" : "pkg:maven/hexlet.code/app@1.0.1?type=jar",
      "dependsOn" : [ ]
    }
  ]
}
```

To create SBOM file (json and xml formats) use:
    
    ~/Brain-Games/app$ ./gradlew cyclonedxBom

file will be located in this path: `app/build/reports/`