Install a recent Android SDK. Plug in a device or create an Android Emulator (verify connection with `$ANDROID_HOME/platform-tools/adb devices`).

Then execute

    $ ./gradlew check connectedCheck

You'll find instrumentation test results in

    $MODULE/build/outputs/androidTest-Results/**

and unit test results in

    $MODULE/build/test-results/**

Instrumentation test code coverage is kept underneath

    $MODULE/build/outputs/code-coverage/connected/**

Android Lint results can be found in

    $MODULE/build/outputs/lint-results-*.xml

There is no support for unit test code coverage yet in this project.

- Thomas.
