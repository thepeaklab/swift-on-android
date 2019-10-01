package com.example.androidcpp;

import android.util.Log;

public class HelloWorldJNI {

    static {
        //System.loadLibrary("helloworld-c");

        // Note: Order matters!
        //System.loadLibrary("c++_shared"); // (if we didn't compile statically)

        // Notice that I renamed the ICU libraries & symbols
        // System.loadLibrary("scudata");
        // System.loadLibrary("scuuc");
        // System.loadLibrary("scui18n");

        // System.loadLibrary("swiftSwiftOnoneSupport"); // used by swiftCore
        // System.loadLibrary("swiftCore");

        // System.loadLibrary("swiftGlibc"); // Should be named Bionic

        // System.loadLibrary("dispatch");
        // System.loadLibrary("Foundation"); // (may have additional dependencies)

        // This is our Swift code compiled into a dynamic library
        // System.loadLibrary("AndroidSampleLib");
        // or System.load("/Users/christoph/Development/temp/AndroidCpp2/app/libs/armeabi-v7a/libAndroidSampleLib.so");

        // c++ sample
        System.loadLibrary("helloworld-c");
    }

    public static void main(String[] args) {
        //new HelloWorldJNI().sayHello();
    }

    public void testingMethod() {
        Log.d("My App", "Foo bar before swift");
        int cpp= returnInteger();
        Log.d("My App", "Foo bar after swift" + cpp);
    }

    // Declare a native method sayHello() that receives no arguments and returns void
    private native void sayHello();

    private native int returnInteger();

    // private native int returnIntegerSwift();
}