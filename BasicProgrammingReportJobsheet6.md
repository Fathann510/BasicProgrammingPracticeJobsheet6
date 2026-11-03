# JOBSHEET 6 - CASE STUDY: SELECTION STRUCTURES WITH GIT AND GITHUB

## Student Identity

- Name: Fathan Nur Hidayat
- Student ID (NIM): 264107020084
- Class / No. Attendance : TI-1I / 30

---

# 1. Objectives

The objectives of this practicum are:

1. Students can solve case studies using basic and nested selection structures.
2. Students can save and submit their work using Git and GitHub through Visual Studio Code.
3. Students can collaborate with classmates using GitHub.

---

# 2. Labs Activities

## 2.1 Initial Setup (Git and GitHub)

This setup is done once on each laptop or PC. The work in this jobsheet is saved and submitted through GitHub. The Git steps (clone, add, commit, push, pull, sync) are done by clicking buttons in Visual Studio Code. Typing commands is only needed once, to set the Git identity.

### 2.1.1 Steps Done

1. Create a GitHub account at github.com, or sign in if the account already exists. The username and email of this account are used in step 4. (To be completed - write the GitHub username here.)
2. Download and install Git from git-scm.com/downloads. The default settings are used, so Git Credential Manager is included and no token is needed.
3. If Visual Studio Code was open before Git was installed, close it and open it again so Git is detected.
4. In Visual Studio Code, open the Terminal menu and choose New Terminal. Then type these two lines one at a time and press Enter after each line. The text in the quotation marks is replaced with my own GitHub username and email.

text
git config --global user.name "Fathann510"
git config --global user.email "fathannh03@gmail.com"


If no message appears after pressing Enter, the setup is successful. This step does not need to be repeated on the same laptop.

### 2.1.2 Running Results / Output Screenshot

![PracticalSession2.1Result](/PracticalSession2.1Result.png)

---

## 2.2 Experiment 1: Setting Up a Repository

This experiment creates a repository on GitHub, copies it to the computer (clone), and sends the first file to GitHub. The repository name follows the job sheet, PraktikumDaspro plus the attendance number, so the name is PraktikumDaspro30.

### 2.2.1 Steps Done

1. On GitHub, click the + button and choose New repository. The repository name is PraktikumDaspro30, the visibility is Public, and Add README stays Off. Then click Create repository.
2. On the Quick setup page, make sure HTTPS is selected, then click the Copy icon to copy the repository URL.
3. In Visual Studio Code, click Clone Git Repository on the Welcome page, paste the URL, and choose Clone from URL.
4. Choose the destination folder, click Select as Repository Destination, then click Open. If Visual Studio Code asks whether I trust the authors, click Yes, I trust the authors.
5. Create a new file named README.md with the New File icon in the Explorer panel. The file contains one sentence and my personal information (name, student ID, and class). After saving, the file shows the letter U (Untracked).
6. Open Source Control and click the + icon (Stage Changes) next to README.md. This is the Add step. The status changes to A (Added).
7. Write a commit message, for example "Added identity information to README", then click Commit. The commit saves the change in the local repository on my computer.
8. Click the ... icon (More Actions) and choose Push, or click the Publish Branch button. The first time, a GitHub login appears in the browser, and I need to authorize it.
9. Refresh the repository page on GitHub. The README.md file should now be there.

README.md content:

text
Ini adalah repository pertama saya
Nama : Wildan Arya Indradiansyah
NIM : 264107020257
Kelas : TI-1I


The job sheet gives a note for a push error. If Push fails with a Permission denied message or a 403 error, another GitHub account may still be logged in on the computer. The fix is to open Start, then Credential Manager, then Windows Credentials, remove git:https://github.com, and push again. (To be completed - write here if this error happened.)

### 2.2.2 Running Results / Output Screenshot

> Insert the screenshots here: the repository creation page, the cloned folder in Visual Studio Code, the README.md file with status U, the commit, and the GitHub page showing README.md. (To be completed - no screenshots have been provided yet.)

Repository link: (To be completed - write the GitHub link of PraktikumDaspro30 here.)

---

## 2.3 Experiment 2: Case Study 1 - Basic Selection

Kedai Kopi Senja sells Kopi Susu Gula Aren for Rp18,000 per cup. A purchase of at least Rp100,000 gets a 10% discount. The program reads the number of cups and the money paid, then calculates the total price, the discount, the total to pay, and the change. If the money is not enough, the program shows how much is still missing. The program follows the flowchart in the job sheet, so the variable names are the same as in the flowchart.

### 2.3.1 Java Program Code

The file is StudiKasus130.java, inside the repository PraktikumDaspro30. The job sheet did not come with a finished code, so this code was written from the flowchart.

```java
import java.util.Scanner;

public class StudiKasus130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup  : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar  : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalBayar = totalHarga - diskon;

        System.out.println("Total harga          : Rp " + totalHarga);
        System.out.println("Diskon               : Rp " + diskon);
        System.out.println("Total bayar          : Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian            : Rp " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp " + kurang);
        }
        sc.close();
    }
}
```

The program has two if statements. The first one checks whether totalHarga is at least 100000. If it is true, diskon becomes 10% of totalHarga. If it is false, diskon stays 0 from the line before. The second one is an if-else. It checks whether uangBayar is enough for totalBayar. If it is enough, the program shows kembalian. If not, the program shows kurang. The variable hargaPerCup is fixed at 18000, and the other variables get their values from the input or from calculations. All of them are int, because the prices are whole rupiah.

For Git, the job sheet asks for at least 2 commits. The example messages in the job sheet are "SK1: input and variable declaration" for the first commit (after the input and variables are finished) and "SK1: discount and change logic" for the second commit (after the selection logic is finished). After that, the code is pushed. (To be completed - write the real commit messages and the GitHub link here.)

### 2.3.2 Running Results / Output Screenshot

> Insert the screenshot of the program output here. (To be completed - no screenshot has been provided yet.)

Expected output (example only, taken from the job sheet; not yet confirmed by running the program). The number after the colon is the input:

text
Masukkan jumlah cup  : 3
Masukkan uang bayar  : 50000
Total harga          : Rp 54000
Diskon               : Rp 0
Total bayar          : Rp 54000
Uang tidak cukup, kurang Rp 4000


Expected output for a purchase with a discount (example only, calculated from the code; not yet confirmed by running the program). Six cups cost 6 x 18000 = 108000, which is at least 100000, so the discount is 10800:

text
Masukkan jumlah cup  : 6
Masukkan uang bayar  : 100000
Total harga          : Rp 108000
Diskon               : Rp 10800
Total bayar          : Rp 97200
Kembalian            : Rp 2800


---

## 2.4 Experiment 3: Case Study 2 - Nested Selection

The Student Affairs Division of Politeknik Negeri Malang gives award funds to students based on the type of activity. For competitions by BELMAWA, BAKORMA, or Mandiri, only the 1st, 2nd, and 3rd place winners get funds. For PKM, funds are given when the proposal is approved for funding. Other activities do not get funds. Students who meet one of the first two conditions must also upload 4 documents. If fewer than 4 documents are uploaded, the data is incomplete and no funds are given. The program only asks for the data that is needed, and it uses nested if with a maximum depth of 3 levels.

### 2.4.1 Java Program Code

The file is StudiKasus230.java, inside the same repository. The job sheet did not come with a finished code, so this code was written from the job sheet description.

```java
import java.util.Scanner;

public class StudiKasus230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = sc.nextLine();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {
            // competition
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            int peringkat = sc.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang
                        + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status : Berhak menerima dana penghargaan (juara "
                            + peringkat + ").");
                } else {
                    System.out.println("Status : Tidak berhak menerima dana penghargaan "
                            + "(hanya untuk juara 1, 2, atau 3).");
                }
            }
        } else if (jenis.equalsIgnoreCase("PKM")) {
            // student creativity program
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = disetujui, 0 = tidak) : ");
            int statusPkm = sc.nextInt();

            if (jumlahDokumen < 4) {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang
                        + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (statusPkm == 1) {
                    System.out.println("Status : Berhak menerima dana penghargaan "
                            + "(proposal PKM disetujui didanai).");
                } else {
                    System.out.println("Status : Tidak berhak menerima dana penghargaan "
                            + "(proposal PKM tidak disetujui didanai).");
                }
            }
        } else {
            // other activity
            System.out.println("Status : Tidak berhak menerima dana penghargaan "
                    + "(jenis kegiatan tidak termasuk dalam ketentuan).");
        }
        sc.close();
    }
}
```

The first if checks whether the activity is a competition (BELMAWA, BAKORMA, or Mandiri). The method equalsIgnoreCase is used, so the input is not case-sensitive. The else if checks PKM, and the last else covers Other, for example Lainnya. This is level 1.

Inside the competition branch and the PKM branch, the second level checks the number of documents. If jumlahDokumen is less than 4, the program counts the missing documents (4 - jumlahDokumen) and shows that the data is incomplete. If the documents are complete, the third level checks the real condition. For a competition, peringkat must be from 1 to 3. For PKM, statusPkm must be 1. So the deepest nesting is 3 levels, as the job sheet requires.

The program only asks for the data that is needed. The rank is only asked for competitions, the funding status is only asked for PKM, and the Other branch does not ask for any more data. In the Other branch the number of documents is not asked, because documents only matter for the two types that can get funds.

For Git, the job sheet asks for at least 2 commits. The example messages in the job sheet are "SK2: competition branch" for the first commit and "SK2: PKM and other branches" for the second commit. After that, the code is pushed. (To be completed - write the real commit messages and the GitHub link here.)

### 2.4.2 Running Results / Output Screenshot

> Insert the screenshots of the test results here (one for each test case below). (To be completed - no screenshot has been provided yet.)

Expected output for the example in the job sheet (example only; not yet confirmed by running the program):

text
Nama mahasiswa : Dori
Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : bakorma
Jumlah dokumen : 3
Peringkat juara : 1
Status : Dokumen tidak lengkap (kurang 1 dokumen). Dana penghargaan tidak diberikan.


Expected output for the other test data in the job sheet (example only, calculated from the code; the sentences follow my code, so the wording is not exactly the same as in the job sheet):

text
Nama mahasiswa : (any name)
Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : Mandiri
Jumlah dokumen : 4
Peringkat juara : 0
Status : Tidak berhak menerima dana penghargaan (hanya untuk juara 1, 2, atau 3).


text
Nama mahasiswa : (any name)
Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : pkm
Jumlah dokumen : 4
Status pendanaan PKM (1 = disetujui, 0 = tidak) : 1
Status : Berhak menerima dana penghargaan (proposal PKM disetujui didanai).


text
Nama mahasiswa : (any name)
Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : Lainnya
Status : Tidak berhak menerima dana penghargaan (jenis kegiatan tidak termasuk dalam ketentuan).


---

## 2.5 Experiment 4: Cross-Testing a Classmate's Program

This experiment is done in pairs and in turns. One student is the repository owner and the other is the invited student. The invited student tests the program of the owner with at least 3 test cases and writes the results in README.md. Then the owner pulls the changes and checks the results.

### 2.5.1 Steps Done

Repository owner:

1. On the repository page on GitHub, go to Settings, then Collaborators, then Add people. Type the classmate's GitHub username and click Add to repository.
2. After the classmate has tested the program, pull the changes (... then Pull) or click Sync Changes. Open README.md and check the test results. If a result is wrong, fix the program, then Commit and Push.
3. On GitHub, click the Commits link and make sure the commit of the classmate is in the commit history.

Invited student:

1. Open the invitation email from GitHub and click Accept invitation.
2. Open the classmate's repository page, click the green Code button, choose the HTTPS tab, and copy the URL. Then clone the repository like in Experiment 1.
3. Run StudiKasus2 with at least 3 test cases. Write the results at the bottom of README.md in the format below, then Add and Commit and Push, for example with the message "Test results for SK2 by (name)".

The job sheet gives a note: always Pull before starting work on a shared repository, and the owner should not edit README.md before pulling, so there is no conflict when two people change the same file.

(To be completed - write the GitHub username of the classmate, who tested whose program, and the date.)

### 2.5.2 Running Results / Output Screenshot

> Insert the screenshots here: the collaborator invitation, the clone of the classmate's repository, the test results in README.md, and the commit history. (To be completed - no screenshots have been provided yet.)

The test result format from the job sheet is below. The test data comes from the job sheet. The Output and Correct columns can only be filled after the program is really tested, so they are left open.

text
Test Results for Case Study 2 by <Name>
| No | Type    | Documents | Rank/Funding | Output                                    | Correct? |
|----|---------|-----------|--------------|-------------------------------------------|----------|
| 1  | BAKORMA | 3         | 1            | (to be completed)                         | (to be completed) |
| 2  | Mandiri | 4         | 0            | (to be completed)                         | (to be completed) |
| 3  | pkm     | 4         | 1            | (to be completed)                         | (to be completed) |
| 4  | Lainnya | 4         | not asked    | (to be completed)                         | (to be completed) |


Expected output for each test (from the job sheet, example only): test 1 is documents incomplete with 1 document missing and no award funds; test 2 is not eligible because only 1st, 2nd, and 3rd place get funds; test 3 is eligible because the PKM proposal is approved; test 4 is not eligible because the activity type is not covered by the requirements.