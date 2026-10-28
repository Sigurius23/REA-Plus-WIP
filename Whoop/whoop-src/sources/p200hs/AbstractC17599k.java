package p200hs;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import gs.C16138i0;
import gs.C16139j;
import gs.C16142k0;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p184h5.C16893m1;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: hs.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17599k {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f68173a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f68174b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f68175c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f68176d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f68173a = new C5085d0(C16142k0.class, new C16893m1(21));
        f68174b = new C5081b0(c11105aM16079c, new C16893m1(22));
        f68175c = new C5102m(C16138i0.class, new C16893m1(23));
        f68176d = new C5098k(c11105aM16079c, new C16893m1(24));
    }

    /* JADX INFO: renamed from: a */
    public static EnumC36362h4 m50113a(C16139j c16139j) {
        if (C16139j.f61316w.equals(c16139j)) {
            return EnumC36362h4.TINK;
        }
        if (C16139j.f61317x.equals(c16139j)) {
            return EnumC36362h4.CRUNCHY;
        }
        if (C16139j.f61318y.equals(c16139j)) {
            return EnumC36362h4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c16139j);
    }

    /* JADX INFO: renamed from: b */
    public static C16139j m50114b(EnumC36362h4 enumC36362h4) throws GeneralSecurityException {
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            return C16139j.f61316w;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C16139j.f61318y;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC36362h4.m116306b());
            }
        }
        return C16139j.f61317x;
    }
}
