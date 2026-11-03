# JOBSHEET 6 - CASE STUDY: SELECTION STRUCTURES WITH GIT AND GITHUB

**Student Identity:**
* **Name:** Fathan Nur Hidayat
* **NIM:** 26410702084
* **Class / Student Attendance:** 1I / 12

---

## 1: LEARNING OBJECTIVE

The following are the objectives of the practical work in this chapter:

1. Students are able to solve case studies using basic and nested selection structures
2. Students are able to save and submit their work using Git and GitHub through Visual Studio
Code
3. Students are able to collaborate with classmates using GitHub

---

## 2: PRACTICAL SESSION

### 2.1 Initial Setup (done once on each laptop/PC)

In this worksheet, student case study work will be saved and submitted through GitHub. All Git
processes (clone, add, commit, push, pull, sync) are done by clicking buttons in Visual Studio Code (VS
Code).

### 2.1 Experiment 1: Nested IF to Check Thesis Exam Requirements.

In this section, students are required to apply a *Nested IF* condition to check thesis exam requirements.

#### 2.1.1 Program Code Java
```java

package Week6;
import java.util.Scanner;

public class NestedThesisExam12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        String message;
        System.out.print("Has the student cleared all penalties? (Yes/No): ");
        String noPenalty = input.nextLine().trim();
        
        System.out.print("Enter the number of guidance sessions with Supervisor 1: ");
        int guidanceCount1 = input.nextInt();
        System.out.print("Enter the number of guidance sessions with Supervisor 2: ");
        int guidanceCount2 = input.nextInt();

        if(noPenalty.equalsIgnoreCase("Yes")) {
            if(guidanceCount1 >= 8 && guidanceCount2 >= 4) {
                message = "All requirements met. The student may register for the thesis exam";
            }else if (guidanceCount1 < 8 && guidanceCount2 < 4) {
                message = "Failed! Guidance sessions with Supervisor 1 are below 8 and Supervisor 2 are below 4";
            }else if (guidanceCount1 < 8) {
                message = "Failed! Guidance sessions with Supervisor 1 have not reached 8";
            }else {
                message = "Failed! Guidance sessions with Supervisor 2 have not reached 4";
            }
        }else {
            message = "Failed! The student still has an outstanding penalty";
        }
        System.out.println(message);
        input.close();
    }
}

```

#### 2.1.2 Execution Result / Screenshot Output
The following is an example of the *output* display after the program is run.:

![Experiment1Output](/Experiment1Output.png)

#### 2.1.3 Answers to Questions / Reflection Questions
* **Question 1:** What happens if the student answers "No" to the penalty-clearance question? Why?
  * **Answer:** The process will still proceed to the guidance session, even if you enter the guidance session numbers, the result will still lead to the 'else' section, because the guidance session conditions are only checked when the penalty answer is 'Yes'.
* **Question 2:** Explain the meaning of the following code snippet!
  if (guidanceCount1 >= 8 && guidanceCount2 >= 4) {
  * **Answer:** To check 2 conditions at the same time. If both requirements are met, the code inside the { } will be executed. Both conditions must be True.
* **Question 3:** Describe the full flow of checking the student's requirements from start to finish. Explain
step by step for every condition!
  * **Answer:** The first one, we must enter the penalties, after we enter 'Yes', we are directed to the next statement. We must input the number of guidance session with supervisor 1 & 2.
  * If the requirements of guidance session with supervisor 1 & 2 met, the output will display "All requirements met. The student may register for the thesis exam".
  * If the requirements of guidance sessions with Supervisor 1 are below 8 and Supervisor 2 are below 4, the output will display "Failed! Guidance sessions with Supervisor 1 are below 8 and Supervisor 2 are below 4"
  * If only the required number of guidance sessions with Supervisor 2 is met, but not with Supervisor 1, then the output will display "Failed! Guidance sessions with Supervisor 1 have not reached 8"
  * If only the required number of guidance sessions with Supervisor 1 is met, but not with Supervisor 2, then the output will display "Failed! Guidance sessions with Supervisor 2 have not reached 4"
  * Otherwise if the student hasn't cleared all the penalties, the output will display "Failed! The student still has an outstanding penalty" 
---

### 2.2 Experiment 2: Logical Operators to Determine Campus WiFi Access

Campus WiFi may be used by students or lecturers whose accounts are not blocked. Access is granted if the user is a student or a lecturer, **and** the account is not blocked. This experiment practices the logical operators && (AND), || (OR), and ! (NOT).

#### 2.2.1 Program Code Java
```java

package Week6;
import java.util.Scanner;

public class LogicalOperatorWifi12 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     boolean isStudent;
     boolean isLecturer;
     boolean isBlocked;

     System.out.println("--- Wifi Access System ---");
     System.out.print("Is the user a student? (true/false): ");
     isStudent = input.nextBoolean();
     System.out.print("Is the user a lecturer? (true/false): ");
     isLecturer = input.nextBoolean();
     System.out.print("Is the account currently blocked? (true/false): ");
     isBlocked = input.nextBoolean();

     if ((isStudent || isLecturer) && !isBlocked) {
        System.out.println("Wifi Access Granted");
     } else {
        System.out.println("Wifi Access Denied");
     }
     input.close();
 }
}
```
#### 2.2.2 Execution Result / Screenshot Output
The following is an example of the *output* display after the program is run.:
![Experiment2Output](/Experiment2OutputJobsheet6.png)

#### 2.2.3 Answers to Questions / Reflection Questions
* **Question 1:** Explain the function of the ||, &&, and ! operators in the condition above
  * **Answer:** || (OR) is true if at least one side is true, so the user only needs to be a student or a lecturer. && (AND) is true only if both sides are true, so the user must be a student/lecturer **and** have an account that is not blocked. ! (NOT) reverses a boolean value, so !isBlocked is true when the account is not blocked.
* **Question 2:** Why can a lecturer still get access when isStudent = false?
  * **Answer:** Because (isStudent || isLecturer) uses OR. When isStudent is false but isLecturer is true, the OR expression is still true. If the account is not blocked, !isBlocked is also true, so the full condition is true (see Test 2).
* **Question 3:** Change || to &&. Run the program again using test data 1 and 2. What happens, and why?
  * **Answer:** The condition becomes (isStudent && isLecturer) && !isBlocked. For Test 1 (true, false, false) and Test 2 (false, true, false), the result changes to "WiFi access denied", because the user would have to be a student **and** a lecturer at the same time, and in both tests only one of the two is true.
* **Question 4:** In the expression isStudent || isLecturer, when does isLecturer not need to be evaluated?
  * **Answer:** When isStudent is true. With short-circuit evaluation, || stops as soon as the left side is true, because the result must be true no matter what isLecturer is. The right side is evaluated only when isStudent is false.
* **Question 5:** In the expression (isStudent || isLecturer) && !isBlocked, when does !isBlocked not need to be evaluated?
  * **Answer:** When (isStudent || isLecturer) is false, meaning the user is neither a student nor a lecturer. With short-circuit evaluation, && stops as soon as the left side is false, because the result must be false regardless of !isBlocked.

---

### 2.3 Experiment 3: Nested IF and Logical Operators to Determine Laboratory Access
A student may use the laboratory outside class hours if their status is active and they are not under sanction. If this is met, access is granted when the student has lecturer permission or is a lab assistant. This case combines nested selection with logical operators.

#### 2.2.1 Program Code Java
```java
package Week6;
import java.util.Scanner;

public class NestedLabAcces12 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    boolean isActiveStudent;
    boolean isSanctioned;
    boolean hasLecturerPermit;
    boolean isLabAssistant;

    System.out.println("--- Lab Access System ---");
    System.out.print("Is the user an active student? (true/false): ");
    isActiveStudent = input.nextBoolean();
    System.out.print("Is the user sanctioned? (true/false): ");
    isSanctioned = input.nextBoolean();
    System.out.print("Does the user have a lecturer permit? (true/false): ");
    hasLecturerPermit = input.nextBoolean();
    System.out.print("Is the user a lab assistant? (true/false): ");
    isLabAssistant = input.nextBoolean();

    if (isActiveStudent && !isSanctioned) {
        if (hasLecturerPermit || isLabAssistant) {
            System.out.println("Laboratory Access Granted");
        }else {
            System.out.println("Access Denied: lecturer permission or lab assistant status required.");
        }
    } else {
        System.out.println("Access Denied: Student status does not meet the requirements.");
    }
    
    input.close();
  }
}
```

#### 2.3.2 Execution Result / Screenshot Output
The following is an example of the *output* display after the program is run.:
![Experimen31Output](/Experiment3OutputJobsheer5.png)

#### 2.2.3 Answers to Questions / Reflection Questions
* **Question 1:** Why is the check hasLecturerPermit || isLabAssistant placed inside the first IF?
  * **Answer:** It is only meaningful for students who already passed the basic requirement (active and not sanctioned). A student who fails the first check must be denied regardless of permission, so there is no reason to evaluate the second check for them.
* **Question 2:** Explain the function of the &&, ||, and ! operators in this program.
  * **Answer:** && combines two requirements in the first IF: the student must be active **and** not sanctioned. ! reverses isSanctioned, so !isSanctioned is true when the student has no sanction. || in the second IF grants access when at least one of hasLecturerPermit or isLabAssistant is true.
* **Question 3:** Can the access requirement be written as a single condition: isActiveStudent && !isSanctioned && (hasLecturerPermit || isLabAssistant)? Explain whether the final access decision stays the same.
  * **Answer:** Yes. The final decision (granted or denied) stays exactly the same, because access is granted only when all three parts are true. The difference is that a single IF has only one else, so it cannot tell the user which requirement failed.
* **Question 4:** What is the advantage of using Nested IF in this case, compared to a single IF, if the system needs to show different reasons for denial?
  * **Answer:** Nested IF separates the checks into levels, and each level has its own else block. This lets the program print a specific reason: "student status does not meet the requirement" at the first level, or "lecturer permission or lab assistant status required" at the second level. It is also easier to read and extend.
* **Question 5:** Create one input combination that causes access to be denied at the first level, and one that causes it to be denied at the second level.
  * **Answer:**
    **First level:** isActiveStudent = true, isSanctioned = true, hasLecturerPermit = true, isLabAssistant = true gives "Access denied: student status does not meet the requirement".
    **Second level:** isActiveStudent = true, isSanctioned = false, hasLecturerPermit = false, isLabAssistant = false gives "Access denied: lecturer permission or lab assistant status required".
---

## 3: ASSIGNMENT

The following is a list of tasks to be performed in this Jobsheet:

- [x] **Task 1:** Implement the Flowchart from Exercise 2, Week 6. Bookstore discount system using Nested IF and logical operators 
- [x] **Task 2:** Lab-assistant candidate selection system using nested selection and logical operators.

### 3.1 Implementation Task Code

#### Tugas 1: Bookstore Discount System
#### 3.1.1 Program Code Java
```java
package Week6;
import java.util.Scanner;

public class Task1BookStoreDiscount12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is the customer a member? (true/false): ");
        boolean isMember = input.nextBoolean();
        System.out.print("Total purchase (Rp): ");
        int total = input.nextInt();

        int discountPercent;
        if (isMember) {
            if (total >= 200000) {
                discountPercent = 20;
            } else if (total >= 100000) {
                discountPercent = 10;
            } else {
                discountPercent = 5;
            }
        } else {
            if (total >= 200000) {
                discountPercent = 10;
            } else if (total >= 100000) {
                discountPercent = 5;
            } else {
                discountPercent = 0;
            }
        }

        double discount = total * discountPercent / 100.0;
        double finalPrice = total - discount;
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Discount amount: Rp" + (long) discount);
        System.out.println("Total Payment: Rp" + (long) finalPrice);

        input.close();
    }
}
```
#### 3.1.2 Execution Result / Screenshot Output
![Task1OutputBookStore](/Task1OutputBookStore.png)

#### Task 2: Lab Assistant Candidate Selection

Rules: (a) the student must be active and not under academic sanction; (b) the student must have a Basic Programming grade of at least 80, or a programming competency certificate; (c) the student is accepted if the interview score is at least 75; (d) the program shows the reason if the student fails at any stage.

#### 3.2.1 Program Code Java
```java
package Week6;
import java.util.Scanner;

public class Task2AssistanceSelection12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is the student active? (true/false): ");
        boolean isActive = input.nextBoolean();
        System.out.print("Is the student under academic sanction? (true/false): ");
        boolean isSanctioned = input.nextBoolean();

        if (isActive && !isSanctioned) {
            System.out.print("Grade in Basic Programming: ");
            int grade = input.nextInt();
            System.out.print("Has a programming competency certificate? (true/false): ");
            boolean hasCertificate = input.nextBoolean();

            if (grade >= 80 || hasCertificate) {
                System.out.print("Interview score: ");
                int interviewScore = input.nextInt();

                if (interviewScore >= 75) {
                    System.out.println("Accepted as lab assistant");
                } else {
                    System.out.println("Not accepted: interview score is below 75");
                }
            } else {
                System.out.println("Failed: grade is below 80 and no programming competency certificate");
            }
        } else {
            System.out.println("Failed: student is not active or is under academic sanction");
        }
        input.close();
    }
}
```

#### 3.1.2 Execution Result / Screenshot Output
![Task2OutputLabAssistance](/Task2OutputLabAssistance.png)

---

## 4: CONCLUSION

Nested IF evaluates conditions step by step, where the next condition is checked only if the previous one is satisfied. Each level can also provide a specific reason when a condition fails. The && operator requires all conditions to be true, || needs at least one condition to be true, while ! changes a boolean value to its opposite. Short-circuit evaluation stops checking once the final result is already known. By combining nested selection with logical operators, programs can be more organized and provide more specific output messages.
