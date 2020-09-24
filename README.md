# rest-assured-testng
<h3>This is a POC rest assured using factory pattern</h3>

<h4>Source</h4>

Using conduit app [here](https://github.com/cypress-io/cypress-example-conduit-app).

<h4>Objective</h4>
To understand nuances of rest assured by creating a project using testng. This
executes all the test locally at https://localhost:3000/api.

<h4>Approach</h4>
1. Using factory pattern to segregate all the services by class and then add functions for each
type of operation to be performed by that service.

2. Using object package which has class for each POST object. This object is ideated in service class
and converting these object class to json using json

3. Test package - has test for a feature, and uses testng annotation and assertions.