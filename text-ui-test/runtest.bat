@ECHO OFF

REM create bin directory if it doesn't exist
if not exist ..\bin mkdir ..\bin

REM delete output from previous run
if exist ACTUAL.TXT del ACTUAL.TXT

REM compile the code into the bin folder
javac  -cp ..\src\main\java\jeremy -Xlint:none -d ..\bin ..\src\main\java\jeremy\*.java ..\src\main\java\jeremy\command\*.java ..\src\main\java\jeremy\exception\*.java ..\src\main\java\jeremy\task\*.java ..\src\main\java\jeremy\util\*.java
IF ERRORLEVEL 1 (
    echo ********** BUILD FAILURE **********
    exit /b 1
)
REM no error here, errorlevel == 0

REM run the program, feed commands from input.txt file and redirect the output to the ACTUAL.TXT
java -classpath ..\bin jeremy.Jeremy < input.txt > ACTUAL.TXT

REM compare the output to the expected output
FC ACTUAL.TXT EXPECTED.TXT

REM deletes stores data
rmdir /s /q "./data"
