-- Create Database
CREATE DATABASE EmployeeManagement;
USE EmployeeManagement;

-- Department Table
CREATE TABLE Department (
    DeptID INT PRIMARY KEY,
    DeptName VARCHAR(50),
    Location VARCHAR(50)
);

-- Insert Department Records
INSERT INTO Department (DeptID, DeptName, Location)
VALUES
(101,'HR','Hyderabad'),
(102,'Finance','Mumbai'),
(103,'IT','Bangalore'),
(104,'Sales','Chennai');

-- Employee Table
CREATE TABLE Employee (
    EmpID INT PRIMARY KEY,
    EmpName VARCHAR(50),
    Gender CHAR(6),
    Age INT,
    Salary DECIMAL(10,2),
    Designation VARCHAR(50),
    DeptID INT,
    HireDate DATE,
    FOREIGN KEY (DeptID) REFERENCES Department(DeptID)
);

-- Insert Employee Records
INSERT INTO Employee
(EmpID, EmpName, Gender, Age, Salary, Designation, DeptID, HireDate)
VALUES
(1,'Amit','Male',28,45000,'Software Engineer',103,'2022-05-10'),
(2,'Priya','Female',30,55000,'HR Manager',101,'2021-03-15'),
(3,'Rahul','Male',27,50000,'Accountant',102,'2023-01-20'),
(4,'Sneha','Female',25,42000,'Sales Executive',104,'2022-09-12'),
(5,'Kiran','Male',31,60000,'Team Lead',103,'2020-11-18');

-- Attendance Table
CREATE TABLE Attendance (
    AttendanceID INT PRIMARY KEY,
    EmpID INT,
    AttendanceDate DATE,
    Status VARCHAR(10),
    FOREIGN KEY (EmpID) REFERENCES Employee(EmpID)
);

-- Insert Attendance Records
INSERT INTO Attendance
(AttendanceID, EmpID, AttendanceDate, Status)
VALUES
(1,1,'2026-07-01','Present'),
(2,2,'2026-07-01','Present'),
(3,3,'2026-07-01','Absent'),
(4,4,'2026-07-01','Present'),
(5,5,'2026-07-01','Present');

-- Display All Employees
SELECT * FROM Employee;

-- Display Employee Name and Salary
SELECT EmpName, Salary
FROM Employee;

-- Employees Earning More Than 50000
SELECT *
FROM Employee
WHERE Salary > 50000;

-- Employees Older Than 30
SELECT *
FROM Employee
WHERE Age > 30;

-- Employees from IT Department
SELECT *
FROM Employee
WHERE DeptID = (
    SELECT DeptID
    FROM Department
    WHERE DeptName = 'IT'
);

-- Female Employees
SELECT *
FROM Employee
WHERE Gender = 'Female';

-- Employees Hired After 2022
SELECT *
FROM Employee
WHERE HireDate > '2022-01-01';

-- Sort by Salary (Descending)
SELECT *
FROM Employee
ORDER BY Salary DESC;

-- Sort by Employee Name
SELECT *
FROM Employee
ORDER BY EmpName;

-- Total Number of Employees
SELECT COUNT(*) AS TotalEmployees
FROM Employee;

-- Highest Salary
SELECT MAX(Salary) AS HighestSalary
FROM Employee;

-- Lowest Salary
SELECT MIN(Salary) AS LowestSalary
FROM Employee;

-- Average Salary
SELECT AVG(Salary) AS AverageSalary
FROM Employee;

-- Total Salary Paid
SELECT SUM(Salary) AS TotalSalary
FROM Employee;

-- Employee Count by Department
SELECT DeptID, COUNT(*) AS EmployeeCount
FROM Employee
GROUP BY DeptID;

-- Average Salary by Department
SELECT DeptID, AVG(Salary) AS AvgSalary
FROM Employee
GROUP BY DeptID;

-- Highest Salary in Each Department
SELECT DeptID, MAX(Salary) AS HighestSalary
FROM Employee
GROUP BY DeptID;

-- Employee Name with Department
SELECT e.EmpName, d.DeptName
FROM Employee e
INNER JOIN Department d
ON e.DeptID = d.DeptID;

-- Employee, Department and Location
SELECT
    e.EmpName,
    d.DeptName,
    d.Location
FROM Employee e
INNER JOIN Department d
ON e.DeptID = d.DeptID;

-- Attendance with Employee Name
SELECT
    e.EmpName,
    a.AttendanceDate,
    a.Status
FROM Attendance a
INNER JOIN Employee e
ON a.EmpID = e.EmpID;

-- Increase IT Employees' Salary by 10%
UPDATE Employee
SET Salary = Salary * 1.10
WHERE DeptID = (
    SELECT DeptID
    FROM Department
    WHERE DeptName = 'IT'
);

-- Update Employee Designation
UPDATE Employee
SET Designation = 'Senior Software Engineer'
WHERE EmpID = 1;

-- Change Employee Department
UPDATE Employee
SET DeptID = 103
WHERE EmpID = 3;

-- Delete Employees with Salary Below 40000
DELETE FROM Employee
WHERE Salary < 40000;

-- Delete Attendance for a Specific Date
DELETE FROM Attendance
WHERE AttendanceDate = '2026-07-01';

-- Create a View for IT Employees
CREATE VIEW IT_Employees AS
SELECT *
FROM Employee
WHERE DeptID = 103;

-- Display View
SELECT * FROM IT_Employees;

-- Update Data Using View
UPDATE IT_Employees
SET Age = 30
WHERE EmpID = 1;

-- Delete the View
DROP VIEW IT_Employees;

-- Stored Procedure
DELIMITER //

CREATE PROCEDURE ShowEmployees()
BEGIN
    SELECT * FROM Employee;
END //

DELIMITER ;

-- Execute Procedure
CALL ShowEmployees();