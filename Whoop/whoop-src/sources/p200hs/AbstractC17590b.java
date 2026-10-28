package p200hs;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import gs.C16139j;
import gs.C16143l;
import gs.C16145n;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p184h5.C16893m1;
import p560vs.C36340e0;
import p560vs.C36346f0;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: hs.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17590b {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f68147a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f68148b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f68149c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f68150d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f68147a = new C5085d0(C16145n.class, new C16893m1(5));
        f68148b = new C5081b0(c11105aM16079c, new C16893m1(6));
        f68149c = new C5102m(C16143l.class, new C16893m1(7));
        f68150d = new C5098k(c11105aM16079c, new C16893m1(8));
    }

    /* JADX INFO: renamed from: a */
    public static C36346f0 m50094a(C16145n c16145n) throws GeneralSecurityException {
        if (c16145n.f61341c != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(c16145n.f61341c)));
        }
        C36340e0 c36340e0M116231C = C36346f0.m116231C();
        c36340e0M116231C.m116211g(c16145n.f61340b);
        return (C36346f0) c36340e0M116231C.m16347b();
    }

    /* JADX INFO: renamed from: b */
    public static EnumC36362h4 m50095b(C16139j c16139j) {
        if (C16139j.f61304k.equals(c16139j)) {
            return EnumC36362h4.TINK;
        }
        if (C16139j.f61305l.equals(c16139j)) {
            return EnumC36362h4.CRUNCHY;
        }
        if (C16139j.f61306m.equals(c16139j)) {
            return EnumC36362h4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c16139j);
    }

    /* JADX INFO: renamed from: c */
    public static C16139j m50096c(EnumC36362h4 enumC36362h4) throws GeneralSecurityException {
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            return C16139j.f61304k;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C16139j.f61306m;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC36362h4.m116306b());
            }
        }
        return C16139j.f61305l;
    }
}
