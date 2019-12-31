// According to this thread (https://news.ycombinator.com/item?id=13487339),
// @_silgen_name only changes the link name and not the calling convention.
// @_cdecl might help here.
@_silgen_name("Java_com_example_androidcpp_HelloWorldJNI_returnIntegerSwift")
public func returnIntegerSwift() -> Int {
    return 10000
}
