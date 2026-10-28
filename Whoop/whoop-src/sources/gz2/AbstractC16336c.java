package gz2;

import a80.C0546j;
import a81.C0560k;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.navigation.C9598e;
import com.whoop.whooplabs.feature.navigation.AbstractC10840c;
import d11.C11474i;
import java.util.List;
import kz2.AbstractC22929f;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: gz2.c */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"", "Lm91/u;", "items", "Lkotlin/Function1;", "Lcom/whoop/whooplabs/feature/navigation/c;", "Ll83/a0;", "onNavEvent", "Landroidx/compose/ui/Modifier;", "modifier", "c", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16336c {
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m46534c(List<? extends InterfaceC25312u> items, Function1 onNavEvent, Modifier modifier, Composer composer, int i13, int i14) {
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        boolean z14;
        Object objM87133R;
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-399900525);
        int i15 = (i13 & 6) == 0 ? (c28655q.m87157i(items) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onNavEvent) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                float f13 = 4;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13 * f13), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
                c28655q.m87150e0(-129065019);
                for (InterfaceC25312u interfaceC25312u : items) {
                    C25307p c25307pM66697b = AbstractC22929f.m66697b();
                    boolean zM87157i = c28655q.m87157i(interfaceC25312u);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C0546j(interfaceC25312u, onNavEvent, 9);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM66697b, null, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                modifier3 = modifier4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0560k(items, onNavEvent, modifier3, i13, i14, 3);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            float f14 = 4;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14 * f14), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
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
            c28655q.m87150e0(-129065019);
            while (r3.hasNext()) {
                C25307p c25307pM66697b2 = AbstractC22929f.m66697b();
                boolean zM87157i2 = c28655q.m87157i(interfaceC25312u);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i2 | z13;
                objM87133R = c28655q.m87133R();
                if (z14) {
                    objM87133R = new C0546j(interfaceC25312u, onNavEvent, 9);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C0546j(interfaceC25312u, onNavEvent, 9);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM66697b2, null, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0560k(items, onNavEvent, modifier3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m46535d(InterfaceC25312u interfaceC25312u, Function1 function1, Object it) {
        C9598e c9598eM30835x;
        AbstractC22676k.m65750j(it, "it");
        C11474i c11474i = interfaceC25312u instanceof C11474i ? (C11474i) interfaceC25312u : null;
        if (c11474i != null && (c9598eM30835x = c11474i.getNavigationAction()) != null) {
            function1.invoke(new AbstractC10840c.i(c9598eM30835x));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m46536e(List list, Function1 function1, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m46534c(list, function1, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
