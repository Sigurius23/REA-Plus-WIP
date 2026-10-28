package p389p0;

import androidx.compose.foundation.lazy.layout.C1106b;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import p005a3.C0238p0;
import p005a3.InterfaceC0245r;
import p014aj.C0929d;
import p026b2.AbstractC2316v;
import p270k2.C22128b;
import p293l2.C23226c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p0.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C28554v extends AbstractC2316v implements InterfaceC0245r {

    /* JADX INFO: renamed from: O */
    public C1106b f115524O;

    public C28554v(C1106b c1106b) {
        this.f115524O = c1106b;
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) {
        C22128b c22128b = c0238p0.f815w;
        ArrayList arrayList = this.f115524O.f4621i;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C28550t c28550t = (C28550t) arrayList.get(i13);
            C23226c c23226c = c28550t.f115514n;
            if (c23226c != null) {
                long j7 = c28550t.f115513m;
                long j13 = c23226c.f91984t;
                float f13 = ((int) (j7 >> 32)) - ((int) (j13 >> 32));
                float f14 = ((int) (j7 & 4294967295L)) - ((int) (j13 & 4294967295L));
                ((C0929d) c22128b.f85852x.f812x).m2339B(f13, f14);
                try {
                    AbstractC15751g.m44467t(c0238p0, c23226c);
                    ((C0929d) c22128b.f85852x.f812x).m2339B(-f13, -f14);
                } catch (Throwable th3) {
                    ((C0929d) c22128b.f85852x.f812x).m2339B(-f13, -f14);
                    throw th3;
                }
            }
        }
        c0238p0.m728a();
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        this.f115524O.f4622j = this;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        C1106b c1106b = this.f115524O;
        c1106b.m3440e();
        c1106b.f4614b = null;
        c1106b.f4615c = -1;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m86861X0(C1106b c1106b) {
        if (this.f115524O.equals(c1106b) || !this.f9142w.f9141N) {
            return;
        }
        C1106b c1106b2 = this.f115524O;
        c1106b2.m3440e();
        c1106b2.f4614b = null;
        c1106b2.f4615c = -1;
        c1106b.f4622j = this;
        this.f115524O = c1106b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28554v) && AbstractC22676k.m65745e(this.f115524O, ((C28554v) obj).f115524O);
    }

    public final int hashCode() {
        return this.f115524O.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f115524O + ')';
    }
}
