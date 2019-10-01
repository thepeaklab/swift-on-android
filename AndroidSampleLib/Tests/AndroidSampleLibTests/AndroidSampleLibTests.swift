import XCTest
@testable import AndroidSampleLib

final class AndroidSampleLibTests: XCTestCase {
    func testExample() {
        // This is an example of a functional test case.
        // Use XCTAssert and related functions to verify your tests produce the correct
        // results.
        XCTAssertEqual(AndroidSampleLib().text, "Hello, World!")
    }

    static var allTests = [
        ("testExample", testExample),
    ]
}
