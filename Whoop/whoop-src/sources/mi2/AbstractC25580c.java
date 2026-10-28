package mi2;

import a23.C0176c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import di2.AbstractC12055a;
import gb1.AbstractC15680h;
import hy0.AbstractC17755i2;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import ih1.C18522f;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import ji2.C21724c;
import ji2.C21726e;
import ji2.C21733l;
import ji2.C21734m;
import ji2.InterfaceC21730i;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kl2.C22571f;
import l01.C23045q;
import l80.C23434k;
import l83.C23454a0;
import lq0.C24656d;
import m83.C25271y;
import mf2.C25514e;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p095dp.AbstractC12240d;
import p163g1.AbstractC14959b1;
import p163g1.C15127r1;
import p208i2.AbstractC17918w0;
import p208i2.C17903p;
import p209i3.C18027i;
import p238j0.C21084j;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: mi2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\"\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lji2/l;", "parentViewState", "Lkotlin/Function1;", "Lji2/i;", "Ll83/a0;", "onViewEvent", "y", "(Lji2/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lji2/e;", "viewState", "q", "(Lji2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lji2/c;", "selectableActivity", "m", "(Lji2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "a", "Ljava/util/List;", "displayActivities", "strava_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25580c {

    /* JADX INFO: renamed from: a */
    private static List<C21724c> f100356a = C25271y.f99162w;

    /* JADX INFO: renamed from: mi2.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f100357w;

        public a(List list) {
            this.f100357w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m75238a(int i13) {
            this.f100357w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m75238a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: mi2.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f100358w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21726e f100359x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f100360y;

        public b(List list, C21726e c21726e, Function1 function1) {
            this.f100358w = list;
            this.f100359x = c21726e;
            this.f100360y = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m75239a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            C28655q c28655q;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q2 = (C28655q) composer;
            if (!c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q2.m87138X();
                return;
            }
            C21724c c21724c = (C21724c) this.f100358w.get(i13);
            c28655q2.m87150e0(-989728353);
            if (i13 == 0) {
                c28655q2.m87150e0(-989717349);
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 2 * 8, 1), null, null, this.f100359x.getPopularTitle(), null, 0L, 0L, null, c28655q2, (TextResource.$stable << 9) | 6, 246);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(-989518422);
                c28655q.m87173q(false);
            }
            AbstractC25580c.m75224m(c21724c, this.f100360y, c28655q, TextResource.$stable | AbstractC22403o.f87638a);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m75239a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mi2.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f100361w;

        public c(List list) {
            this.f100361w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m75240a(int i13) {
            this.f100361w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m75240a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: mi2.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f100362w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21726e f100363x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f100364y;

        public d(List list, C21726e c21726e, Function1 function1) {
            this.f100362w = list;
            this.f100363x = c21726e;
            this.f100364y = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m75241a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            C28655q c28655q;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q2 = (C28655q) composer;
            if (!c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q2.m87138X();
                return;
            }
            C21724c c21724c = (C21724c) this.f100362w.get(i13);
            c28655q2.m87150e0(-1023967606);
            if (i13 == 0) {
                c28655q2.m87150e0(-1023956602);
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 2 * 8, 1), null, null, this.f100363x.getOtherTitle(), null, 0L, 0L, null, c28655q2, (TextResource.$stable << 9) | 6, 246);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                c28655q.m87150e0(-1023759597);
                c28655q.m87173q(false);
            }
            AbstractC25580c.m75224m(c21724c, this.f100364y, c28655q, TextResource.$stable | AbstractC22403o.f87638a);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m75241a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m75210A(C21733l c21733l, Function1 function1, int i13, Composer composer, int i14) {
        m75236y(c21733l, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m75224m(C21724c c21724c, Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(798268443);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c21724c) : c28655q.m87157i(c21724c) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        boolean z4 = false;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC15680h.m44112a(c2314t, true));
            C21084j c21084j = new C21084j();
            C18027i c18027i = new C18027i(1);
            int i16 = i15 & 112;
            int i17 = i15 & 14;
            boolean z13 = (i16 == 32) | (i17 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(c21724c)));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C23045q(function1, c21724c, 29);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM3409f, c21084j, null, true, c18027i, (InterfaceC4339a) objM87133R, 8);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
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
            float f13 = 8;
            float f14 = ((float) 1.5d) * f13;
            Modifier modifierM75313z = AbstractC25589l.m75313z(c2314t, f14);
            boolean zM61211h = c21724c.getSelected();
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            C15127r1 c15127r1M34081r = AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i18).getBrandWhite(), c38072d.m121949b(c28655q, i18).getBrandWhite(), c38072d.m121949b(c28655q, i18).getBrandBlack(), 0L, c28655q, 0, 24);
            boolean z14 = i16 == 32;
            if (i17 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(c21724c))) {
                z4 = true;
            }
            boolean z15 = z14 | z4;
            Object objM87133R2 = c28655q.m87133R();
            if (z15 || objM87133R2 == c28676v0) {
                function2 = function1;
                objM87133R2 = new C24656d(11, function2, c21724c);
                c28655q.m87172p0(objM87133R2);
            } else {
                function2 = function1;
            }
            AbstractC14959b1.m43082a(zM61211h, (Function1) objM87133R2, modifierM75313z, false, c15127r1M34081r, c28655q, 0, 24);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c21724c.getActivityIcon(), null, null, c28655q, AbstractC22403o.f87638a, 3), c21724c.getActivityNameInternal(), AbstractC1102d.m3419p(4 * f13, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 3 * f13, 0.0f, 11)), null, C39102j.f168201c, 0.0f, new C17903p(c38072d.m121949b(c28655q, i18).getBrandWhite(), 5), c28655q, 24960, 40);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c21724c.getActivityNameDisplay(), c28655q, TextResource.$stable), null, c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getBtL(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(c21724c, function2, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m75225n(Function1 function1, C21724c c21724c) {
        function1.invoke(new InterfaceC21730i.i(c21724c.getActivityNameInternal(), !c21724c.getSelected()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m75226o(Function1 function1, C21724c c21724c, boolean z4) {
        function1.invoke(new InterfaceC21730i.i(c21724c.getActivityNameInternal(), z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m75227p(C21724c c21724c, Function1 function1, int i13, Composer composer, int i14) {
        m75224m(c21724c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0244  */
    /* JADX WARN: Code duplicated, block: B:61:0x0275  */
    /* JADX WARN: Code duplicated, block: B:63:0x0279  */
    /* JADX WARN: Code duplicated, block: B:70:0x028f  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ac  */
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
    /* JADX INFO: renamed from: q */
    private static final void m75228q(C21726e c21726e, Function1 function1, Composer composer, int i13) {
        int i14;
        C28676v0 c28676v0;
        Boolean bool;
        boolean z4;
        boolean zM87157i;
        Object objM87133R;
        boolean z13;
        C21726e c21726e2 = c21726e;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(108541872);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c21726e2) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function2) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 8;
            float f14 = 2 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, 0.0f, f14, f14, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            float f15 = 1 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
            TextResource textResourceM61225k = c21726e2.getSearchQuery();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM61225k, c28655q, i15);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7);
            TextResource textResourceM61225k2 = c21726e2.getSearchQuery();
            TextResource textResourceM61224j = c21726e2.getSearchPlaceHolder();
            int i16 = i14 & 112;
            boolean zM87153g = (i16 == 32) | c28655q.m87153g(strM21274h);
            Object objM87133R2 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g || objM87133R2 == c28676v1) {
                objM87133R2 = new C0176c(function2, strM21274h, 4);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC17795v0.m51127j(modifierM3398t2, textResourceM61225k2, textResourceM61224j, null, 0L, 0, false, null, 0L, false, null, false, false, null, (Function1) objM87133R2, c28655q, (i15 << 3) | 6 | (i15 << 6), 0, 16376);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
            String strM21274h2 = AbstractC8693b.m21274h(c21726e.getDescription(), c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            AbstractC11266d.m30469w((float) 1.5d, f13, c2314t, c28655q);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f15);
            boolean zM87157i2 = (i16 == 32) | c28655q.m87157i(c21726e);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R3 == c28676v0) {
                }
                C28676v0 c28676v2 = c28676v0;
                AbstractC22674j.m65717c(layoutWeightElement, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R3, c28655q, 24576, 494);
                WeakHashMap weakHashMap = C22944c2.f90553v;
                bool = (Boolean) C22949e.m66712e(c28655q).f90556c.f90544d.getValue();
                bool.getClass();
                if (((Boolean) AbstractC28683x.m87238F(bool, c28655q).getValue()).booleanValue()) {
                    c21726e2 = c21726e;
                    function2 = function1;
                    c28655q.m87150e0(872637148);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(871688331);
                    EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                    String strM21274h3 = AbstractC8693b.m21274h(c21726e.getSaveSelectionDisplay(), c28655q, i15);
                    Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 3 * f13, 0.0f, 0.0f, 13);
                    long jM125377a = c38072d.m121949b(c28655q, i17).getAccentAction();
                    if (i16 == 32) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c21726e2 = c21726e;
                    zM87157i = c28655q.m87157i(c21726e2) | z4;
                    objM87133R = c28655q.m87133R();
                    if (!zM87157i || objM87133R == c28676v2) {
                        function2 = function1;
                        z13 = false;
                        objM87133R = new C25579b(function2, c21726e2, 0 == true ? 1 : 0);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function2 = function1;
                        z13 = false;
                    }
                    AbstractC27282u.m82292h(modifierM3398t3, enumC27284v, strM21274h3, false, jM125377a, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 104);
                    c28655q.m87173q(z13);
                }
                c28655q.m87173q(true);
            }
            objM87133R3 = new C24656d(12, function1, c21726e);
            c28655q.m87172p0(objM87133R3);
            C28676v0 c28676v3 = c28676v0;
            AbstractC22674j.m65717c(layoutWeightElement, null, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R3, c28655q, 24576, 494);
            WeakHashMap weakHashMap2 = C22944c2.f90553v;
            bool = (Boolean) C22949e.m66712e(c28655q).f90556c.f90544d.getValue();
            bool.getClass();
            if (((Boolean) AbstractC28683x.m87238F(bool, c28655q).getValue()).booleanValue()) {
                c28655q.m87150e0(871688331);
                EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
                String strM21274h4 = AbstractC8693b.m21274h(c21726e.getSaveSelectionDisplay(), c28655q, i15);
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 3 * f13, 0.0f, 0.0f, 13);
                long jM125377a2 = c38072d.m121949b(c28655q, i17).getAccentAction();
                if (i16 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                c21726e2 = c21726e;
                zM87157i = c28655q.m87157i(c21726e2) | z4;
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    function2 = function1;
                    z13 = false;
                    objM87133R = new C25579b(function2, c21726e2, 0 == true ? 1 : 0);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function2 = function1;
                    z13 = false;
                    objM87133R = new C25579b(function2, c21726e2, 0 == true ? 1 : 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27282u.m82292h(modifierM3398t4, enumC27284v2, strM21274h4, false, jM125377a2, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 104);
                c28655q.m87173q(z13);
            } else {
                c21726e2 = c21726e;
                function2 = function1;
                c28655q.m87150e0(872637148);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(c21726e2, function2, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m75229r(Function1 function1, String str, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17801x0.a) {
            function1.invoke(new InterfaceC21730i.g(""));
        } else if (event instanceof AbstractC17801x0.c) {
            AbstractC17801x0.c cVar = (AbstractC17801x0.c) event;
            if (!cVar.getNewText().contentEquals(str)) {
                function1.invoke(new InterfaceC21730i.g(cVar.getNewText()));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m75230s(Function1 function1, C21726e c21726e, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C18522f(function1, c21726e, 23), true, 414425211), 3);
        List<C21724c> list = f100356a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C21724c) obj).getPopular()) {
                arrayList.add(obj);
            }
        }
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(arrayList.size(), null, new a(arrayList), new C37816b(new b(arrayList, c21726e, function1), true, 2039820996));
        List<C21724c> list2 = f100356a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!((C21724c) obj2).getPopular()) {
                arrayList2.add(obj2);
            }
        }
        c26053f.m77529r(arrayList2.size(), null, new c(arrayList2), new C37816b(new d(arrayList2, c21726e, function1), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m75231t(Function1 function1, C21726e c21726e, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44112a = AbstractC15680h.m44112a(c2314t, true);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            C18027i c18027i = new C18027i(1);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c21726e);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C25579b(function1, c21726e, 1);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM44112a, interfaceC21083i, null, true, c18027i, (InterfaceC4339a) objM87133R2, 8);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
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
            Modifier modifierM75313z = AbstractC25589l.m75313z(c2314t, ((float) 1.5d) * 8);
            boolean zM61216b = c21726e.getAllActivities();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C15127r1 c15127r1M34081r = AbstractC12240d.m34081r(c38072d.m121949b(c28655q, i14).getBrandWhite(), c38072d.m121949b(c28655q, i14).getBrandWhite(), c38072d.m121949b(c28655q, i14).getBrandBlack(), 0L, c28655q, 0, 24);
            boolean zM87153g2 = c28655q.m87153g(function1);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C23434k(function1, 22);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC14959b1.m43082a(zM61216b, (Function1) objM87133R3, modifierM75313z, false, c15127r1M34081r, c28655q, 0, 24);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c21726e.getAllTextDisplay(), c28655q, TextResource.$stable), null, c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getBtS(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m75232u(Function1 function1, C21726e c21726e) {
        function1.invoke(new InterfaceC21730i.h(!c21726e.getAllActivities()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m75233v(Function1 function1, boolean z4) {
        function1.invoke(new InterfaceC21730i.h(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m75234w(Function1 function1, C21726e c21726e) {
        function1.invoke(new InterfaceC21730i.k(new C21734m(true, c21726e.getAllActivities(), c21726e.getTemplateName(), c21726e.m61215a(), true, c21726e.getAutomaticallyImportEnabled())));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m75235x(C21726e c21726e, Function1 function1, int i13, Composer composer, int i14) {
        m75228q(c21726e, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    public static final void m75236y(C21733l parentViewState, Function1 onViewEvent, Composer composer, int i13) {
        AbstractC22676k.m65750j(parentViewState, "parentViewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1923429042);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(parentViewState) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C21726e c21726eM61295b = parentViewState.getSelectableActivity();
            if (c21726eM61295b == null) {
                c28655q.m87150e0(1716103196);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1716103197);
                InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                if (!c21726eM61295b.getDisplayKeyboard() && interfaceC2464x2 != null) {
                    ((C2463x1) interfaceC2464x2).m7442a();
                }
                c28655q.m87150e0(1579385276);
                List<C21724c> listM61215a = c21726eM61295b.m61215a();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM61215a) {
                    if (AbstractC39414r.m125876U(((C21724c) obj).getActivityNameSearch(), AbstractC8693b.m21274h(c21726eM61295b.getSearchQuery(), c28655q, TextResource.$stable), true)) {
                        arrayList.add(obj);
                    }
                }
                c28655q.m87173q(false);
                f100356a = arrayList;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C38072d c38072d = C38072d.f163053a;
                Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1092a.m3358c(modifierM3407d, c38072d.m121949b(c28655q, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66723l);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                C0209i c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                C0209i c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                int i15 = i14;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                Modifier modifierM66723l2 = AbstractC22953f.m66723l(c2314t);
                AbstractC6721d.a aVar = new AbstractC6721d.a(c21726eM61295b.getTitleDisplay(), null, AbstractC38963t7.m124375e(c38072d), AbstractC30060g.m92103Y(c28655q, AbstractC12055a.f39969d), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                int i16 = i15 & 112;
                boolean z4 = i16 == 32;
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C25514e(onViewEvent, 2);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(modifierM66723l2, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
                m75228q(c21726eM61295b, onViewEvent, c28655q, i16);
                AbstractC25012a.m73392y(c28655q, true, true, false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25578a(parentViewState, onViewEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m75237z(Function1 function1) {
        function1.invoke(new InterfaceC21730i.f(null, null, null, true, 7, null));
        return C23454a0.f92919a;
    }
}
