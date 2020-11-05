# FetchRewards_Automation
Automated tests for succesful and unsuccesfull account creation on native Fetch Rewards android application.


Before you run the script:
Please have Appium server connected on: http://127.0.0.1:4723/wd/hub
And have the Android emulator running with the Fetch Reward application loaded.

Tests in this cover the scenario:

Scenario # 1:
1. Open app.
2. Click on Sign up with email button
3. Fill out the form with random valid values and submit
4. Verify you landed on second step of registration
5. Save Screen shot

Scenario#2 :
1. Open app.
2. Click on Sign up with email button
3. Fill out the form with random valid values and submit
4. Verify the account was not created.
5. Save a screen shot

Code uses Appium to connect with the Pixel 2 device on an emulator in Android Studio.

I wanted to use Androidx and other ways to test the UI of the application, but the APK would not decompile into proper classes. Hence I went this route to test the UI by Appium, with selenium the driving force.

I could have used more Junit tests to verify elements present, but I would rather use it in white box testing, in testing the code.

I had successful tests, until later the application decided NOT to create a new account for me, hence the successful account creation test was failing. I believe	I have the right steps for it.

Please feel free to reach out to me:
saadhq20@gmail.com




