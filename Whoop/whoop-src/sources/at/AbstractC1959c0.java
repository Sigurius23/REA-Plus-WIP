package at;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;
import p288ks.AbstractC22819a;

/* JADX INFO: renamed from: at.c0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC1959c0 {
    static {
        Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
        Pattern.compile("^projects/([0-9a-zA-Z\\-\\.\\_~])+/locations/([0-9a-zA-Z\\-\\.\\_~])+/keyRings/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeys/([0-9a-zA-Z\\-\\.\\_~])+/cryptoKeyVersions/([0-9a-zA-Z\\-\\.\\_~])+$", 2);
    }

    /* JADX INFO: renamed from: a */
    public static void m5971a(int i13) throws InvalidAlgorithmParameterException {
        if (i13 != 16 && i13 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i13 * 8)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m5972b(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return str.substring(19);
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    /* JADX INFO: renamed from: c */
    public static void m5973c(int i13) throws GeneralSecurityException {
        if (i13 < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i13)));
        }
        if (AbstractC22819a.m66183a() && i13 != 2048 && i13 != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i13)));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m5974d(BigInteger bigInteger) throws GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            throw new GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(BigInteger.valueOf(65536L)) <= 0) {
            throw new GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5975e(EnumC1979w enumC1979w) throws GeneralSecurityException {
        int iOrdinal = enumC1979w.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return;
        }
        throw new GeneralSecurityException("Unsupported hash: " + enumC1979w.name());
    }
}
