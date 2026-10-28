package x30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.C1844y;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bi.AbstractC3269g;
import com.mapbox.common.HttpHeaders;
import com.stripe.android.uicore.elements.C5705a;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.whoop.android.R;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import g40.AbstractC15327b3;
import g40.C15333c3;
import g40.C15339d3;
import g40.C15351f3;
import g40.C15372j0;
import g40.C15378k0;
import g40.C15420s2;
import g40.C15425t2;
import g40.InterfaceC15361h1;
import g40.InterfaceC15379k1;
import g40.InterfaceC15445x2;
import g40.InterfaceC15450y2;
import g40.InterfaceC15455z2;
import hc3.AbstractC17182o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n53.C26318e;
import p048ce.C4463d;
import p077d0.C11387o2;
import p390p1.C28655q;
import p463rj.AbstractC31484o;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p695zx.C41192n;
import p695zx.C41193o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import uo1.C35141b;
import w30.C36784a;
import w30.C36785b;
import w30.InterfaceC36786c;
import wb3.AbstractC37056f;
import y00.EnumC38853i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: x30.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C37928t implements InterfaceC15455z2, InterfaceC15445x2 {

    /* JADX INFO: renamed from: a */
    public final C15378k0 f162383a;

    /* JADX INFO: renamed from: b */
    public final C15333c3 f162384b;

    /* JADX INFO: renamed from: c */
    public final C37940z f162385c;

    /* JADX INFO: renamed from: d */
    public final C37887f0 f162386d;

    /* JADX INFO: renamed from: e */
    public final C15333c3 f162387e;

    /* JADX INFO: renamed from: f */
    public final C35141b f162388f;

    /* JADX INFO: renamed from: g */
    public final List f162389g;

    /* JADX INFO: renamed from: h */
    public final C26318e f162390h;

    public C37928t(C41193o cardAccountRangeRepositoryFactory, LinkedHashMap linkedHashMap, boolean z4, InterfaceC36786c cbcEligibility, InterfaceC35320a cardBrandFilter, InterfaceC35322b cardFundingFilter) {
        EnumC38853i enumC38853i;
        C15333c3 c15333c3;
        InterfaceC37922r c37916p;
        EnumC38853i enumC38853iM106236i;
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3069w1 uiContext = AbstractC17182o.f65999a;
        ExecutorC22364d workContext = ExecutorC22364d.f87316w;
        C37938y c37938y = new C37938y(!AbstractC22676k.m65745e(cbcEligibility, C36785b.f157369w), cardBrandFilter, cardFundingFilter);
        C11387o2 c11387o2 = new C11387o2(10);
        C15372j0 c15372j0 = new C15372j0();
        AbstractC22676k.m65750j(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC22676k.m65750j(cbcEligibility, "cbcEligibility");
        AbstractC22676k.m65750j(uiContext, "uiContext");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        this.f162383a = C15378k0.f57812w;
        C25271y c25271y = C25271y.f99162w;
        if (z4) {
            C15339d3 c15339d3 = new C15339d3(AbstractC32128i.m100064s(R.string.stripe_name_on_card, new Object[0], c25271y), 2, 1, null, false, 56);
            IdentifierSpec.Companion.getClass();
            enumC38853i = null;
            c15333c3 = new C15333c3(IdentifierSpec.Name, new C15351f3(c15339d3, (String) linkedHashMap.get(IdentifierSpec.Name), null, 4));
        } else {
            enumC38853i = null;
            c15333c3 = null;
        }
        this.f162384b = c15333c3;
        IdentifierSpec.Companion.getClass();
        IdentifierSpec identifierSpec = IdentifierSpec.CardNumber;
        C41192n c41192n = (C41192n) cardAccountRangeRepositoryFactory.f177722e.getValue();
        String str = (String) linkedHashMap.get(IdentifierSpec.CardNumber);
        if (cbcEligibility instanceof C36784a) {
            List list = ((C36784a) cbcEligibility).f157368w;
            String str2 = (String) linkedHashMap.get(IdentifierSpec.PreferredCardBrand);
            if (str2 != null) {
                EnumC38853i.f167238M.getClass();
                enumC38853iM106236i = C33623c0.m106236i(str2);
            } else {
                enumC38853iM106236i = enumC38853i;
            }
            c37916p = new C37916p(list, enumC38853iM106236i);
        } else {
            if (!(cbcEligibility instanceof C36785b)) {
                throw new NoWhenBranchMatchedException();
            }
            c37916p = C37919q.f162375a;
        }
        C37940z c37940z = new C37940z(identifierSpec, new C37917p0(c37938y, c41192n, uiContext, workContext, str, c37916p, cardBrandFilter, cardFundingFilter));
        this.f162385c = c37940z;
        C37887f0 c37887f0 = new C37887f0(IdentifierSpec.CardCvc, new C37884e0(c11387o2, c37940z.f162419c.f162366u, (String) linkedHashMap.get(IdentifierSpec.CardCvc)));
        this.f162386d = c37887f0;
        IdentifierSpec identifierSpecM16892a = C5705a.m16892a(HttpHeaders.DATE);
        Object obj = linkedHashMap.get(IdentifierSpec.CardExpMonth);
        String str3 = (String) linkedHashMap.get(IdentifierSpec.CardExpYear);
        C15333c3 c15333c4 = new C15333c3(identifierSpecM16892a, new C15351f3(c15372j0, obj + (str3 != null ? AbstractC39414r.m125867M0(2, str3) : null), C37925s.f162381w));
        this.f162387e = c15333c4;
        this.f162388f = new C35141b(this, 27);
        List listM118959K = AbstractC37056f.m118959K(c15333c4, c37887f0);
        this.f162389g = AbstractC25260n.m74077r0(new InterfaceC15450y2[]{c15333c3, c37940z, new C15425t2(C5705a.m16892a("row_" + UUID.randomUUID().getLeastSignificantBits()), listM118959K, new C15420s2(listM118959K))});
        List listM74077r0 = AbstractC25260n.m74077r0(new AbstractC15327b3[]{c15333c3, c37940z, c15333c4, c37887f0});
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM74077r0, 10));
        Iterator it = listM74077r0.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC15327b3) it.next()).mo43534k());
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((InterfaceC15379k1) it3.next()).mo43544f());
        }
        this.f162390h = new C26318e(arrayList2.isEmpty() ? AbstractC3269g.m9493Z((InterfaceC15361h1) AbstractC25265s.m74100H0(AbstractC25265s.m74092D0(AbstractC25265s.m74152u1(c25271y, this.f162383a)))) : new C1844y(7, (InterfaceC13058l[]) AbstractC25265s.m74093D1(arrayList2).toArray(new InterfaceC13058l[0]), this), new C4463d(15, arrayList2, this));
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: b */
    public final void mo43558b(boolean z4) {
        Iterator it = this.f162389g.iterator();
        while (it.hasNext()) {
            ((InterfaceC15450y2) it.next()).mo43537b(z4);
        }
    }

    @Override // g40.InterfaceC15455z2
    /* JADX INFO: renamed from: f */
    public final InterfaceC13037f2 mo43544f() {
        return this.f162390h;
    }

    @Override // g40.InterfaceC15445x2
    /* JADX INFO: renamed from: i */
    public final void mo43545i(boolean z4, InterfaceC15450y2 interfaceC15450y2, Modifier modifier, Set set, IdentifierSpec identifierSpec, Composer composer, int i13) {
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-125603865);
        int i14 = i13 >> 3;
        AbstractC31484o.m96949a(z4, this, set, identifierSpec, modifier, c28655q, (i13 & 14) | ((i13 >> 12) & 112) | (i14 & 896) | (IdentifierSpec.$stable << 9) | (i14 & 7168) | ((i13 << 6) & 57344));
        c28655q.m87173q(false);
    }
}
