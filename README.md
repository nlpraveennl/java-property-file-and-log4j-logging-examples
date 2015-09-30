# java-property-file-and-log4j-logging-examples

<h3>Pluggable java web application plugins for .properties file reading</h3>
<h4>project 1: Reading Properties file</h4>
<p>It is not advised to store the server configurations such as DB username, DB password, DB IP address, other service URL, FTP username, FTP password, and Current Version of build in .java file.
Because It is not easier to modify it later in server if it is defined in .java file as server will be having .class file of Constants. If you want to modify configuration at any time you have to do lot of stuffs to change configurations present in .class file. So it is advised to store all the configurable parameters in .properties file.</p>
<p>This Repository has snippets for reading parameters from .properties file in web application. It has two collections for accessing parameters <br> a. properties <code>java.util.Properties</code> <br> b. HashMap  <code>java.util.HashMap</code><br> both collection objects can able to give keys and values stored in .properties file. You can use whichever convinient for you.</p>
<br>
<h4>project 2: Logging using Log4j + Reading params from properties file</h4>
  <p> I used log4j for logging and it covers all the requirement for logging utility for web applications. And it also has snippet to read params from .properties file</p>
