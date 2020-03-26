DESCRIPTION = "A free C++ class library of cryptographic schemes"
AUTHOR = "weidai@weidai.com"
SECTION = "libs"
HOMEPAGE = "http://www.cryptopp.com/wiki/Main_Page"
BUGTRACKER = "https://github.com/weidai11/cryptopp/issues"
LICENSE = "BSL-1.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/License.txt;md5=deb6d182b0f7f8a866c42941b9f014c4"

COMPATIBLE_MACHINE = "genericx86-64|gforce-genericx86-64"

inherit pkgconfig lib_package

PR = "r0"
PV = "6.1.0"

SRC_URI = "git://github.com/weidai11/cryptopp.git"
SRCREV = "5be140bcea453a00f7f2fec09fb9e37849d65d98"

S = "${WORKDIR}/git"

do_compile() {
  oe_runmake libcryptopp.so
}

do_install() {
  oe_runmake install PREFIX=/usr LIBDIR=${D}${libdir} INCLUDEDIR=${D}${includedir}
}

BBCLASSEXTEND = "native nativesdk"

