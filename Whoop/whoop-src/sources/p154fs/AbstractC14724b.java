package p154fs;

import com.google.crypto.tink.internal.C5101l0;
import com.google.crypto.tink.internal.C5107o0;
import com.google.crypto.tink.internal.C5111q0;
import com.google.crypto.tink.internal.C5112r;
import com.google.crypto.tink.internal.C5119x;
import com.google.crypto.tink.internal.C5121z;
import com.google.crypto.tink.shaded.protobuf.C5167p;
import java.io.IOException;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p560vs.C36409p3;

/* JADX INFO: renamed from: fs.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC14724b {

    /* JADX INFO: renamed from: a */
    public static final byte[] f54463a = new byte[0];

    /* JADX INFO: renamed from: a */
    public static C14728f m42224a(String str) {
        AbstractC14733k abstractC14733k;
        C5119x c5119x = C5119x.f21470b;
        synchronized (c5119x) {
            if (!c5119x.f21471a.containsKey(str)) {
                throw new GeneralSecurityException("Name " + str + " does not exist");
            }
            abstractC14733k = (AbstractC14733k) c5119x.f21471a.get(str);
        }
        return new C14728f(abstractC14733k, 2);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC14733k m42225b(byte[] bArr) throws GeneralSecurityException {
        try {
            C36409p3 c36409p3M116531I = C36409p3.m116531I(bArr, C5167p.m16298a());
            C5121z c5121z = C5121z.f21474b;
            C5101l0 c5101l0M16022F = C5101l0.m16022F(c36409p3M116531I);
            C5111q0 c5111q0 = (C5111q0) c5121z.f21475a.get();
            c5111q0.getClass();
            return !c5111q0.f21459d.containsKey(new C5107o0(C5101l0.class, (C11105a) c5101l0M16022F.f21443x)) ? new C5112r(c5101l0M16022F) : c5121z.m16092b(c5101l0M16022F);
        } catch (IOException e5) {
            throw new GeneralSecurityException("Failed to parse proto", e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m42226c(AbstractC14733k abstractC14733k) {
        return abstractC14733k instanceof C5112r ? ((C36409p3) ((C5112r) abstractC14733k).f21460a.f21444y).m16108e() : ((C36409p3) ((C5101l0) C5121z.f21474b.m16098h(abstractC14733k)).f21444y).m16108e();
    }
}
