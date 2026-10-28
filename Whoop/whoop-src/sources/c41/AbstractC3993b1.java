package c41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import aw0.C2101a;
import b30.C2476a1;
import b91.EnumC2888c;
import be1.C3169c;
import bz0.C3713c;
import c13.AbstractC3855a;
import c31.C3929m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d13.AbstractC11478a;
import dp0.C12253i;
import fy1.C14873i;
import ge3.AbstractC15751g;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import hy0.EnumC17744g;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k91.C22303b;
import kd1.C22411w;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25235a0;
import n21.C26190d;
import n21.C26191e;
import n21.EnumC26195i;
import p000.AbstractC11266d;
import p000.C13762f;
import p000.C21061j;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p134f2.C14015d;
import p134f2.C14018g;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import r80.AbstractC31061c;
import s01.C32048d;
import s01.EnumC32047c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: c41.b1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc41/i1;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Landroidx/compose/ui/Modifier;Lc41/i1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "Lm91/u;", "legendItems", "v", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "t", "(Landroidx/compose/runtime/Composer;I)V", "Ls01/d;", "a", "Ls01/d;", "sampleWhoopCoachVow", "b", "Ljava/util/List;", "z", "()Ljava/util/List;", "sampleContributorTiles", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3993b1 {

    /* JADX INFO: renamed from: a */
    private static final C32048d f16258a;

    /* JADX INFO: renamed from: b */
    private static final List<C4042i1> f16259b;

    /* JADX INFO: renamed from: c41.b1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m12103a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1911877291);
            AbstractC18247a abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, 6).getBackgroundDarkStd());
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f13, AbstractC18249c.m52565c(c2314t, abstractC18247aM52577o));
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
            c28655q.m87150e0(178208235);
            for (C4042i1 c4042i1 : AbstractC3993b1.m12102z()) {
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, 2 * f13, 1);
                C4042i1 c4042i1M12321b = C4042i1.m12321b(c4042i1, null, null, null, null, null, 0.0f, 59, null);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = b.f16260w;
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC3993b1.m12088l(modifierM3396r, c4042i1M12321b, (Function1) objM87133R, c28655q, 390);
            }
            AbstractC25012a.m73392y(c28655q, false, true, false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m12103a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c41.b1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f16260w = new b();

        /* JADX INFO: renamed from: a */
        public final void m12104a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m12104a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        String str = null;
        C9598e c9598e = null;
        TextResource textResource = null;
        f16258a = new C32048d(AbstractC8693b.m21278l("Your HRV is elevated while your RHR, Respiratory Rate, and Sleep Performance are all typical, resulting in a higher Recovery today."), AbstractC11478a.m30853e(Locale.ROOT, "Learn More with Coach", "toUpperCase(...)"), EnumC16313m0.ARROW_FORWARD, str, c9598e, textResource, EnumC32047c.NORMAL, 56, null);
        List<C4028g1> listM12243t = AbstractC4021f1.m12243t();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM12243t, 10));
        Iterator<T> it = listM12243t.iterator();
        while (it.hasNext()) {
            arrayList.add(C4028g1.m12267b((C4028g1) it.next(), null, null, null, null, null, null, null, null, null, null, null, 1919, null));
        }
        AbstractC18247a abstractC18247aM52575m = AbstractC18249c.m52575m(EnumC39333f.ACCENT_NEGATIVE_TREND);
        TextResource textResourceM21278l = AbstractC8693b.m21278l("Poor");
        EnumC26195i enumC26195i = EnumC26195i.RECTANGLE_SMALL;
        EnumC39333f enumC39333f = EnumC39333f.WHITE_70;
        int i13 = 209;
        DefaultConstructorMarker defaultConstructorMarker = null;
        EnumC16313m0 enumC16313m0 = null;
        Function1 function1 = null;
        EnumC2888c enumC2888c = null;
        f16259b = AbstractC37056f.m118958J(new C4042i1("", arrayList, AbstractC37056f.m118959K(new C26191e(null, abstractC18247aM52575m, textResourceM21278l, enumC26195i, null, enumC39333f, null, null, 209, null), new C26191e(0 == true ? 1 : 0, AbstractC18249c.m52575m(EnumC39333f.WHITE_10), AbstractC8693b.m21278l("Sufficient"), enumC26195i, enumC16313m0, enumC39333f, function1, enumC2888c, i13, defaultConstructorMarker), new C26191e(0 == true ? 1 : 0, AbstractC18249c.m52575m(EnumC39333f.ACCENT_POSITIVE_TREND), AbstractC8693b.m21278l("Optimal"), enumC26195i, enumC16313m0, enumC39333f, function1, enumC2888c, i13, defaultConstructorMarker)), null, AbstractC37056f.m118958J(f16258a), 0.0f, 40, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /* JADX INFO: renamed from: l */
    public static final void m12088l(Modifier modifier, C4042i1 viewState, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Object obj;
        int i15;
        Function1 function2;
        float f13;
        int i16;
        int i17;
        float f14;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(951821559);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        int i18 = i14;
        if (c28655q2.m87135U(i18 & 1, (i18 & 147) != 146)) {
            C22303b c22303bM64091d = C22411w.f87680a.m64535a().m64091d();
            float f15 = 4;
            C17909s c17909s = AbstractC17911t.f69612b;
            C38072d c38072d = C38072d.f163053a;
            int i19 = i18;
            int i24 = 1;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(AbstractC15751g.m44456i(((float) 0.25d) * f15, modifier, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(c38072d.m121949b(c28655q2, 6).getWhite5()), new C17919x(c38072d.m121949b(c28655q2, 6).getTransparent())), 0.0f, 550.0f, 10), c22303bM64091d), c38072d.m121949b(c28655q2, 6).getTransparent(), c22303bM64091d));
            boolean zM87153g = c28655q2.m87153g(c22303bM64091d);
            Object objM87133R = c28655q2.m87133R();
            Object obj2 = C28635l.f115821a;
            if (zM87153g || objM87133R == obj2) {
                obj = objM87133R;
                Object c4159z0 = new C4159z0(c22303bM64091d, 0);
                c28655q2.m87172p0(c4159z0);
                obj = c4159z0;
            }
            Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3409f, (Function1) obj);
            boolean zM87153g2 = c28655q2.m87153g(c22303bM64091d);
            Object objM87133R2 = c28655q2.m87133R();
            Object obj3 = objM87133R2;
            if (zM87153g2 || objM87133R2 == obj2) {
                Object c4159z1 = new C4159z0(c22303bM64091d, 1);
                c28655q2.m87172p0(c4159z1);
                obj3 = c4159z1;
            }
            Modifier modifierM3479b = AbstractC1125a.m3479b(modifierM3486a, (Function1) obj3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3479b);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            float f16 = 2;
            float f17 = 8;
            float f18 = f16 * f17;
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f18, ((float) 2.5d) * f17);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            c28655q2.m87150e0(-1704516957);
            Iterator it = viewState.m12326g().iterator();
            int i25 = 0;
            C28655q c28655q3 = c28655q2;
            while (it.hasNext()) {
                Object next = it.next();
                int i26 = i25 + 1;
                if (i25 < 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                AbstractC25303l.m74291r((InterfaceC25312u) next, null, new C13762f(22), onViewEvent, c28655q3, (i19 << 3) & 7168, 2);
                if (i25 < viewState.m12326g().size() - 1) {
                    c28655q3.m87150e0(2051931367);
                    int i27 = i24;
                    float f19 = f15;
                    C28655q c28655q4 = c28655q3;
                    f14 = f19;
                    i16 = i19;
                    i17 = i27;
                    f13 = f18;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, i27 * f17, i27), EnumC17744g.SOLID, null, null, null, 0L, 0L, null, c28655q4, 54, 252);
                    c28655q3 = c28655q4;
                    c28655q3.m87173q(false);
                } else {
                    f13 = f18;
                    i16 = i19;
                    i17 = i24;
                    f14 = f15;
                    c28655q3.m87150e0(2052150475);
                    c28655q3.m87173q(false);
                }
                onViewEvent = function1;
                f18 = f13;
                f15 = f14;
                i25 = i26;
                i19 = i16;
                f17 = f17;
                i24 = i17;
                it = it;
                c28655q3 = c28655q3;
            }
            float f24 = f17;
            int i28 = i19;
            boolean z4 = i24;
            c28655q3.m87173q(false);
            c28655q3.m87173q(z4);
            Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, AbstractC31061c.m95629e(AbstractC1099a.m3396r(c2314t, f18, 0.0f, 2), f16, f15, C38072d.f163053a.m121949b(c28655q3, 6).getBlack50())), (z4 ? 1.0f : 0.0f) * f24, ((float) 0.5d) * f24);
            List<InterfaceC25312u> listM12325f = viewState.m12325f();
            if (listM12325f == null) {
                c28655q3.m87150e0(-335203726);
                c28655q3.m87173q(false);
                function2 = function1;
                i15 = i28;
            } else {
                c28655q3.m87150e0(-335203725);
                i15 = i28;
                function2 = function1;
                m12098v(modifierM3395q2, listM12325f, function2, c28655q3, i15 & 896);
                c28655q3.m87173q(false);
            }
            InterfaceC25312u tileLegend = viewState.getTileLegend();
            if (tileLegend == null) {
                c28655q3.m87150e0(-335018811);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-335018810);
                AbstractC25303l.m74291r(tileLegend, null, new C2101a(2, modifierM3395q2), function2, c28655q3, (i15 << 3) & 7168, 2);
                c28655q3.m87173q(false);
            }
            AbstractC22953f.m66715b(c28655q3, AbstractC1102d.m3419p(viewState.getFooterTopSpacing(), c2314t));
            c28655q3.m87150e0(-1673364519);
            Iterator<T> it3 = viewState.m12323c().iterator();
            while (it3.hasNext()) {
                AbstractC25303l.m74291r((InterfaceC25312u) it3.next(), null, new C13762f(23), function1, c28655q3, (i15 << 3) & 7168, 2);
            }
            AbstractC25012a.m73392y(c28655q3, false, z4, z4);
            c28655q = c28655q3;
        } else {
            c28655q2.m87138X();
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(modifier, viewState, function1, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m12089m(C22303b c22303b, InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        C17920x0 c17920x0 = (C17920x0) graphicsLayer;
        c17920x0.m51554e(true);
        c17920x0.m51563t(c22303b);
        c17920x0.m51555f(2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C14018g m12090n(C22303b c22303b, C14015d drawWithCache) {
        AbstractC22676k.m65750j(drawWithCache, "$this$drawWithCache");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithCache.f50036w.mo468d() >> 32)) / 2.0f;
        C17909s c17909s = AbstractC17911t.f69612b;
        long j7 = C17919x.f69629f;
        return drawWithCache.m39910a(new C3169c(8, c22303b, C17909s.m51489g(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.1f, j7)), new C17919x(C17919x.m51541c(0.0f, j7))), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(0.0f))), fIntBitsToFloat, 8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m12091o(C22303b c22303b, AbstractC17911t abstractC17911t, InterfaceC22129c onDrawWithContent) {
        AbstractC22676k.m65750j(onDrawWithContent, "$this$onDrawWithContent");
        InterfaceC22131e.m63378L(onDrawWithContent, c22303b.getPath(), abstractC17911t, 0.0f, null, 60);
        ((C0238p0) onDrawWithContent).m728a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Modifier m12092p(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(752277191);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Modifier m12093q(Modifier modifier, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1361345376);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Modifier m12094r(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-160594647);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m12095s(Modifier modifier, C4042i1 c4042i1, Function1 function1, int i13, Composer composer, int i14) {
        m12088l(modifier, c4042i1, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final void m12096t(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1114303609);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3713c(i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m12097u(int i13, Composer composer, int i14) {
        m12096t(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m12098v(Modifier modifier, List<? extends InterfaceC25312u> list, Function1 function1, Composer composer, int i13) {
        Modifier modifier2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2003750734);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87153g(modifier) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(list) ? 32 : 16;
        }
        Function1 function2 = function1;
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            List<? extends InterfaceC25312u> list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof C26191e) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (!(((InterfaceC25312u) obj2) instanceof C26191e)) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                modifier2 = modifier;
                if (arrayList2.isEmpty()) {
                    c28655q.m87150e0(2013115184);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2012892232);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                    int iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
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
                    c28655q.m87150e0(-1241117946);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function2, c28655q, (i15 << 3) & 7168, 6);
                        function2 = function1;
                    }
                    AbstractC25012a.m73392y(c28655q, false, true, false);
                }
            } else {
                c28655q.m87150e0(2012617758);
                AbstractC22960g2.m66729a(modifier, null, null, null, 0, 0, AbstractC37817c.m121344e(1367462450, c28655q, new C2476a1(arrayList, 4)), c28655q, (i15 & 14) | 1572864, 62);
                modifier2 = modifier;
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            AbstractC18489d0.m53380u(2, 4, C2314t.f9131w, c28655q);
        } else {
            modifier2 = modifier;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3986a1(modifier2, list, function1, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m12099w(List list, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C26191e c26191e = (C26191e) it.next();
                C26190d c26190d = new C26190d();
                C26191e c26191eM77754e = C26191e.m77754e(c26191e, AbstractC1099a.m3394p(((float) 0.5d) * 8, C2314t.f9131w), null, null, null, null, null, null, null, 254, null);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C3929m(8);
                    c28655q.m87172p0(objM87133R);
                }
                c26190d.Compose(c26191eM77754e, (Function1) objM87133R, c28655q, 48);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m12100x(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m12101y(Modifier modifier, List list, Function1 function1, int i13, Composer composer, int i14) {
        m12098v(modifier, list, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final List<C4042i1> m12102z() {
        return f16259b;
    }
}
