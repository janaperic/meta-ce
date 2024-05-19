DESCRIPTION = "Adding custom inventory script"
LICENSE="GPL-3.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0-only;md5=c79ff39f19dfec6d293b95dea7b07891"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = " \
     file://mender-inventory-homework_variable \
"

PR="1"

do_install() {
    install -d ${D}${datadir}/mender/inventory
    install -m 0755 ${WORKDIR}/mender-inventory-homework_variable ${D}${datadir}/mender/inventory/mender-inventory-homework_variable
}

FILES:${PN} += "\
    ${datadir}/mender/inventory  \
    ${datadir}/mender/inventory/mender-inventory-homework_variable \
"