# Exercise 4: React Component Lifecycle - Blog App

## Overview

This project demonstrates React **Class Components** and the use of **Component Lifecycle Methods**.
In this hands-on exercise, a Blog application is created that fetches posts from an external API and displays them using React.

The main focus of this exercise is understanding:

* Component lifecycle phases
* `constructor()`
* `componentDidMount()`
* `componentDidCatch()`
* State management
* Fetch API integration

---

## Objectives

* Explain the need and benefits of component lifecycle.
* Identify various lifecycle hook methods.
* Understand the sequence of steps involved in rendering a component.
* Implement `componentDidMount()` lifecycle hook.
* Implement `componentDidCatch()` lifecycle hook.

---

## Technologies Used

* React JS
* Vite
* JavaScript (ES6)
* Fetch API
* JSONPlaceholder API

---

## Project Structure

```
blogapp
│
├── src
│   ├── App.jsx
│   ├── main.jsx
│   ├── Post.js
│   └── Posts.jsx
│
├── package.json
└── vite.config.js
```

---

## Components

### Post.js

A JavaScript class used to represent a blog post object.

Properties:

* id
* title
* body

---

### Posts.jsx

A class-based React component responsible for:

* Initializing component state.
* Fetching blog posts from API.
* Updating state with fetched data.
* Displaying posts on the webpage.
* Handling component errors.

---

## Lifecycle Methods Used

### constructor()

The constructor initializes the component state.

Example:

```javascript
this.state = {
    posts: []
};
```

---

### componentDidMount()

This method executes after the component is rendered for the first time.

In this project, it calls:

```javascript
this.loadPosts();
```

to fetch blog posts from the API.

Lifecycle flow:

```
constructor()
      |
      ↓
render()
      |
      ↓
componentDidMount()
      |
      ↓
API Call
      |
      ↓
setState()
      |
      ↓
render()
```

---

### componentDidCatch()

Used to catch errors in the component and display an alert message.

Example:

```javascript
componentDidCatch(error){
    alert(error);
}
```

---

## API Used

Posts are fetched from JSONPlaceholder:

```
https://jsonplaceholder.typicode.com/posts
```

The API returns a list of blog posts containing:

* Post ID
* Title
* Description

---

## Installation and Running the Project

Clone the repository:

```bash
git clone <repository-url>
```

Navigate to the project folder:

```bash
cd blogapp
```

Install dependencies:

```bash
npm install
```

Run the application:

```bash
npm run dev
```

Open the browser:

```
http://localhost:5173/
```

---

## Output

The application displays:

* Blog post titles
* Blog post descriptions

Example:

```
Blog Posts

sunt aut facere repellat provident occaecati

quia et suscipit

ea molestias quasi exercitationem repellat qui ipsa sit aut
```

---

## Learning Outcome

After completing this exercise, we understand:

* How React class components work.
* How lifecycle methods control component behavior.
* How to fetch external data using Fetch API.
* How state updates trigger re-rendering.
* How React handles component errors.
