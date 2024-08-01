# Task Management Web Application

## Overview

<p>This is a task management web application designed to streamline the management of tasks. Built using Java with the Spring Boot framework, JPA for data persistence, Thymeleaf for server-side rendering, and MySQL as the database, this application provides a user-friendly interface to perform  CRUD (Create, Read, Update, Delete) operations on tasks. The application also incorporates validation mechanisms to ensure data integrity.</p>

## Features

<ul>
  <li><strong>Task Management:</strong> Create, read, update, and delete tasks.</li>
  <li><strong>User Management:</strong> Register and log in as an admin to manage tasks.</li>
  <li><strong>Validation:</strong> Ensure accurate and valid data entries.</li>
</ul>

## Images

<p>Here are some screenshots of the application:</p>

<!-- Main Screenshot -->
<img src="Images/Task%20Management%20-%20localhost%2001.png" alt="Task Management Screenshot" style="max-width: 100%; height: auto;"/>

<!-- Add more images as needed -->
## Login
<img src="Images/Task%20Management%20-%20localhost%2002.png" alt="Task Management Screenshot" style="max-width: 100%; height: auto;"/>

## Dashboard
<img src="Images/Task%20Management%20Dashboard%20-%20localhost%2004.png" alt="Dashboard Screenshot" style="max-width: 100%; height: auto;"/>

## Add Task
<img src="Images/Task%20Management%20Add%20Task%20-%20localhost%2005.png" alt="Add Task Screenshot" style="max-width: 100%; height: auto;"/>

## Task List
<img src="Images/Task%20Management%20TaskList%20-%20localhost%2006.png" alt="Task List Screenshot" style="max-width: 100%; height: auto;"/>


<hr>



## Endpoints

<ul>
  <li><strong>Home:</strong> <a href="http://localhost:8080/hometask">http://localhost:8080/hometask</a></li>
  <li><strong>Register Task Admin:</strong> <a href="http://localhost:8080/registertaskadmin">http://localhost:8080/registertaskadmin</a></li>
  <li><strong>Admin Login:</strong> <a href="http://localhost:8080/adminlogin">http://localhost:8080/adminlogin</a></li>
</ul>

<hr>

## Getting Started

<p>To get a local copy of the project up and running, follow these steps:</p>

### Prerequisites

<ul>
  <li><strong>Java 11 or later</strong></li>
  <li><strong>MySQL Database</strong></li>
  <li><strong>Maven</strong></li>
</ul>

### Installation

<ol>
  <li><strong>Clone the repository:</strong>
    <pre><code>git clone https://github.com/prasenjitb1234/taskmanagement01.git</code></pre>
  </li>
  <li><strong>Navigate to the project directory:</strong>
    <pre><code>cd your-repository</code></pre>
  </li>
  <li><strong>Configure the database:</strong>
    <ul>
      <li>Open MySQL Workbench (or your preferred MySQL client).</li>
      <li>Create a new database named <code>taskmanagetry</code>, or you can change the database name in the <code>application.properties</code> file to a name of your choice.</li>
    </ul>
  </li>
  <li><strong>Update the application properties:</strong>
    <p>Open <code>src/main/resources/application.properties</code> and ensure that the database connection settings match your MySQL setup. Update the database name if necessary:</p>
    <pre><code>spring.datasource.url=jdbc:mysql://localhost:3306/taskmanagetry
spring.datasource.username=yourusername
spring.datasource.password=yourpassword</code></pre>
  </li>
  <li><strong>Build and run the application:</strong>
    <pre><code>mvn clean install
mvn spring-boot:run</code></pre>
  </li>
  <li><strong>Access the application:</strong>
    <p>Open your web browser and navigate to the following URLs:</p>
    <ul>
      <li><strong>Home page:</strong> <a href="http://localhost:8080/hometask">http://localhost:8080/hometask</a></li>
      <li><strong>Register Task Admin:</strong> <a href="http://localhost:8080/registertaskadmin">http://localhost:8080/registertaskadmin</a></li>
      <li><strong>Admin Login:</strong> <a href="http://localhost:8080/adminlogin">http://localhost:8080/adminlogin</a></li>
    </ul>
  </li>
</ol>

<hr>





