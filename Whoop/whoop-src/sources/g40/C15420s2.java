package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bi.AbstractC3269g;
import com.stripe.android.uicore.elements.IdentifierSpec;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.C26318e;
import p108e4.AbstractC12667a;
import p390p1.C28655q;
import p599wz.C37722h1;
import p715kotlin.jvm.internal.AbstractC22676k;
import x30.C37910n;
import x30.C37913o;

/* JADX INFO: renamed from: g40.s2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15420s2 implements InterfaceC15455z2, InterfaceC15445x2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57936a = 0;

    /* JADX INFO: renamed from: b */
    public final C26318e f57937b;

    /* JADX INFO: renamed from: c */
    public final Object f57938c;

    public C15420s2(List fields) {
        AbstractC22676k.m65750j(fields, "fields");
        this.f57938c = fields;
        List list = fields;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC15327b3) it.next()).mo43534k().mo43544f());
        }
        this.f57937b = new C26318e(arrayList.isEmpty() ? AbstractC3269g.m9493Z((InterfaceC15361h1) AbstractC25265s.m74100H0(AbstractC25265s.m74092D0(C25271y.f99162w))) : new C15329c((InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList).toArray(new InterfaceC13058l[0]), 5), new C15335d(arrayList, 5));
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43544f() {
        switch (this.f57936a) {
            case 0:
                break;
        }
        return this.f57937b;
    }

    @Override // g40.InterfaceC15445x2
    /* JADX INFO: renamed from: i */
    public final void mo43545i(boolean z4, InterfaceC15450y2 interfaceC15450y2, Modifier modifier, Set set, IdentifierSpec identifierSpec, Composer composer, int i13) {
        switch (this.f57936a) {
            case 0:
                AbstractC22676k.m65750j(modifier, "modifier");
                C28655q c28655q = (C28655q) composer;
                c28655q.m87150e0(1457794813);
                int i14 = i13 >> 3;
                AbstractC12667a.m35457i(z4, this, set, identifierSpec, modifier, c28655q, (i13 & 14) | ((i13 >> 12) & 112) | (i14 & 896) | (i14 & 7168) | ((i13 << 6) & 57344));
                c28655q.m87173q(false);
                break;
            default:
                AbstractC22676k.m65750j(modifier, "modifier");
                C28655q c28655q2 = (C28655q) composer;
                c28655q2.m87150e0(593571299);
                InterfaceC15455z2 interfaceC15455z2 = ((C37913o) this.f57938c).f162321d;
                if (interfaceC15455z2 instanceof InterfaceC15445x2) {
                    ((InterfaceC15445x2) interfaceC15455z2).mo43545i(z4, interfaceC15450y2, modifier, set, identifierSpec, c28655q2, (i13 & 8190) | (IdentifierSpec.$stable << 12) | (i13 & 57344));
                }
                c28655q2.m87173q(false);
                break;
        }
    }

    public C15420s2(C37913o c37913o) {
        this.f57938c = c37913o;
        this.f57937b = AbstractC3269g.m9518y(AbstractC3269g.m9518y(c37913o.f162320c.mo43553g(), new C37910n(c37913o, 1)), new C37722h1(4));
    }
}
