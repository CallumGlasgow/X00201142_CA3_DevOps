# Project Name
X00201142_CA3_DevOps
## Overview
This project is a Calculator gradle application. it implements features such as addition, subtraction, multiplication and division. 

CA3 extends from CA2 using pipeline, testing, deployment, approval gates and multi-enviornment deployments. 

## Technologies Used
- Java
- Gradle
- Azure DevOps
- GitHub

## Local Development Setup
git clone https://github.com/CallumGlasgow/X00201142_CA3_DevOps.git

./gradlew build

./gradlew run

./gradlew test

check reports
build/reports/jacoco/test/html/index.html

## Application Features

- Addition
- Subtraction
- Multiplication
- Division
- Square
- Cube

with tests and coverage

## CI Pipeline Implementation

multi stage
1. Build - build project, run tests and generate code coverage
2. Security
3. Performance
4. UAT
5. DeployTest - deploy to test enviornment
6. DeployProd - deploy to prod enviornment

## Branch Policies and Protection

- requires Pull Request to push to main
- requires status check to pass before merging PR
- approval gates added to Prod and Test enviornments

## Testing Strategy

- Unit Tests for Calculator functions with more than 80% code coverage required

- publish results to pipeline

- added dummy placeholders for Security, Performance and UAT testing

## Troubleshooting 
test locally that these all pass

./gradlew build

./gradlew run

./gradlew test

if pipeline failed check error message and re run

if JaCoCoTestReport fails check local test coverage

If PR is blocked check approval and status of pipeline

if Deployment to enviornments blocked ensure approval has been granted

