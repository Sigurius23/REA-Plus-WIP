package of2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import gz0.AbstractC16319p0;
import ih0.AbstractC18489d0;
import java.util.List;
import l83.C23454a0;
import lf2.C24011d;
import lf2.C24012e;
import mi2.C25592o;
import mx1.C26003i;
import nq0.C27050m;
import nw0.C27207n;
import ny0.AbstractC27282u;
import ny0.AbstractC27283u0;
import ny0.AbstractC27285v0;
import ny0.EnumC27251e1;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf2.AbstractC29151a;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: of2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Llf2/d;", "repeatDaysViewState", "Lkotlin/Function1;", "Lpf2/a;", "Ll83/a0;", "repeatDaysViewEventListener", "i", "(Llf2/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Llf2/e;", "item", "repeatDaysViewEvent", "f", "(Llf2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "sleep-coach_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27897a {

    /* JADX INFO: renamed from: of2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f112490w;

        public a(List list) {
            this.f112490w = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m84191a(int i13) {
            this.f112490w.get(i13);
            return null;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m84191a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: of2.a$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f112491w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f112492x;

        public b(List list, Function1 function1) {
            this.f112491w = list;
            this.f112492x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m84192a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C24012e c24012e = (C24012e) this.f112491w.get(i13);
            c28655q.m87150e0(-219238217);
            AbstractC27897a.m84184f(c24012e, this.f112492x, c28655q, 0);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m84192a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m84184f(C24012e item, Function1 repeatDaysViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(item, "item");
        AbstractC22676k.m65750j(repeatDaysViewEvent, "repeatDaysViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(633593046);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(item) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(repeatDaysViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2305k c2305k = C2299e.f9111N;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 0.5d) * 8, AbstractC1102d.m3427x(c2314t, null, 3));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
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
            String strM70828a = item.getDayLabelDisplay();
            AbstractC27285v0.d dVar = new AbstractC27285v0.d(EnumC27251e1.FIXED, null, 2, null);
            boolean zM70831d = item.getIsSelected();
            boolean zM70830c = item.getIsEnabled();
            boolean z4 = ((i14 & 14) == 4) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C25592o(25, repeatDaysViewEvent, item);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27283u0.m82318q(null, strM70828a, null, null, dVar, zM70831d, zM70830c, 0.0f, null, (InterfaceC4339a) objM87133R, c28655q, AbstractC27285v0.d.f109209f << 12, 397);
            float f13 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(5 * f13, c2314t));
            if (item.getIsEnabled()) {
                c28655q.m87150e0(-1025054430);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1025443635);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getTinyIcons().getEllipse(), c28655q, 6), "", AbstractC13673n.m38560g(c2305k, AbstractC1102d.m3415l(2 * f13, c2314t)), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite20(), c28655q, 48, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(item, repeatDaysViewEvent, i13, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m84185g(Function1 function1, C24012e c24012e) {
        function1.invoke(new AbstractC29151a.b(c24012e.getDayOfWeek()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m84186h(C24012e c24012e, Function1 function1, int i13, Composer composer, int i14) {
        m84184f(c24012e, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m84187i(C24011d repeatDaysViewState, Function1 repeatDaysViewEventListener, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(repeatDaysViewState, "repeatDaysViewState");
        AbstractC22676k.m65750j(repeatDaysViewEventListener, "repeatDaysViewEventListener");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(309932368);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(repeatDaysViewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(repeatDaysViewEventListener) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2305k c2305k = C2299e.f9111N;
            C22961h c22961h = AbstractC22977m.f90654e;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, AbstractC1099a.m3396r(c2314t, 1 * 8, 0.0f, 2));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3406c);
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
            float f13 = 4;
            float f14 = 5 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            C27430e c27430eM107874S = AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getLogo().getWhoopRounded(), c28655q, 6);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, "Logo", null, c38072d.m121949b(c28655q, i15).getBrandWhite(), c28655q, 48, 4);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC30795n.m94707h(repeatDaysViewState.getRepeatDaysDescriptionText(), null, c38072d.m121949b(c28655q, i15).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196090);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l = C2299e.f9107J;
            int i16 = i14 & 112;
            boolean zM87157i = c28655q.m87157i(repeatDaysViewState) | (i16 == 32);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C27050m(repeatDaysViewState, repeatDaysViewEventListener, 8);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22674j.m65718d(modifierM3409f, null, null, c22961h, c2306l, null, false, null, (Function1) objM87133R, c28655q, 221190, 462);
            AbstractC18489d0.m53380u(15, f13, c2314t, c28655q);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM70824c = repeatDaysViewState.getNextActionLabel();
            boolean zM70825d = repeatDaysViewState.getNextButtonEnabled();
            boolean z4 = i16 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z4 || objM87133R2 == c28676v0) {
                objM87133R2 = new C27207n(repeatDaysViewEventListener, 12);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27282u.m82292h(modifierM3409f2, enumC27284v, strM70824c, zM70825d, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 112);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(repeatDaysViewState, repeatDaysViewEventListener, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m84188j(C24011d c24011d, Function1 function1, InterfaceC26064q LazyRow) {
        AbstractC22676k.m65750j(LazyRow, "$this$LazyRow");
        List<C24012e> listM70827f = c24011d.m70827f();
        ((C26053f) LazyRow).m77529r(listM70827f.size(), null, new a(listM70827f), new C37816b(new b(listM70827f, function1), true, 2039820996));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m84189k(Function1 function1) {
        function1.invoke(AbstractC29151a.a.f117997a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m84190l(C24011d c24011d, Function1 function1, int i13, Composer composer, int i14) {
        m84187i(c24011d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
