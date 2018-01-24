public class Task9 {
    // With Scanner you can get the last IOException of its underlying Readable with ioException()
// PrintWriter has the boolean method checkError() to tell if any errors occurred, but it does
// not inform what the errors are.
// This is enough to determine if an error occurred and to do some debugging in the case of
// Scanner. Debugging can still be done with PrintWriter and usually the causes of
// errors are relatively obvious if you look for them at the right level - such as write failures
// due to disk full at the file system level. However, probably many programmers are focused on
// their code as the only source of errors.
// It is good that their constructors can throw checked exceptions since that is a major source
// of problems such as file not found or cannot be opened. This helps to make them easier for
// everyone to use them successfully if they can be launched with no errors.
// Also it is easy to move up to more robust IO tools such as BufferedReader and BufferedWriter
// with Files.newBufferedReader(Path path) and
// Files.newBufferedWriter(Path path, OpenOption... options).
}
