# Setting Up Test Automation Environment

## 1. Install Java 8

Download and install Java 8 JDK from [Java SE Development Kit 8 Downloads](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html).

Set up the `JAVA_HOME` environment variable:

```bash
export JAVA_HOME=/path/to/your/java8/installation
export PATH=$JAVA_HOME/bin:$PATH

# Install Appium

Appium is an open-source tool for automating mobile applications on Android and iOS platforms. Follow the steps below to install Appium on your machine.

## Prerequisites

Before installing Appium, make sure you have the following prerequisites installed on your machine:

- [Node.js and npm](https://nodejs.org/en/download/)
- Java Development Kit (JDK) 8 or later
- Appium requires [Appium Desktop](https://github.com/appium/appium-desktop/releases) for a graphical interface. You can download and install it separately.

## Install Appium

1. Open a terminal or command prompt.

2. Install Appium globally using npm:

    ```bash
    npm install -g appium
    ```

    This command installs Appium globally, making it accessible from any directory.

3. Additionally, you can install Appium Doctor, a helpful utility for verifying the installation and diagnosing common issues:

    ```bash
    npm install -g appium-doctor
    ```

    Run Appium Doctor to check if all dependencies are met:

    ```bash
    appium-doctor
    ```

    Follow any recommendations provided by Appium Doctor to ensure a smooth installation.

4. Start the Appium server by running:

    ```bash
    appium
    ```

    The Appium server will start, and you will see logs indicating that the server is listening on a specific address and port.

## Verify Installation

To verify that Appium is installed correctly, open a new terminal window and run:

```bash
appium --version

##**Run tests with gradle:**

```
./gradlew clean test
```

To run tests in Firefox:

```
./gradlew clean test -Dwebdriver.driver=firefox
```

In windows:
```
gradlew clean test
```

##**Run tests with Maven:**

```
mvn clean verify -Ddriver=firefox
```
or try this:

```
mvn clean verify -Dwebdriver.driver=firefox
```

