DESCRIPTION = "Service for polling status of mender-client every 5 seconds"
LICENSE="GPL-3.0-only"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0-only;md5=c79ff39f19dfec6d293b95dea7b07891"

SRC_URI = "\
    file://mender-check-status.service \
    file://check-status.sh \
"

do_install() {
    install -d ${D}${systemd_unitdir}/system/
    install -m 0644 ${WORKDIR}/mender-check-status.service ${D}${systemd_unitdir}/system/

    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/check-status.sh  ${D}${bindir}/check-status
}

FILES:${PN} = "\
    ${systemd_unitdir}/system/mender-check-status.service \
    ${bindir}/check-status \
"

inherit systemd

SYSTEMD_SERVICE:${PN} = "mender-check-status.service"