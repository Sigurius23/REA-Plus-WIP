package p200hs;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import gs.C16139j;
import gs.C16146o;
import gs.C16148q;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p184h5.C16893m1;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: hs.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC17591c {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f68151a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f68152b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f68153c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f68154d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f68151a = new C5085d0(C16148q.class, new C16893m1(9));
        f68152b = new C5081b0(c11105aM16079c, new C16893m1(10));
        f68153c = new C5102m(C16146o.class, new C16893m1(11));
        f68154d = new C5098k(c11105aM16079c, new C16893m1(12));
    }

    /* JADX INFO: renamed from: a */
    public static EnumC36362h4 m50097a(C16139j c16139j) {
        if (C16139j.f61307n.equals(c16139j)) {
            return EnumC36362h4.TINK;
        }
        if (C16139j.f61308o.equals(c16139j)) {
            return EnumC36362h4.CRUNCHY;
        }
        if (C16139j.f61309p.equals(c16139j)) {
            return EnumC36362h4.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c16139j);
    }

    /* JADX INFO: renamed from: b */
    public static C16139j m50098b(EnumC36362h4 enumC36362h4) throws GeneralSecurityException {
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            return C16139j.f61307n;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return C16139j.f61309p;
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC36362h4.m116306b());
            }
        }
        return C16139j.f61308o;
    }

    /* JADX INFO: renamed from: c */
    public static void m50099c(C16148q c16148q) {
        int i13 = c16148q.f61354c;
        int i14 = c16148q.f61353b;
        if (i13 != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(c16148q.f61354c)));
        }
        if (i14 != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i14)));
        }
    }
}
