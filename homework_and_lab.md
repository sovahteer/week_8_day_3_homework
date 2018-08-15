# Lab + Homework

Create a many-to-many hibernate application

## MVP
Create an application to track Courses, Students and Mentors at Quahog University.

- `Course`s should have a `Title` and `Level` (BEng, BSc, MA, HND, etc.)
- `Student`s should have a `Name`, `Age` and `Enrolment number`.
- `Course`s will have many `Student`s and `Student`s will be enrolled on only one `Course`.
- Create a `Lesson` class. Lesson will have a `title` and `classroom number`.
- `Course`s will have many `Lesson`s and each `Lesson` will belong to one `Course`.
- `Student`s will attend many `Lesson`s and `Lesson`s will have many `Student`s.
- Add a `Mentor` with a `Name`.
- An `Mentor` will have one `Student`. And a `Student` will have one `Mentor`.

## Extension

Add `Instructors` to the lessons.

- An `Instructor` can teach many `Lesson`s and each `Lesson` will have one `Instructor`.

## There was an Advanced Extension here, its gone now...
