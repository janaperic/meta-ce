DESCRIPTION = "Adding custom inventory script"
LICENSE = "CLOSED"

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