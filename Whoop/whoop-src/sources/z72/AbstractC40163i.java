package z72;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b01.C2188i;
import b91.C2886a;
import d11.C11474i;
import ej1.C13258u;
import gb1.AbstractC15676d;
import h51.C16934f;
import hy0.C17736e;
import hy0.C17749h0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import qz0.AbstractC30795n;
import uf0.C34905f;
import vx0.C36553a;
import wb3.AbstractC37056f;
import x72.C38043a;
import x81.C38072d;
import y72.AbstractC39285a;
import yf1.C39516e;

/* JADX INFO: renamed from: z72.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lx72/a;", "section", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lx72/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "sanguine_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40163i {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    public static final void m128875h(C38043a section, Function1 onViewEvent, Composer composer, int i13) {
        Function1 function1;
        Object next;
        C0209i c0209i;
        C2305k c2305k;
        C0213j c0213j;
        boolean z4;
        C0209i c0209i2;
        C0209i c0209i3;
        boolean z13;
        C0209i c0209i4;
        C28676v0 c28676v0;
        C2314t c2314t;
        AbstractC22676k.m65750j(section, "section");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1358500044);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(section) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Iterator<T> it = section.m121804b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((InterfaceC25312u) next) instanceof C16934f));
            boolean z14 = next != null;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i7);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N);
            String strM121805c = section.getHeaderText();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (strM121805c == null) {
                c28655q.m87150e0(1524051485);
                c28655q.m87173q(false);
                z4 = z14;
                c0209i4 = c0209i8;
                c0209i3 = c0209i7;
                c0209i = c0209i5;
                z13 = false;
                c28676v0 = c28676v1;
                c2314t = c2314t2;
                c0209i2 = c0209i6;
                c2305k = c2305k2;
                c0213j = c0213j2;
            } else {
                c28655q.m87150e0(1524051486);
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                C2886a c2886aM8417O = c38072d.m121952e(c28655q, i15).getT2();
                long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, 1 * 8, 7);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v1) {
                    objM87133R = new C40160f(3);
                    c28655q.m87172p0(objM87133R);
                }
                c0209i = c0209i5;
                c2305k = c2305k2;
                c0213j = c0213j2;
                z4 = z14;
                c0209i2 = c0209i6;
                c0209i3 = c0209i7;
                z13 = false;
                c0209i4 = c0209i8;
                c28676v0 = c28676v1;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(strM121805c, AbstractC15676d.m44099b(modifierM3398t, z14, (Function1) objM87133R), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            String strM121803a = section.getBodyText();
            if (strM121803a == null) {
                c28655q.m87150e0(1524540727);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(1524540728);
                C38072d c38072d2 = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                C2886a c2886aM8420a = c38072d2.m121952e(c28655q, i16).getB1();
                long jM125385c1 = c38072d2.m121949b(c28655q, i16).getWhite70();
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C40160f(4);
                    c28655q.m87172p0(objM87133R2);
                }
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM121803a, AbstractC15676d.m44099b(c2314t, z4, (Function1) objM87133R2), jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(z13);
            }
            if (section.getHeaderText() == null && section.getBodyText() == null) {
                c28655q.m87150e0(1525007712);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(1524957740);
                AbstractC25012a.m73389v(c2314t, 16, c28655q, z13);
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(8), c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            c28655q.m87150e0(2143711767);
            for (InterfaceC25312u interfaceC25312u : section.m121804b()) {
                if (interfaceC25312u instanceof C17749h0) {
                    c28655q.m87150e0(-1898246404);
                    AbstractC25303l.m74291r(interfaceC25312u, null, new C36553a(27), null, c28655q, 0, 10);
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(-1898030613);
                    C25307p c25307pM125252h = AbstractC39285a.m125252h();
                    C13258u c13258u = new C13258u(7, interfaceC25312u);
                    boolean zM87157i = c28655q.m87157i(interfaceC25312u) | ((i14 & 112) == 32 ? true : z13);
                    Object objM87133R3 = c28655q.m87133R();
                    if (zM87157i || objM87133R3 == c28676v0) {
                        objM87133R3 = new C34905f(interfaceC25312u, onViewEvent, 7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM125252h, c13258u, (Function1) objM87133R3, c28655q, C25307p.f99300b << 3, 0);
                    c28655q.m87173q(z13);
                }
            }
            function1 = onViewEvent;
            AbstractC25012a.m73392y(c28655q, z13, true, true);
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(section, function1, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Modifier m128876i(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3396r(applyIf, 16, 0.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Modifier m128877j(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3396r(applyIf, 16, 0.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final Modifier m128878k(C17749h0 it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1218294787);
        Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), false, 1.0f);
        c28655q.m87173q(false);
        return modifierM3384f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final Modifier m128879l(InterfaceC25312u interfaceC25312u, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(37682635);
        boolean z4 = interfaceC25312u instanceof C17736e;
        Object objM87133R = c28655q.m87133R();
        if (objM87133R == C28635l.f115821a) {
            objM87133R = new C40160f(5);
            c28655q.m87172p0(objM87133R);
        }
        Modifier modifierM44099b = AbstractC15676d.m44099b(C2314t.f9131w, z4, (Function1) objM87133R);
        c28655q.m87173q(false);
        return modifierM44099b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Modifier m128880m(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 16, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m128881n(InterfaceC25312u interfaceC25312u, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (interfaceC25312u instanceof C11474i) {
            function1.invoke(interfaceC25312u);
        } else if (interfaceC25312u instanceof C2188i) {
            function1.invoke(((C2188i) interfaceC25312u).getCta());
        } else {
            function1.invoke(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m128882o(C38043a c38043a, Function1 function1, int i13, Composer composer, int i14) {
        m128875h(c38043a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
