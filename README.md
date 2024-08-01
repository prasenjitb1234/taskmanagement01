# Task Management Web Application

## Overview

<p>This is a task management web application designed to streamline the management of tasks. Built using Java with the Spring Boot framework, JPA for data persistence, Thymeleaf for server-side rendering, and MySQL as the database, this application provides a user-friendly interface to perform basic CRUD (Create, Read, Update, Delete) operations on tasks. The application also incorporates validation mechanisms to ensure data integrity.</p>

## Features

<ul>
  <li><strong>Task Management:</strong> Create, read, update, and delete tasks.</li>
  <li><strong>User Management:</strong> Register and log in as an admin to manage tasks.</li>
  <li><strong>Validation:</strong> Ensure accurate and valid data entries.</li>
</ul>

## Endpoints

<ul>
  <li><strong>Home:</strong> <a href="http://localhost:8080/hometask">http://localhost:8080/hometask</a></li>
  <li><strong>Register Task Admin:</strong> <a href="http://localhost:8080/registertaskadmin">http://localhost:8080/registertaskadmin</a></li>
  <li><strong>Admin Login:</strong> <a href="http://localhost:8080/adminlogin">http://localhost:8080/adminlogin</a></li>
</ul>

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
    <pre><code>git clone https://github.com/yourusername/your-repository.git</code></pre>
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

## Contributing

<p>If you wish to contribute to this project, please fork the repository, create a feature branch, and submit a pull request. Ensure that your contributions are well-documented and tested.</p>

## License

<p>This project is licensed under the MIT License - see the <a href="LICENSE">LICENSE</a> file for details.</p>


