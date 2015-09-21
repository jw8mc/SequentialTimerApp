##Problem Statement
With this individual project, I hope to create a sequential timer application (for Windows desktop, but it would be neat to try and make an Android app), with the goal of providing an easily configured staging environment for people who struggle with executive disfunction. This app would allow you to set alarms to go off in order, and set delay timers to give yourself time to complete the tasks before the next alarm begins.

**Things I want to include:**
* Set a series of alarms
* Configure when they should repeat (every day, weekdays, weekends, MWF, etc)
* Multiple possible responses to an alarm - 
  1. I'm on it!
  2. Give me five minutes... (snooze)
  3. I won't be doing this today (skip, only for that day, only available after at least two snoozes, will require confirmation; this is kind of a stretch goal)
* Pull in Google Calendar events to give a summary of day's commitments and create appropriate and overriding alarms for these events

**Things that would be nice to have:**
* A way to calculate average time needed to complete a task and adjust timers appropriately (ex. initially allot 20 minutes to shower, find average is closer to 25 minutes, asjust timer delay)
* After the above, a way to inform you if you will not have enough time to complete the current task before a major commitment (ex. not enough time to shower before class)
* Charts, metrics, and statistics on tasks completion, time, successes, etc

I'd like to explore using some of Google's APIs for Calendar and OAuth2. I'd like to be able to sync data across multiple devices, or configure certain alarms to sound only on specific devices (ie. no wakeup alarm on your computer) but since porting it to other platforms is a stretch goal this is less important.