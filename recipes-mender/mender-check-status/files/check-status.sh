#!/bin/sh

# Script used for checking the status of mender-client service every 5 seconds and printing it to stdout

while true
do
	echo "mender-client $(systemctl is-active mender-client)"
	sleep 5
done

exit 0