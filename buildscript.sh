#!/bin/sh
find . -type f -exec sh -c "cd {} && javac {}" \;
