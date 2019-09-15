# employee_portal
# This is a Employee Portal which has the following features
1) Register new employee with following information
  - Employee Id
  - First Name
  - Last Name
  - Gender
  - Date of Birth
  - Department
2) Get all the employees in Department, Employee Name order

Example object for registering an employee:
{
	"employee_id" : 12345,
	"first_name": "Ravi",
	"last_name": "Banakar",
	"gender": "M",
	"date_of_birth": "09/10/1989",
	"department": "075"
}

Steps to Run the application
- gradlew clean build
- java -jar build\libs\employee_portal-1.0.jar
