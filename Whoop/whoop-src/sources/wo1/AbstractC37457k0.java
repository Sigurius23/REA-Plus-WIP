package wo1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm0.C3412o;
import bm2.C3428b1;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import gb1.AbstractC15680h;
import ge3.AbstractC15751g;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import java.io.IOException;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.C22411w;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import so1.C32811e0;
import so1.C32821j0;
import t80.C33592b;
import w20.C36727q;
import wb3.AbstractC37056f;
import wl2.C37358a;
import x81.C38072d;
import xn1.AbstractC38480c;

/* JADX INFO: renamed from: wo1.k0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000e\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lso1/e0;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onTileClicked", "i", "(Lso1/e0;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "title", "g", "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "", "Lso1/j0;", "phaseStats", "n", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC37457k0 {
    /* JADX INFO: renamed from: g */
    public static final void m119994g(TextResource title, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        AbstractC22676k.m65750j(title, "title");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-64573771);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(title) : c28655q.m87157i(title) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21274h = AbstractC8693b.m21274h(title, c28655q, (i14 & 14) | TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 6);
            String strM21273g = AbstractC8693b.m21273g(AbstractC38480c.f164870q, c28655q, 0);
            Modifier modifierM44112a = AbstractC15680h.m44112a(c2314t, true);
            float f13 = 4;
            AbstractC15005f3.m43108b(c27430eM107874S, strM21273g, AbstractC1102d.m3419p(f13 * f13, modifierM44112a), c38072d.m121949b(c28655q, i15).getWhite50(), c28655q, 0, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3428b1(title, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m119995h(TextResource textResource, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m119994g(textResource, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m119996i(C32811e0 viewState, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-447724783);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C37358a(28);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(C2314t.f9131w, "PhaseCoachingTileTag");
                z13 = (i15 & 112) == 32;
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C31918g(interfaceC4339a4, 25);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3599a, false, null, null, (InterfaceC4339a) objM87133R, 15), C22411w.f87680a.m64535a().m64090c(), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), null, 0 * 4, AbstractC37817c.m121344e(-961962956, c28655q, new C36727q(viewState, 5)), c28655q, 1769472, 24);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33592b(viewState, i13, interfaceC4339a3, i14, 29);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C37358a(28);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(C2314t.f9131w, "PhaseCoachingTileTag");
            if ((i15 & 112) == 32) {
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C31918g(interfaceC4339a4, 25);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C31918g(interfaceC4339a4, 25);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12889b.m36263b(AbstractC1092a.m3362g(modifierM3599a2, false, null, null, (InterfaceC4339a) objM87133R, 15), C22411w.f87680a.m64535a().m64090c(), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), null, 0 * 4, AbstractC37817c.m121344e(-961962956, c28655q, new C36727q(viewState, 5)), c28655q, 1769472, 24);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(viewState, i13, interfaceC4339a3, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m119997j() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m119998k(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m119999l(C32811e0 c32811e0, Composer composer, int i13) throws XmlPullParserException, IOException {
        float f13;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f14 = 2 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            TextResource textResourceM102959g = c32811e0.getTitleDisplay();
            int i14 = TextResource.$stable;
            m119994g(textResourceM102959g, c28655q, i14);
            float f15 = 4;
            float f16 = f15 * f15;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
            if (c32811e0.getImageUrl() != null) {
                c28655q.m87150e0(1295109712);
                f13 = f16;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c32811e0.getImageUrl(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3411h(160, AbstractC1102d.m3409f(1.0f, c2314t)), null, null, 0.0f, null, c28655q, 432, 120);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                f13 = f16;
                c28655q.m87150e0(1295377304);
                c28655q.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13, c2314t));
            String strM21274h = AbstractC8693b.m21274h(c32811e0.getDescriptionDisplay(), c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
            m120001n(c32811e0.m102958f(), c28655q2, 0);
            AbstractC25012a.m73388u(3, f15, c2314t, c28655q2, true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m120000m(C32811e0 c32811e0, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m119996i(c32811e0, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r21v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v19, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r6v13, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r8v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r8v3, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
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
    /* JADX INFO: renamed from: n */
    public static final void m120001n(List<C32821j0> list, Composer composer, int i13) {
        ?? r10;
        int i14;
        C2314t c2314t;
        boolean z4;
        List<C32821j0> phaseStats = list;
        AbstractC22676k.m65750j(phaseStats, "phaseStats");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1025681641);
        int i15 = 4;
        int i16 = 2;
        int i17 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(phaseStats) ? 4 : 2) : i13;
        ?? r14 = 0;
        ?? r15 = 1;
        if (c28655q.m87135U(i17 & 1, (i17 & 3) != 2)) {
            float f13 = 1.0f;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1102d.m3409f(1.0f, c2314t2), EnumC22935a1.f90537w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3388j);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1316245759);
            int i18 = 0;
            ?? r16 = c28655q;
            for (Object obj : phaseStats) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                C32821j0 c32821j0 = (C32821j0) obj;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3388j(AbstractC1102d.m3409f(f13, c2314t2), EnumC22935a1.f90537w), i18 == 0 ? (float) r14 : i16 * 8, 0.0f, i18 == phaseStats.size() - r15 ? (float) r14 : 8 * i16, 0.0f, 10);
                if (f13 <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3398t, r15, f13);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, r16, r14);
                int iHashCode2 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r16.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r16, modifierM31988g);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j2);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N2);
                if (c32821j0.getIcon() != null) {
                    r16.m87150e0(1843524400);
                    i14 = i18;
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c32821j0.getIcon().intValue(), r16, 6), null, AbstractC1102d.m3419p(5 * i15, c2314t2), C38072d.f163053a.m121949b(r16, C38072d.f163054b).getWhite50(), r16, 432, 0);
                    r16.m87173q(r14);
                } else {
                    i14 = i18;
                    r16.m87150e0(1843829037);
                    r16.m87173q(r14);
                }
                String strM21274h = AbstractC8693b.m21274h(c32821j0.getTitleDisplay(), r16, TextResource.$stable);
                ?? r17 = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                ?? r25 = r16;
                int i25 = i15;
                int i26 = i16;
                ?? r24 = r15;
                C2314t c2314t3 = c2314t2;
                AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t2, 0.0f, 3 * i15, r15), r17.m121949b(r16, i24).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r17.m121952e(r16, i24).getH5(), null, r25, 48, C2886a.f11498d << 18, 196600);
                ?? r18 = r25;
                AbstractC17808z1.m51175c(c32821j0.getTrend(), r18, C17731c2.f68917p);
                r18.m87173q(r24);
                if (i14 < list.size() - (r24 == true ? 1 : 0)) {
                    r18.m87150e0(1915439088);
                    c2314t = c2314t3;
                    f13 = 1.0f;
                    AbstractC15751g.m44449b(AbstractC1102d.m3424u(r24 == true ? 1.0f : 0.0f, AbstractC1102d.m3406c(1.0f, c2314t)), r17.m121949b(r18, i24).getWhite10(), 0.0f, 0.0f, r18, 6, 12);
                    z4 = false;
                    r18.m87173q(false);
                } else {
                    c2314t = c2314t3;
                    f13 = 1.0f;
                    z4 = false;
                    r18.m87150e0(1915644215);
                    r18.m87173q(false);
                }
                r15 = r24 == true ? 1 : 0;
                c2314t2 = c2314t;
                r14 = z4;
                i18 = i19;
                i15 = i25;
                i16 = i26;
                phaseStats = list;
                r16 = r18;
            }
            r16.m87173q(r14);
            r16.m87173q(r15);
            r10 = r16;
        } else {
            c28655q.m87138X();
            r10 = c28655q;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m120002o(List list, int i13, Composer composer, int i14) {
        m120001n(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
