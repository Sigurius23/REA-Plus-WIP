package p202hw;

import com.nimbusds.jose.JOSEException;
import gw.C16258i;
import gw.C16260k;
import hm.C17417d;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p263jw.AbstractC21976b;
import p263jw.AbstractC21977c;
import p263jw.AbstractC21979e;
import p628xw.C38672b;

/* JADX INFO: renamed from: hw.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17690a extends AbstractC21977c {

    /* JADX INFO: renamed from: g */
    public final C17417d f68646g;

    public C17690a(byte[] bArr) {
        super(new SecretKeySpec(bArr, "AES"));
        this.f68646g = new C17417d(24);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m50563c(C16260k c16260k, C38672b c38672b, C38672b c38672b2, C38672b c38672b3, C38672b c38672b4, byte[] bArr) throws JOSEException {
        C16258i c16258i = (C16258i) c16260k.f61787w;
        if (c16258i == null) {
            throw new JOSEException("The algorithm \"alg\" header parameter must not be null");
        }
        if (!c16258i.equals(C16258i.f61812K)) {
            throw new JOSEException(AbstractC21979e.m62762l(c16258i, AbstractC21977c.f85110f));
        }
        if (c38672b != null) {
            throw new JOSEException("Unexpected present JWE encrypted key");
        }
        if (c38672b2 == null) {
            throw new JOSEException("Unexpected present JWE initialization vector (IV)");
        }
        if (c38672b4 == null) {
            throw new JOSEException("Missing JWE authentication tag");
        }
        if (!this.f68646g.m49432k(c16260k)) {
            throw new JOSEException("Unsupported critical header parameter(s)");
        }
        SecretKey secretKeyM62747b = null;
        try {
            secretKeyM62747b = m62747b(null);
        } catch (Exception unused) {
        }
        return AbstractC21976b.m62749b(c16260k, bArr, c38672b2, c38672b3, c38672b4, secretKeyM62747b, this.f85106c);
    }
}
