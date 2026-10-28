package p077d0;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.C1578e1;
import c41.C4065l3;
import c93.InterfaceC4351m;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p446r1.C30849c;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: d0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11373l0 {

    /* JADX INFO: renamed from: a */
    public final C30849c f36453a = new C30849c(new C11365j0[16]);

    /* JADX INFO: renamed from: b */
    public final C28633k1 f36454b = AbstractC28683x.m87272z(Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public long f36455c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public final C28633k1 f36456d = AbstractC28683x.m87272z(Boolean.TRUE);

    /* JADX INFO: renamed from: a */
    public final void m30603a(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-318043801);
        int i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            InterfaceC30057d interfaceC30057d = null;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            if (((Boolean) this.f36456d.getValue()).booleanValue() || ((Boolean) this.f36454b.getValue()).booleanValue()) {
                c28655q.m87150e0(-144783432);
                boolean zM87157i = c28655q.m87157i(this);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C1578e1(interfaceC28601c1, this, interfaceC30057d, 4);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, this);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-143396709);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4065l3(this, i13);
        }
    }
}
