# Appium-automation
appium, intellij, maven
Option 1: Install curl using APT 

Open your terminal. 

Run the following command to install curl: 

bash 

Copy code 

sudo apt update 
sudo apt install curl 
 

After installation, verify that curl is installed correctly: 

bash 

Copy code 

curl --version 
 

Option 2: Install curl using Snap 

If you prefer using snap, you can run: 

Open your terminal. 

Install curl using the following command: 

bash 

Copy code 

sudo snap install curl 
 

Verify the installation: 

bash 

Copy code 

curl --version 
 

 

Step 1: Install NVM 

Open your terminal and run the following command to install NVM: 

bash 

Copy code 

curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.40.0/install.sh | bash 
 

Step 2: Load NVM 

After installation, you need to load NVM into your current shell session. You can do this by either restarting your terminal or running the following command: 

bash 

Copy code 

export NVM_DIR="$HOME/.nvm" 
[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh" # This loads nvm 
 

Step 3: Verify NVM Installation 

To check if NVM was installed correctly, run: 

bash 

Copy code 

nvm --version 
 

Step 4: Install Node.js Version 20 

Now you can install Node.js version 20: 

bash 

Copy code 

nvm install 20 

 

Step 6: Verify Node.js and npm Versions 

Now check that the correct version of Node.js is installed: 

bash 

Copy code 

node -v 
 

You should see output like: 

Copy code 

v20.18.0 
 

Next, check the npm version: 

bash 

Copy code 

npm -v 
 

You should see output similar to: 

Copy code 

10.8.2 

 

 

Run Appium:  

appium 

Stop: ctrl + c 

 

Install appium doctor 

npm install -g appium-doctor 

appium-doctor –version 

appium-doctor –android 

 

Install Appium drivers 

appium driver list 

✔ Listing available drivers 

- uiautomator2 [not installed] 

- xcuitest [not installed] 

- espresso [not installed] 

- mac2 [not installed] 

- windows [not installed] 

- safari [not installed] 

- gecko [not installed] 

- chromium [not installed] 

appium plugin list 

✔ Listing available plugins 

- images [not installed] 

- execute-driver [not installed] 

- relaxed-caps [not installed] 

- universal-xml [not installed] 

 

appium driver install uiautomato 

✔ Checking if 'appium-uiautomator2-driver' is compatible 

✔ Installing 'uiautomator2' using NPM install spec 'appium-uiautomator2-driver' 

ℹ Driver uiautomator2@3.8.0 successfully installed 

- automationName: UiAutomator2 

- platformNames: ["Android"] 

appium driver install xcuitest  

✔ Checking if 'appium-xcuitest-driver' is compatible 

✔ Installing 'xcuitest' using NPM install spec 'appium-xcuitest-driver' 

ℹ Driver xcuitest@7.28.0 successfully installed 

- automationName: XCUITest 

- platformNames: ["iOS","tvOS"] 

 

Appium dri ver update 

appium driver list --updates 

appium driver update uiautomator2 

 

 

Steps to Set Up Java Version 

Install JDK: 

Downloaded and installed Oracle JDK version 22.0.2. 

Identify JDK Path: 

Checked the installation path of the JDK: 

bash 

Copy code 

ls /usr/lib/jvm/ 
 

Edit Environment Variables: 

Opened the .bashrc file to set environment variables: 

bash 

Copy code 

nano ~/.bashrc 
 

Set JAVA_HOME: 

Added or modified the JAVA_HOME variable in .bashrc: 

bash 

Copy code 

export JAVA_HOME=/usr/lib/jvm/jdk-22.0.2-oracle-x64 
 

Update PATH: 

Ensured the PATH variable includes the Java binaries: 

bash 

Copy code 

export PATH=$PATH:$JAVA_HOME/bin 
 

Save and Exit: 

Saved changes in nano (CTRL + X, then Y, then Enter). 

Reload Configuration: 

Reloaded the .bashrc file to apply changes: 

bash 

Copy code 

source ~/.bashrc 
 

Verify Java Installation: 

Checked that JAVA_HOME is correctly set: 

bash 

Copy code 

echo $JAVA_HOME 
 

Verified Java version: 

bash 

Copy code 

$JAVA_HOME/bin/java -version 
 

Check with Appium Doctor: 

Ran Appium Doctor to ensure there are no warnings regarding Java: 

bash 

Copy code 

appium-doctor --android 
 

Outcome 

Java is now correctly configured and recognized by your system, with JAVA_HOME pointing to the correct JDK installation path. 

 

Download and install android studio 

Setting Up ANDROID_HOME in Ubuntu 

Find sdk path from welcome home -> more action -> sdk manager  

Open Terminal: 

Press Ctrl + Alt + T to open a terminal. 

Edit the .bashrc File: 

bash 

Copy code 

nano ~/.bashrc 
 

Add Environment Variables: Scroll to the bottom and add the following lines: 

bash 

Copy code 

export ANDROID_HOME=/home/upay/Android/Sdk 
export PATH=$PATH:$ANDROID_HOME/tools 
export PATH=$PATH:$ANDROID_HOME/platform-tools 
 

Save and Exit: 

Press CTRL + X, then Y, and hit Enter. 

Apply Changes: 

bash 

Copy code 

source ~/.bashrc 
 

Verify ANDROID_HOME: 

bash 

Copy code 

echo $ANDROID_HOME 
 

Ensure it outputs /home/upay/Android/Sdk. 

Verify Setup with Appium Doctor 

Run the following command to check for any remaining issues: 

bash 

Copy code 

appium-doctor --android 
 

Setup virtual device on android studio 

Install vysor 

(echo 'deb [arch=amd64, trusted=yes] https://nuts.vysor.io/apt ./' | sudo tee /etc/apt/sources.list.d/vysor.list)  

sudo apt update  

sudo apt install vysor 

 

Connect device with usb 

Turn on developer option 

Device uuid command: adb devices -l 

Install apk info from play store 

 

Setup intellij 

Upen project java maven 

Setup dependencies at pom 

Selenium 

Appium 

Testng 

 
