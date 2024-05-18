#!/bin/sh

while true
do
	echo "mender-client $(systemctl is-active mender-client)"
	sleep 5
done

exit 0