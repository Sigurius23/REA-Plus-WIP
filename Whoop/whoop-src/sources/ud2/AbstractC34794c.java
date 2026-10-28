package ud2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32627j2;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rq0.C31703x;
import td2.C33712c;
import td2.C33716g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ud2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Ltd2/c;", "historyDetailViewState", "Ll83/a0;", "f", "(Ltd2/c;Landroidx/compose/runtime/Composer;I)V", "Ltd2/g;", "detailRecord", "d", "(Ltd2/g;Landroidx/compose/runtime/Composer;I)V", "shepherd_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34794c {

    /* JADX INFO: renamed from: ud2.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f146500w = new a();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C33716g c33716g) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ud2.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f146501w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f146502x;

        public b(Function1 function1, List list) {
            this.f146501w = function1;
            this.f146502x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m109817a(int i13) {
            return this.f146501w.invoke(this.f146502x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m109817a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: ud2.c$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f146503w;

        public c(List list) {
            this.f146503w = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m109818a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C33716g c33716g = (C33716g) this.f146503w.get(i13);
            c28655q.m87150e0(-1734547061);
            AbstractC34794c.m109810d(c33716g, c28655q, TextResource.$stable);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m109818a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m109810d(C33716g c33716g, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-13994377);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c33716g) : c28655q.m87157i(c33716g) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            float f13 = 8;
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(2, f13, C2299e.f9108K, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f14 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(7 * f14, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f15 = 1;
            Modifier modifierM95629e = AbstractC31061c.m95629e(modifierM3419p, f15, f14, c38072d.m121949b(c28655q, i15).getAccentNegativeTrend());
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM95629e);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c33716g.getIcon(), c28655q, 6), null, AbstractC1099a.m3394p(f15 * f13, c2314t), c38072d.m121949b(c28655q, i15).getBrandBlack(), c28655q, 432, 0);
            c28655q.m87173q(true);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
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
            TextResource label = c33716g.getLabel();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(label, c28655q, i16);
            long brandWhite = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a h7 = c38072d.m121952e(c28655q, i15).getH5();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h7, null, c28655q, 0, i17, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 0.5d) * f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c33716g.getTimeRange(), c28655q, i16), null, c38072d.m121949b(c28655q, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getN9(), null, c28655q, 0, i17, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(c33716g, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m109811e(C33716g c33716g, int i13, Composer composer, int i14) {
        m109810d(c33716g, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m109812f(C33712c historyDetailViewState, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(historyDetailViewState, "historyDetailViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1175153564);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(historyDetailViewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            String strM21274h = AbstractC8693b.m21274h(historyDetailViewState.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getH5(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(2 * f13, c2314t));
            if (historyDetailViewState.getHistoryDetailByDate() != null) {
                c28655q.m87150e0(-720953893);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * f13);
                boolean zM87157i = c28655q.m87157i(historyDetailViewState);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    c28655q = c28655q;
                    c28655q = c28655q;
                    objM87133R = new C31703x(historyDetailViewState, 29);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q = c28655q;
                AbstractC22674j.m65717c(modifierM3407d, c26068uM77569a, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R, c28655q, 24582, 492);
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q;
                c28655q.m87150e0(-720612738);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(historyDetailViewState, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m109813g(C33712c c33712c, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C33716g> listM106546b = c33712c.getHistoryDetailByDate().m106546b();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM106546b.size(), null, new b(a.f146500w, listM106546b), new C37816b(new c(listM106546b), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m109814h(C33712c c33712c, int i13, Composer composer, int i14) {
        m109812f(c33712c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
