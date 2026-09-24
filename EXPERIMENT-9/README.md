Open the Folder in VS Code

Open Visual Studio Code.

Select:

File → Open Folder

Choose:

Experiment-9

You should see:

nodeModules.js

in the Explorer.

6. Check the JavaScript Program

Open:

nodeModules.js


7. Open the Terminal in VS Code

In VS Code:

Terminal → New Terminal

A terminal will appear at the bottom.

Make sure the terminal is inside your project folder.

For example:

PS D:\SkillLab\Experiment-9>

Check the files using:

dir

You should see:

nodeModules.js
8. Execute the Program

Run:

node nodeModules.js

Press Enter.

The program starts the HTTP server on port 3000.

You should see output similar to:

--- FILE SYSTEM MODULE ---
File Content: Welcome to Node.js Core Modules
Full Stack Development Lab

--- OS MODULE ---
Platform: win32
OS Type: Windows_NT
OS Release: ...
Architecture: x64
CPU Cores: ...
Total Memory: ...
Free Memory: ...
Hostname: ...
Home Directory: ...

--- PATH MODULE ---
File Path: ...
Directory: ...
File Name: details.txt
Extension: .txt
Parsed Path: ...

--- URL / QUERY STRING MODULE ---
Query String: name=Rahul&age=21&course=CSE
Student Name: Rahul
Student Age: 21
Student Course: CSE

--- CRYPTO MODULE ---
Original Password: student123
SHA-256 Hash: ...

--- BUFFER MODULE ---
Buffer: ...
Buffer Length: ...
Buffer Data: Hello Node.js

--- PROCESS MODULE ---
Node Version: ...
Platform: win32
Architecture: x64
Process ID: ...
Current Directory: ...

--- DNS MODULE ---
