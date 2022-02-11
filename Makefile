test: MarkdownParse2.class MarkdownParseTest2.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest
 
MarkdownParse2.class: MarkdownParse2.java
	javac MarkdownParse.java
 
MarkdownParseTest2.class: MarkdownParseTest2.java
	javac -cp "lib/\*" MarkdownParseTest2.java
