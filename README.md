# How to access this project
1. Clone the project using :-
   ```batch
   git clone https://github.com/FouzanJafriFouzanJafri_BDDCucumber_FrameWork 
   ```
2. Got to the project directory and into the suite folder
3. Open testng.xml available in suites folder in eclipse IDE.
4. Run the xml file as TestNG Suite 

## Framework file strucuture
```mermaid
flowchart LR;
src-->main;
src-->test;
src-->main-->java-->Utility-->BrowserManager.java;
src-->main-->java-->Utility-->Constraints.java;
src-->main-->java-->Utility-->ExtentRep.java;
src-->main-->java-->Utility-->ReadProp.java;
src-->main-->java-->Utility-->ScreenShot.java;
src-->main-->java-->BasePage-->Common.java

src-->main-->java-->Pages-->Login.java
src-->main-->java-->Pages-->Home.java

src-->test-->Java;
src-->test-->java-->StepDefinations-->LoginStep.java
src-->test-->java-->StepDefinations-->HomeStep.java
src-->test-->java-->featuresFile--> Login.feature
src-->test-->java-->featuresFile--> Home.feature

src-->test-->java-->RunnerFile-->LoginRunner.java
src-->test-->java-->RunnerFile-->HomeRunner.java

src-->test-->resources-->configure-->configure.properties;
src-->test-->Resources-->drivers;
src-->test-->Resources-->drivers-->chromedriver;
src-->test-->Resources-->drivers-->msedgedriver;

```

## Driver flow
```mermaid 
flowchart TD;
Testng.xml-->browserName1-->ConfigurationReader-->Browser.setProperty-->Prerequisite.driver
