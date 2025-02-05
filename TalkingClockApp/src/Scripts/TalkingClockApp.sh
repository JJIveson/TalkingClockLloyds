#!/bin/bash
# talking-clock-cli.sh
# Usage: ./talking-clock-cli.sh [time]
# If a time argument in HH:mm format is provided, it will be passed to the TalkingClockCli class.
# Otherwise, the program uses the current system time.

# Path to the built JAR file (update this path as needed)
JAR_FILE="../target/TalkingClockApp-1.0-SNAPSHOT.jar"

# The fully qualified name of the CLI main class
MAIN_CLASS="../src/main/java/lcc/cli/TalkingClockCli.java"

# Check if the JAR file exists
if [ ! -f "$JAR_FILE" ]; then
    echo "Error: JAR file '$JAR_FILE' not found. Please build the project first."
    exit 1
fi

# Run the Java program with an optional parameter
if [ "$#" -eq 1 ]; then
    echo "Running TalkingClockCli with provided time: $1"
    java -cp "$JAR_FILE" $MAIN_CLASS "$1"
else
    echo "Running TalkingClockCli with current system time."
    java -cp "$JAR_FILE" $MAIN_CLASS
fi