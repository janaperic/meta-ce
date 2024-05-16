# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

DESCRIPTION = "Homework tasks for Custimer Engineer role at Mender"

IMAGE_FEATURES += " \
    ssh-server-dropbear \
"

# Include modules in rootfs
#IMAGE_INSTALL += " \
#    kernel-modules \
#    sudo \
#    avahi-daemon \
#    jq \
#"