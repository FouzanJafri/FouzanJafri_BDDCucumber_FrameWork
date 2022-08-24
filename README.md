# How to access this project
1. Clone the project using :-
   ```batch
   git clone https://github.com/shark-2000/NCA_Fwk.git NCA_Fwk 
   ```
2. Got to the project directory and into the suite folder
3. Open testng.xml available in suites folder in eclipse IDE.
4. Run the xml file as TestNG Suite 

## Framework file strucuture
```mermaid
flowchart LR;
src-->main;
src-->test;
src-->main-->java-->pages-->Login.java;
src-->main-->java-->pages-->DashBoard.java;
src-->main-->java-->utils-->API_Initializer.java;
src-->main-->java-->utils-->BrowserManager.java;
src-->main-->java-->utils-->ParsedAPIData.java;
src-->main-->java-->utils-->ExtentReport.java;
src-->main-->java-->utils-->ScreenShot.java;
src-->main-->java-->utils-->Constant.java;
src-->main-->java-->utils-->ConfigurationReader.java;
src-->main-->resources-->configurations-->configuration.properties;
src-->main-->resources-->configurations-->api.properties;
src-->test-->Java;
src-->test-->Java-->abstracted-->Report.java;
src-->test-->Java-->base-->TestScript.java;
src-->test-->Java-->dataProviders-->Data.java;
src-->test-->Resources-->drivers;
```

## Driver flow
```mermaid 
flowchart TD;
Testng.xml-->browserName1-->ConfigurationReader-->Browser.setProperty-->Prerequisite.driver