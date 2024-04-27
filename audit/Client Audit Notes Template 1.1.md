# Client Name

## Details

| Name              | Comment            |
| ----------------- | ------------------ |
| Client            |                    |
| Target System     | Windchill 11.1     |
| Build information |                    |
| Date              | 29th November 2021 |
| Auditor           | Wincom             |
| By                | Simon Heath        |



## Executive Summary

This is a typical customization codebase, with extensive use of ...

## High Level Audit

**Deployment technique** Classic replace strategy

### Codebase


| Type                     | Comments     |
| ------------------------ | ------------ |
| Java Source files        | x            |
| Top Packages             | x            |
| Total packages (level 1) | x            |
| Java OOTB                | Yes (minor)  |
| Listeners                | x            |
| MVC Classes              | x            |
| Workflow Classes         | x (estimate) |

### User Interface

| Type                          | Comments                     |
| ----------------------------- | ---------------------------- |
| JSP Files                     | x                            |
| JSP OOTB                      | Yes/No (significant changes) |
| JSP in page coding            | x                            |
| XML Action References (Files) | x files - x references *     |

* Many files were including with other changes (unknown)

### General

| Type                 | Comments |
| -------------------- | -------- |
| MVC Beans            | x        |
| Usage of Info*engine | Yes/No   |
| Implements PTC Rest  | Yes/No   |
| Use of wtCustom      | Yes/No   |

## Java Code and Design

### PTC Modules

+ PDMLink
+ ProjectLink
+ SUMA
+ ESI



### Code Quality and Separation

Packaging of the code is typical in evolved code...

## General Notes

### Source adjustments

Various files were not UTF and contains illegal chars...

## Security & Third Party Libraries

The following libraries are used (examples)

| Group ID           | Artifact ID    | Version     | License  |
| ------------------ | -------------- | ----------- | -------- |
| org.hibernate      | hibernate-core | 5.1.0.Final | LGPL     |
| org.apache.commons | commons-vfs2   | 2.0         | Apache 2 |

### Security Vulnerabilities (>2.0)

(examples)

| Artifact                   | CVE            | Score        |
| -------------------------- | -------------- | ------------ |
| hibernate-core-5.1.0.Final | CVE-2020-25638 | 7.4 (high)   |
| pdfbox-1.8.9.jar           | CVE-2018-11797 | 5.5 (medium) |

A deep analysis is required, some of these CVE are due to included libraries and could be excluded

## Upgrade to 12 review

The code was compiled and checked against 12.0.2

Aside the JSP changes, which were not reviewed, the codebase poses no significant upgrade issues

Leaving aside the log4j conversion the following was found

| Package  | Class   | Affeceted                                                  |
| -------- | ------- | ---------------------------------------------------------- |
| workflow | xxxx    | com.ptc.windchill.cadx.common.util.ObjectDependencyUtility |
| xxxx     | IBAUtil | wt.csm                                                     |







