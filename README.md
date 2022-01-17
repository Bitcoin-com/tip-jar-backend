# Tip-jar
## Problem
Imagine we have an app as seen in the following link 
[Design](https://www.figma.com/file/Wjc3WG4kH8IFooV2DLv29v/TipJar?node-id=0%3A1).

The purpose of this app is to allow users to calculate how much each member of a party should contribute when paying a tip.

Users now wants to be able to store and retrieve their payment history from our server. To solve this problem we 
need to build an API that supports the following operations.

* Save payment history item
* Get latest payment history item
* Get all payment history items

The challenge shouldn't take more than an hour or two, assuming you have an environment set up for Java development. 
That being said, take as much time as you need to complete it. 
We're going to be looking at the quality of your code, so make that your main focus.


## Instructions
* Clone this repo locally using git clone
* Once you have completed the assignment, push the code up to a new private repo and grant access to the following users for code review
  ```
  arnkthr
  AndreasLarssons
  glennguden
  ```
* Then notify your Bitcoin.com hiring contact with a link to your private repo.

## Requirements
* You are supposed to design and implement a system that covers these API endpoints. We expect the code to be
built in a manner that makes it easy to write tests and maintain.

* These endpoints need some kind of database to store the payments, so we can retrieve them later.

* We expect you to take full advantage of spring framework and show us that you are comfortable using it.

## Nice to have
* Utilize reactive frameworks (RxJava, Reactor)
* Nested resources are great. POST /questions/:question_id/answers is better than POST /answers, and it's easier to code it that way!

## What we'll be looking at
* Clean, understandable code
* Either clear experience with the technology we use or the ability to pick them up quickly by referring to the documentation
