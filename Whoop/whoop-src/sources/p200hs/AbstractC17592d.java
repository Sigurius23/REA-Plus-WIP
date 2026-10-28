package p200hs;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import gs.C16139j;
import gs.C16149r;
import gs.C16151t;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p184h5.C16893m1;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: hs.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17592d {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f68155a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f68156b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f68157c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f68158d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f68155a = new C5085d0(C16151t.class, new C16893m1(13));
        f68156b = new C5081b0(c11105aM16079c, new C16893m1(14));
        f68157c = new C5102m(C16149r.class, new C16893m1(15));
        f68158d = new C5098k(c11105aM16079c, new C16893m1(16));
    }

    /* JADX INFO: renamed from: a */
    public static EnumC36362h4 m50100a(C16139j c16139j) {
        if (C16139j.f61310q.equals(c16139j)) {
            return EnumC36362h4.TINK;
        }
        if (C16139j.f61311r.equals(c16139j)) {
            return EnumC36362h4.CRUNCHY;
        }
        if (C16139j.f61312s.equals(c16139j)) {
            return EnumC36362h4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c16139j);
    }

    /* JADX INFO: renamed from: b */
    public static C16139j m50101b(EnumC36362h4 enumC36362h4) throws GeneralSecurityException {
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            return C16139j.f61310q;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C16139j.f61312s;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC36362h4.m116306b());
            }
        }
        return C16139j.f61311r;
    }
}
