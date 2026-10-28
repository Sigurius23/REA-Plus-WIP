package p635y2;

import java.util.Map;
import p002a0.C0057v0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: y2.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C39100i0 implements InterfaceC39130s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC39130s0 f168194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C39115n0 f168195b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f168196c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC39130s0 f168197d;

    public C39100i0(InterfaceC39130s0 interfaceC39130s0, C39115n0 c39115n0, int i13, InterfaceC39130s0 interfaceC39130s1) {
        this.f168195b = c39115n0;
        this.f168196c = i13;
        this.f168197d = interfaceC39130s1;
        this.f168194a = interfaceC39130s0;
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: a */
    public final Map mo776a() {
        return this.f168194a.mo776a();
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: b */
    public final void mo777b() {
        int i13 = this.f168196c;
        C39115n0 c39115n0 = this.f168195b;
        c39115n0.f168228E = i13;
        this.f168197d.mo777b();
        C0057v0 c0057v0 = c39115n0.f168235L;
        long[] jArr = c0057v0.f170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j7 = jArr[i14];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8 - ((~(i14 - length)) >>> 31);
                for (int i16 = 0; i16 < i15; i16++) {
                    if ((255 & j7) < 128) {
                        int i17 = (i14 << 3) + i16;
                        Object obj = c0057v0.f171b[i17];
                        InterfaceC39131s1 interfaceC39131s1 = (InterfaceC39131s1) c0057v0.f172c[i17];
                        int iM94892j = c39115n0.f168236M.m94892j(obj);
                        if (iM94892j < 0 || iM94892j >= c39115n0.f168228E) {
                            interfaceC39131s1.dispose();
                            c0057v0.m134l(i17);
                        }
                    }
                    j7 >>= 8;
                }
                if (i15 != 8) {
                    return;
                }
            }
            if (i14 == length) {
                return;
            } else {
                i14++;
            }
        }
    }

    @Override // p635y2.InterfaceC39130s0
    /* JADX INFO: renamed from: c */
    public final Function1 mo778c() {
        return this.f168194a.mo778c();
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getHeight() {
        return this.f168194a.getHeight();
    }

    @Override // p635y2.InterfaceC39130s0
    public final int getWidth() {
        return this.f168194a.getWidth();
    }
}
