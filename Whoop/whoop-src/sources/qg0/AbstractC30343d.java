package qg0;

import a80.C0546j;
import a80.C0547k;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bg0.C3226h;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15674c;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import l83.C23454a0;
import og0.C27917c;
import og0.InterfaceC27915a;
import oq1.C28119c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p602x1.C37816b;
import p62.C28947h;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.InterfaceC25312u;
import q11.C29793c;
import qe0.C30301b;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: qg0.d */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Log0/c$d;", "viewState", "", "isPresented", "Lkotlin/Function1;", "Log0/a;", "Ll83/a0;", "onEvent", "i", "(Log0/c$d;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/u;", "item", "", "o", "(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "advanced-labs-management_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30343d {
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116  */
    /* JADX WARN: Code duplicated, block: B:57:0x0121  */
    /* JADX WARN: Code duplicated, block: B:60:0x0168  */
    /* JADX WARN: Code duplicated, block: B:61:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0177  */
    /* JADX WARN: Code duplicated, block: B:68:0x019e  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m92718i(C27917c.d viewState, boolean z4, Function1 onEvent, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iM53357C;
        int i16;
        boolean z17;
        Object objM87133R;
        boolean z18;
        boolean z19;
        Object objM87133R2;
        int i17;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-649181570);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q.m87157i(onEvent)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM114675c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                TextResource textResourceM84239b = viewState.getToolbarTitle();
                if (z16) {
                    iM53357C = AbstractC39383f.m125595a(C38072d.f163053a);
                } else {
                    iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
                }
                AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM84239b, null, Integer.valueOf(iM53357C), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                float f13 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f13, c2314t);
                i16 = i15 & 896;
                if (i16 == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (z17 || objM87133R == c28676v0) {
                    objM87133R = new C28947h(onEvent, 28);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(modifierM3394p, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                float f14 = 2 * f13;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC15674c.m44085i(c2314t, 0.0f, null, 3, null), f14, 0.0f, 2);
                C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0.0f, f14, 1);
                C2305k c2305k = C2299e.f9111N;
                boolean zM87157i = c28655q.m87157i(viewState);
                if (i16 == 256) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zM87157i | z18;
                objM87133R2 = c28655q.m87133R();
                if (z19 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C29793c(viewState, onEvent, 8);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC22674j.m65717c(modifierM3396r, null, c22976l1M3379a, null, c2305k, null, false, null, (Function1) objM87133R2, c28655q, 196992, 474);
                c28655q = c28655q;
                c28655q.m87173q(true);
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(viewState, z15, onEvent, i13, i14, 26);
            }
        }
        i15 |= 48;
        z13 = z4;
        if ((i13 & 384) == 0) {
            if (c28655q.m87157i(onEvent)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM114675c2 = AbstractC36095b.m114675c(c2314t2, 1.0f);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM114675c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            TextResource textResourceM84239b2 = viewState.getToolbarTitle();
            if (z16) {
                iM53357C = AbstractC39383f.m125595a(C38072d.f163053a);
            } else {
                iM53357C = AbstractC18489d0.m53357C(C38072d.f163053a);
            }
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(textResourceM84239b2, null, Integer.valueOf(iM53357C), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            float f15 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(1 * f15, c2314t2);
            i16 = i15 & 896;
            if (i16 == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z17) {
                objM87133R = new C28947h(onEvent, 28);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C28947h(onEvent, 28);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3394p2, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f16 = 2 * f15;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC15674c.m44085i(c2314t2, 0.0f, null, 3, null), f16, 0.0f, 2);
            C22976l1 c22976l1M3379a2 = AbstractC1099a.m3379a(0.0f, f16, 1);
            C2305k c2305k2 = C2299e.f9111N;
            boolean zM87157i2 = c28655q.m87157i(viewState);
            if (i16 == 256) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zM87157i2 | z18;
            objM87133R2 = c28655q.m87133R();
            if (z19) {
                objM87133R2 = new C29793c(viewState, onEvent, 8);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C29793c(viewState, onEvent, 8);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22674j.m65717c(modifierM3396r2, null, c22976l1M3379a2, null, c2305k2, null, false, null, (Function1) objM87133R2, c28655q, 196992, 474);
            c28655q = c28655q;
            c28655q.m87173q(true);
            z15 = z16;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(viewState, z15, onEvent, i13, i14, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m92719j(Function1 function1) {
        function1.invoke(InterfaceC27915a.e.f112517a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m92720k(C27917c.d dVar, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = dVar.m84238a().iterator();
        while (it.hasNext()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C28119c(8, (C27917c.b) it.next(), function1), true, 846812378), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m92721l(C27917c.b bVar, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        C2314t c2314t;
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            c28655q.m87150e0(2037878056);
            Iterator<T> it = bVar.m84233b().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c2314t = C2314t.f9131w;
                if (!zHasNext) {
                    break;
                }
                InterfaceC25312u interfaceC25312u = (InterfaceC25312u) it.next();
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC25312u);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0546j(function1, interfaceC25312u, 23);
                    c28655q.m87172p0(objM87133R);
                }
                m92724o(interfaceC25312u, (Function1) objM87133R, c28655q, 0, 0);
                AbstractC11266d.m30469w(3, 4, c2314t, c28655q);
            }
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(bVar.getInsetBottom().getSpacing(), c2314t));
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m92722m(Function1 function1, InterfaceC25312u interfaceC25312u, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC27915a.f(it, interfaceC25312u));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m92723n(C27917c.d dVar, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m92718i(dVar, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m92724o(InterfaceC25312u item, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-443646358);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C30301b(6);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C30301b(7);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC25303l.m74291r(item, p720m91.Function1.m74306g((Function1) objM87133R2), null, function3, c28655q, (i15 & 14) | (C25307p.f99300b << 3) | ((i15 << 6) & 7168), 4);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0547k(item, function2, i13, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m92725p(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m92726q(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m92727r(InterfaceC25312u interfaceC25312u, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m92724o(interfaceC25312u, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
