# Address Book Tests in JUnit

This open source code is for use in introductory Selenium workshops.

See [LICENSE](https://github.com/sauce-examples/address_book_junit/LICENSE.md) file for details.

<br />

## Description

Different workshops and lessons will be managed by different branches. To ensure you are getting
the correct code for your workshop, go to the [Releases Page](https://github.com/titusfortner/address_book_junit/releases/)
and download the tutorial zip file that corresponds with your workshop.

<br />

## Setting Up Your Environment

### Install Git

[Git](https://git-scm.com/doc) is a version control system that lets you check out code from a repository, 
work with that code on your own branch, and then merge that code with any changes that have been made by other developers. 
Git is an essential tool for distributed development teams, and is a critical component of the continuous 
integration/continuous development toolchain.

#### MacOSX ([screen cast](https://youtu.be/N0cNxpbWUXs)):

1. Go to https://git-scm.com/downloads.
2. Under **Downloads**, click **Mac OS X**.
3. When the download completes, double-click the `.dmg` file open the installer package.
4. Double-click the installer package to begin the installation.
    > *Security Warning*
    >
    > You may see a warning message that the package can't be opened because it's not from a recognized developer. 
    If this happens, go to System Preferences > Security and Privacy Settings, and click Open Anyway.
5. Click **Continue** for the installation, and enter your local password to authorize the installation.

#### Windows ([screen cast](https://youtu.be/rQX7-Xataa0)):

1. Go to https://git-scm.com/downloads
2. Under **Downloads**, click on **Windows**.
3. When the dialog opens asking if you want to allow the app to make changes to your device, click Yes.
4. Follow the steps in the setup wizard to complete the installation. You should accept all the default settings.
<br />

### Install IntelliJ

[IntelliJ](https://www.jetbrains.com/idea/) is an integrated development environment that incorporates several tools for developing and running Java code. You will be using IntelliJ to write and edit the sample Selenium scripts used in the exercises.  For these exercises you only need to download the free Community edition.

#### MacOSX ([screen cast](https://youtu.be/XyVyk5u2eac)):

1. Go to https://www.jetbrains.com/idea/
2. Click **Download**.
3. On the **Downloads** page, select **macOS**.
4. Under **Community**, click **Download**.
5. When the download completes, double-click the .dmg file open the installer package.
6. Double-click the installer package to begin the installation.
7. Drag and drop the IntelliJ icon into the **Applications** folder.

#### Windows ([screen cast](https://youtu.be/8ysBHlJN57g)):

1. Go to https://www.jetbrains.com/idea/
2. Click **Download**.
3. On the **Downloads** page, select **Windows**.
4. Under **Community**, click **Download**.
5. When the download completes, double-click the `.exe` file to launch the installation wizard. You should accept all the default settings.
<br />

### Install the Java Developer's Kit

#### MacOSX ([screen cast](https://youtu.be/QIPv7oiWZR4)):

1. Go to http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2. Under **Java SE Development Kit 8u161**, select **Accept License Agreement**.
3. Click the download link for **Mac OS**.
4. When the download completes, double-click the `.dmg` file open the installer package.
Double-click the installer package to begin the installation.

#### Windows ([screen cast](https://youtu.be/5Vww6KUq5Mk)):

1. Go to http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
2. Under **Java SE Development Kit 8u161**, select **Accept License Agreement**.
3. Click the download link for **Windows x64**.
4. When the download completes, double-click the `.exe` file open the installer package.
5. Double-click the installer package to begin the installation. You should accept all the default settings.
<br />

### Set Up This Project in IntelliJ

#### MacOSX ([screen cast](https://youtu.be/HC02K5hEV4o)):

1. Downloading the Project Files
    * Go to https://github.com/sauce-examples/address_book_junit/releases.
    * Download and extract `tutorial_mac.zip`.
        > You can save the zip file to any directory you want, including Downloads. You will just need to remember the directory when you want to open the tutorial files in IntelliJ. 

2. Opening the Project in IntelliJ
    * Launch IntelliJ.
    * Click **Open**.
    * Browse to the **address_book_junit** directory, and click **Open**.
    * Click the **Sidebars** icon in the lower left corner of IntelliJ to open the sidebars.
    * Open the **Project** sidebar and select the **address_book_junit** directory.
    * In the **src** directory, select **SeleniumExamples**.
    * In the Project sidebar, expand the directories **address_book_junit > lib > src > test**.
    * Select **SeleniumExamples**, and a sample file will load into the editor window.

3. Configure the Project SDK

    When the file loads, you'll see a notification at the top of the file that the SDK for the project is not defined.
    * Click **Setup SDK**, and then **Configure**.
    * Click **+** in the **Configure SDK** dialog.
    * Select **Java SDK**.
    * Browse to the directory where you installed the Java SDK and click **OK**. IntelliJ will load all the `.jar` files for the SDK. 
    * Click **OK** when the installation completes.

4. Confirm that Selenium is Running
    * In the file list on the left, right-click on the **SeleniumExamples** file.
    * Select **Run 'SeleniumExamples'**.

You should see the code begin to build, and then a console window will open. You should see that the driver opens and closes a browser, confirming that the Selenium environment is running on your local machine.


#### Windows ([screen cast](https://youtu.be/uATRmXlhn10)):

1. Downloading the Project Files
    * Go to https://github.com/sauce-examples/address_book_junit/releases.
    * Download and extract `tutorial_windows.zip`.

2. Opening the Project in IntelliJ

    * Launch IntelliJ.
    * Click **Open**.
    * Browse to the **projects > address_book_junit** directory you created, and click **OK**.
    * Click the **Sidebars** icon in the lower left corner of IntelliJ to open the sidebars.
    * Open the **Project** sidebar.
    * In the Project sidebar, expand the directories **address_book_junit > lib > src > test**.
    * Select **SeleniumExamples**, and a sample file will load into the editor window.

3. Configure the Project SDK

    When the file loads, you'll see a notification that the SDK for the project is not defined.
    * Click **Setup SDK**, and then **Configure**.
    * Click + in the **Configure SDK** dialog.
    * Select **Java SDK**.
    * Browse to the directory where you installed the Java SDK and click **OK**. IntelliJ will load all the `.jar` files for the SDK. 
    * Click **OK** when the installation completes.

4. Confirm that Selenium is Running
    * In the file list on the left, right-click on the **SeleniumExamples** file.
    * Select **Run 'SeleniumExamples'**.
