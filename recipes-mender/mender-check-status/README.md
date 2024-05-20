## Task: Develop a system service which will poll for the status of the service mender-client every 5 seconds and print it to stdout 

This task is concluded by the mender-check-status recipe which installs 2 files: 
1. check-status.sh - bash script which prints the status of the mender-client every 5 seconds
2. mender-check-status.service - systemd service which starts the above script at boot

Status and logs of the service can be seen by running: 
```
systemctl status mender-check-status
```
Logs of the bash script can be seen using the service status or by running journalctl
```
journalctl | grep check-status
```
Script can be also manually started by running the check-status binary
```
check-status
```
