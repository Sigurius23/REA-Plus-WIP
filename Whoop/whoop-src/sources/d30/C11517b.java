package d30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p097ds.AbstractC12314q;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;
import v00.C35459c0;
import y00.C38915o4;

/* JADX INFO: renamed from: d30.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C11517b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37093w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11535h f37094x;

    public /* synthetic */ C11517b(C11535h c11535h) {
        this.f37094x = c11535h;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37093w) {
            case 0:
                List paymentMethods = (List) obj;
                String str = (String) obj2;
                AbstractC22676k.m65750j(paymentMethods, "paymentMethods");
                List list = paymentMethods;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC32411b.m101092e0((C38915o4) it.next(), (C35459c0) this.f37094x.f37186c, str));
                }
                return arrayList;
            default:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC12314q.m34326f(this.f37094x, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C11517b(C11535h c11535h, int i13) {
        this.f37094x = c11535h;
    }
}
