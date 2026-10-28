package bt;

import at.EnumC1979w;
import com.google.crypto.tink.internal.C5088f;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import p075ct.C11105a;
import p505ts.C34122e;
import p505ts.C34124g;
import p505ts.C34125h;
import p581we.C37199o;

/* JADX INFO: renamed from: bt.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3615b implements InterfaceC3616c {

    /* JADX INFO: renamed from: d */
    public static final C37199o f14708d;

    /* JADX INFO: renamed from: a */
    public final EnumC1979w f14709a;

    /* JADX INFO: renamed from: b */
    public final byte[] f14710b;

    /* JADX INFO: renamed from: c */
    public final byte[] f14711c;

    static {
        C5088f c5088fM119196j = C37199o.m119196j();
        c5088fM119196j.m15967a(EnumC1979w.f7828w, C34124g.f143044c);
        c5088fM119196j.m15967a(EnumC1979w.f7829x, C34124g.f143045d);
        c5088fM119196j.m15967a(EnumC1979w.f7830y, C34124g.f143046e);
        c5088fM119196j.m15967a(EnumC1979w.f7831z, C34124g.f143047f);
        c5088fM119196j.m15967a(EnumC1979w.f7826E, C34124g.f143048g);
        f14708d = c5088fM119196j.m15968b();
    }

    public C3615b(EnumC1979w enumC1979w, byte[] bArr, byte[] bArr2) {
        this.f14709a = enumC1979w;
        this.f14710b = Arrays.copyOf(bArr, bArr.length);
        this.f14711c = Arrays.copyOf(bArr2, bArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public static String m10976a(EnumC1979w enumC1979w) throws GeneralSecurityException {
        int iOrdinal = enumC1979w.ordinal();
        if (iOrdinal == 0) {
            return "HmacSha1";
        }
        if (iOrdinal == 2) {
            return "HmacSha256";
        }
        if (iOrdinal == 3) {
            return "HmacSha384";
        }
        if (iOrdinal == 4) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("No getJavaxHmacName for given hash " + enumC1979w + " known");
    }

    /* JADX INFO: renamed from: b */
    public static C3615b m10977b(C34122e c34122e) {
        C34125h c34125h = c34122e.f143038b;
        C11105a c11105a = c34125h.f143058c;
        return new C3615b((EnumC1979w) f14708d.m119215U(c34125h.f143057b), ((C11105a) c34122e.f143039c.f130665x).m30035b(), c11105a == null ? new byte[0] : c11105a.m30035b());
    }
}
