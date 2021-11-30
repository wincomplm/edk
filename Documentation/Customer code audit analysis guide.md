# Customer code audit analysis

**Author** Simon Heath

**Date** Nov 2022

## Introduction

This guide is used to complete a high level analysis of code

## Code Request

First it must be ensured that Wincom and client are under full NDA.

The following information is required

+ The exact Windchill version
+ Intended upgrade path
+ If it contains IP from any 3rd party

The customer is then requested for a complete copy of their codebase including all supporting files and UI. Any details of deployment must be provided but any functional or requirements document is **not** requires as this is a full source code analysis. The files that are required include

+ Java source
+ JSP
+ xconf
+ Properties
+ XML
+ All 3rd party references
+ The code must then be stored under the clients area in the share system with a note that this folder is under NDA

## Executive Summary

This section is an overview for the managers, they need to know scope and some details of the code quality

* Windchill Modules useds
* Web services
* Rest implements
* OOTB changes
* Risks
* Code Quality

## Code analysis

The analysis follows the following steps

+ Java source code analysis
+ UI and JSP analysis
+ Configuration review


## Java source code analysis

The objective in this step is to create a commons wex that contains the complete codebase. The files must compile and any missing files requested from the client.

The wex is created with the standard archetype and all code added.

Once the code is compliable the modules that reference the PTC modules can be isolated. e.g. SUMA, ESI, ProjectLink etc. 

### Codebase

| Type                     | Comments                                      |
| ------------------------ | --------------------------------------------- |
| Java Source files        | Number of java file                           |
| Top Packages             |                                               |
| Total packages (level 1) |                                               |
| Java OOTB                | Yes/No (Major/Minor)                          |
| Listeners                | Look for ServiceEventListenerAdapter          |
| MVC Classes              | Any classes the use com.ptc.mvc               |
| Workflow Classes         | Check the workflow code and manual inspection |

### User Interface

| Type                          | Comments                                                     |
| ----------------------------- | ------------------------------------------------------------ |
| JSP Files                     | Look for jsp and jspf                                        |
| JSP OOTB                      | Yes/No (significant/minor changes)                           |
| JSP in page coding            | Limited (If the client coded a lot of java in jsp )          |
| XML Action References (Files) | x files - yyyy references * (these are modes in the config/actions) |

- Many files were including with other changes (unknown)

### General

| Type                 | Comments                     |
| -------------------- | ---------------------------- |
| MVC Beans            | config/mvc additions         |
| Usage of Info*engine | Yes/No (Check for tasks dir) |
| Implements PTC Rest  | Yes/No (Check rest area)     |
| Use of wtCustom      | Yes/No (Does this exist)     |



