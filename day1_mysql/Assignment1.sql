CREATE DATABASE School;
USE School;

CREATE TABLE Students (
    StudentID INT PRIMARY KEY,
    Name VARCHAR(50),
    Age INT,
    Gender CHAR(1),
    City VARCHAR(50)
);

INSERT INTO Students (StudentID, Name, Age, Gender, City)
VALUES
(101, 'Rahul', 20, 'M', 'Hyderabad'),
(102, 'Priya', 19, 'F', 'Chennai'),
(103, 'Arjun', 21, 'M', 'Bengaluru'),
(104, 'Sneha', 20, 'F', 'Mumbai'),
(105, 'Kiran', 22, 'M', 'Pune');

SELECT * FROM Students;

SELECT Name, City
FROM Students;

SELECT *
FROM Students
WHERE Age > 20;

SELECT *
FROM Students
WHERE Gender = 'F';

SELECT *
FROM Students
WHERE City = 'Hyderabad';

SELECT *
FROM Students
ORDER BY Name;

SELECT *
FROM Students
ORDER BY Age DESC;

SELECT *
FROM Students
ORDER BY City ASC, Name ASC;

SELECT *
FROM Students
WHERE Age BETWEEN 19 AND 21;

SELECT *
FROM Students
WHERE Name LIKE 'R%';

SELECT *
FROM Students
WHERE City LIKE '%i';

SELECT *
FROM Students
WHERE Age IN (20, 22);

UPDATE Students
SET City = 'Delhi'
WHERE StudentID = 101;

UPDATE Students
SET Age = Age + 1
WHERE StudentID = 103;

UPDATE Students
SET City = 'Kolkata'
WHERE StudentID = 104;

DELETE FROM Students
WHERE StudentID = 105;

DELETE FROM Students
WHERE City = 'Chennai';

SELECT * FROM Students;