FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Enable pango lib
PACKAGECONFIG_append = " pango "

# Remove gio-unix-2.0 as it does not seem to exist anywhere
PACKAGECONFIG_remove = "gio-unix-2.0"
# Overwrite the unrecognised option which is set in gstreamer1.0-plugins-base.inc under poky layer
PACKAGECONFIG[gio-unix-2.0] = ""

SRC_URI_append = " file://0001-basetextoverlay-make-memory-copy-when-video-buffer-s.patch \
                   file://0002-gstplaysink-don-t-set-async-of-custom-text-sink-to-f.patch \
                   file://0003-ssaparse-enhance-SSA-text-lines-parsing.patch \
                   file://0004-subparse-set-need_segment-after-sink-pad-received-GS.patch \
                   file://0005-encodebin-Need-more-buffers-in-output-queue-for-bett.patch \
                   file://0006-ENGR00312515-get-caps-from-src-pad-when-query-caps.patch \
                   file://0008-taglist-not-send-to-down-stream-if-all-the-frame-cor.patch \
                   file://0009-handle-audio-video-decoder-error.patch \
                   file://0010-gstaudiobasesink-print-warning-istead-of-return-ERRO.patch \
                   file://0011-Disable-orc-optimization-for-lib-video-in-plugins-ba.patch \
                   file://0012-Remove-dependence-on-imx-plugin-git.patch \
                   file://0013-dmabuf-Make-the-allocator-sub-classable.patch \
                   file://0014-dmabuf-allocator-Add-missing-padding-in-the-class.patch \
                   file://0015-dmabuf-Add-free-function.patch \
                   file://0016-ion-DMA-Buf-allocator-based-on-ion.patch \
"

# The following "IMX_PATCHES" being defined in meta-fsl-arm layer are only applied to mx6 & mx7,
# Actually, they need to be applied to all SoC.
# Do the following change temporarily, will do upstream later.
SRC_URI_append_mx6ul  = "${IMX_PATCHES}"
SRC_URI_append_mx6sll = "${IMX_PATCHES}"
SRC_URI_append_mx8 = "${IMX_PATCHES}"

PACKAGE_ARCH_mxs = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx5 = "${MACHINE_SOCARCH}"
PACKAGE_ARCH_mx6 = "${MACHINE_SOCARCH}"
