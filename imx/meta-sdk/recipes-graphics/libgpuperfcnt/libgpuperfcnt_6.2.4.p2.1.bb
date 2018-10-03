DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "9f370aa12ec404aafcedfa81b5b18d28"
SRC_URI[arm-fb.sha256sum] = "af5f24585b9d4a0bcd2d3a6dc09592d68b0b12bab68064db2ed703df36314854"

SRC_URI[arm-wayland.md5sum] = "25594a9585656ece223fc6fe85901e77"
SRC_URI[arm-wayland.sha256sum] = "9a945c4f8b0fd303127aa499009550e84583666fbf25d6c8273dda9bdace2d70"

SRC_URI[arm-x11.md5sum] = "02ad1b4e78cd20b03d667ec02a2a60e0"
SRC_URI[arm-x11.sha256sum] = "781c9e59555398d3c05456f90c1d25cec362c179aabeea38653f48e36b7afaa0"

SRC_URI[aarch64-fb.md5sum] = "b8924871d285add8f713d5eb46f5c51d"
SRC_URI[aarch64-fb.sha256sum] = "6f9f55dd7c7f0ca93ef3d46063b5ad71e35c1a175ce573052a497ffc500bbc27"

SRC_URI[aarch64-wayland.md5sum] = "5db039c1ffce2d11875bc94861b2feea"
SRC_URI[aarch64-wayland.sha256sum] = "00d8e8402a9d48774ab4a347a03bb65f2178e759805783bd25e5b344dc7554b6"

SRC_URI[aarch64-x11.md5sum] = "7dd9275564fb80c745ebecd1ccfc9934"
SRC_URI[aarch64-x11.sha256sum] = "5dd61f3cc504331f2226d22925ccae5f26ee8551e20e77075785181760d86101"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"