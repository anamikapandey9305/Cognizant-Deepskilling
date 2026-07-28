# Git HOL 5: Clean Up and Push Back to Remote Repository

## Overview

This hands-on explains how to clean the local Git repository, synchronize changes with the remote repository, and push pending updates back to the remote Git repository.

## Objectives

* Understand how to synchronize local and remote repositories.
* Learn the process of pulling and pushing changes.
* Verify changes after updating the remote repository.

## Tools Required

* Git Bash
* Git repository
* GitHub/GitLab remote repository

## Steps Performed

### 1. Check Repository Status

Verify that the master branch is clean:

```bash
git status
```

A clean repository should show:

```text
nothing to commit, working tree clean
```

---

### 2. View Available Branches

List all branches:

```bash
git branch -a
```

---

### 3. Pull Latest Changes

Fetch and update the local master branch from the remote repository:

```bash
git pull origin master
```

---

### 4. Push Pending Changes

Upload local changes to the remote repository:

```bash
git push origin master
```

---

### 5. Verify Remote Repository

Check GitHub/GitLab repository to confirm that the latest changes are reflected.

---

## Important Git Commands

| Command         | Purpose                                  |
| --------------- | ---------------------------------------- |
| `git status`    | Checks repository state                  |
| `git branch -a` | Lists local and remote branches          |
| `git pull`      | Downloads changes from remote repository |
| `git push`      | Uploads changes to remote repository     |

---

## Learning Outcome

Learned how to clean a Git repository, synchronize changes with a remote repository, and push updated code successfully.
