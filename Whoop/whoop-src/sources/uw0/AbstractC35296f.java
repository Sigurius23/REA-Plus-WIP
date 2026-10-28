package uw0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c41.C4119t1;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import java.util.List;
import km0.C22580d;
import km0.C22582f;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27244c0;
import ny0.AbstractC27275q0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p043c4.C3948a0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17920x0;
import p208i2.InterfaceC17886g0;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import se.AbstractC32411b;
import tg2.C33795i;
import uk2.C35051a;
import ut2.C35231a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: uw0.f */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aO\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a9\u0010\u0015\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lkm0/f;", "viewState", "", "Lkm0/d;", "behaviorsInWeeklyPlan", "", "forceScrollbar", "Lkotlin/Function0;", "Ll83/a0;", "onConfirm", "onDismiss", "o", "(Lkm0/f;Ljava/util/List;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "m", "(Lkm0/d;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Ln0/u;", "state", "Ly3/f;", "width", "verticalPadding", "z", "(Landroidx/compose/ui/Modifier;Ln0/u;FFZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;", "custombottomsheet_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35296f {

    /* JADX INFO: renamed from: uw0.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f150303w = new a();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C22580d c22580d) {
            return null;
        }
    }

    /* JADX INFO: renamed from: uw0.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f150304w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f150305x;

        public b(Function1 function1, List list) {
            this.f150304w = function1;
            this.f150305x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m112005a(int i13) {
            return this.f150304w.invoke(this.f150305x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m112005a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: uw0.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f150306w;

        public c(List list) {
            this.f150306w = list;
        }

        /* JADX INFO: renamed from: a */
        public final void m112006a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C22580d c22580d = (C22580d) this.f150306w.get(i13);
            c28655q.m87150e0(-1458648246);
            AbstractC35296f.m111990m(c22580d, c28655q, C22580d.f88854k);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m112006a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final boolean m111976A(C26068u c26068u) {
        return c26068u.mo39183d() || c26068u.mo39182c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m111977B(C26068u c26068u, boolean z4, InterfaceC28670t2 interfaceC28670t2, float f13, float f14, long j7, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        C22128b c22128b = c0238p0.f815w;
        c0238p0.m728a();
        ?? r10 = c26068u.m77565h().f103177k;
        int i13 = c26068u.m77565h().f103180n;
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74100H0(r10);
        Integer numValueOf = interfaceC26054g != null ? Integer.valueOf(((C26062o) interfaceC26054g).f103184a) : null;
        if ((z4 || c26068u.f103226i.mo9765b() || ((Number) interfaceC28670t2.getValue()).floatValue() > 0.0f) && numValueOf != null && i13 > 0) {
            float fMo743q0 = c0238p0.mo743q0(f13);
            float f15 = 2;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) - (fMo743q0 * f15)) / i13;
            float fIntValue = (numValueOf.intValue() * fIntBitsToFloat) + fMo743q0;
            InterfaceC22131e.m63374D(drawWithContent, j7, (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)) - c0238p0.mo743q0(f14)) - c0238p0.mo743q0(1 * 8))) << 32) | (((long) Float.floatToRawIntBits(fIntValue)) & 4294967295L), (((long) Float.floatToRawIntBits(c0238p0.mo743q0(f14))) << 32) | (((long) Float.floatToRawIntBits(r10.size() * fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(c0238p0.mo743q0(f14) / f15)) << 32) | (((long) Float.floatToRawIntBits(c0238p0.mo743q0(f14) / f15)) & 4294967295L), null, ((Number) interfaceC28670t2.getValue()).floatValue(), 208);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final void m111990m(C22580d c22580d, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-682557741);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c22580d) : c28655q.m87157i(c22580d) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            float f13 = 5;
            float f14 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13 * f14, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3419p, c38072d.m121949b(c28655q, i15).getAccentNegativeTrend15(), AbstractC33253j.m105489e(f13));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
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
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getCross(), c28655q, 6), null, AbstractC1102d.m3419p(10, c2314t), c38072d.m121949b(c28655q, i15).getAccentNegativeTrend(), c28655q, 432, 0);
            c28655q.m87173q(true);
            AbstractC18489d0.m53380u(3, f14, c2314t, c28655q);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            TextResource textResourceM65411c = c22580d.getTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM65411c, c28655q, i16);
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i15).getB1();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i17, 196602);
            c28655q = c28655q;
            TextResource textResourceM65412d = c22580d.getSubtitle();
            if (textResourceM65412d == null) {
                c28655q.m87150e0(326452091);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(326452092);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM65412d, c28655q, i16), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB3(), null, c28655q, 0, i17, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35293c(c22580d, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m111991n(C22580d c22580d, int i13, Composer composer, int i14) {
        m111990m(c22580d, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x010f  */
    /* JADX WARN: Code duplicated, block: B:81:0x011a  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public static final void m111992o(C22582f viewState, List<C22580d> behaviorsInWeeklyPlan, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        int i16;
        InterfaceC4339a interfaceC4339a3;
        int i17;
        int i18;
        InterfaceC4339a interfaceC4339a4;
        int i19;
        boolean z14;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        int i24;
        InterfaceC4339a interfaceC4339a7;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(behaviorsInWeeklyPlan, "behaviorsInWeeklyPlan");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1874033028);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(behaviorsInWeeklyPlan) ? 32 : 16;
        }
        int i25 = i14 & 4;
        if (i25 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a3 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a3)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a4)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 9363) != 9362) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z14)) {
                        if (i25 != 0) {
                            z13 = false;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C35231a(14);
                                c28655q.m87172p0(objM87133R3);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                            i24 = i18;
                        } else {
                            i24 = i18;
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i24 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C35231a(15);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a6 = interfaceC4339a4;
                        }
                        int i26 = 3;
                        C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C35231a(16);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(i26), AbstractC37817c.m121344e(581748883, c28655q, new C4119t1(viewState, c26068uM77569a, z13, behaviorsInWeeklyPlan, interfaceC4339a6, interfaceC4339a7, 5)), c28655q, 438);
                        interfaceC4339a5 = interfaceC4339a7;
                    } else {
                        c28655q.m87138X();
                        interfaceC4339a5 = interfaceC4339a3;
                        interfaceC4339a6 = interfaceC4339a4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C33795i(viewState, behaviorsInWeeklyPlan, z13, interfaceC4339a5, interfaceC4339a6, i13, i14);
                    }
                }
                i15 |= 24576;
                interfaceC4339a4 = interfaceC4339a2;
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i25 != 0) {
                        z13 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35231a(14);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35231a(15);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a6 = interfaceC4339a4;
                    }
                    int i27 = 3;
                    C26068u c26068uM77569a2 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35231a(16);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(i27), AbstractC37817c.m121344e(581748883, c28655q, new C4119t1(viewState, c26068uM77569a2, z13, behaviorsInWeeklyPlan, interfaceC4339a6, interfaceC4339a7, 5)), c28655q, 438);
                    interfaceC4339a5 = interfaceC4339a7;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33795i(viewState, behaviorsInWeeklyPlan, z13, interfaceC4339a5, interfaceC4339a6, i13, i14);
                }
            }
            i15 |= 3072;
            interfaceC4339a3 = interfaceC4339a;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i25 != 0) {
                        z13 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35231a(14);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35231a(15);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a6 = interfaceC4339a4;
                    }
                    int i28 = 3;
                    C26068u c26068uM77569a3 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35231a(16);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(i28), AbstractC37817c.m121344e(581748883, c28655q, new C4119t1(viewState, c26068uM77569a3, z13, behaviorsInWeeklyPlan, interfaceC4339a6, interfaceC4339a7, 5)), c28655q, 438);
                    interfaceC4339a5 = interfaceC4339a7;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33795i(viewState, behaviorsInWeeklyPlan, z13, interfaceC4339a5, interfaceC4339a6, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i25 != 0) {
                    z13 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35231a(14);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                    i24 = i18;
                } else {
                    i24 = i18;
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35231a(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a6 = interfaceC4339a4;
                }
                int i29 = 3;
                C26068u c26068uM77569a4 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C35231a(16);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(i29), AbstractC37817c.m121344e(581748883, c28655q, new C4119t1(viewState, c26068uM77569a4, z13, behaviorsInWeeklyPlan, interfaceC4339a6, interfaceC4339a7, 5)), c28655q, 438);
                interfaceC4339a5 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(viewState, behaviorsInWeeklyPlan, z13, interfaceC4339a5, interfaceC4339a6, i13, i14);
            }
        }
        i15 |= 384;
        z13 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a3)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                if ((i15 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    if (i25 != 0) {
                        z13 = false;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C35231a(14);
                            c28655q.m87172p0(objM87133R3);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                        i24 = i18;
                    } else {
                        i24 = i18;
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i24 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C35231a(15);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a6 = interfaceC4339a4;
                    }
                    int i210 = 3;
                    C26068u c26068uM77569a5 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C35231a(16);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(i210), AbstractC37817c.m121344e(581748883, c28655q, new C4119t1(viewState, c26068uM77569a5, z13, behaviorsInWeeklyPlan, interfaceC4339a6, interfaceC4339a7, 5)), c28655q, 438);
                    interfaceC4339a5 = interfaceC4339a7;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4339a6 = interfaceC4339a4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C33795i(viewState, behaviorsInWeeklyPlan, z13, interfaceC4339a5, interfaceC4339a6, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i25 != 0) {
                    z13 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35231a(14);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                    i24 = i18;
                } else {
                    i24 = i18;
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35231a(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a6 = interfaceC4339a4;
                }
                int i211 = 3;
                C26068u c26068uM77569a6 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C35231a(16);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(i211), AbstractC37817c.m121344e(581748883, c28655q, new C4119t1(viewState, c26068uM77569a6, z13, behaviorsInWeeklyPlan, interfaceC4339a6, interfaceC4339a7, 5)), c28655q, 438);
                interfaceC4339a5 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(viewState, behaviorsInWeeklyPlan, z13, interfaceC4339a5, interfaceC4339a6, i13, i14);
            }
        }
        i15 |= 3072;
        interfaceC4339a3 = interfaceC4339a;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i25 != 0) {
                    z13 = false;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C35231a(14);
                        c28655q.m87172p0(objM87133R3);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                    i24 = i18;
                } else {
                    i24 = i18;
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i24 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C35231a(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a6 = interfaceC4339a4;
                }
                int i212 = 3;
                C26068u c26068uM77569a7 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C35231a(16);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(i212), AbstractC37817c.m121344e(581748883, c28655q, new C4119t1(viewState, c26068uM77569a7, z13, behaviorsInWeeklyPlan, interfaceC4339a6, interfaceC4339a7, 5)), c28655q, 438);
                interfaceC4339a5 = interfaceC4339a7;
            } else {
                c28655q.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4339a6 = interfaceC4339a4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33795i(viewState, behaviorsInWeeklyPlan, z13, interfaceC4339a5, interfaceC4339a6, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4339a4 = interfaceC4339a2;
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i25 != 0) {
                z13 = false;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C35231a(14);
                    c28655q.m87172p0(objM87133R3);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R3;
                i24 = i18;
            } else {
                i24 = i18;
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i24 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C35231a(15);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a6 = interfaceC4339a4;
            }
            int i213 = 3;
            C26068u c26068uM77569a8 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C35231a(16);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC32411b.m101089d((InterfaceC4339a) objM87133R, new C3948a0(i213), AbstractC37817c.m121344e(581748883, c28655q, new C4119t1(viewState, c26068uM77569a8, z13, behaviorsInWeeklyPlan, interfaceC4339a6, interfaceC4339a7, 5)), c28655q, 438);
            interfaceC4339a5 = interfaceC4339a7;
        } else {
            c28655q.m87138X();
            interfaceC4339a5 = interfaceC4339a3;
            interfaceC4339a6 = interfaceC4339a4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33795i(viewState, behaviorsInWeeklyPlan, z13, interfaceC4339a5, interfaceC4339a6, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m111993p() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m111994q() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m111995r() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:41:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:53:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:59:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x031f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0328  */
    /* JADX WARN: Code duplicated, block: B:70:0x033f  */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m111996s(C22582f c22582f, C26068u c26068u, boolean z4, List list, final InterfaceC4339a interfaceC4339a, final InterfaceC4339a interfaceC4339a2, Composer composer, int i13) {
        C28676v0 c28676v0;
        int iHashCode;
        float f13;
        boolean zM87153g;
        Object objM87133R;
        boolean zM87153g2;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC17911t abstractC17911tM44012U = AbstractC15673b0.m44012U();
            float f14 = 12;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f14);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3357b = AbstractC1092a.m3357b(c2314t, abstractC17911tM44012U, c33252iM105489e, 0.0f, 4);
            float f15 = 4;
            float f16 = 5 * f15;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1102d.m3409f(0.8f, AbstractC1099a.m3395q(modifierM3357b, f16, f16)), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f17 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 1 * f17, 0.0f, 2);
            String strM65435d = c22582f.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C2886a c2886aM8436q = c38072d.m121952e(c28655q, i14).getH3();
            C36775k c36775k = new C36775k(3);
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM65435d, modifierM3396r, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q, 48, i15, 196088);
            float f18 = 2 * f17;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t));
            AbstractC30795n.m94707h(c22582f.getSubtitle(), null, c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB2(), null, c28655q, 0, i15, 196090);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f18, c2314t));
            float f19 = 3;
            float f24 = f19 * f15;
            Modifier modifierM3358c = AbstractC1092a.m3358c(c2314t, c38072d.m121949b(c28655q, i14).getBlack20(), AbstractC33253j.m105489e(f24));
            Object objM87133R3 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R3 == c28676v1) {
                objM87133R3 = new C35051a(18);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3486a = AbstractC1127a.m3486a(modifierM3358c, (Function1) objM87133R3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3486a);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C22976l1 c22976l1M3379a = AbstractC1099a.m3379a(0.0f, f18, 1);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3413j(AbstractC1099a.m3396r(m112003z(c2314t, c26068u, 0.0f, 0.0f, z4, c28655q, 6, 6), f18, 0.0f, 2), 0.0f, 45 * f15, 1));
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
            boolean zM87157i = c28655q.m87157i(list);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R4 == c28676v0) {
                }
                AbstractC22674j.m65717c(modifierM3409f, c26068u, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) objM87133R4, c28655q, 24960, 488);
                c28655q.m87173q(true);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19 * f17, c2314t));
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f13 = Float.MAX_VALUE;
                } else {
                    f13 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13, true);
                TextResource textResourceM65433b = c22582f.getSecondaryButtonText();
                zM87153g = c28655q.m87153g(interfaceC4339a);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    final int i16 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: uw0.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i16) {
                                case 0:
                                    return AbstractC35296f.m111999v(interfaceC4339a);
                                default:
                                    return AbstractC35296f.m112000w(interfaceC4339a);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                int i17 = TextResource.$stable;
                AbstractC27275q0.m82278b(layoutWeightElement, false, textResourceM65433b, null, null, null, (InterfaceC4339a) objM87133R, c28655q, i17 << 6, 58);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f24, c2314t));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                TextResource textResourceM65432a = c22582f.getPrimaryButtonText();
                zM87153g2 = c28655q.m87153g(interfaceC4339a2);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    final int i18 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: uw0.d
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC35296f.m111999v(interfaceC4339a2);
                                default:
                                    return AbstractC35296f.m112000w(interfaceC4339a2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27244c0.m82098b(layoutWeightElement2, false, null, textResourceM65432a, null, null, (InterfaceC4339a) objM87133R2, c28655q, i17 << 9, 54);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            }
            objM87133R4 = new C35303m(list, 2);
            c28655q.m87172p0(objM87133R4);
            AbstractC22674j.m65717c(modifierM3409f, c26068u, c22976l1M3379a, c22971kM66746i, null, null, false, null, (Function1) objM87133R4, c28655q, 24960, 488);
            c28655q.m87173q(true);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f19 * f17, c2314t));
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f13 = Float.MAX_VALUE;
            } else {
                f13 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f13, true);
            TextResource textResourceM65433b2 = c22582f.getSecondaryButtonText();
            zM87153g = c28655q.m87153g(interfaceC4339a);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                final int i19 = 0;
                objM87133R = new InterfaceC4339a() { // from class: uw0.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i19) {
                            case 0:
                                return AbstractC35296f.m111999v(interfaceC4339a);
                            default:
                                return AbstractC35296f.m112000w(interfaceC4339a);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                final int i110 = 0;
                objM87133R = new InterfaceC4339a() { // from class: uw0.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i110) {
                            case 0:
                                return AbstractC35296f.m111999v(interfaceC4339a);
                            default:
                                return AbstractC35296f.m112000w(interfaceC4339a);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            int i111 = TextResource.$stable;
            AbstractC27275q0.m82278b(layoutWeightElement3, false, textResourceM65433b2, null, null, null, (InterfaceC4339a) objM87133R, c28655q, i111 << 6, 58);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f24, c2314t));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            TextResource textResourceM65432a2 = c22582f.getPrimaryButtonText();
            zM87153g2 = c28655q.m87153g(interfaceC4339a2);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                final int i112 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: uw0.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i112) {
                            case 0:
                                return AbstractC35296f.m111999v(interfaceC4339a2);
                            default:
                                return AbstractC35296f.m112000w(interfaceC4339a2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            } else {
                final int i113 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: uw0.d
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i113) {
                            case 0:
                                return AbstractC35296f.m111999v(interfaceC4339a2);
                            default:
                                return AbstractC35296f.m112000w(interfaceC4339a2);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27244c0.m82098b(layoutWeightElement4, false, null, textResourceM65432a2, null, null, (InterfaceC4339a) objM87133R2, c28655q, i111 << 9, 54);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m111997t(InterfaceC17886g0 graphicsLayer) {
        AbstractC22676k.m65750j(graphicsLayer, "$this$graphicsLayer");
        ((C17920x0) graphicsLayer).m51554e(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m111998u(List list, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(list.size(), null, new b(a.f150303w, list), new C37816b(new c(list), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m111999v(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m112000w(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m112001x(C22582f c22582f, List list, boolean z4, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m111992o(c22582f, list, z4, interfaceC4339a, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

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
    /* JADX INFO: renamed from: z */
    public static final Modifier m112003z(Modifier verticalScrollbar, C26068u state, float f13, float f14, boolean z4, Composer composer, int i13, int i14) {
        AbstractC22676k.m65750j(verticalScrollbar, "$this$verticalScrollbar");
        AbstractC22676k.m65750j(state, "state");
        float f15 = (i14 & 2) != 0 ? 4 : f13;
        float f16 = (i14 & 4) != 0 ? 8 : f14;
        boolean z13 = true;
        boolean z14 = (i14 & 8) != 0 ? true : z4;
        C28655q c28655q = (C28655q) composer;
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = AbstractC28683x.m87264r(new C35295e(state, 0));
            c28655q.m87172p0(objM87133R);
        }
        float f17 = ((Boolean) ((InterfaceC28670t2) objM87133R).getValue()).booleanValue() ? 1.0f : 0.0f;
        int i15 = state.f103226i.mo9765b() ? 150 : 500;
        long jM125374Y0 = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite30();
        InterfaceC28670t2 interfaceC28670t2M30588b = AbstractC11352g.m30588b(f17, AbstractC11348f.m30574v(i15, 0, null, 6), "", null, c28655q, 3072, 20);
        boolean zM87153g = ((((i13 & 112) ^ 48) > 32 && c28655q.m87153g(state)) || (i13 & 48) == 32) | ((((57344 & i13) ^ 24576) > 16384 && c28655q.m87155h(z14)) || (i13 & 24576) == 16384) | c28655q.m87153g(interfaceC28670t2M30588b) | ((((i13 & 7168) ^ 3072) > 2048 && c28655q.m87147d(f16)) || (i13 & 3072) == 2048);
        if ((((i13 & 896) ^ 384) <= 256 || !c28655q.m87147d(f15)) && (i13 & 384) != 256) {
            z13 = false;
        }
        boolean zM87151f = zM87153g | z13 | c28655q.m87151f(jM125374Y0);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87151f || objM87133R2 == c28676v0) {
            C35292b c35292b = new C35292b(state, z14, interfaceC28670t2M30588b, f16, f15, jM125374Y0, 0);
            c28655q.m87172p0(c35292b);
            objM87133R2 = c35292b;
        }
        return AbstractC1125a.m3480c(verticalScrollbar, (Function1) objM87133R2);
    }
}
