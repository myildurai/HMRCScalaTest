# HMRCScalaTest
1.  CalcBill of ChekcOut object calculates the bill for the shopping without any offers. 
2.  CalcBillWithOffer of Checkout Object calculates the bill for the shopping by reducing the items under offer from the total bill amount. 

The code comments are quite detailed and am more than happy to give an explanation in case of queries. 

Sbt test result: 

$ sbt test
[info] Loading project definition from C:\work\official\Hadoop\work\HMRCScalaTest\project
[info] Set current project to HMRCScalaTest (in build file:/C:/work/official/Hadoop/work/HMRCScalaTest/)
[info] Compiling 4 Scala sources to C:\work\official\Hadoop\work\HMRCScalaTest\target\scala-2.10\classes...
[info] 'compiler-interface' not yet compiled for Scala 2.10.6. Compiling...
[info]   Compilation completed in 9.426 s
[info] Compiling 1 Scala source to C:\work\official\Hadoop\work\HMRCScalaTest\target\scala-2.10\test-classes...
[info] CheckOutTest:
[info] Feature: Shopping with out offers
[info]   Scenario: Empty Shopping Bucket Test
[info]   Scenario: Non Empty Shopping Bucket Test
[info]   Scenario: Adding Items to the list Test
[info] Feature: Shopping with offers
[info]   Scenario: Empty Shopping Bucket Test
[info]   Scenario: Shopping with one offer per item
[info]   Scenario: Shopping with multiple offers for apples and Oranges
[info]   Scenario: Shopping with multiple offers for apple No Oranges
[info]   Scenario: Shopping with no apples and multiple offers for Oranges
[info] Run completed in 368 milliseconds.
[info] Total number of tests run: 8
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 8, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 15 s, completed 09-May-2017 05:07:21
