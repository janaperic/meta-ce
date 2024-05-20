## Task: Enable UART 

UART is enabled adding the following line to ce-linux.conf:

```
ENABLE_UART = "1"
```
 ## Task: Mender client configuration

 Communication with the Mender server is configured with the following lines, in the ce-linux.conf file:

```
MENDER_SERVER_URL = "https://eu.hosted.mender.io"
MENDER_TENANT_TOKEN = "tzenD2587u_6fCoCeQtNcNSLpxC7XExAQ2S1mRC4sJA"
```
