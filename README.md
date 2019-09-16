# employee_portal
# This is a Employee Portal which has the following features
1) Register new employee with following information
  - Employee Id
  - First Name
  - Last Name
  - Gender
  - Date of Birth
  - Department
2) Get all the employeee order by First Name

Example object for registering an employee:
{
	"employee_id" : 12345,
	"first_name": "Ravi",
	"last_name": "Banakar",
	"gender": "M",
	"date_of_birth": "09/10/1989",
	"department": "075"
}

Run below commands after installing Mongo DB
- use admin
- db.createUser({	user: "admin", pwd: "admin123", roles:[{role: "userAdminAnyDatabase" , db:"admin"}]})
- use EmployeeDB
- db.createUser({user: "user", pwd: "user123", roles:[{role: "readWrite" , db:"EmployeeDB"}]})

Steps to Run the application
- gradlew clean build
- java -jar build\libs\employee_portal-1.0.jar


REST API:
1) Get Employeees
GET http://localhost:8080/employee_portal/employee

2) Register Employee
POST http://localhost:8080/employee_portal/employee

