package p748zc1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.AbstractC4128u3;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22399k;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.e5 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0002¨\u0006\u0005"}, m65681d2 = {"Ll83/a0;", "f", "(Landroidx/compose/runtime/Composer;I)V", "d", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40314e5 {
    /* JADX INFO: renamed from: d */
    public static final void m129659d(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-401235675);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(0.5f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22399k.m64473c("Health", c28655q, 6);
            float f13 = 4;
            AbstractC18489d0.m53380u(1, f13, c2314t, c28655q);
            AbstractC22399k.m64473c("Positive Range", c28655q, 6);
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            C38072d c38072d = C38072d.f163053a;
            int iM46349n = c38072d.m121951d().getVarious().getDiagnosticData();
            TextResource textResourceM21278l = AbstractC8693b.m21278l("HEALTH MONITOR");
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("5/5 METRIC");
            int i14 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("WITHIN RANGE");
            long jM125400j = c38072d.m121949b(c28655q, i14).getAccentPositiveTrend();
            int iM8290c = AbstractC2875y.m8290c(c38072d);
            long jM125400j2 = c38072d.m121949b(c28655q, i14).getAccentPositiveTrend();
            int i15 = TextResource.$stable;
            int i16 = i15 | (i15 << 12) | (i15 << 18);
            AbstractC4128u3.m12749n(textResourceM21278l, iM46349n, iM8290c, jM125400j2, textResourceM21278l2, jM125430y, textResourceM21278l3, jM125400j, null, c28655q, i16, 256);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Negative Range", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC4128u3.m12749n(AbstractC8693b.m21278l("HEALTH MONITOR"), c38072d.m121951d().getVarious().getDiagnosticData(), AbstractC18489d0.m53362c(c38072d), c38072d.m121949b(c28655q, i14).getAccentNegativeTrend(), AbstractC8693b.m21278l("3/5 Metric"), c38072d.m121949b(c28655q, i14).getBrandWhite(), AbstractC8693b.m21278l("WITHIN RANGE"), c38072d.m121949b(c28655q, i14).getAccentNegativeTrend(), null, c28655q, i16, 256);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Alert Range", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC4128u3.m12749n(AbstractC8693b.m21278l("HEALTH MONITOR"), c38072d.m121951d().getVarious().getDiagnosticData(), AbstractC18489d0.m53362c(c38072d), c38072d.m121949b(c28655q, i14).getAccentAlert(), AbstractC8693b.m21278l("RESPIRATORY RATE"), c38072d.m121949b(c28655q, i14).getBrandWhite(), AbstractC8693b.m21278l("VERY ELEVATED"), c38072d.m121949b(c28655q, i14).getAccentAlert(), null, c28655q, i16, 256);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("No Data", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC4128u3.m12749n(AbstractC8693b.m21278l("HEALTH MONITOR"), c38072d.m121951d().getVarious().getDiagnosticData(), c38072d.m121951d().getVarious().getMissingData(), c38072d.m121949b(c28655q, i14).getBrandWhite(), AbstractC8693b.m21278l("NO DATA"), AbstractC13673n.m38559f(c38072d, c28655q, i14, 0.5f), AbstractC8693b.m21278l("AVAILABLE"), AbstractC13673n.m38559f(c38072d, c28655q, i14, 0.5f), null, c28655q, i16, 256);
            AbstractC25012a.m73389v(c2314t, f14, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m129660e(int i13, Composer composer, int i14) {
        m129659d(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m129661f(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(978990108);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
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
            m129659d(c28655q, 0);
            m129663h(c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m129662g(int i13, Composer composer, int i14) {
        m129661f(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m129663h(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(271913677);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC22399k.m64473c("Stress", c28655q, 6);
            float f13 = 4;
            AbstractC18489d0.m53380u(1, f13, c2314t, c28655q);
            AbstractC22399k.m64473c("Low Stress", c28655q, 6);
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            C38072d c38072d = C38072d.f163053a;
            int iM46336g0 = c38072d.m121951d().getVarious().getStressMonitor();
            TextResource textResourceM21278l = AbstractC8693b.m21278l("STRESS MONITOR");
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("LOW");
            int i14 = C38072d.f163054b;
            long jM125371X = c38072d.m121949b(c28655q, i14).getRecovery();
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("1 MIN. AGO");
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            int iM8290c = AbstractC2875y.m8290c(c38072d);
            long jM125371X2 = c38072d.m121949b(c28655q, i14).getRecovery();
            int i15 = TextResource.$stable;
            int i16 = i15 | (i15 << 12) | (i15 << 18);
            AbstractC4128u3.m12749n(textResourceM21278l, iM46336g0, iM8290c, jM125371X2, textResourceM21278l2, jM125371X, textResourceM21278l3, jM125430y, null, c28655q, i16, 256);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("Medium Stress", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC4128u3.m12749n(AbstractC8693b.m21278l("STRESS MONITOR"), c38072d.m121951d().getVarious().getStressMonitor(), AbstractC2875y.m8290c(c38072d), c38072d.m121949b(c28655q, i14).getAccentPositiveTrend(), AbstractC8693b.m21278l("MEDIUM"), c38072d.m121949b(c28655q, i14).getAccentPositiveTrend(), AbstractC8693b.m21278l("1 MIN. AGO"), c38072d.m121949b(c28655q, i14).getBrandWhite(), null, c28655q, i16, 256);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("High Stress", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC4128u3.m12749n(AbstractC8693b.m21278l("STRESS MONITOR"), c38072d.m121951d().getVarious().getStressMonitor(), AbstractC18489d0.m53362c(c38072d), c38072d.m121949b(c28655q, i14).getAccentNegativeTrend(), AbstractC8693b.m21278l("HIGH"), c38072d.m121949b(c28655q, i14).getAccentNegativeTrend(), AbstractC8693b.m21278l("1 MIN. AGO"), c38072d.m121949b(c28655q, i14).getBrandWhite(), null, c28655q, i16, 256);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC22399k.m64473c("No Data", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            AbstractC4128u3.m12749n(AbstractC8693b.m21278l("STRESS MONITOR"), c38072d.m121951d().getVarious().getStressMonitor(), c38072d.m121951d().getVarious().getMissingData(), c38072d.m121949b(c28655q, i14).getBrandWhite(), AbstractC8693b.m21278l("NO DATA"), AbstractC13673n.m38559f(c38072d, c28655q, i14, 0.5f), AbstractC8693b.m21278l("AVAILABLE"), AbstractC13673n.m38559f(c38072d, c28655q, i14, 0.5f), null, c28655q, i16, 256);
            AbstractC25012a.m73389v(c2314t, f14, c28655q, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40270a5(i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m129664i(int i13, Composer composer, int i14) {
        m129663h(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
