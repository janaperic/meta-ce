# meta-ce

Custom Yocto layer for CE-linux 

### To-do list: 
1. Name the artifact 'rootfs-v1' ✅
2. Ensure communication with Mender server ✅
3. Enable UART & SSH ✅
4. Add bootloader variable 'homework_variable' ✅
5. Write a distro specific conf file ✅
6. Write an inventory script for reading 'homework_variable' ✅
7. Write a recipe for the inventory script  ✅
8. Override polling intervals in mender.conf (via recipe) ✅
9. Deal with layer licenses
10. Develop a system service which will poll for the status of the service mender-client and print to stdout ✅
11. Write a bash script for gathering device information via Mender's API ✅
12. Create a reproducible build environment
