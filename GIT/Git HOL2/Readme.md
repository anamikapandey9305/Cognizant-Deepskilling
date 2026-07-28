# Git Hands-on Lab: Git Ignore (.gitignore)



## Overview

This hands-on lab demonstrates the usage of the **`.gitignore`** file in Git.

The `.gitignore` file is used to specify files and folders that should not be tracked by Git. It helps developers prevent unwanted files such as log files, temporary files, and generated folders from being added to the repository.

---






# Implementation Steps

## Step 1: Create Git Repository

Create a new directory:

```bash
mkdir GitHOL2
```

Navigate into the directory:

```bash
cd GitHOL2
```

Initialize Git repository:

```bash
git init
```

---

## Step 2: Create .gitignore File

Create a `.gitignore` file:

```bash
touch .gitignore
```

Add the following rules:

```text
*.log
log/
```

---

## Explanation of .gitignore Rules

### Ignore Log Files

```text
*.log
```

This rule ignores all files ending with `.log`.

Examples:

```
error.log
application.log
server.log
```

---

### Ignore Log Folder

```text
log/
```

This rule ignores the complete `log` directory and all files inside it.

Example:

```
log/
 ├── test.log
 └── error.log
```

---

# Step 3: Create Log File

Create a sample log file:

```bash
echo "Sample log file" > application.log
```

---

# Step 4: Create Log Folder

Create a folder named `log`:

```bash
mkdir log
```

Create a file inside the folder:

```bash
echo "Log folder file" > log/test.log
```

---

# Step 5: Check Git Status

Execute:

```bash
git status
```

The `.log` files and `log` folder should not appear as untracked files because they are ignored by `.gitignore`.

---

# Step 6: Add .gitignore File

Add `.gitignore` to the staging area:

```bash
git add .gitignore
```

---

# Step 7: Commit Changes

Commit the changes:

```bash
git commit -m "Added gitignore configuration"
```

---

# Step 8: Verify Repository Status

Check the repository status:

```bash
git status
```

Expected output:

```
nothing to commit, working tree clean
```

This confirms that ignored files are not tracked by Git.

---

# Step 9: Connect Remote Repository

Create a remote repository in GitHub/GitLab.

Add remote repository:

```bash
git remote add origin <repository-url>
```

Verify remote connection:

```bash
git remote -v
```

---

# Step 10: Push Changes

Push the local repository to remote repository:

```bash
git push origin main
```

---

# Git Commands Used

| Command      | Purpose                              |
| ------------ | ------------------------------------ |
| `git init`   | Creates a new Git repository         |
| `git status` | Displays repository status           |
| `git add`    | Adds files to staging area           |
| `git commit` | Saves changes to local repository    |
| `git remote` | Connects local and remote repository |
| `git push`   | Uploads changes to remote repository |

---

# Learning Outcome

After completing this exercise, we understand:

* The purpose of `.gitignore`.
* How to ignore unwanted files and folders.
* How to ignore specific file extensions.
* How to prevent log files from being committed.
* How to verify ignored files using Git status.
