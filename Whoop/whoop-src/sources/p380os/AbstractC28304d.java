package p380os;

import at.EnumC1972p;
import com.google.crypto.tink.internal.AbstractC5113r0;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import p347ns.C27090k;

/* JADX INFO: renamed from: os.d */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC28304d {
    static {
        m85749c(1, 0);
        m85749c(1, 2);
        m85749c(2, 32);
        m85749c(2, 16);
        m85749c(2, 17);
        m85749c(2, 18);
        m85749c(2, 1);
        m85749c(2, 2);
        m85749c(2, 3);
        m85749c(2, 1);
        m85749c(2, 2);
        m85749c(2, 3);
        Charset charset = AbstractC5113r0.f21461a;
        "KEM".getBytes(charset);
        "HPKE".getBytes(charset);
        "HPKE-v1".getBytes(charset);
    }

    /* JADX INFO: renamed from: a */
    public static int m85747a(C27090k c27090k) throws GeneralSecurityException {
        if (c27090k == C27090k.f108285G || c27090k == C27090k.f108286z) {
            return 32;
        }
        if (c27090k == C27090k.f108283E) {
            return 48;
        }
        if (c27090k == C27090k.f108284F) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    /* JADX INFO: renamed from: b */
    public static int m85748b(C27090k c27090k) throws GeneralSecurityException {
        if (c27090k == C27090k.f108285G) {
            return 32;
        }
        if (c27090k == C27090k.f108286z) {
            return 65;
        }
        if (c27090k == C27090k.f108283E) {
            return 97;
        }
        if (c27090k == C27090k.f108284F) {
            return 133;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    /* JADX INFO: renamed from: c */
    public static void m85749c(int i13, int i14) {
        if (i13 > 4 || i13 < 0) {
            throw new IllegalArgumentException("capacity must be between 0 and 4");
        }
        if (i14 < 0 || (i13 < 4 && i14 >= (1 << (i13 * 8)))) {
            throw new IllegalArgumentException("value too large");
        }
        byte[] bArr = new byte[i13];
        for (int i15 = 0; i15 < i13; i15++) {
            bArr[i15] = (byte) ((i14 >> (((i13 - i15) - 1) * 8)) & 255);
        }
    }

    /* JADX INFO: renamed from: d */
    public static EnumC1972p m85750d(C27090k c27090k) throws GeneralSecurityException {
        if (c27090k == C27090k.f108286z) {
            return EnumC1972p.f7802w;
        }
        if (c27090k == C27090k.f108283E) {
            return EnumC1972p.f7803x;
        }
        if (c27090k == C27090k.f108284F) {
            return EnumC1972p.f7804y;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}
