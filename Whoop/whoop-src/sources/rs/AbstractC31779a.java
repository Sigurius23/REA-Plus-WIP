package rs;

import com.google.crypto.tink.internal.AbstractC5113r0;
import com.google.crypto.tink.internal.C5081b0;
import com.google.crypto.tink.internal.C5085d0;
import com.google.crypto.tink.internal.C5098k;
import com.google.crypto.tink.internal.C5102m;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p380os.C28301a;
import p436qs.C30557a;
import p436qs.C30559c;
import p436qs.C30560d;
import p560vs.EnumC36362h4;

/* JADX INFO: renamed from: rs.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC31779a {

    /* JADX INFO: renamed from: a */
    public static final C5085d0 f131588a;

    /* JADX INFO: renamed from: b */
    public static final C5081b0 f131589b;

    /* JADX INFO: renamed from: c */
    public static final C5102m f131590c;

    /* JADX INFO: renamed from: d */
    public static final C5098k f131591d;

    static {
        C11105a c11105aM16079c = AbstractC5113r0.m16079c("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f131588a = new C5085d0(C30560d.class, new C28301a(15));
        f131589b = new C5081b0(c11105aM16079c, new C28301a(16));
        f131590c = new C5102m(C30557a.class, new C28301a(17));
        f131591d = new C5098k(c11105aM16079c, new C28301a(18));
    }

    /* JADX INFO: renamed from: a */
    public static EnumC36362h4 m98678a(C30559c c30559c) {
        if (C30559c.f125756b.equals(c30559c)) {
            return EnumC36362h4.TINK;
        }
        if (C30559c.f125757c.equals(c30559c)) {
            return EnumC36362h4.CRUNCHY;
        }
        if (C30559c.f125759e.equals(c30559c)) {
            return EnumC36362h4.RAW;
        }
        if (C30559c.f125758d.equals(c30559c)) {
            return EnumC36362h4.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + c30559c);
    }

    /* JADX INFO: renamed from: b */
    public static C30559c m98679b(EnumC36362h4 enumC36362h4) throws GeneralSecurityException {
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            return C30559c.f125756b;
        }
        if (iOrdinal == 2) {
            return C30559c.f125758d;
        }
        if (iOrdinal == 3) {
            return C30559c.f125759e;
        }
        if (iOrdinal == 4) {
            return C30559c.f125757c;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + enumC36362h4.m116306b());
    }
}
