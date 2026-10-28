package p738tv0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kv0.AbstractC22843a;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: tv0.c, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onTryAgainClicked", "b", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "content-search_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function0 {
    /* JADX INFO: renamed from: b */
    public static final void m108114b(InterfaceC4339a onTryAgainClicked, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onTryAgainClicked, "onTryAgainClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(209550917);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(onTryAgainClicked) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC33199m0.m105214F(new AbstractC33208p0.b(new TextResource.C8688b(AbstractC22843a.f90057b, null, 2, null), false, null, 6, null), AbstractC8693b.m21267a(), onTryAgainClicked, new TextResource.C8688b(AbstractC22843a.f90056a, null, 2, null), onTryAgainClicked, false, false, null, null, null, false, false, c28655q, ((i14 << 12) & 57344) | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | ((i14 << 6) & 896) | (TextResource.C8688b.f25889c << 9), 0, 4064);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4651t(i13, 22, onTryAgainClicked);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m108115c(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m108114b(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
