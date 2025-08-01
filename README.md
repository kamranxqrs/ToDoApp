📝 ToDo List App

A clean and beginner-friendly To-Do List web application built using Java Spring Boot (Backend) and HTML/CSS (Frontend).

This app helps users manage their daily tasks efficiently. It follows a clear MVC architecture and interacts with the backend using RESTful APIs.

---

Tech Stack

| Layer       | Technology            |
|-------------|-----------------------|
| Backend     | Java, Spring Boot     |
| Frontend    | HTML, CSS |
| Database    | H2 (in-memory DB)     |
| Tools       | VS Code, Git, GitHub  |

---

Core Functionalities

1. **Add Task**
- Users can enter a task in the input field and click "Add".
- The task is sent to the backend using a POST API.
- It gets stored in the database and instantly appears in the UI.

2. **Display All Tasks**
- On page load, the app fetches all tasks from the backend using a GET API.
- Tasks are dynamically displayed on the screen using JavaScript.

3. **Delete Task**
- Every task has a “Delete” button.
- When clicked, it sends a DELETE request to the backend with the task ID.
- The task gets removed from both the database and the frontend instantly.

4. **Live Updates Without Refresh**
- Tasks update in real-time without refreshing the browser.
- Achieved using `fetch` API and JavaScript DOM manipulation.

5. **Extensible for Future Enhancements**
- Easily extendable to add features like:
  - Edit task
  - Mark as completed
  - Due dates
  - Priority levels

---

How to Run Locally

Backend (Spring Boot)

```bash
# Navigate to your backend folder
cd todoapp

# Run the application using Maven
./mvnw spring-boot:run
