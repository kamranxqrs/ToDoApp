# To-Do App

An interactive To-Do application built using **Java Spring Boot** for the backend and **Vanilla JavaScript + Tailwind CSS** for the frontend. This app allows users to manage tasks efficiently, with support for filtering, editing, and dark mode.

---

## Features

### 1. **Add Tasks**
- Users can add new tasks with a simple input field.
- Tasks are stored in a backend database using **Spring Boot JPA**.

### 2. **Edit Tasks**
- Update the title of an existing task.
- Easy inline editing without reloading the page.

### 3. **Delete Tasks**
- Remove tasks permanently with a single click.

### 4. **Mark Tasks as Completed**
- Toggle task status between **pending** and **completed**.
- Visual feedback with a toggle switch and strikethrough for completed tasks.

### 5. **Filter Tasks**
- **All:** Show all tasks.
- **Completed:** Show only tasks marked as completed.
- **Pending:** Show tasks that are not yet completed.

### 6. **Dark Mode**
- Supports light and dark themes.
- Theme preference is saved in **localStorage** and persists across sessions.
- Toggle easily using the moon/sun button in the header.

### 7. **Responsive Design**
- Built with **Tailwind CSS** for a modern, responsive layout.
- Works well on both desktop and mobile screens.

---
### **Screenshots**
### Screenshots

**Empty List View**  
![Empty List](screenshots<img width="530" height="347" alt="Empty-list" src="https://github.com/user-attachments/assets/6b6696db-83b3-46ca-89b0-622d857d1f24" />)

**With Tasks**  
![With Tasks](screenshots/<img width="507" height="538" alt="Tasks List" src="https://github.com/user-attachments/assets/999300be-9321-467c-bf9f-3e8422e94754" />
)

**Dark Mode**  
![Dark Mode](screenshots/<img width="514" height="543" alt="Dark Mode" src="https://github.com/user-attachments/assets/b25d1868-8091-4c64-abcb-36200b850827" />
)

**Adding a Task**  
![Add Task](screenshots/<img width="507" height="536" alt="Add Task" src="https://github.com/user-attachments/assets/6d3e14ec-5aaf-41f2-a254-d3fb7dc0be6e" />)

**Completed Task**  
![Completed Task](screenshots/<img width="505" height="619" alt="Completed Tasks" src="https://github.com/user-attachments/assets/8b68a619-28bc-4e53-bb69-7b493ef2304f" />)

**Editing a Task**  
![Edit Task](screenshots/<img width="502" height="630" alt="Edit Tasks" src="https://github.com/user-attachments/assets/6b104849-a0b6-4a05-b9af-19ff6957e356" />)

**Filter Pending Tasks**  
![Filter Pending](screenshots/<img width="510" height="446" alt="Filter-Pending" src="https://github.com/user-attachments/assets/de4a7597-1da7-47de-af51-4806a3e2aa64" />)

**Filter Completed Tasks**  
![Filter Completed](screenshots/<img width="505" height="447" alt="Filter-Completed" src="https://github.com/user-attachments/assets/153dca6d-6c29-40b9-aab7-3256ba87f7c1" />)
---

## Tech Stack

- **Backend:** Java, Spring Boot, Spring Data JPA
- **Frontend:** HTML, CSS, JavaScript
- **Styling:** Tailwind CSS
- **Database:** H2 / MySQL (Spring Boot JPA compatible)
- **Version Control:** Git & GitHub

---

## How It Works

1. The backend exposes a REST API (`/tasks`) to handle CRUD operations for tasks.
2. The frontend fetches data from the API and dynamically renders the task list.
3. Users can interact with tasks using buttons for editing, deleting, or marking as completed.
4. The filter buttons allow users to quickly switch between all, completed, and pending tasks.
5. Dark mode toggle changes the UI theme and remembers the user’s preference.

---

## Usage

1. Clone the repository:
   ```bash
   git clone <repo-url>
2. Run the Spring Boot backend:
   ./mvnw spring-boot:run
3. Open the index.html file in your browser.
4. Start adding, editing, deleting, and filtering tasks.
