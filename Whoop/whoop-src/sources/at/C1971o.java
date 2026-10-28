package at;

import a33.C0352d;
import com.google.crypto.tink.internal.AbstractC5078a;
import com.google.crypto.tink.internal.AbstractC5082c;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5110q;
import com.google.crypto.tink.internal.C5117v;
import com.google.crypto.tink.internal.C5118w;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import ih0.AbstractC18489d0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p075ct.C11105a;
import p154fs.InterfaceC14736n;
import p560vs.C36379k3;
import p560vs.C36391m3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;
import ws.C37585g;
import ws.C37589k;

/* JADX INFO: renamed from: at.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C1971o implements InterfaceC14736n {
    public C1971o(C0352d c0352d) {
        if (c0352d.m953z()) {
            C5117v c5117vM16084a = C5118w.f21467b.m16084a();
            AbstractC5078a.m15936i(c0352d);
            c5117vM16084a.getClass();
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1971o m6021a(C5110q c5110q) {
        C5099k0 c5099k0 = c5110q.f21455a;
        C5110q.m16075V(c5099k0);
        C36379k3 c36379k3M116432G = C36391m3.m116432G();
        c36379k3M116432G.m116388h((String) c5099k0.f21439x);
        c36379k3M116432G.m116389i((AbstractC5146i) c5099k0.f21441z);
        c36379k3M116432G.m116387g((EnumC36385l3) c5099k0.f21436E);
        m6023c(c5099k0);
        ((EnumC36362h4) c5099k0.f21437F).equals(EnumC36362h4.LEGACY);
        return new C1971o();
    }

    /* JADX INFO: renamed from: b */
    public static C1971o m6022b(C37589k c37589k) throws GeneralSecurityException {
        if (!AbstractC18489d0.m53360a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        byte[] bArrM30035b = c37589k.f160745c.m30035b();
        c37589k.f160746d.m30035b();
        c37589k.f160744b.f160735a.equals(C37585g.f160732d);
        C1971o c1971o = new C1971o();
        if (!AbstractC18489d0.m53360a(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArrM30035b.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        C11105a.m30034a(bArrM30035b);
        if (AbstractC5082c.f21395a != null) {
            return c1971o;
        }
        throw new IllegalStateException("Could not initialize Ed25519.");
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m6023c(C5099k0 c5099k0) {
        EnumC36362h4 enumC36362h4 = (EnumC36362h4) c5099k0.f21437F;
        Integer num = (Integer) c5099k0.f21438w;
        int iOrdinal = enumC36362h4.ordinal();
        if (iOrdinal == 1) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return new byte[0];
            }
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array();
    }
}
