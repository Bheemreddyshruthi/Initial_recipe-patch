DESCRIPTION = "Demo application to showcase 3D graphics using kms and gbm"
HOMEPAGE = "https://cgit.freedesktop.org/mesa/kmscube/"
LICENSE = "MIT"
SECTION = "graphics"
DEPENDS = "virtual/libgles2 virtual/egl libdrm"

LIC_FILES_CHKSUM = "file://kmscube.c;beginline=1;endline=23;md5=8b309d4ee67b7315ff7381270dd631fb"

SRCREV = "4660a7dca6512b6e658759d00cff7d4ad2a2059d"
SRC_URI = "git://gitlab.freedesktop.org/mesa/kmscube;branch=master;protocol=https"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit meson pkgconfig features_check

REQUIRED_DISTRO_FEATURES = "opengl"

PACKAGECONFIG ??= ""
PACKAGECONFIG[gstreamer] = "-Dgstreamer=enabled,-Dgstreamer=disabled,gstreamer1.0 gstreamer1.0-plugins-base"
