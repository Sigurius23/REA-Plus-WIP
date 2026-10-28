package rs;

import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5110q;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p154fs.InterfaceC14732j;
import p560vs.C36379k3;
import p560vs.C36391m3;
import p560vs.EnumC36362h4;
import p560vs.EnumC36385l3;

/* JADX INFO: renamed from: rs.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C31783e implements InterfaceC14732j {
    /* JADX INFO: renamed from: a */
    public static C31783e m98696a(C5110q c5110q) throws GeneralSecurityException {
        C5099k0 c5099k0 = c5110q.f21455a;
        C5110q.m16075V(c5099k0);
        C36379k3 c36379k3M116432G = C36391m3.m116432G();
        c36379k3M116432G.m116388h((String) c5099k0.f21439x);
        c36379k3M116432G.m116389i((AbstractC5146i) c5099k0.f21441z);
        c36379k3M116432G.m116387g((EnumC36385l3) c5099k0.f21436E);
        int iOrdinal = ((EnumC36362h4) c5099k0.f21437F).ordinal();
        if (iOrdinal == 1) {
            ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else if (iOrdinal == 2) {
            ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) c5099k0.f21438w).intValue()).array();
        }
        return new C31783e();
    }
}
