# HMRCScalaTest
1.  CalcBill of ChekcOut object calculates the bill for the shopping without any offers. 
2.  CalcBillWithOffer of Checkout Object calculates the bill for the shopping by reducing the items under offer from the total bill amount. 

The code comments are quite detailed and am more than happy to give an explanation in case of queries. 

Sbt test result: 

$ sbt test \n
[info] Loading project definition from C:\work\official\Hadoop\work\HMRCScalaTest\project \n
[info] Set current project to HMRCScalaTest (in build file:/C:/work/official/Hadoop/work/HMRCScalaTest/) \n
[info] Compiling 4 Scala sources to C:\work\official\Hadoop\work\HMRCScalaTest\target\scala-2.10\classes... \n
[info] 'compiler-interface' not yet compiled for Scala 2.10.6. Compiling... \n
[info]   Compilation completed in 9.426 s \n
[info] Compiling 1 Scala source to C:\work\official\Hadoop\work\HMRCScalaTest\target\scala-2.10\test-classes... \n
[info] CheckOutTest: \n
[info] Feature: Shopping with out offers \n
[info]   Scenario: Empty Shopping Bucket Test \n
[info]   Scenario: Non Empty Shopping Bucket Test \n
[info]   Scenario: Adding Items to the list Test \n
[info] Feature: Shopping with offers \n
[info]   Scenario: Empty Shopping Bucket Test \n
[info]   Scenario: Shopping with one offer per item \n
[info]   Scenario: Shopping with multiple offers for apples and Oranges \n
[info]   Scenario: Shopping with multiple offers for apple No Oranges \n
[info]   Scenario: Shopping with no apples and multiple offers for Oranges \n
[info] Run completed in 368 milliseconds. \n
[info] Total number of tests run: 8 \n
[info] Suites: completed 1, aborted 0 \n
[info] Tests: succeeded 8, failed 0, canceled 0, ignored 0, pending 0 \n
[info] All tests passed. \n
[success] Total time: 15 s, completed 09-May-2017 05:07:21 \n
