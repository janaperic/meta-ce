## Task: Add a bootloader variable homework_variable

To add a custom variable to U-Boot it was necessary to change configuration in rpi.h, which was done using a patch. 
Patch is installed to the image using a u-boot.bbappend file. 

Variable value can be read using the following command: 
```
fw_printenv | grep homework_variable
```
