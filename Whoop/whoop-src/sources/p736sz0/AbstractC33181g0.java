package p736sz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import dp0.C12253i;
import fy1.C14873i;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k81.EnumC22291a;
import l83.C23454a0;
import lf0.C23967s0;
import m83.C25235a0;
import ny0.AbstractC27265l0;
import ny0.C27273p0;
import ny0.EnumC27269n0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17916v0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q81.C30048f;
import qk2.C30453i;
import qz0.AbstractC30795n;
import s51.C32205b;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: sz0.g0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019\"\u0014\u0010\u001e\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019\"\u0014\u0010 \u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019\"\u0014\u0010\"\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\"\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lsz0/h0;", "numberedList", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "l", "(Landroidx/compose/ui/Modifier;Lsz0/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lsz0/e0;", "viewState", "p", "(Lsz0/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "number", "", "hasBackgroundBar", "j", "(IZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "v", "(Landroidx/compose/runtime/Composer;I)V", "t", "Ly3/f;", "a", "F", "INNER_NUMBER_CIRCLE_SIZE", "b", "OUTER_NUMBER_CIRCLE_SIZE", "c", "NUMBER_BAR_WIDTH", "d", "NUMBER_BAR_OFFSET_X", "e", "NUMBER_BAR_OFFSET_Y", "", "f", "Ljava/util/List;", "sampleItems", "Lny0/p0;", "g", "Lny0/p0;", "sampleCta", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lsz0/h0;", "x", "()Lsz0/h0;", "sampleNumberedListViewState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33181g0 {

    /* JADX INFO: renamed from: a */
    private static final float f138352a;

    /* JADX INFO: renamed from: b */
    private static final float f138353b;

    /* JADX INFO: renamed from: c */
    private static final float f138354c;

    /* JADX INFO: renamed from: d */
    private static final float f138355d;

    /* JADX INFO: renamed from: e */
    private static final float f138356e;

    /* JADX INFO: renamed from: f */
    private static final List<C33175e0> f138357f;

    /* JADX INFO: renamed from: g */
    private static final C27273p0 f138358g;

    /* JADX INFO: renamed from: h */
    private static final C33184h0 f138359h;

    /* JADX INFO: renamed from: sz0.g0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f138360w = new a();

        /* JADX INFO: renamed from: a */
        public final long m105145a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m105145a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: sz0.g0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m105146a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(2128453843);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            AbstractC33181g0.m105132l(null, C33184h0.m105155b(AbstractC33181g0.m105144x(), null, null, 1, null), null, c28655q, 0, 5);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m105146a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sz0.g0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m105147a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-922081387);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            AbstractC33181g0.m105132l(null, AbstractC33181g0.m105144x(), null, c28655q, 0, 5);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m105147a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        float f13 = 4;
        f138352a = 6 * f13;
        float f14 = 8 * f13;
        f138353b = f14;
        float f15 = f13 * f13;
        f138354c = f15;
        float f16 = 2;
        f138355d = (f14 - f15) / f16;
        f138356e = f14 / f16;
        EnumC22291a enumC22291a = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        List<C33175e0> listM118959K = AbstractC37056f.m118959K(new C33175e0(1, AbstractC8693b.m21278l("Schedule Your Lab Test"), AbstractC8693b.m21278l("Schedule at a location near you or choose a mobile draw from the comfort of your home."), new C27273p0(AbstractC8693b.m21278l("LEARN MORE"), new C9598e(null, null, null, 7, null), objArr, objArr2, objArr3, null, false, enumC22291a, null, null, null, false, null, false, 16380, null), true, true), new C33175e0(2, AbstractC8693b.m21278l("Receive a clinician-reviewed report. This is a longer header"), AbstractC8693b.m21278l("Your personalized analysis helps you understand what your results mean for your health and performance—plus what to do next."), null, true, true), new C33175e0(3, AbstractC8693b.m21278l("Get guidance every step of the way"), AbstractC8693b.m21278l("Make changes that have the biggest impact based on your results, and start to build a better routine."), null, true, true), new C33175e0(4, AbstractC8693b.m21278l("See your progress in between tests"), AbstractC8693b.m21278l("Watch your improvements unfold in your WHOOP data as you make changes to your behaviors that are linked to key biomarkers."), null, true, true), new C33175e0(5, AbstractC8693b.m21278l("Retest and continue to optimize"), AbstractC8693b.m21278l("Lab results and WHOOP data work together to show what's improving and what still needs work."), null, false, false));
        f138357f = listM118959K;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        C27273p0 c27273p0 = new C27273p0(AbstractC8693b.m21278l("LEARN MORE"), new C9598e(null, null, null, 7, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, false, null, null, null, enumC22291a, false, objArr4, false, 16380, objArr5);
        f138358g = c27273p0;
        f138359h = new C33184h0(listM118959K, c27273p0);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:62:0x018b  */
    /* JADX WARN: Code duplicated, block: B:63:0x018f  */
    /* JADX WARN: Code duplicated, block: B:68:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x020e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0219  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    private static final void m105130j(final int i13, final boolean z4, Modifier modifier, Composer composer, final int i14, final int i15) {
        int i16;
        Modifier modifier2;
        boolean z13;
        C28655q c28655q;
        final Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i17;
        int iHashCode2;
        int iHashCode3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1188202970);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        int i18 = i15 & 4;
        if (i18 == 0) {
            if ((i14 & 384) == 0) {
                modifier2 = modifier;
                i16 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            if ((i16 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z13)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                if (z4) {
                    c28655q2.m87150e0(-1586728856);
                    i17 = 0;
                    AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3391m(AbstractC1102d.m3424u(f138354c, AbstractC1102d.m3406c(1.0f, c2314t)), f138355d, f138356e), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC13673n.m38559f(C38072d.f163053a, c28655q2, 6, 0.15f)), new C17919x(C17919x.f69636m)), 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    i17 = 0;
                    c28655q2.m87150e0(-1586169554);
                    c28655q2.m87173q(false);
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, i17);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                C2307m c2307m = C2299e.f9102E;
                Modifier modifierM3419p = AbstractC1102d.m3419p(f138353b, c2314t);
                C33252i c33252i = AbstractC33253j.f138651a;
                Modifier modifierM118994r = AbstractC37056f.m118994r(modifierM3419p, c33252i);
                C38072d c38072d = C38072d.f163053a;
                long jM125414q = c38072d.m121949b(c28655q2, 6).getBlack20();
                C17916v0 c17916v0 = AbstractC17918w0.f69621a;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, jM125414q, c17916v0);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3358c);
                c28655q2.m87158i0();
                Modifier modifier5 = modifier4;
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f138352a, c2314t), c33252i), c38072d.m121949b(c28655q2, 6).getRecovery(), c17916v0), c28655q2, 0);
                AbstractC30795n.m94707h(String.valueOf(i13), null, C17919x.f69625b, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q2, 384, 0, 196090);
                c28655q = c28655q2;
                AbstractC25012a.m73392y(c28655q, true, true, true);
                modifier3 = modifier5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.f0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC33181g0.m105131k(i13, z4, modifier3, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 384;
        modifier2 = modifier;
        if ((i16 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z13)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifier4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            if (z4) {
                c28655q2.m87150e0(-1586728856);
                i17 = 0;
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(AbstractC1099a.m3391m(AbstractC1102d.m3424u(f138354c, AbstractC1102d.m3406c(1.0f, c2314t)), f138355d, f138356e), C17909s.m51493k(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC13673n.m38559f(C38072d.f163053a, c28655q2, 6, 0.15f)), new C17919x(C17919x.f69636m)), 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q2, 0);
                c28655q2.m87173q(false);
            } else {
                i17 = 0;
                c28655q2.m87150e0(-1586169554);
                c28655q2.m87173q(false);
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, i17);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N5);
            C2307m c2307m2 = C2299e.f9102E;
            Modifier modifierM3419p2 = AbstractC1102d.m3419p(f138353b, c2314t);
            C33252i c33252i2 = AbstractC33253j.f138651a;
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(modifierM3419p2, c33252i2);
            C38072d c38072d2 = C38072d.f163053a;
            long jM125414q2 = c38072d2.m121949b(c28655q2, 6).getBlack20();
            C17916v0 c17916v1 = AbstractC17918w0.f69621a;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM118994r2, jM125414q2, c17916v1);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3358c2);
            c28655q2.m87158i0();
            Modifier modifier6 = modifier4;
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N6);
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC37056f.m118994r(AbstractC1102d.m3419p(f138352a, c2314t), c33252i2), c38072d2.m121949b(c28655q2, 6).getRecovery(), c17916v1), c28655q2, 0);
            AbstractC30795n.m94707h(String.valueOf(i13), null, C17919x.f69625b, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, 6).getN8(), null, c28655q2, 384, 0, 196090);
            c28655q = c28655q2;
            AbstractC25012a.m73392y(c28655q, true, true, true);
            modifier3 = modifier6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: sz0.f0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC33181g0.m105131k(i13, z4, modifier3, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m105131k(int i13, boolean z4, Modifier modifier, int i14, int i15, Composer composer, int i16) {
        m105130j(i13, z4, modifier, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x0146  */
    /* JADX WARN: Code duplicated, block: B:60:0x014a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181 A[LOOP:0: B:67:0x017b->B:69:0x0181, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01df  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x0226  */
    /* JADX WARN: Code duplicated, block: B:87:0x0231  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static final void m105132l(Modifier modifier, C33184h0 numberedList, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        int iHashCode2;
        Iterator<T> it;
        float f14;
        C27273p0 cta;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        Function1 function5;
        boolean z14;
        Object objM87133R2;
        AbstractC22676k.m65750j(numberedList, "numberedList");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(454426853);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(numberedList) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C33192k(1);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                float f15 = 4;
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(modifier3, null, 3)), 3, f15), C38072d.f163053a.m121949b(c28655q2, 6).getWhite5(), AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3358c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                f13 = 8;
                Modifier modifier4 = modifier3;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 1 * f13, 1), 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                c28655q2.m87150e0(-375036000);
                it = numberedList.m105158e().iterator();
                while (it.hasNext()) {
                    m105136p((C33175e0) it.next(), function4, c28655q2, (i15 >> 3) & 112, 0);
                }
                c28655q2.m87173q(false);
                f14 = 2;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14 * f15, c2314t));
                cta = numberedList.getCta();
                if (cta == null) {
                    c28655q2.m87150e0(1258972850);
                    c28655q2.m87173q(false);
                    c28655q = c28655q2;
                    function5 = function4;
                    z14 = true;
                } else {
                    c28655q2.m87150e0(1258972851);
                    float f16 = f14 * f13;
                    Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, f16, f16, 0.0f, f16, 4);
                    EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                    TextResource textResourceM82267m = cta.getText();
                    C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, 0 == true ? 1 : 0);
                    if ((i15 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zM87157i = c28655q2.m87157i(cta) | z13;
                    objM87133R = c28655q2.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C23967s0(function4, cta, 3);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function5 = function4;
                    z14 = true;
                    AbstractC27265l0.m82217i(modifierM3398t2, enumC27269n0, textResourceM82267m, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q2, 100663350, 0, 3816);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
                c28655q.m87173q(z14);
                function3 = function5;
                modifier2 = modifier4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b(modifier2, numberedList, function3, i13, i14, 24);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C33192k(1);
                    c28655q2.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            float f17 = 4;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3427x(modifier3, null, 3)), 3, f17), C38072d.f163053a.m121949b(c28655q2, 6).getWhite5(), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3358c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC39127r0M66763d2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            f13 = 8;
            Modifier modifier5 = modifier3;
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 1 * f13, 1), 0.0f, ((float) 1.5d) * f13, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3398t3);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            c28655q2.m87150e0(-375036000);
            it = numberedList.m105158e().iterator();
            while (it.hasNext()) {
                m105136p((C33175e0) it.next(), function4, c28655q2, (i15 >> 3) & 112, 0);
            }
            c28655q2.m87173q(false);
            f14 = 2;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f14 * f17, c2314t));
            cta = numberedList.getCta();
            if (cta == null) {
                c28655q2.m87150e0(1258972850);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                function5 = function4;
                z14 = true;
            } else {
                c28655q2.m87150e0(1258972851);
                float f18 = f14 * f13;
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, f18, f18, 0.0f, f18, 4);
                EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                TextResource textResourceM82267m2 = cta.getText();
                C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(C38072d.f163053a), null, 2, 0 == true ? 1 : 0);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = c28655q2.m87157i(cta) | z13;
                objM87133R = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R = new C23967s0(function4, cta, 3);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C23967s0(function4, cta, 3);
                    c28655q2.m87172p0(objM87133R);
                }
                function5 = function4;
                z14 = true;
                AbstractC27265l0.m82217i(modifierM3398t4, enumC27269n1, textResourceM82267m2, null, c39274g2, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q2, 100663350, 0, 3816);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z14);
            c28655q.m87173q(z14);
            function3 = function5;
            modifier2 = modifier5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b(modifier2, numberedList, function3, i13, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m105133m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m105134n(Function1 function1, C27273p0 c27273p0, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(c27273p0.getNavigationAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m105135o(Modifier modifier, C33184h0 c33184h0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m105132l(modifier, c33184h0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:51:0x013f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x016c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0187  */
    /* JADX WARN: Code duplicated, block: B:63:0x0264  */
    /* JADX WARN: Code duplicated, block: B:64:0x0277  */
    /* JADX WARN: Code duplicated, block: B:66:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:76:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:80:0x0305  */
    /* JADX WARN: Code duplicated, block: B:82:0x0335  */
    /* JADX WARN: Code duplicated, block: B:84:0x0348  */
    /* JADX WARN: Code duplicated, block: B:87:0x0354  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private static final void m105136p(C33175e0 c33175e0, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC39171c interfaceC39171c;
        boolean zM87147d;
        Object objM87133R;
        C2314t c2314t;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C38072d c38072d;
        float f14;
        Function1 function5;
        C27273p0 c27273p0M105110a;
        Object objM87133R2;
        boolean z13;
        boolean z14;
        Object objM87133R3;
        Function1 function6;
        Function1 function7;
        float f15;
        C2314t c2314t2;
        boolean z15;
        Object objM87133R4;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1749384243);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87157i(c33175e0) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            i16 = i15;
            if ((i16 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C33192k(2);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
                zM87147d = c28655q2.m87147d(interfaceC39171c.getFontScale());
                objM87133R = c28655q2.m87133R();
                if (zM87147d || objM87133R == c28676v0) {
                    objM87133R = new C39174f(2 * ((float) Math.pow(interfaceC39171c.getFontScale(), 2)));
                    c28655q2.m87172p0(objM87133R);
                }
                float f16 = ((C39174f) objM87133R).f168413w;
                c2314t = C2314t.f9131w;
                f13 = 8;
                float f17 = 2 * f13;
                Modifier modifierM3388j = AbstractC1099a.m3388j(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f17, 0.0f, 2), EnumC22935a1.f90537w);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 48);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3388j);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                m105130j(c33175e0.getNumber(), c33175e0.getHasBackgroundBar(), AbstractC1099a.m3392n(AbstractC1102d.m3406c(1.0f, c2314t), 0.0f, f16, 1), c28655q2, 0, 0);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f17, c2314t));
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                String strM21274h = AbstractC8693b.m21274h(c33175e0.getHeaderText(), c28655q2, 0);
                c38072d = C38072d.f163053a;
                float f18 = 1;
                f14 = f18 * f13;
                function5 = function4;
                AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q2, 48, 0, 196600);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f18 * 4, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c33175e0.getDescriptionText(), c28655q2, 0), null, c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB2(), null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                c27273p0M105110a = c33175e0.getCta();
                if (c27273p0M105110a == null) {
                    c28655q.m87150e0(-380475560);
                    c28655q.m87173q(false);
                    z15 = false;
                    f15 = f14;
                    function7 = function5;
                    c2314t2 = c2314t;
                } else {
                    c28655q.m87150e0(-380475559);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                    EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                    TextResource textResourceM82267m = c27273p0M105110a.getText();
                    C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = a.f138360w;
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R2);
                    boolean zM87157i = c28655q.m87157i(c27273p0M105110a);
                    if ((i16 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i | z13;
                    objM87133R3 = c28655q.m87133R();
                    if (!z14 || objM87133R3 == c28676v0) {
                        function6 = function5;
                        objM87133R3 = new C23967s0(c27273p0M105110a, function6, 4);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        function6 = function5;
                    }
                    function7 = function6;
                    f15 = f14;
                    c2314t2 = c2314t;
                    AbstractC27265l0.m82217i(modifierM3398t, enumC27269n0, textResourceM82267m, null, c39274g, false, interfaceC39332eM125323a, null, false, false, null, null, (Function1) objM87133R3, c28655q, 100663350, 0, 3752);
                    c28655q = c28655q;
                    z15 = false;
                    c28655q.m87173q(false);
                }
                if (c33175e0.getHasDivider()) {
                    c28655q.m87150e0(-379725049);
                    C28655q c28655q3 = c28655q;
                    AbstractC15751g.m44449b(AbstractC1099a.m3395q(c2314t2, f15, ((float) 1.5d) * f13), c38072d.m121949b(c28655q, 6).getWhite10(), 0.0f, 0.0f, c28655q3, 6, 12);
                    c28655q = c28655q3;
                    c28655q.m87173q(z15);
                } else {
                    c28655q.m87150e0(-379496331);
                    c28655q.m87173q(z15);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function3 = function7;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(c33175e0, i13, function3, i14, 25);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i15;
        if ((i16 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C33192k(2);
                    c28655q2.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            interfaceC39171c = (InterfaceC39171c) c28655q2.m87161k(AbstractC2453v1.f9569h);
            zM87147d = c28655q2.m87147d(interfaceC39171c.getFontScale());
            objM87133R = c28655q2.m87133R();
            if (zM87147d) {
                objM87133R = new C39174f(2 * ((float) Math.pow(interfaceC39171c.getFontScale(), 2)));
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C39174f(2 * ((float) Math.pow(interfaceC39171c.getFontScale(), 2)));
                c28655q2.m87172p0(objM87133R);
            }
            float f19 = ((C39174f) objM87133R).f168413w;
            c2314t = C2314t.f9131w;
            f13 = 8;
            float f110 = 2 * f13;
            Modifier modifierM3388j2 = AbstractC1099a.m3388j(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f110, 0.0f, 2), EnumC22935a1.f90537w);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q2, 48);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3388j2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c22994r1M66759a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            m105130j(c33175e0.getNumber(), c33175e0.getHasBackgroundBar(), AbstractC1099a.m3392n(AbstractC1102d.m3406c(1.0f, c2314t), 0.0f, f19, 1), c28655q2, 0, 0);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3424u(f110, c2314t));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N4);
            String strM21274h2 = AbstractC8693b.m21274h(c33175e0.getHeaderText(), c28655q2, 0);
            c38072d = C38072d.f163053a;
            float f111 = 1;
            f14 = f111 * f13;
            function5 = function4;
            AbstractC30795n.m94707h(strM21274h2, AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB1(), null, c28655q2, 48, 0, 196600);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f111 * 4, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c33175e0.getDescriptionText(), c28655q2, 0), null, c38072d.m121949b(c28655q2, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB2(), null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            c27273p0M105110a = c33175e0.getCta();
            if (c27273p0M105110a == null) {
                c28655q.m87150e0(-380475560);
                c28655q.m87173q(false);
                z15 = false;
                f15 = f14;
                function7 = function5;
                c2314t2 = c2314t;
            } else {
                c28655q.m87150e0(-380475559);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
                EnumC27269n0 enumC27269n1 = EnumC27269n0.TextSmall;
                TextResource textResourceM82267m2 = c27273p0M105110a.getText();
                C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = a.f138360w;
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a((Function1) objM87133R2);
                boolean zM87157i2 = c28655q.m87157i(c27273p0M105110a);
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i2 | z13;
                objM87133R3 = c28655q.m87133R();
                if (z14) {
                    function6 = function5;
                    objM87133R3 = new C23967s0(c27273p0M105110a, function6, 4);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    function6 = function5;
                    objM87133R3 = new C23967s0(c27273p0M105110a, function6, 4);
                    c28655q.m87172p0(objM87133R3);
                }
                function7 = function6;
                f15 = f14;
                c2314t2 = c2314t;
                AbstractC27265l0.m82217i(modifierM3398t2, enumC27269n1, textResourceM82267m2, null, c39274g2, false, interfaceC39332eM125323a2, null, false, false, null, null, (Function1) objM87133R3, c28655q, 100663350, 0, 3752);
                c28655q = c28655q;
                z15 = false;
                c28655q.m87173q(false);
            }
            if (c33175e0.getHasDivider()) {
                c28655q.m87150e0(-379725049);
                C28655q c28655q4 = c28655q;
                AbstractC15751g.m44449b(AbstractC1099a.m3395q(c2314t2, f15, ((float) 1.5d) * f13), c38072d.m121949b(c28655q, 6).getWhite10(), 0.0f, 0.0f, c28655q4, 6, 12);
                c28655q = c28655q4;
                c28655q.m87173q(z15);
            } else {
                c28655q.m87150e0(-379496331);
                c28655q.m87173q(z15);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function3 = function7;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(c33175e0, i13, function3, i14, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m105137q(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m105138r(C27273p0 c27273p0, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        AnalyticEventModel analyticEventModelM82260f = c27273p0.getAnalyticEvent();
        if (analyticEventModelM82260f != null) {
            AbstractC13673n.m38578y(null, analyticEventModelM82260f, function1);
        }
        function1.invoke(c27273p0.getNavigationAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m105139s(C33175e0 c33175e0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m105136p(c33175e0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final void m105140t(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1136946596);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new b()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m105141u(int i13, Composer composer, int i14) {
        m105140t(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    public static final void m105142v(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1648831229);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new c()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30048f(i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m105143w(int i13, Composer composer, int i14) {
        m105142v(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final C33184h0 m105144x() {
        return f138359h;
    }
}
