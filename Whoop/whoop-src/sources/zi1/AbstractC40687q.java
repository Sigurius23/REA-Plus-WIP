package zi1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import b61.AbstractC2756k;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17796v1;
import hy0.C17723a2;
import hy0.EnumC17727b2;
import j71.C21395c;
import java.util.List;
import kd1.C22411w;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p727py0.C29616a;
import p736sz0.C33209p1;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import sk1.AbstractC32572a;
import sk1.C32573b;
import wb3.AbstractC37056f;
import x81.C38072d;
import xi1.InterfaceC38321a;
import y71.C39272e;
import yf1.C39516e;
import yi1.C39575i;
import yo1.C39689b;

/* JADX INFO: renamed from: zi1.q */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\n\u0010\t\u001a%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lyi1/i;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Lyi1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "m", "(Lyi1/i;Landroidx/compose/runtime/Composer;I)V", "o", "Lj71/c;", "Lkotlin/Function0;", "onClick", "q", "(Lj71/c;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "kennel_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40687q {
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
    /* JADX INFO: renamed from: i */
    public static final void m132106i(C39575i state, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1226731747);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(state);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C39689b(18, onViewEvent, state);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C39272e(interfaceC4339a, 20);
                c28655q.m87172p0(objM87133R2);
            }
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R2, 15)), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), C22411w.f87680a.m64535a().m64090c()));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9111N, c28655q, 54);
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
            int i15 = i14 & 14;
            m132112o(state, c28655q, i15);
            C21395c c21395cM126444f = state.getWaveform();
            if (c21395cM126444f == null) {
                c28655q.m87150e0(-1713742027);
            } else {
                c28655q.m87150e0(-1713742026);
                m132114q(c21395cM126444f, interfaceC4339a, c28655q, C21395c.f81985e);
            }
            c28655q.m87173q(false);
            m132110m(state, c28655q, i15);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(state, onViewEvent, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m132107j(Function1 function1, C39575i c39575i) {
        function1.invoke(new InterfaceC38321a.d(c39575i.getDestination()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m132108k(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m132109l(C39575i c39575i, Function1 function1, int i13, Composer composer, int i14) {
        m132106i(c39575i, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m132110m(C39575i c39575i, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1443006427);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(c39575i) ? 4 : 2) | i13 : i13;
        if (!c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87138X();
        } else if (c39575i.m126440b().isEmpty()) {
            c28655q.m87150e0(-275983683);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-276690979);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack20(), C22411w.f87680a.m64535a().m64090c()));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 54);
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
            c28655q.m87150e0(-951283406);
            for (C32573b c32573b : c39575i.m126440b()) {
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                AbstractC32572a.m101627b(c32573b, null, c38072d.m121952e(c28655q, i15).getB2(), c38072d.m121949b(c28655q, i15).getWhite70(), c28655q, (C2886a.f11498d << 6) | C32573b.f134953c, 2);
            }
            AbstractC25012a.m73392y(c28655q, false, true, false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40686p(c39575i, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m132111n(C39575i c39575i, int i13, Composer composer, int i14) {
        m132110m(c39575i, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m132112o(C39575i c39575i, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-385518750);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c39575i) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 8 * 1;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            float f14 = 2;
            AbstractC17796v1.m51143b(AbstractC32572a.m101629d(c39575i.getTrendType(), true, c28655q, 48, 0), null, f13, 4 * f14, c39575i.getTrendType() == EnumC17727b2.NEUTRAL ? f14 : Float.NaN, c28655q, C17723a2.f68897j | 3456, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            TextResource textResourceM126441c = c39575i.getTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM126441c, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i16).getBrandWhite();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i16).getB1();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i17, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c39575i.getSubtitle(), c28655q, i15), null, c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB4(), null, c28655q, 0, i17, 196602);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, 0), null, AbstractC1102d.m3419p(28, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40686p(c39575i, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m132113p(C39575i c39575i, int i13, Composer composer, int i14) {
        m132112o(c39575i, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m132114q(C21395c c21395c, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C21395c c21395c2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(545847694);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c21395c) : c28655q.m87157i(c21395c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            long jM125416r = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack30();
            Modifier modifierM107879c = AbstractC34132o.m107879c(0.99f, AbstractC1099a.m3384f(C2314t.f9131w, false, 4.0f));
            boolean zM87151f = c28655q.m87151f(jM125416r);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87151f || objM87133R == c28676v0) {
                objM87133R = new C33209p1(jM125416r, 10);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3480c = AbstractC1125a.m3480c(modifierM107879c, (Function1) objM87133R);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C29616a(interfaceC4339a, 26);
                c28655q.m87172p0(objM87133R2);
            }
            c21395c2 = c21395c;
            AbstractC2756k.m7799p(modifierM3480c, c21395c2, null, null, false, null, (Function1) objM87133R2, c28655q, (C21395c.f81985e << 3) | ((i14 << 3) & 112), 60);
        } else {
            c21395c2 = c21395c;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C39516e(c21395c2, interfaceC4339a, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m132115r(long j7, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C17909s c17909s = AbstractC17911t.f69612b;
        List listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.f69625b), new C17919x(j7), new C17919x(C17919x.f69636m));
        C22128b c22128b = c0238p0.f815w;
        InterfaceC22131e.m63385u(drawWithContent, C17909s.m51483a(c17909s, listM118959K, (Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)) * 2.0f) / 3.0f, Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)), 8), 0L, 0L, 0.0f, null, 6, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m132116s(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m132117t(C21395c c21395c, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m132114q(c21395c, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
