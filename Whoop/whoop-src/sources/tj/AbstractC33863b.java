package tj;

import androidx.compose.runtime.Composer;
import com.amplitude.android.engagement.C4861a;
import com.amplitude.android.engagement.types.Nudge;
import p043c4.C3955e;
import p043c4.C3963i;
import p292l1.C23187v0;
import p305lj.AbstractC24425e0;
import p328mj.AbstractC25611r;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: tj.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33863b {

    /* JADX INFO: renamed from: a */
    public static final C28596b0 f141865a = new C28596b0(C33862a.f141864w);

    /* JADX INFO: renamed from: a */
    public static final void m107084a(Nudge nudge, int i13, C37816b c37816b, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1412460485);
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = AbstractC28683x.m87272z(null);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
        C4861a c4861a = (C4861a) c28655q.m87161k(AbstractC25611r.f100475a);
        AbstractC24425e0 abstractC24425e0 = (AbstractC24425e0) interfaceC28601c1.getValue();
        AbstractC28683x.m87253g(c28655q, new C23187v0(c4861a, nudge, interfaceC28601c1, i13, (InterfaceC30057d) null), abstractC24425e0 != null ? abstractC24425e0.toJSONString() : null);
        AbstractC28683x.m87247a(f141865a.mo86977a(interfaceC28601c1), AbstractC37817c.m121341b(-585231611, c28655q, new C3955e(c37816b, i14, 10)), c28655q, 56);
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u == null) {
            return;
        }
        c28677v1M87180u.f115982d = new C3963i(nudge, i13, c37816b, i14, 7);
    }
}
