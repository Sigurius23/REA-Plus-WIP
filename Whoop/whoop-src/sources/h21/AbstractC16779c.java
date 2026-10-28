package h21;

import a31.C0341c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import ar2.C1935f;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.service.network.model.UserSessionDto;
import dp0.C12253i;
import e93.AbstractC12889b;
import ej1.C13242h;
import ep1.C13412g;
import f01.C13849c0;
import f02.C13917c;
import fy1.C14873i;
import g40.C15369i3;
import ge3.AbstractC15751g;
import gy0.AbstractC16272a;
import gz2.C16334a;
import h00.C16513l0;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25235a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.C17919x;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: h21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u001b²\u0006\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00198\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh21/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "r", "(Landroidx/compose/ui/Modifier;Lh21/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkd1/o;", "imageSource", "k", "(Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lh21/e;", "cardState", "", "isSelected", "Lkotlin/Function0;", "onCardClick", "n", "(Lh21/e;ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "x", "(Landroidx/compose/runtime/Composer;I)V", "z", "", "internalSelectedCardId", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16779c {

    /* JADX INFO: renamed from: h21.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C16781e f64500w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f64501x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f64502y;

        public a(C16781e c16781e, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
            this.f64500w = c16781e;
            this.f64501x = function1;
            this.f64502y = interfaceC28601c1;
        }

        /* JADX INFO: renamed from: a */
        public final void m47319a() {
            AbstractC16779c.m47313u(this.f64502y, this.f64500w.getId());
            this.f64501x.invoke(new C16777a(this.f64500w.getId()));
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m47319a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h21.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f64503w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C16781e c16781e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h21.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f64504w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f64505x;

        public c(Function1 function1, List list) {
            this.f64504w = function1;
            this.f64505x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m47321a(int i13) {
            return this.f64504w.invoke(this.f64505x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m47321a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: h21.c$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f64506w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f64507x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f64508y;

        public d(List list, InterfaceC28601c1 interfaceC28601c1, Function1 function1) {
            this.f64506w = list;
            this.f64507x = interfaceC28601c1;
            this.f64508y = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m47322a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C16781e c16781e = (C16781e) this.f64506w.get(i13);
            c28655q.m87150e0(1804710196);
            boolean zM65745e = AbstractC22676k.m65745e(c16781e.getId(), AbstractC16779c.m47312t(this.f64507x));
            boolean zM87153g = c28655q.m87153g(this.f64507x) | c28655q.m87153g(c16781e) | c28655q.m87153g(this.f64508y);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new a(c16781e, this.f64508y, this.f64507x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC16779c.m47306n(c16781e, zM65745e, (InterfaceC4339a) objM87133R, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m47322a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h21.c$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m47323a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(701358906);
            Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
            float f13 = 0.0f;
            float f14 = 0.0f;
            float f15 = 0.0f;
            float f16 = 0.0f;
            float f17 = 0.0f;
            C16780d c16780d = new C16780d(AbstractC37056f.m118959K(new C16781e(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, new AbstractC22403o.a(AbstractC16272a.f62056c), "Strength", 0.0f, f13, 24, null), new C16781e("2", new AbstractC22403o.a(AbstractC16272a.f62050b), "Sleep", f13, f14, 24, null), new C16781e("3", new AbstractC22403o.a(AbstractC16272a.f62056c), "Recovery", f14, f15, 24, null), new C16781e("4", new AbstractC22403o.a(AbstractC16272a.f62050b), "Strain", f15, f16, 24, null), new C16781e("5", new AbstractC22403o.a(AbstractC16272a.f62056c), "Health", f16, f17, 24, null), new C16781e("6", new AbstractC22403o.a(AbstractC16272a.f62050b), "Activity", f17, 0.0f, 24, null)), "3");
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = f.f64509w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC16779c.m47310r(modifierM3396r, c16780d, (Function1) objM87133R, c28655q, 390, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m47323a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h21.c$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f64509w = new f();

        /* JADX INFO: renamed from: a */
        public final void m47324a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m47324a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h21.c$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m47325a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-790421455);
            Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 2 * 8, 0.0f, 2);
            C16780d c16780d = new C16780d(AbstractC37056f.m118958J(new C16781e(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, new AbstractC22403o.a(AbstractC16272a.f62056c), null, 0.0f, 0.0f, 24, null)), UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = h.f64510w;
                c28655q.m87172p0(objM87133R);
            }
            AbstractC16779c.m47310r(modifierM3396r, c16780d, (Function1) objM87133R, c28655q, 390, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m47325a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h21.c$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f64510w = new h();

        /* JADX INFO: renamed from: a */
        public final void m47326a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m47326a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m47289A(int i13, Composer composer, int i14) {
        m47318z(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m47303k(AbstractC22403o abstractC22403o, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-362550011);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(abstractC22403o) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC12889b.m36263b(AbstractC1136a.m3599a(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, modifier), false, 1.7777778f), "HeroImage"), AbstractC33253j.m105489e(3 * 4), C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), null, 0, AbstractC37817c.m121344e(1225334722, c28655q, new C13242h(abstractC22403o, 25)), c28655q, 1769472, 24);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16334a(abstractC22403o, modifier2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m47304l(AbstractC22403o abstractC22403o, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q, 0, 3), null, AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C39102j.f168199a, 0.0f, null, c28655q, 25008, 104);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m47305m(AbstractC22403o abstractC22403o, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m47303k(abstractC22403o, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m47306n(C16781e c16781e, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        boolean z13;
        float f13;
        long jM53358D;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1755676060);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c16781e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f14 = 1;
            float f15 = 4;
            float f16 = f14 * f15;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f16);
            float fM47330b = c16781e.getCardWidth() * f15;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3424u = AbstractC1102d.m3424u(fM47330b, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3424u);
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
            Modifier modifierM3411h = AbstractC1102d.m3411h(c16781e.getCardHeight() * f15, AbstractC1102d.m3424u(c16781e.getCardWidth() * f15, c2314t));
            if (z4) {
                f13 = f14;
                z13 = false;
            } else {
                z13 = false;
                f13 = 0;
            }
            if (z4) {
                c28655q.m87150e0(251903821);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, z13);
            } else {
                c28655q.m87150e0(251904433);
                c28655q.m87173q(z13);
                jM53358D = C17919x.f69636m;
            }
            Modifier modifierM44455h = AbstractC15751g.m44455h(modifierM3411h, f13, jM53358D, c33252iM105489e);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            boolean z14 = (i14 & 896) == 256 ? true : z13;
            Object objM87133R2 = c28655q.m87133R();
            if (z14 || objM87133R2 == c28676v0) {
                objM87133R2 = new C15369i3(interfaceC4339a, 11);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1092a.m3360e(modifierM44455h, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28), "ImageCard_" + c16781e.getId());
            C38072d c38072d = C38072d.f163053a;
            AbstractC12889b.m36263b(modifierM3599a, c33252iM105489e, c38072d.m121949b(c28655q, 6).getWhite10(), null, (float) 12, AbstractC37817c.m121344e(289252899, c28655q, new C0341c(c16781e, z4, c33252iM105489e, 6)), c28655q, 1769472, 24);
            String strM47332e = c16781e.getLabel();
            if (strM47332e == null) {
                c28655q.m87150e0(-779634073);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-779634072);
                AbstractC30795n.m94707h(strM47332e, AbstractC1102d.m3424u(c16781e.getCardWidth() * f15, c2314t), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196088);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(c16781e, z4, interfaceC4339a, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m47307o(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m47308p(C16781e c16781e, boolean z4, C33252i c33252i, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(c16781e.getImageSource(), null, null, c28655q, 0, 3);
            float f13 = z4 ? ((float) 0.3d) * 8 : 0;
            Modifier modifierM44455h = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1099a.m3394p(f13, modifierM44455h));
            if (z4) {
                modifierM44455h = AbstractC15751g.m44455h(modifierM44455h, 1, C17919x.f69625b, c33252i);
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i, null, AbstractC37056f.m118994r(modifierM3407d.mo3471e(modifierM44455h), c33252i), null, C39102j.f168199a, 0.0f, null, c28655q, 24624, 104);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m47309q(C16781e c16781e, boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m47306n(c16781e, z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0219  */
    /* JADX WARN: Code duplicated, block: B:104:0x0224  */
    /* JADX WARN: Code duplicated, block: B:107:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:70:0x0107  */
    /* JADX WARN: Code duplicated, block: B:71:0x010c  */
    /* JADX WARN: Code duplicated, block: B:72:0x010e  */
    /* JADX WARN: Code duplicated, block: B:74:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:78:0x015c  */
    /* JADX WARN: Code duplicated, block: B:83:0x017d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0187  */
    /* JADX WARN: Code duplicated, block: B:87:0x0192  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01db  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0209  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX INFO: renamed from: r */
    public static final void m47310r(Modifier modifier, C16780d viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87153g;
        String strM47328b;
        C16781e c16781e;
        Object obj;
        InterfaceC28601c1 interfaceC28601c1;
        C16781e c16781e2;
        AbstractC22403o abstractC22403oM47331c;
        float f13;
        float f14;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ?? r10;
        ?? r14;
        int i16;
        Object obj2;
        Iterator it;
        Object next;
        C16781e c16781e3;
        Object objM87133R;
        Object obj3;
        AbstractC22676k.m65750j(viewState, "viewState");
        ?? r15 = (C28655q) composer;
        r15.m87154g0(-939047520);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (r15.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= r15.m87157i(viewState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= r15.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (r15.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R = r15.m87133R();
                    if (objM87133R == c28676v0) {
                        obj3 = objM87133R;
                        C16513l0 c16513l0 = new C16513l0(12);
                        r15.m87172p0(c16513l0);
                        obj3 = c16513l0;
                    }
                    obj3 = objM87133R;
                    function4 = (Function1) obj3;
                } else {
                    function4 = function2;
                }
                zM87153g = r15.m87153g(viewState.getSelectedCardId()) | r15.m87149e(viewState.m47327a().size());
                Object objM87133R2 = r15.m87133R();
                obj = objM87133R2;
                if (zM87153g || objM87133R2 == c28676v0) {
                    strM47328b = viewState.getSelectedCardId();
                    if (strM47328b == null) {
                        if (viewState.m47327a().size() > 1 || (c16781e = (C16781e) AbstractC25265s.m74100H0(viewState.m47327a())) == null) {
                            strM47328b = null;
                        } else {
                            strM47328b = c16781e.getId();
                        }
                    }
                    C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(strM47328b);
                    r15.m87172p0(c28633k1M87272z);
                    obj = c28633k1M87272z;
                }
                interfaceC28601c1 = (InterfaceC28601c1) obj;
                if (m47312t(interfaceC28601c1) != null) {
                    it = viewState.m47327a().iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!AbstractC22676k.m65745e(((C16781e) next).getId(), m47312t(interfaceC28601c1)));
                    c16781e3 = (C16781e) next;
                    if (c16781e3 != null) {
                        abstractC22403oM47331c = c16781e3.getImageSource();
                    } else {
                        abstractC22403oM47331c = null;
                    }
                } else {
                    c16781e2 = (C16781e) AbstractC25265s.m74100H0(viewState.m47327a());
                    if (c16781e2 != null) {
                        abstractC22403oM47331c = c16781e2.getImageSource();
                    } else {
                        abstractC22403oM47331c = null;
                    }
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "ImageCardPicker");
                f13 = 2;
                f14 = 8 * f13;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, r15, 6);
                iHashCode = Long.hashCode(r15.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = r15.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(r15, modifierM3599a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                r15.m87158i0();
                if (r15.f115903S) {
                    r15.m87163l(c0213j);
                } else {
                    r15.m87178s0();
                }
                AbstractC28683x.m87239G(r15, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(r15, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (r15.f115903S || !AbstractC22676k.m65745e(r15.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, r15, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(r15, C0217k.f726d, modifierM118962N);
                if (abstractC22403oM47331c == null) {
                    r15.m87150e0(-636070681);
                    r10 = 0;
                    r15.m87173q(false);
                } else {
                    r10 = 0;
                    r15.m87150e0(-636070680);
                    m47303k(abstractC22403oM47331c, modifier2, r15, (i15 << 3) & 112, 0);
                    r15.m87173q(false);
                }
                if (viewState.m47327a().size() > 1) {
                    r15.m87150e0(-635898940);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(4 * f13);
                    C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(f14, 0.0f, (float) r10, 0.0f, 10);
                    int i19 = (r15.m87157i(viewState) ? 1 : 0) | (r15.m87153g(interfaceC28601c1) ? 1 : 0);
                    if ((i15 & 896) == 256) {
                        r14 = 1;
                    } else {
                        r14 = r10;
                    }
                    i16 = r14 | i19;
                    Object objM87133R3 = r15.m87133R();
                    obj2 = objM87133R3;
                    if (i16 == 0 || objM87133R3 == c28676v0) {
                        C13412g c13412g = new C13412g(viewState, interfaceC28601c1, function4, 21);
                        r15.m87172p0(c13412g);
                        obj2 = c13412g;
                    }
                    AbstractC22674j.m65718d(modifierM3409f, null, c22976l1M3381c, c22971kM66746i, null, null, false, null, (Function1) obj2, r15, 24966, 490);
                    r15.m87173q(r10);
                } else {
                    r15.m87150e0(-635204788);
                    r15.m87173q(r10);
                }
                r15.m87173q(true);
                modifier3 = modifier2;
                function3 = function4;
            } else {
                r15.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = r15.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13917c(i13, i14, 24, modifier3, function3, viewState);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (r15.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R = r15.m87133R();
                if (objM87133R == c28676v0) {
                    obj3 = objM87133R;
                    C16513l0 c16513l1 = new C16513l0(12);
                    r15.m87172p0(c16513l1);
                    obj3 = c16513l1;
                }
                obj3 = objM87133R;
                function4 = (Function1) obj3;
            } else {
                function4 = function2;
            }
            zM87153g = r15.m87153g(viewState.getSelectedCardId()) | r15.m87149e(viewState.m47327a().size());
            Object objM87133R4 = r15.m87133R();
            obj = objM87133R4;
            if (zM87153g) {
                strM47328b = viewState.getSelectedCardId();
                if (strM47328b == null) {
                    if (viewState.m47327a().size() > 1) {
                        strM47328b = null;
                    } else {
                        strM47328b = null;
                    }
                }
                C28633k1 c28633k1M87272z2 = AbstractC28683x.m87272z(strM47328b);
                r15.m87172p0(c28633k1M87272z2);
                obj = c28633k1M87272z2;
            } else {
                strM47328b = viewState.getSelectedCardId();
                if (strM47328b == null) {
                    if (viewState.m47327a().size() > 1) {
                        strM47328b = null;
                    } else {
                        strM47328b = null;
                    }
                }
                C28633k1 c28633k1M87272z3 = AbstractC28683x.m87272z(strM47328b);
                r15.m87172p0(c28633k1M87272z3);
                obj = c28633k1M87272z3;
            }
            interfaceC28601c1 = (InterfaceC28601c1) obj;
            if (m47312t(interfaceC28601c1) != null) {
                it = viewState.m47327a().iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC22676k.m65745e(((C16781e) next).getId(), m47312t(interfaceC28601c1)));
                c16781e3 = (C16781e) next;
                if (c16781e3 != null) {
                    abstractC22403oM47331c = c16781e3.getImageSource();
                } else {
                    abstractC22403oM47331c = null;
                }
            } else {
                c16781e2 = (C16781e) AbstractC25265s.m74100H0(viewState.m47327a());
                if (c16781e2 != null) {
                    abstractC22403oM47331c = c16781e2.getImageSource();
                } else {
                    abstractC22403oM47331c = null;
                }
            }
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "ImageCardPicker");
            f13 = 2;
            f14 = 8 * f13;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, r15, 6);
            iHashCode = Long.hashCode(r15.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = r15.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(r15, modifierM3599a2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            r15.m87158i0();
            if (r15.f115903S) {
                r15.m87163l(c0213j);
            } else {
                r15.m87178s0();
            }
            AbstractC28683x.m87239G(r15, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(r15, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (r15.f115903S) {
                AbstractC11266d.m30471y(iHashCode, r15, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, r15, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(r15, C0217k.f726d, modifierM118962N2);
            if (abstractC22403oM47331c == null) {
                r15.m87150e0(-636070681);
                r10 = 0;
                r15.m87173q(false);
            } else {
                r10 = 0;
                r15.m87150e0(-636070680);
                m47303k(abstractC22403oM47331c, modifier2, r15, (i15 << 3) & 112, 0);
                r15.m87173q(false);
            }
            if (viewState.m47327a().size() > 1) {
                r15.m87150e0(-635898940);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(4 * f13);
                C22976l1 c22976l1M3381c2 = AbstractC1099a.m3381c(f14, 0.0f, (float) r10, 0.0f, 10);
                int i110 = (r15.m87157i(viewState) ? 1 : 0) | (r15.m87153g(interfaceC28601c1) ? 1 : 0);
                if ((i15 & 896) == 256) {
                    r14 = 1;
                } else {
                    r14 = r10;
                }
                i16 = r14 | i110;
                Object objM87133R5 = r15.m87133R();
                obj2 = objM87133R5;
                if (i16 == 0) {
                    C13412g c13412g2 = new C13412g(viewState, interfaceC28601c1, function4, 21);
                    r15.m87172p0(c13412g2);
                    obj2 = c13412g2;
                } else {
                    C13412g c13412g3 = new C13412g(viewState, interfaceC28601c1, function4, 21);
                    r15.m87172p0(c13412g3);
                    obj2 = c13412g3;
                }
                AbstractC22674j.m65718d(modifierM3409f2, null, c22976l1M3381c2, c22971kM66746i2, null, null, false, null, (Function1) obj2, r15, 24966, 490);
                r15.m87173q(r10);
            } else {
                r15.m87150e0(-635204788);
                r15.m87173q(r10);
            }
            r15.m87173q(true);
            modifier3 = modifier2;
            function3 = function4;
        } else {
            r15.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = r15.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 24, modifier3, function3, viewState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m47311s(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final String m47312t(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m47313u(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m47314v(C16780d c16780d, InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        List<C16781e> listM47327a = c16780d.m47327a();
        C26053f c26053f = (C26053f) LazyRow;
        c26053f.m77529r(listM47327a.size(), null, new c(b.f64503w, listM47327a), new C37816b(new d(listM47327a, interfaceC28601c1, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m47315w(Modifier modifier, C16780d c16780d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m47310r(modifier, c16780d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m47316x(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(989945902);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new e()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m47317y(int i13, Composer composer, int i14) {
        m47316x(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m47318z(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1203526662);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new g()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 18);
        }
    }
}
