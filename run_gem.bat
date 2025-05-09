@echo off
REM run_gem.bat

REM Check if source file provided
if "%~1" == "" (
  echo Usage: run_gem.bat ^<source_file.gem^>
  exit /b 1
)

REM Get file name without extension
for %%F in ("%~1") do set FILENAME=%%~nF

REM Compile the Gem source
echo Compiling %~1...
java -jar build\libs\GemLang-1.0-SNAPSHOT-uber.jar "%~1"

REM Check compilation result
if %ERRORLEVEL% neq 0 (
  echo Compilation failed.
  exit /b 1
)

REM Run the compiled class
echo Running %FILENAME%...
java -cp . %FILENAME%