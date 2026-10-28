package p202hw;

import b30.C2570m;
import com.nimbusds.jose.JOSEException;
import gw.C16258i;
import gw.C16260k;
import gw.InterfaceC16259j;
import javax.crypto.SecretKey;
import p263jw.AbstractC21976b;
import p263jw.AbstractC21977c;
import p263jw.AbstractC21979e;

/* JADX INFO: renamed from: hw.b */
/* JADX INFO: loaded from: classes6.dex */
public class C17691b extends AbstractC21977c implements InterfaceC16259j {
    @Override // gw.InterfaceC16259j
    /* JADX INFO: renamed from: a */
    public final C2570m mo46079a(C16260k c16260k, byte[] bArr, byte[] bArr2) throws JOSEException {
        C16258i c16258i = (C16258i) c16260k.f61787w;
        if (c16258i == null) {
            throw new JOSEException("The algorithm \"alg\" header parameter must not be null");
        }
        if (!c16258i.equals(C16258i.f61812K)) {
            throw new JOSEException(AbstractC21979e.m62762l(c16258i, AbstractC21977c.f85110f));
        }
        SecretKey secretKeyM62747b = null;
        try {
            secretKeyM62747b = m62747b(null);
        } catch (Exception unused) {
        }
        return AbstractC21976b.m62750c(c16260k, bArr, bArr2, secretKeyM62747b, null, this.f85106c);
    }
}
