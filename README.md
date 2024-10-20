# Appium Setup 
This documentation guides you through installing essential tools and setting up your environment for mobile app testing using Appium, Java, and Android Studio.

## Table of Contents
Install curl
Option 1: Install curl using APT
Option 2: Install curl using Snap
Install NVM
Install Node.js Version 20
Run Appium
Install Appium Doctor
Install Appium Drivers
Set Up Java Version
Download and Install Android Studio
Setting Up ANDROID_HOME in Ubuntu
Verify Setup with Appium Doctor
Set Up Virtual Device on Android Studio
Install Vysor
Setup IntelliJ IDEA
Install curl

### Option 1: Install curl using APT
Open your terminal.
Run the following command to install curl:
  
sudo apt update
sudo apt install curl

After installation, verify that curl is installed correctly:
curl --version

### Option 2: Install curl using Snap
Open your terminal.
Install curl using the following command:
sudo snap install curl

### Verify the installation: 
curl --version

## Install NVM
Open your terminal and run the following command to install NVM:
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.40.0/install.sh | bash

### Load NVM into your current shell session:
You can do this by either restarting your terminal or running:
export NVM_DIR="$HOME/.nvm"
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"  # This loads nvm

### Verify NVM Installation:
nvm --version

## Install Node.js Version 20
Now you can install Node.js version 20:
nvm install 20

## Run Appium
### Run Appium:
appium
### Stop Appium: 
Press CTRL + C.

## Install Appium Doctor
Install Appium Doctor:
npm install -g appium-doctor

### Verify the installation:
appium-doctor --version

### Check for Android setup:
appium-doctor --android

## Install Appium Drivers
List available drivers:
appium driver list

### Install the uiautomator2 driver:
appium driver install uiautomator2

### Install the xcuitest driver:
appium driver install xcuitest

### Check installed drivers:
appium driver list

### Update drivers if needed:
appium driver update uiautomator2

## Set Up Java Version
### Step 1: Install JDK
Download and install Oracle JDK version 22.0.2.

### Step 2: Identify JDK Path
Check the installation path of the JDK: 
ls /usr/lib/jvm/
### Step 3: Edit Environment Variables
Open the .bashrc file:
nano ~/.bashrc

### Step 4: Set JAVA_HOME
Add or modify the JAVA_HOME variable in .bashrc:
export JAVA_HOME=/usr/lib/jvm/jdk-22.0.2-oracle-x64
export PATH=$PATH:$JAVA_HOME/bin

### Step 5: Save and Exit
Save changes in nano: (CTRL + X, then Y, then Enter).

### Step 6: Reload Configuration
Reload the .bashrc file to apply changes:
source ~/.bashrc

### Step 7: Verify Java Installation
Check that JAVA_HOME is correctly set:
echo $JAVA_HOME

### Verify Java version:
$JAVA_HOME/bin/java -version

## Download and Install Android Studio
Download Android Studio from the official website.
Follow the installation instructions to complete the setup.

## Setting Up ANDROID_HOME in Ubuntu
Find SDK path from: Welcome Screen -> More Actions -> SDK Manager.
Open Terminal: Press Ctrl + Alt + T to open a terminal.
### Edit the .bashrc file:
nano ~/.bashrc

### Add Environment Variables: Scroll to the bottom and add the following lines: 
export ANDROID_HOME=/home/<your_username>/Android/Sdk
export PATH=$PATH:$ANDROID_HOME/tools
export PATH=$PATH:$ANDROID_HOME/platform-tools
Save and Exit: Press CTRL + X, then Y, and hit Enter.

### Apply Changes:
source ~/.bashrc

### Verify ANDROID_HOME:
echo $ANDROID_HOME

### Verify Setup with Appium Doctor
Run the following command to check for any remaining issues:
appium-doctor --android

## Set Up Virtual Device on Android Studio
Open Android Studio and create a virtual device:
Go to AVD Manager to create a new virtual device.

### Install Vysor
Install Vysor using APT: 
(echo 'deb [arch=amd64, trusted=yes] https://nuts.vysor.io/apt ./' | sudo tee /etc/apt/sources.list.d/vysor.list)
sudo apt update
sudo apt install vysor

### Connect Device with USB
Turn on Developer Options on your Android device.

### Verify connected devices:
adb devices -l

### Install APK info from Play Store if needed.

## Setup IntelliJ IDEA
Download IntelliJ IDEA from the official website.
Open your Java Maven project in IntelliJ IDEA.

### Set up dependencies in pom.xml:

xml
 
<dependencies>
    <dependency>
        <groupId>io.appium</groupId>
        <artifactId>java-client</artifactId>
        <version>8.1.0</version>
    </dependency>
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.4.0</version>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.11.0</version>
    </dependency>
</dependencies>
Sync the Maven project to download the required dependencies.

# Conclusion
By following this documentation, you should have a fully set up environment for mobile app testing with Appium, Java, and Android Studio. If you encounter any issues, please refer to the official documentation of the respective tools or seek support in community forums.

