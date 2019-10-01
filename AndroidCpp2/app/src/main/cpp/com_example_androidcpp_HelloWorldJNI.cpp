//
// Created by Christoph Pageler on 2019-08-19.
//

#include <jni.h>
#include <iostream>
#import "com_example_androidcpp_HelloWorldJNI.h"

JNIEXPORT void JNICALL Java_com_example_androidcpp_HelloWorldJNI_sayHello(JNIEnv *, jobject) {
    std::cout << "Hello from C++ !!" << std::endl;
}

JNIEXPORT jint JNICALL Java_com_example_androidcpp_HelloWorldJNI_returnInteger(JNIEnv *, jobject) {
    return 315;
}
