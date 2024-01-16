### Prepared project
The project contains set of elements related to personnel control area:
- Department and Employee entities
- Additional association attribute - User#department
- Department and Employee standard views (list and detail)

### Task
In this homework you have to set up the application's role model as required below and test restrictions in the running application.

#### 1. Resource roles
Create set of roles in app source code:
- "View employees". Grants access to Employee entity view and read in the application UI (Remember about role scope).
- "Edit employees". Grants full access to Employee CRUD operations in UI.
- "Access to departments". Grants access to Department view and read from UI. Also, grants access to modify exactly one Department's attribute - Department#notes.

#### 2. Row-level role
Create new row-level role in app source code:
- Role name - "Editing employees of own department".
- Politic type - predicate.
- Restricts the ability of creation, editing or deletion for Employees.
  Operations above available only for the same Department users (E.g. - user who wants to edit other user's info must be a member of the same Department)

#### 3. Composite roles
Launch the application and create set of composite roles using Administration UI:
- "Viewer" - assembles ui-minimal with "View employees".
- "Supervisor" - assembles ui-minimal, "Edit employees" and "Access to departments"

#### 4. Roles assignment and testing
"Viewer":
- Create new "viewer" user in running application (remember about password, but keep it simple).
- Assign them with Viewer role.
- Log-in as viewer and check, that accesses and restrictions are working as expected:
    - Employee is accessible for view only

"Supervisor":
- Create new user via running application - "supervisor".
- Assign supervisor with department = "IT"
- Assign them with Supervisor and "Editing employees of own department" roles too.
- Log-in as supervisor and check:
    - Department view screen is accessible
    - Department - Notes - editable attribute(unlike any other attributes)
    - Employee from *own* ("IT" in this case) Department are editable and accessible for view and delete
    - Other departments (not "IT"") employees are accessible for view only

#### Optional
Make some screenshots from opened views for viewer and supervisor users and add them to completed homework.