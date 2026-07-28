# Git Hands-on Lab 3: Branching and Merging

## Overview

This hands-on exercise focuses on Git branching and merging concepts. It demonstrates how developers can create separate branches for development work, make changes independently, and combine those changes back into the main branch.

Branching allows multiple developers to work on different features without affecting the stable codebase. Merging helps integrate completed work into the main branch.

---

## Learning Goals

After completing this exercise, you will understand:

* How Git branches are created and managed.
* How to work with multiple branches in a repository.
* How changes are committed separately in different branches.
* How to compare differences between branches.
* How to merge branch changes into the main branch.
* How to remove branches after successful merging.

---

## Tools Required

* Git Bash
* Git version control system
* GitHub/GitLab remote repository
* P4Merge tool for visual comparison of changes

---

# Branching Implementation

## 1. Create a New Branch

Create a new branch named:

```bash
git branch GitNewBranch
```

This creates a separate development branch from the current branch.

---

## 2. View Available Branches

Display all local branches:

```bash
git branch
```

Display local and remote branches:

```bash
git branch -a
```

The `*` symbol indicates the branch currently checked out.

Example:

```text
* master
  GitNewBranch
```

---

## 3. Switch to New Branch

Move to the newly created branch:

```bash
git checkout GitNewBranch
```

or:

```bash
git switch GitNewBranch
```

---

## 4. Add Files in Branch

Create a new file:

```bash
echo "Branching Hands-on Example" > branchfile.txt
```

Check the created file:

```bash
ls
```

---

## 5. Track Changes

Add the file to the staging area:

```bash
git add branchfile.txt
```

---

## 6. Commit Branch Changes

Save changes in the branch:

```bash
git commit -m "Added files in GitNewBranch"
```

---

## 7. Verify Branch Status

Check the current repository status:

```bash
git status
```

Expected result:

```text
nothing to commit, working tree clean
```

---

# Merging Implementation

## 1. Switch Back to Main Branch

Move back to the main branch:

```bash
git checkout master
```

or:

```bash
git switch master
```

---

## 2. Compare Differences Between Branches

View differences between master and GitNewBranch:

```bash
git diff master GitNewBranch
```

This shows the changes available in the source branch.

---

## 3. Compare Changes Using P4Merge

Configure P4Merge as Git comparison tool and view visual differences:

```bash
git difftool master GitNewBranch
```

P4Merge displays file changes using a graphical interface.

---

## 4. Merge Branch with Master

Merge the changes from GitNewBranch into master:

```bash
git merge GitNewBranch
```

The commits and files from the branch become part of the master branch.

---

## 5. View Merge History

Display commit history in graphical format:

```bash
git log --oneline --graph --decorate
```

Example:

```text
*   Merge branch 'GitNewBranch'
|\
| * Added files in GitNewBranch
|/
* Initial commit
```

---

## 6. Delete Branch After Merge

Once merging is completed, remove the unused branch:

```bash
git branch -d GitNewBranch
```

Verify available branches:

```bash
git branch
```

---

# Important Git Commands Used

| Command         | Purpose                                   |
| --------------- | ----------------------------------------- |
| `git branch`    | Creates and displays branches             |
| `git checkout`  | Switches between branches                 |
| `git switch`    | Alternative command for changing branches |
| `git add`       | Adds changes to staging area              |
| `git commit`    | Saves changes in repository               |
| `git diff`      | Shows differences between branches        |
| `git difftool`  | Opens visual comparison tool              |
| `git merge`     | Combines branch changes                   |
| `git log`       | Displays commit history                   |
| `git branch -d` | Deletes merged branch                     |

---

# Repository Workflow

```text
                GitNewBranch
                    |
                    |
        Add files → Commit changes
                    |
                    ↓
Master  ←──────── Merge ────────
                    |
                    ↓
          Delete unused branch
```

---

# Expected Outcome

After completing this exercise:

* A new branch is created successfully.
* Changes are developed independently in the branch.
* Branch changes are merged into the main branch.
* Commit history shows the merge operation.
* The temporary branch is removed after merging.

---

# Learning Summary

This exercise provides practical experience with Git branch management and merging workflows. It demonstrates how teams can safely develop features separately and integrate them into the main codebase using Git commands.
