# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

DESCRIPTION = "CE Linux image"

inherit mender-full 

IMAGE_FEATURES += " \
    ssh-server-dropbear \
"

IMAGE_INSTALL += " \
    sudo \
    vim \
    mender-add-inventory \
    mender-check-status \
"
