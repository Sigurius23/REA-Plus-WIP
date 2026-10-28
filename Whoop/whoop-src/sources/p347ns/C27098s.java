package p347ns;

import a33.C0352d;
import at.EnumC1972p;
import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5110q;
import com.google.crypto.tink.internal.C5117v;
import com.google.crypto.tink.internal.C5118w;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import ng3.C26701n;
import p075ct.C11105a;
import p154fs.InterfaceC14727e;
import p560vs.C36379k3;
import p560vs.C36391m3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;

/* JADX INFO: renamed from: ns.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C27098s implements InterfaceC14727e {
    public C27098s(C0352d c0352d) {
        if (c0352d.m953z()) {
            C5117v c5117vM16084a = C5118w.f21467b.m16084a();
            AbstractC5078a.m15936i(c0352d);
            c5117vM16084a.getClass();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C27098s m81467a(C5110q c5110q) throws GeneralSecurityException {
        C5099k0 c5099k0 = c5110q.f21455a;
        C5110q.m16075V(c5099k0);
        C36379k3 c36379k3M116432G = C36391m3.m116432G();
        c36379k3M116432G.m116388h((String) c5099k0.f21439x);
        c36379k3M116432G.m116389i((AbstractC5146i) c5099k0.f21441z);
        c36379k3M116432G.m116387g((EnumC36385l3) c5099k0.f21436E);
        EnumC36362h4 enumC36362h4 = (EnumC36362h4) c5099k0.f21437F;
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else if (iOrdinal == 2) {
            ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + enumC36362h4);
            }
            ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        }
        return new C27098s();
    }

    /* JADX INFO: renamed from: b */
    public static C27098s m81468b(C27095p c27095p) {
        C27092m c27092m = c27095p.f108307b;
        C11105a c11105a = c27095p.f108308c;
        m81471e(c27092m.f108291a);
        m81470d(c27092m.f108292b);
        m81469c(c27092m.f108293c);
        C11105a c11105a2 = c27095p.f108309d;
        C27098s c27098s = new C27098s();
        c11105a.m30035b();
        c11105a2.m30035b();
        return c27098s;
    }

    /* JADX INFO: renamed from: c */
    public static void m81469c(C27088i c27088i) {
        if (!c27088i.equals(C27088i.f108279z) && !c27088i.equals(C27088i.f108277E) && !c27088i.equals(C27088i.f108278F)) {
            throw new GeneralSecurityException("Unrecognized HPKE AEAD identifier");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m81470d(C27089j c27089j) {
        if (!c27089j.equals(C27089j.f108282z) && !c27089j.equals(C27089j.f108280E) && !c27089j.equals(C27089j.f108281F)) {
            throw new GeneralSecurityException("Unrecognized HPKE KDF identifier");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m81471e(C27090k c27090k) {
        if (c27090k.equals(C27090k.f108285G)) {
            return;
        }
        if (c27090k.equals(C27090k.f108286z)) {
            C26701n.m79404k(EnumC1972p.f7802w);
        } else if (c27090k.equals(C27090k.f108283E)) {
            C26701n.m79404k(EnumC1972p.f7803x);
        } else {
            if (!c27090k.equals(C27090k.f108284F)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            C26701n.m79404k(EnumC1972p.f7804y);
        }
    }
}
