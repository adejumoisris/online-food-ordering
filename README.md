# Online Food Ordering System

## Table of Contents
1. [Project Overview](#project-overview)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Installation](#installation)
5. [Usage](#usage)
6. [Contributing](#contributing)
7. [License](#license)

---

## Project Overview
The Online Food Ordering System is a web-based application that allows users to browse restaurants, explore menus, and order food online. The system aims to streamline the food ordering process for both customers and restaurant owners, providing a seamless experience from order placement to delivery.

---

## Features
- **User Registration & Authentication**
  - Secure login and registration for customers and restaurant admins.

- **Browse Restaurants & Menus**
  - Explore a list of restaurants, view their menus, and select desired food items.

- **Search & Filter**
  - Search restaurants by name, cuisine, or location and apply filters to refine results.

- **Order Placement**
  - Add items to a cart, view the order summary, and proceed to checkout.

- **Order Tracking**
  - Real-time updates on order status from "Preparing" to "Delivered."

- **Admin Panel**
  - Manage restaurant details, menu items, and order processing.

---

## Technologies Used
- **Frontend**: React, HTML, CSS, JavaScript
- **Backend**: Spring Boot (Java), RESTful APIs
- **Database**: MySQL
- **Authentication**: JWT (JSON Web Token)
- **Build Tool**: Maven
- **Testing**: JUnit, Postman
- **Version Control**: Git

---

## Installation

### Prerequisites
- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Node.js](https://nodejs.org/)
- [MySQL](https://www.mysql.com/)
- [Maven](https://maven.apache.org/)

### Steps
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/online-food-ordering.git
   cd online-food-ordering
   ```

2. **Set Up Backend:**
   - Navigate to the `backend` folder.
   - Update the `application.properties` file with your MySQL credentials.
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/food_ordering
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```
   - Run the following command:
   ```bash
   mvn spring-boot:run
   ```

3. **Set Up Frontend:**
   - Navigate to the `frontend` folder.
   - Install dependencies and start the development server:
   ```bash
   npm install
   npm start
   ```

4. **Access the Application:**
   - Open your browser and navigate to `http://localhost:3000`.

---

## Usage
### Customer
1. Register or log in to your account.
2. Browse restaurants and select menu items to add to your cart.
3. Proceed to checkout and confirm your order.
4. Track your order in real-time.

### Restaurant Admin
1. Log in to the admin panel.
2. Add or update restaurant details and menus.
3. Manage incoming orders and update their statuses.

---

## Contributing
We welcome contributions to improve this project! To contribute:
1. Fork the repository.
2. Create a new branch for your feature or bug fix:
   ```bash
   git checkout -b feature-name
   ```
3. Commit your changes:
   ```bash
   git commit -m "Description of changes"
   ```
4. Push to your branch and create a pull request.

---

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
