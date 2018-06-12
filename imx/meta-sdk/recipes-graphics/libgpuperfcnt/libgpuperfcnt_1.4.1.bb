DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[arm-fb.md5sum] = "1caa973112d86535933fe9e8293e4f7a"
SRC_URI[arm-fb.sha256sum] = "9b4740a82b67c8ce6c5faab6e53f9b1345d1bbe05c4e5da80d69ee749716abbd"

SRC_URI[arm-wayland.md5sum] = "f93924512585e49102656b29248c9551"
SRC_URI[arm-wayland.sha256sum] = "f5546055dc19fc7b99173c4ae0826d0aef556ad585fff9bec6342ced0596efcf"

SRC_URI[arm-x11.md5sum] = "e3775b699b226057d1e41d211ae025de"
SRC_URI[arm-x11.sha256sum] = "d4362bd65a32269ba04f833006645ed1ebb6bf0170f5106a3401240803a2a33e"

SRC_URI[aarch64-fb.md5sum] = "ddc0a4d3874faf1cddd7d9ae79d16d37"
SRC_URI[aarch64-fb.sha256sum] = "ba61fc65fdb35cf4b29d1d40f68efbec542b65daa85dde77fe2028aa7f91cb8e"

SRC_URI[aarch64-wayland.md5sum] = "8cd0a7841dda44b782dc0c95d6cc1120"
SRC_URI[aarch64-wayland.sha256sum] = "63f7ffe3c553654e3f7cf199ad4a20a8eeaffabc456724cd2fe5e6c2bc73be45"

SRC_URI[aarch64-x11.md5sum] = "2181c057dc9885bc289db83c3bdf045a"
SRC_URI[aarch64-x11.sha256sum] = "f1f661f6f33d9ddd02f8059e69f9652c5c6bfc4e220f8230513626ad5cd1f644"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
