package p505ts;

import bt.C3614a;
import bt.C3615b;
import com.google.crypto.tink.internal.C5099k0;
import com.google.crypto.tink.internal.C5110q;
import com.google.crypto.tink.shaded.protobuf.AbstractC5146i;
import java.io.IOException;
import java.security.GeneralSecurityException;
import p154fs.AbstractC14737o;
import p560vs.C36379k3;
import p560vs.C36391m3;
import p560vs.EnumC36385l3;

/* JADX INFO: renamed from: ts.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C34133p implements InterfaceC34130m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f143073a;

    /* JADX INFO: renamed from: b */
    public final Object f143074b;

    public /* synthetic */ C34133p(Object obj, int i13) {
        this.f143073a = i13;
        this.f143074b = obj;
    }

    /* JADX INFO: renamed from: b */
    public static C34133p m107902b(C5110q c5110q) {
        C5099k0 c5099k0 = c5110q.f21455a;
        C5110q.m16075V(c5099k0);
        C36379k3 c36379k3M116432G = C36391m3.m116432G();
        c36379k3M116432G.m116388h((String) c5099k0.f21439x);
        c36379k3M116432G.m116389i((AbstractC5146i) c5099k0.f21441z);
        c36379k3M116432G.m116387g((EnumC36385l3) c5099k0.f21436E);
        return new C34133p(AbstractC14737o.m42241a((C36391m3) c36379k3M116432G.m16347b(), InterfaceC34130m.class), 1);
    }

    /* JADX INFO: renamed from: c */
    public static C34133p m107903c(C3615b c3615b) {
        return new C34133p(c3615b, 2);
    }

    @Override // p505ts.InterfaceC34130m
    /* JADX INFO: renamed from: a */
    public final byte[] mo6031a(int i13, byte[] bArr) throws GeneralSecurityException {
        switch (this.f143073a) {
            case 0:
                return ((InterfaceC34130m) this.f143074b).mo6031a(i13, bArr);
            case 1:
                return ((InterfaceC34130m) this.f143074b).mo6031a(i13, bArr);
            default:
                if (i13 <= 0) {
                    throw new GeneralSecurityException("Invalid outputLength specified.");
                }
                C3614a c3614a = new C3614a((C3615b) this.f143074b, bArr);
                try {
                    byte[] bArr2 = new byte[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = c3614a.read(bArr2, i14, i13 - i14);
                        if (i15 <= 0) {
                            throw new GeneralSecurityException("Provided StreamingPrf terminated before providing requested number of bytes.");
                        }
                        i14 += i15;
                    }
                    return bArr2;
                } catch (IOException e5) {
                    throw new GeneralSecurityException(e5);
                }
        }
    }

    public C34133p(InterfaceC34130m interfaceC34130m, int i13) {
        this.f143073a = 0;
        this.f143074b = interfaceC34130m;
    }
}
