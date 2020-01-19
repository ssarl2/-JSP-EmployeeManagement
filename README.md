# Operated environment
windows 10, 64bit<br>
There are some errors such as database structure, CSS..<br>
You need to input ESDept data at first<br>

# Needs
tomcat v9.0<br>
: https://tomcat.apache.org/download-90.cgi - 32-bit/64-bit Windows Service Installer<br>
<br>
Oracle Database 11g Release 2<br>
: https://www.oracle.com/kr/database/technologies/112010-win64soft.html - win64_11gR2_database_1of2.zip + win64_11gR2_database_1of2.zip<br>
<br>
ojdbc6.jar<br>
: C:\app\\(User)\product\11.2.0\dbhome_1\jdbc\lib<br>
<br>
eclipse ee 2019-12<br>
: https://www.eclipse.org/downloads/packages/release/neon/3/eclipse-ide-java-ee-developers
<br>
jdk1.8.0_241<br>
: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html - jdk-8u241-windows-x64.exe<br>
<br>
bootstrap v3.3.2(included)<br>
<br>
sql developer(optional)<br>
: https://www.oracle.com/kr/tools/downloads/sqldev-v192-downloads.html - JDK8<br>
<br>

# How to install or use this
1. Install jdk, oracle database, tomcat, eclipse ee<br>
1-1.<br>
Tomcat admin port : 8005<br>
HTTP/1.1 : 8090<br>
AJP/1.3 : 8009<br>
2. Set up your environment properly such as jre, tomcat in Project(ESystem) - Java Build Path<br>
3. Add ojdbc6.jar to ESystem\WebContent\WEB-INF\lib from C:\app\\(User)\product\11.2.0\dbhome_1\jdbc\lib<br>
4. Build Database Connections at Data Source Explorer tab<br>
4-1. https://www.youtube.com/watch?v=-pZRydD8BBM<br>
5. Modify your information of oracle on the ESystem\WebContent\WEB-INF\web.xml<br>
5-1.<br>
...<br>
\<param-name\>url\</param-name\><br>
\<param-value\>jdbc:oracle:thin:@localhost:1521:orcl\</param-value\><br>
...<br>
\<param-name\>username\</param-name\><br>
\<param-value\>(your oracle)\</param-value\><br>
...<br>
\<param-name\>password\</param-name\><br>
\<param-value\>(your oracle)\</param-value\><br>
...<br>
6. Create tables and objects with 'SQL Developer' or 'SQL Plus(on cmd)' by ESystem.sql<br>
7. Build a Server at Servers tab<br>
8. Open the ESystem\WebContent\mainView\ESDept.jsp and Run<br>

# Structure
## E-R Diagram of Oracle Database<br>
![ESystem_ERDiagram](https://user-images.githubusercontent.com/37391569/72593459-5d104f80-3948-11ea-800d-2c0bc8e8a8a6.png)
<br>
<br>
## MVC
![MVC](https://user-images.githubusercontent.com/37391569/72677632-34eb3280-3aa7-11ea-8db6-81d0f138d521.png)
<br>
<br>
<br>
## Web pages
![Webpage](https://user-images.githubusercontent.com/37391569/72677635-37e62300-3aa7-11ea-9cb8-a1d91fc961b2.png)
<br>
<br>
<br>
Made in December, 2018<br>
