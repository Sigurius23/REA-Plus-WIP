package p202hw;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import gw.C16262m;
import gw.C16263n;
import gw.InterfaceC16266q;
import hm.C17417d;
import java.security.Provider;
import java.util.Collections;
import java.util.Set;
import javax.crypto.SecretKey;
import la.C23548b;
import p263jw.AbstractC21979e;
import p263jw.AbstractC21980f;
import p550vd.AbstractC35903f;
import p628xw.C38672b;

/* JADX INFO: renamed from: hw.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C17693d extends AbstractC21980f implements InterfaceC16266q {

    /* JADX INFO: renamed from: f */
    public final C17417d f68649f;

    public C17693d(SecretKey secretKey) {
        super(secretKey);
        C17417d c17417d = new C17417d(24);
        this.f68649f = c17417d;
        c17417d.f67507x = Collections.EMPTY_SET;
    }

    @Override // gw.InterfaceC16266q
    /* JADX INFO: renamed from: e */
    public final boolean mo46085e(C16263n c16263n, byte[] bArr, C38672b c38672b) throws JOSEException {
        String str;
        int i13;
        C16262m c16262m = (C16262m) c16263n.f61787w;
        SecretKey secretKey = this.f85117d;
        if (secretKey == null) {
            throw new IllegalStateException("Unexpected state");
        }
        byte[] encoded = secretKey.getEncoded();
        Set set = AbstractC21980f.f85116e;
        if (encoded != null) {
            if (C16262m.f61863y.equals(c16262m)) {
                i13 = 256;
            } else if (C16262m.f61864z.equals(c16262m)) {
                i13 = 384;
            } else {
                if (!C16262m.f61849E.equals(c16262m)) {
                    throw new JOSEException(AbstractC21979e.m62763m(c16262m, set));
                }
                i13 = 512;
            }
            if (secretKey == null) {
                throw new IllegalStateException("Unexpected state");
            }
            byte[] encoded2 = secretKey.getEncoded();
            if ((encoded2 == null ? 0 : encoded2.length * 8) < i13) {
                throw new KeyLengthException("The secret length for " + c16262m + " must be at least " + i13 + " bits");
            }
        }
        if (!this.f68649f.m49432k(c16263n)) {
            return false;
        }
        C16262m c16262m2 = (C16262m) c16263n.f61787w;
        if (c16262m2.equals(C16262m.f61863y)) {
            str = "HMACSHA256";
        } else if (c16262m2.equals(C16262m.f61864z)) {
            str = "HMACSHA384";
        } else {
            if (!c16262m2.equals(C16262m.f61849E)) {
                throw new JOSEException(AbstractC21979e.m62763m(c16262m2, set));
            }
            str = "HMACSHA512";
        }
        if (secretKey != null) {
            return AbstractC35903f.m114013h(AbstractC21979e.m62751a(str, secretKey, bArr, (Provider) ((C23548b) this.f9292c).f93280x), c38672b.m124047a());
        }
        throw new IllegalStateException("Unexpected state");
    }
}
