package c41;

import am2.C1027k0;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import bs1.C3603v;
import bz0.C3713c;
import c13.AbstractC3855a;
import c31.C3929m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import dp0.C12253i;
import fy1.C14873i;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: c41.f1 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000f\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016\"\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001f\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c\"\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\"\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!\"\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!\"\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!\"\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010!\"\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010!\"\u0014\u00101\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010!\"\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010!\"\u0014\u00104\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!\"\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010!\"\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010)¨\u00068"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc41/g1;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lc41/g1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Ly81/f;", "barStyles", "Ly3/f;", "bottomPadding", "p", "(Ljava/util/List;FLandroidx/compose/runtime/Composer;II)V", "l", "(Landroidx/compose/runtime/Composer;I)V", "n", "Lcom/whoop/design/util/TextResource;", "a", "Lcom/whoop/design/util/TextResource;", "sampleContributorTileMetricNoDataText", "b", "sampleContributorTileMetricCalibratingText", "Lc41/h1;", "c", "Lc41/h1;", "sampleContributorTileMetricStyleNoData", "d", "sampleContributorTileMetricStyleData", "e", "Lc41/g1;", "sampleContributorTileMetricHrvHighPositive", "f", "sampleContributorTileMetricRhrHighNegative", "g", "sampleContributorTileMetricRespiratoryRateHighNeutral", "sampleContributorTileMetricSleepPerformanceHighPositive", "i", "Ljava/util/List;", "t", "()Ljava/util/List;", "sampleContributorTileMetrics", "j", "sampleContributorTileMetricHrvNoIcon", "k", "sampleContributorTileMetricRhrNoStatus", "sampleContributorTileMetricRespiratoryRateNoData", "m", "sampleContributorTileMetricSleepPerformanceLongText", "sampleContributorTileMetricStrengthTrainingTime", "o", "sampleContributorTileMetricRhrHighNegativeWithSubtitle", "variantSampleContributorTileMetrics", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4021f1 {

    /* JADX INFO: renamed from: a */
    private static final TextResource f16330a;

    /* JADX INFO: renamed from: b */
    private static final TextResource f16331b;

    /* JADX INFO: renamed from: c */
    private static final EnumC4035h1 f16332c;

    /* JADX INFO: renamed from: d */
    private static final EnumC4035h1 f16333d;

    /* JADX INFO: renamed from: e */
    private static final C4028g1 f16334e;

    /* JADX INFO: renamed from: f */
    private static final C4028g1 f16335f;

    /* JADX INFO: renamed from: g */
    private static final C4028g1 f16336g;

    /* JADX INFO: renamed from: h */
    private static final C4028g1 f16337h;

    /* JADX INFO: renamed from: i */
    private static final List<C4028g1> f16338i;

    /* JADX INFO: renamed from: j */
    private static final C4028g1 f16339j;

    /* JADX INFO: renamed from: k */
    private static final C4028g1 f16340k;

    /* JADX INFO: renamed from: l */
    private static final C4028g1 f16341l;

    /* JADX INFO: renamed from: m */
    private static final C4028g1 f16342m;

    /* JADX INFO: renamed from: n */
    private static final C4028g1 f16343n;

    /* JADX INFO: renamed from: o */
    private static final C4028g1 f16344o;

    /* JADX INFO: renamed from: p */
    private static final List<C4028g1> f16345p;

    /* JADX INFO: renamed from: c41.f1$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m12244a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-448143178);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, c2314t);
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
            c28655q.m87150e0(-1975271779);
            for (C4028g1 c4028g1 : AbstractC4021f1.m12243t()) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = b.f16346w;
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC4021f1.m12231h(c2314t, c4028g1, (Function1) objM87133R, c28655q, 390, 0);
            }
            AbstractC25012a.m73392y(c28655q, false, true, false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m12244a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c41.f1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f16346w = new b();

        /* JADX INFO: renamed from: a */
        public final void m12245a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m12245a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c41.f1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4351m {
        /* JADX INFO: renamed from: a */
        public final void m12246a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(-1202989372);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, AbstractC15673b0.m44008S(c2314t));
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
            c28655q.m87150e0(632443562);
            for (C4028g1 c4028g1 : AbstractC4021f1.f16345p) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = d.f16347w;
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC4021f1.m12231h(c2314t, c4028g1, (Function1) objM87133R, c28655q, 390, 0);
            }
            AbstractC25012a.m73392y(c28655q, false, true, false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m12246a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: c41.f1$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f16347w = new d();

        /* JADX INFO: renamed from: a */
        public final void m12247a(Object it) {
            AbstractC22676k.m65750j(it, "it");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m12247a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC4035h1 enumC4035h1 = EnumC4035h1.NO_DATA;
        TextResource textDefault = enumC4035h1.getTextDefault();
        f16330a = textDefault;
        EnumC4035h1 enumC4035h2 = EnumC4035h1.CALIBRATING;
        TextResource textDefault2 = enumC4035h2.getTextDefault();
        f16331b = textDefault2;
        f16332c = enumC4035h1;
        EnumC4035h1 enumC4035h3 = EnumC4035h1.DATA;
        f16333d = enumC4035h3;
        EnumC16313m0 enumC16313m0 = EnumC16313m0.HRV_OUTLINE;
        TextResource.C8691e c8691e = new TextResource.C8691e("heart rate variability");
        TextResource.C8691e c8691e2 = new TextResource.C8691e("124");
        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_TRIANGLE_UP;
        EnumC39333f enumC39333f = EnumC39333f.ACCENT_POSITIVE_TREND;
        int i13 = 7;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AppScreen appScreen = null;
        C9598e c9598e = new C9598e(appScreen, null, null, i13, defaultConstructorMarker);
        EnumC39333f enumC39333f2 = EnumC39333f.WHITE_10;
        int i14 = 66;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        String str = null;
        String str2 = null;
        TextResource textResource = null;
        C4028g1 c4028g1 = new C4028g1(str, str2, enumC16313m0, c8691e, enumC4035h3, c8691e2, textResource, enumC16313m1, enumC39333f, c9598e, AbstractC37056f.m118959K(enumC39333f2, enumC39333f2, enumC39333f), i14, defaultConstructorMarker2);
        f16334e = c4028g1;
        EnumC16313m0 enumC16313m2 = EnumC16313m0.RHR;
        TextResource.C8691e c8691e3 = new TextResource.C8691e("resting heart rate");
        TextResource.C8691e c8691e4 = new TextResource.C8691e("49");
        EnumC39333f enumC39333f3 = EnumC39333f.ACCENT_NEGATIVE_TREND;
        C9598e c9598e2 = new C9598e(appScreen, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i13, defaultConstructorMarker);
        C25271y c25271y = C25271y.f99162w;
        C4028g1 c4028g2 = new C4028g1(str, str2, enumC16313m2, c8691e3, enumC4035h3, c8691e4, textResource, enumC16313m1, enumC39333f3, c9598e2, c25271y, i14, defaultConstructorMarker2);
        f16335f = c4028g2;
        C4028g1 c4028g3 = new C4028g1(str, str2, EnumC16313m0.RESPIRATORY_RATE, new TextResource.C8691e("respiratory rate"), enumC4035h3, new TextResource.C8691e("14.5"), textResource, enumC16313m1, EnumC39333f.BRAND_WHITE, new C9598e(appScreen, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i13, defaultConstructorMarker), c25271y, i14, defaultConstructorMarker2);
        f16336g = c4028g3;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        C4028g1 c4028g4 = new C4028g1(str, str2, EnumC16313m0.SLEEP, new TextResource.C8691e("sleep performance"), enumC4035h3, new TextResource.C8691e("74%"), textResource, enumC16313m1, enumC39333f, new C9598e(objArr, objArr2, null, 7, null), c25271y, i14, defaultConstructorMarker2);
        f16337h = c4028g4;
        f16338i = AbstractC37056f.m118959K(c4028g1, c4028g2, c4028g3, c4028g4);
        C4028g1 c4028g1M12267b = C4028g1.m12267b(c4028g1, null, null, null, null, null, null, null, null, null, null, null, 2043, null);
        f16339j = c4028g1M12267b;
        C4028g1 c4028g1M12267b2 = C4028g1.m12267b(c4028g2, null, null, null, null, null, null, null, null, null, null, null, 1919, null);
        f16340k = c4028g1M12267b2;
        C4028g1 c4028g1M12267b3 = C4028g1.m12267b(c4028g3, null, null, null, null, enumC4035h1, textDefault, null, null, null, null, null, 1871, null);
        f16341l = c4028g1M12267b3;
        C4028g1 c4028g1M12267b4 = C4028g1.m12267b(c4028g4, null, null, null, new TextResource.C8691e("Sleep performance over the last thirty days"), null, null, null, null, null, null, null, 2039, null);
        f16342m = c4028g1M12267b4;
        C4028g1 c4028g5 = new C4028g1(str, str2, EnumC16313m0.TONNAGE, new TextResource.C8691e("Strength Training Time"), enumC4035h3, new TextResource.C8691e("1:30"), textResource, EnumC16313m0.TINY_TRIANGLE_DOWN, enumC39333f3, new C9598e(null, null, null, 7, 0 == true ? 1 : 0), c25271y, 66, defaultConstructorMarker2);
        f16343n = c4028g5;
        C4028g1 c4028g1M12267b5 = C4028g1.m12267b(c4028g2, null, null, null, null, null, null, new TextResource.C8691e("45"), null, null, null, null, 1983, null);
        f16344o = c4028g1M12267b5;
        f16345p = AbstractC37056f.m118959K(c4028g1M12267b, c4028g1M12267b2, c4028g1M12267b3, c4028g1M12267b4, c4028g5, C4028g1.m12267b(c4028g1M12267b2, null, null, null, null, null, AbstractC8693b.m21267a(), null, null, null, null, null, 1759, null), C4028g1.m12267b(c4028g1M12267b2, null, null, null, null, enumC4035h2, textDefault2, null, null, null, null, null, 1871, null), c4028g1M12267b5);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0234  */
    /* JADX WARN: Code duplicated, block: B:104:0x023d  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:117:0x030b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0337  */
    /* JADX WARN: Code duplicated, block: B:122:0x033b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0356  */
    /* JADX WARN: Code duplicated, block: B:130:0x0366  */
    /* JADX WARN: Code duplicated, block: B:132:0x038b  */
    /* JADX WARN: Code duplicated, block: B:133:0x038f  */
    /* JADX WARN: Code duplicated, block: B:138:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:141:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:145:0x041d  */
    /* JADX WARN: Code duplicated, block: B:146:0x042a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0437  */
    /* JADX WARN: Code duplicated, block: B:150:0x0456  */
    /* JADX WARN: Code duplicated, block: B:151:0x045d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0493  */
    /* JADX WARN: Code duplicated, block: B:156:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:159:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:160:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:162:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:163:0x04db  */
    /* JADX WARN: Code duplicated, block: B:165:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:166:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:170:0x051c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0527  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x0100  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:74:0x0139  */
    /* JADX WARN: Code duplicated, block: B:77:0x0145  */
    /* JADX WARN: Code duplicated, block: B:79:0x0149  */
    /* JADX WARN: Code duplicated, block: B:82:0x0170  */
    /* JADX WARN: Code duplicated, block: B:84:0x0176  */
    /* JADX WARN: Code duplicated, block: B:89:0x0192  */
    /* JADX WARN: Code duplicated, block: B:92:0x019f  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x021c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0223  */
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
    /* JADX INFO: renamed from: h */
    public static final void m12231h(Modifier modifier, C4028g1 viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        String testTag;
        boolean z13;
        boolean z14;
        Object objM87133R;
        float f13;
        float f14;
        C2306l c2306l;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        float f15;
        int iHashCode2;
        EnumC16313m0 icon;
        C2306l c2306l2;
        C0209i c0209i5;
        C0209i c0209i6;
        int i16;
        C38072d c38072d;
        String strConcat;
        String str;
        List<EnumC39333f> listM12269c;
        C2306l c2306l3;
        int i17;
        int iHashCode3;
        C0209i c0209i7;
        C0209i c0209i8;
        int iHashCode4;
        float f16;
        String str2;
        boolean z15;
        EnumC16313m0 statusIcon;
        EnumC39333f statusColor;
        String strConcat2;
        int iHashCode5;
        String strConcat3;
        TextResource statusSubtitle;
        String strConcat4;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1184124249);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C3929m(9);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                testTag = viewState.getTestTag();
                if (testTag != null || testTag.length() <= 0) {
                    testTag = null;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC15676d.m44101d(modifier4, testTag));
                boolean zM87157i = c28655q.m87157i(viewState);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i | z13;
                objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C3603v(viewState, function4, 10);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM5391i = AbstractC1772c1.m5391i(modifierM3409f, false, null, (InterfaceC4339a) objM87133R, 3);
                f13 = 8;
                f14 = ((float) 0.5d) * f13;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f14, modifierM5391i);
                c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f15 = Float.MAX_VALUE;
                } else {
                    f15 = 1.0f;
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f15, true);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                Modifier modifier5 = modifier4;
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
                icon = viewState.getIcon();
                if (icon == null) {
                    c28655q.m87150e0(-722717490);
                    c28655q.m87173q(false);
                    c0209i6 = c0209i;
                    i16 = 0;
                    c2306l2 = c2306l;
                    c0209i5 = c0209i2;
                } else {
                    c2306l2 = c2306l;
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i;
                    AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, -722717489, icon, c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 1 * f13, 0.0f, 11)), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                    i16 = 0;
                    c28655q.m87173q(false);
                }
                String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i16);
                c38072d = C38072d.f163053a;
                C2886a c2886aM8438s = c38072d.m121952e(c28655q, 6).getH5();
                long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
                if (testTag != 0) {
                    strConcat = testTag.concat("_Title");
                } else {
                    strConcat = null;
                }
                Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, strConcat);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                str = testTag;
                Function1 function5 = function4;
                AbstractC30795n.m94707h(strM21274h, modifierM44101d.mo3471e(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, c2886aM8438s, null, c28655q, 0, 48, 194552);
                c28655q = c28655q;
                c28655q.m87173q(true);
                listM12269c = viewState.m12269c();
                if (listM12269c == null) {
                    c28655q.m87150e0(-100141225);
                    c28655q.m87173q(false);
                    c2306l3 = c2306l2;
                    c0209i7 = c0209i6;
                    c0209i8 = c0209i5;
                    i17 = 54;
                } else {
                    c28655q.m87150e0(-100141224);
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 1 * f13, 0.0f, 2);
                    c2306l3 = c2306l2;
                    i17 = 54;
                    C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l3, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i7 = c0209i6;
                    AbstractC28683x.m87239G(c28655q, c0209i7, c22994r1M66759a3);
                    c0209i8 = c0209i5;
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    m12239p(listM12269c, 0.0f, c28655q, 0, 2);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, c2306l3, c28655q, i17);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                if (AbstractC8693b.m21270d(viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String())) {
                    c28655q.m87150e0(-1075302140);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
                    iHashCode5 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                    String strM21274h2 = AbstractC8693b.m21274h(viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String(), c28655q, 0);
                    C2886a textStyle = viewState.getStyle().getTextStyle();
                    long jMo134584toComposableColorWaAFU9c = viewState.getStyle().getColorKey().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    if (str != null) {
                        str2 = str;
                        strConcat3 = str2.concat("_Value");
                    } else {
                        str2 = str;
                        strConcat3 = null;
                    }
                    f16 = f14;
                    AbstractC30795n.m94707h(strM21274h2, AbstractC1099a.m3396r(AbstractC15676d.m44101d(c2314t, strConcat3), f14, 0.0f, 2), jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, null, c28655q, 0, 0, 196600);
                    c28655q = c28655q;
                    statusSubtitle = viewState.getStatusSubtitle();
                    if (statusSubtitle == null) {
                        c28655q.m87150e0(-885663368);
                        c28655q.m87173q(false);
                        z15 = false;
                    } else {
                        c28655q.m87150e0(-885663367);
                        if (AbstractC8693b.m21270d(statusSubtitle)) {
                            c28655q.m87150e0(1321727640);
                            String strM21274h3 = AbstractC8693b.m21274h(statusSubtitle, c28655q, 0);
                            C2886a c2886aM8408F = c38072d.m121952e(c28655q, 6).getN9();
                            long jM125385c1 = c38072d.m121949b(c28655q, 6).getWhite70();
                            if (str2 != null) {
                                strConcat4 = str2.concat("_Subtitle");
                            } else {
                                strConcat4 = null;
                            }
                            AbstractC30795n.m94707h(strM21274h3, AbstractC1099a.m3396r(AbstractC15676d.m44101d(c2314t, strConcat4), f16, 0.0f, 2), jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8408F, null, c28655q, 0, 0, 196600);
                            c28655q = c28655q;
                            z15 = false;
                            c28655q.m87173q(false);
                        } else {
                            z15 = false;
                            c28655q.m87150e0(1322182999);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z15);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(z15);
                } else {
                    f16 = f14;
                    str2 = str;
                    z15 = false;
                    c28655q.m87150e0(-1074173926);
                    c28655q.m87173q(false);
                }
                statusIcon = viewState.getStatusIcon();
                if (statusIcon == null) {
                    c28655q.m87150e0(-1074119274);
                    c28655q.m87173q(z15);
                } else {
                    c28655q.m87150e0(-1074119273);
                    statusColor = viewState.getStatusColor();
                    if (statusColor == null) {
                        c28655q.m87150e0(1945775734);
                        c28655q.m87173q(z15);
                    } else {
                        C27430e c27430eM53378s = AbstractC18489d0.m53378s(c28655q, 1945775735, statusIcon, c28655q, 6);
                        long jMo134584toComposableColorWaAFU9c2 = statusColor.mo134584toComposableColorWaAFU9c(c28655q, z15 ? 1 : 0);
                        if (str2 != null) {
                            strConcat2 = str2.concat("_ValueIndicatorIcon");
                        } else {
                            strConcat2 = null;
                        }
                        AbstractC15005f3.m43108b(c27430eM53378s, null, AbstractC1102d.m3419p(2 * 4, AbstractC1099a.m3394p(f16, AbstractC15676d.m44101d(c2314t, strConcat2))), jMo134584toComposableColorWaAFU9c2, c28655q, 48, 0);
                        z15 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier5;
                function3 = function5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4007d1(modifier3, viewState, function3, i13, i14, 0);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C3929m(9);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            testTag = viewState.getTestTag();
            if (testTag != null) {
                testTag = null;
            } else {
                testTag = null;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC15676d.m44101d(modifier4, testTag));
            boolean zM87157i2 = c28655q.m87157i(viewState);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i2 | z13;
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C3603v(viewState, function4, 10);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3603v(viewState, function4, 10);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM5391i2 = AbstractC1772c1.m5391i(modifierM3409f2, false, null, (InterfaceC4339a) objM87133R, 3);
            f13 = 8;
            f14 = ((float) 0.5d) * f13;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, modifierM5391i2);
            c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a5);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f15 = Float.MAX_VALUE;
            } else {
                f15 = 1.0f;
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f15, true);
            C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
            c28655q.m87158i0();
            Modifier modifier6 = modifier4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
            icon = viewState.getIcon();
            if (icon == null) {
                c28655q.m87150e0(-722717490);
                c28655q.m87173q(false);
                c0209i6 = c0209i;
                i16 = 0;
                c2306l2 = c2306l;
                c0209i5 = c0209i2;
            } else {
                c2306l2 = c2306l;
                c0209i5 = c0209i2;
                c0209i6 = c0209i;
                AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, -722717489, icon, c28655q, 6), null, AbstractC1102d.m3419p(5 * 4, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 1 * f13, 0.0f, 11)), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
                i16 = 0;
                c28655q.m87173q(false);
            }
            String strM21274h4 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, i16);
            c38072d = C38072d.f163053a;
            C2886a c2886aM8438s2 = c38072d.m121952e(c28655q, 6).getH5();
            long jM125430y2 = c38072d.m121949b(c28655q, 6).getBrandWhite();
            if (testTag != 0) {
                strConcat = testTag.concat("_Title");
            } else {
                strConcat = null;
            }
            Modifier modifierM44101d2 = AbstractC15676d.m44101d(c2314t, strConcat);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            str = testTag;
            Function1 function6 = function4;
            AbstractC30795n.m94707h(strM21274h4, modifierM44101d2.mo3471e(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 2, false, 0, 0, null, c2886aM8438s2, null, c28655q, 0, 48, 194552);
            c28655q = c28655q;
            c28655q.m87173q(true);
            listM12269c = viewState.m12269c();
            if (listM12269c == null) {
                c28655q.m87150e0(-100141225);
                c28655q.m87173q(false);
                c2306l3 = c2306l2;
                c0209i7 = c0209i6;
                c0209i8 = c0209i5;
                i17 = 54;
            } else {
                c28655q.m87150e0(-100141224);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 1 * f13, 0.0f, 2);
                c2306l3 = c2306l2;
                i17 = 54;
                C22994r1 c22994r1M66759a7 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l3, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i7 = c0209i6;
                AbstractC28683x.m87239G(c28655q, c0209i7, c22994r1M66759a7);
                c0209i8 = c0209i5;
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m8);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                m12239p(listM12269c, 0.0f, c28655q, 0, 2);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            C22994r1 c22994r1M66759a8 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, c2306l3, c28655q, i17);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, c22994r1M66759a8);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
            if (AbstractC8693b.m21270d(viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String())) {
                c28655q.m87150e0(-1075302140);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q, 48);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i7, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m10);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                String strM21274h5 = AbstractC8693b.m21274h(viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String(), c28655q, 0);
                C2886a textStyle2 = viewState.getStyle().getTextStyle();
                long jMo134584toComposableColorWaAFU9c3 = viewState.getStyle().getColorKey().mo134584toComposableColorWaAFU9c(c28655q, 0);
                if (str != null) {
                    str2 = str;
                    strConcat3 = str2.concat("_Value");
                } else {
                    str2 = str;
                    strConcat3 = null;
                }
                f16 = f14;
                AbstractC30795n.m94707h(strM21274h5, AbstractC1099a.m3396r(AbstractC15676d.m44101d(c2314t, strConcat3), f14, 0.0f, 2), jMo134584toComposableColorWaAFU9c3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle2, null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                statusSubtitle = viewState.getStatusSubtitle();
                if (statusSubtitle == null) {
                    c28655q.m87150e0(-885663368);
                    c28655q.m87173q(false);
                    z15 = false;
                } else {
                    c28655q.m87150e0(-885663367);
                    if (AbstractC8693b.m21270d(statusSubtitle)) {
                        c28655q.m87150e0(1321727640);
                        String strM21274h6 = AbstractC8693b.m21274h(statusSubtitle, c28655q, 0);
                        C2886a c2886aM8408F2 = c38072d.m121952e(c28655q, 6).getN9();
                        long jM125385c2 = c38072d.m121949b(c28655q, 6).getWhite70();
                        if (str2 != null) {
                            strConcat4 = str2.concat("_Subtitle");
                        } else {
                            strConcat4 = null;
                        }
                        AbstractC30795n.m94707h(strM21274h6, AbstractC1099a.m3396r(AbstractC15676d.m44101d(c2314t, strConcat4), f16, 0.0f, 2), jM125385c2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8408F2, null, c28655q, 0, 0, 196600);
                        c28655q = c28655q;
                        z15 = false;
                        c28655q.m87173q(false);
                    } else {
                        z15 = false;
                        c28655q.m87150e0(1322182999);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z15);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(z15);
            } else {
                f16 = f14;
                str2 = str;
                z15 = false;
                c28655q.m87150e0(-1074173926);
                c28655q.m87173q(false);
            }
            statusIcon = viewState.getStatusIcon();
            if (statusIcon == null) {
                c28655q.m87150e0(-1074119274);
                c28655q.m87173q(z15);
            } else {
                c28655q.m87150e0(-1074119273);
                statusColor = viewState.getStatusColor();
                if (statusColor == null) {
                    c28655q.m87150e0(1945775734);
                    c28655q.m87173q(z15);
                } else {
                    C27430e c27430eM53378s2 = AbstractC18489d0.m53378s(c28655q, 1945775735, statusIcon, c28655q, 6);
                    long jMo134584toComposableColorWaAFU9c4 = statusColor.mo134584toComposableColorWaAFU9c(c28655q, z15 ? 1 : 0);
                    if (str2 != null) {
                        strConcat2 = str2.concat("_ValueIndicatorIcon");
                    } else {
                        strConcat2 = null;
                    }
                    AbstractC15005f3.m43108b(c27430eM53378s2, null, AbstractC1102d.m3419p(2 * 4, AbstractC1099a.m3394p(f16, AbstractC15676d.m44101d(c2314t, strConcat2))), jMo134584toComposableColorWaAFU9c4, c28655q, 48, 0);
                    z15 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z15);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier6;
            function3 = function6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4007d1(modifier3, viewState, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m12232i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m12233j(C4028g1 c4028g1, Function1 function1) {
        C9598e destination = c4028g1.getDestination();
        if (destination != null) {
            function1.invoke(destination);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m12234k(Modifier modifier, C4028g1 c4028g1, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12231h(modifier, c4028g1, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m12235l(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1481627545);
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
            c28677v1M87180u.f115982d = new C3713c(i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m12236m(int i13, Composer composer, int i14) {
        m12235l(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m12237n(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2021534838);
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
            c28677v1M87180u.f115982d = new C3713c(i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m12238o(int i13, Composer composer, int i14) {
        m12237n(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    public static final void m12239p(List<? extends EnumC39333f> barStyles, float f13, Composer composer, int i13, int i14) {
        int i15;
        float f14;
        AbstractC22676k.m65750j(barStyles, "barStyles");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(340838237);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(barStyles) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f15 = i16 != 0 ? 4 : f13;
            c28655q.m87150e0(1128034107);
            List<? extends EnumC39333f> list = barStyles;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C17919x(((EnumC39333f) it.next()).mo134584toComposableColorWaAFU9c(c28655q, 0)));
            }
            c28655q.m87173q(false);
            Modifier modifierM3427x = AbstractC1102d.m3427x(AbstractC1102d.m3424u(62, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, f15, 7)), null, 3);
            boolean zM87157i = c28655q.m87157i(arrayList);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C4014e1(arrayList, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM3427x, (Function1) objM87133R, c28655q, 0);
            f14 = f15;
        } else {
            c28655q.m87138X();
            f14 = f13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1027k0(barStyles, f14, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m12240q(List list, InterfaceC22131e interfaceC22131e) {
        InterfaceC22131e Canvas = interfaceC22131e;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        float fMo743q0 = Canvas.mo743q0(5 * 4);
        float fMo743q1 = Canvas.mo743q0((float) 4.2d);
        float fMo743q2 = Canvas.mo743q0(2);
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            long j7 = ((C17919x) obj).f69639a;
            float fMo743q3 = Canvas.mo743q0(((float) 0.14d) * 8);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMo743q3)) & 4294967295L) | (Float.floatToRawIntBits(fMo743q3) << 32);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q1)) & 4294967295L);
            float f13 = i13;
            Canvas = interfaceC22131e;
            InterfaceC22131e.m63374D(Canvas, j7, (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits((f13 * fMo743q2) + (f13 * fMo743q0)) << 32), jFloatToRawIntBits2, jFloatToRawIntBits, null, 0.0f, 240);
            i13 = i14;
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m12241r(List list, float f13, int i13, int i14, Composer composer, int i15) {
        m12239p(list, f13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final List<C4028g1> m12243t() {
        return f16338i;
    }
}
