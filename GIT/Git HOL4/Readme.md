# Git HOL 4: Merge Conflict Resolution

## Overview

This hands-on demonstrates how to create and resolve merge conflicts in Git when the same file is modified in different branches.

## Objectives

* Understand why merge conflicts occur.
* Learn how to identify and resolve conflicts.
* Perform branch merging after resolving conflicts.

## Tools Required

* Git Bash
* Git Repository
* P4Merge / Merge Tool

## Steps Performed

### 1. Check Repository Status

```bash
git status
```

Verify that the master branch is clean.

### 2. Create Branch

Create and switch to a new branch:

```bash
git branch GitWork
git checkout GitWork
```

Create and modify `hello.xml` file.

### 3. Commit Branch Changes

```bash
git add hello.xml
git commit -m "Updated hello.xml in GitWork branch"
```

### 4. Modify Master Branch

Switch to master:

```bash
git checkout master
```

Create the same `hello.xml` file with different content and commit:

```bash
git add hello.xml
git commit -m "Updated hello.xml in master"
```

### 5. Compare Changes

View differences:

```bash
git diff master GitWork
```

View commit history:

```bash
git log --oneline --graph --decorate --all
```

### 6. Merge and Resolve Conflict

Merge branch:

```bash
git merge GitWork
```

Resolve conflicts manually in `hello.xml`.

Complete merge:

```bash
git add hello.xml
git commit -m "Resolved merge conflict"
```

### 7. Cleanup

Add backup files to `.gitignore`:

```text
*.bak
```

Commit changes:

```bash
git add .gitignore
git commit -m "Added backup files to gitignore"
```

Delete merged branch:

```bash
git branch -d GitWork
```

## Important Commands

| Command        | Purpose                 |
| -------------- | ----------------------- |
| `git branch`   | Create/list branches    |
| `git checkout` | Switch branches         |
| `git merge`    | Merge branches          |
| `git diff`     | Compare changes         |
| `git status`   | Check repository status |
| `git log`      | View commit history     |

## Learning Outcome

Learned how to handle Git merge conflicts, compare branch changes, resolve conflicts, and maintain a clean repository.
