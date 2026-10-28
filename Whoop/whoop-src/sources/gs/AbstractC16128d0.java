package gs;

import b23.C2342h;
import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: gs.d0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16128d0 {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f61256a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f61257b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f61258c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f61259d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f61256a = new C5085d0(C16126c0.class, new C2342h(20));
        f61257b = new C5081b0(c11105aM16079c, new C2342h(21));
        f61258c = new C5102m(C16122a0.class, new C2342h(22));
        f61259d = new C5098k(c11105aM16079c, new C2342h(23));
    }

    /* JADX INFO: renamed from: a */
    public static EnumC36362h4 m45684a(C16124b0 c16124b0) {
        if (C16124b0.f61241c.equals(c16124b0)) {
            return EnumC36362h4.TINK;
        }
        if (C16124b0.f61242d.equals(c16124b0)) {
            return EnumC36362h4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c16124b0);
    }

    /* JADX INFO: renamed from: b */
    public static C16124b0 m45685b(EnumC36362h4 enumC36362h4) throws GeneralSecurityException {
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            return C16124b0.f61241c;
        }
        if (iOrdinal == 3) {
            return C16124b0.f61242d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC36362h4.m116306b());
    }
}
