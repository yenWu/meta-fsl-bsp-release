# Copyright (C) 2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "GPU G2D library and apps for imx8"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

RDEPENDS_${PN} = "libgal-imx libdrm"

PROVIDES += "virtual/libg2d"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"

S="${WORKDIR}/${PN}-${PV}"

inherit fsl-eula-unpack

SRC_URI[md5sum] = "0a28d6417fe3532d188d3acbea1929ef"
SRC_URI[sha256sum] = "150ee6ffe2006abc5ca880315105eefb62bf937178cf17933b65964771359bf3"

do_install () {

    install -d ${D}${libdir}
    install -d ${D}${includedir}

    cp -r ${S}/g2d/usr/lib/*.so* ${D}${libdir}
    cp -Pr ${S}/g2d/usr/include/* ${D}${includedir}
    cp -r ${S}/gpu-demos/opt ${D}
}

INSANE_SKIP_${PN} += "ldflags"

FILES_${PN} = "${libdir}/libg2d* /opt"
FILES_${PN}-dev = "${libdir}/libg2d${SOLIBSDEV} ${includedir}"

# Compatible only with i.MX DPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxdpu = "${MACHINE}"
