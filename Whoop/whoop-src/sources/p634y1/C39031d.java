package p634y1;

import a11.C0137o;
import androidx.compose.runtime.Composer;
import ih0.AbstractC18489d0;
import java.util.Map;
import l83.C23454a0;
import p002a0.AbstractC0015d1;
import p002a0.C0057v0;
import p007a6.C0467z0;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p419qb.AbstractC30178a;
import p459rf.C31345p;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import vb1.C35868a;
import xl2.C38454a;

/* JADX INFO: renamed from: y1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C39031d implements InterfaceC39030c {

    /* JADX INFO: renamed from: E */
    public static final C28539n0 f167996E = new C28539n0(10, new C38454a(22), new C35868a(17));

    /* JADX INFO: renamed from: w */
    public final Map f167997w;

    /* JADX INFO: renamed from: x */
    public final C0057v0 f167998x;

    /* JADX INFO: renamed from: y */
    public InterfaceC39033f f167999y;

    /* JADX INFO: renamed from: z */
    public final C31345p f168000z;

    public C39031d(Map map) {
        this.f167997w = map;
        long[] jArr = AbstractC0015d1.f36a;
        this.f167998x = new C0057v0();
        this.f168000z = new C31345p(this, 10);
    }

    @Override // p634y1.InterfaceC39030c
    /* JADX INFO: renamed from: a */
    public final void mo86874a(Object obj) {
        if (this.f167998x.m133k(obj) == null) {
            this.f167997w.remove(obj);
        }
    }

    @Override // p634y1.InterfaceC39030c
    /* JADX INFO: renamed from: c */
    public final void mo86875c(Object obj, C37816b c37816b, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(533563200);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(obj) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c37816b) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(this) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87156h0(obj);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                C31345p c31345p = this.f168000z;
                if (!((Boolean) c31345p.invoke(obj)).booleanValue()) {
                    throw new IllegalArgumentException(AbstractC18489d0.m53369j(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
                }
                Map map = (Map) this.f167997w.get(obj);
                C28674u2 c28674u2 = AbstractC39035h.f168004a;
                C39036i c39036i = new C39036i(new C39034g(map, c31345p));
                c28655q.m87172p0(c39036i);
                objM87133R = c39036i;
            }
            C39036i c39036i2 = (C39036i) objM87133R;
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC39035h.f168004a.mo86977a(c39036i2), AbstractC30178a.f123552a.mo86977a(c39036i2)}, c37816b, c28655q, (i14 & 112) | 8);
            boolean zM87157i = c28655q.m87157i(this) | c28655q.m87157i(obj) | c28655q.m87157i(c39036i2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C0467z0(this, obj, c39036i2, 7);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R2, c28655q);
            if (c28655q.f115930y && c28655q.f115891G.f115746i == c28655q.f115931z) {
                c28655q.f115931z = -1;
                c28655q.f115930y = false;
            }
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0137o(this, obj, c37816b, i13, 7);
        }
    }
}
