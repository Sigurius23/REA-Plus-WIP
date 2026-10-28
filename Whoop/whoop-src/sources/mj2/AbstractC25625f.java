package mj2;

import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.stress.domain.model.StressCta;
import com.whoop.stress.domain.model.StressTrend;
import com.whoop.stress.domain.model.StressTrendHeader;
import com.whoop.stress.domain.model.StressTrendSegment;
import com.whoop.stress.domain.model.StressTrendStat;
import com.whoop.stress.domain.model.StressTrendStatKey;
import com.whoop.stress.domain.model.StressTrendType;
import com.whoop.util.TrendKey;
import gz0.EnumC16313m0;
import hy0.EnumC17727b2;
import i93.C18283i;
import i93.C18284j;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m83.AbstractC25243e0;
import m83.AbstractC25267u;
import nj2.C26774u;
import nj2.C26775v;
import nj2.C26776w;
import nj2.C26777x;
import nj2.C26778y;
import p208i2.C17919x;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mj2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a!\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, m65681d2 = {"Lcom/whoop/stress/domain/model/StressTrend;", "trend", "Ljava/time/LocalDate;", "selectedDate", "Lnj2/y;", "f", "(Lcom/whoop/stress/domain/model/StressTrend;Ljava/time/LocalDate;)Lnj2/y;", "", "Lcom/whoop/stress/domain/model/StressTrendSegment;", "segments", "", "isFading", "Lnj2/w;", "b", "(Ljava/util/List;Z)Ljava/util/List;", "Lcom/whoop/stress/domain/model/StressTrendType;", "stressTrendType", "", "alpha", "Ly81/e;", "e", "(Lcom/whoop/stress/domain/model/StressTrendType;F)Ly81/e;", "", "Lcom/whoop/stress/domain/model/StressTrendStatKey;", "Lcom/whoop/stress/domain/model/StressTrendStat;", "stats", "Lnj2/x;", "c", "(Ljava/util/Map;)Ljava/util/List;", "stat", "d", "(Lcom/whoop/stress/domain/model/StressTrendStat;)Lnj2/x;", "Lcom/whoop/stress/domain/model/StressCta;", "cta", "currentDate", "Lnj2/u;", "a", "(Lcom/whoop/stress/domain/model/StressCta;Ljava/time/LocalDate;)Lnj2/u;", "stress_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25625f {

    /* JADX INFO: renamed from: mj2.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100563a;

        static {
            int[] iArr = new int[StressTrendType.values().length];
            try {
                iArr[StressTrendType.HIGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StressTrendType.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StressTrendType.LOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100563a = iArr;
        }
    }

    /* JADX INFO: renamed from: mj2.f$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f100564w;

        public b(float f13) {
            this.f100564w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m75397a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f100564w, whoopColor.getAccentNegativeTrend());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75397a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: mj2.f$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f100565w;

        public c(float f13) {
            this.f100565w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m75398a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f100565w, whoopColor.getAccentPositiveTrend());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75398a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: mj2.f$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ float f100566w;

        public d(float f13) {
            this.f100566w = f13;
        }

        /* JADX INFO: renamed from: a */
        public final long m75399a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return C17919x.m51541c(this.f100566w, whoopColor.getRecovery());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m75399a((C39336i) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061  */
    /* JADX INFO: renamed from: a */
    private static final C26774u m75391a(StressCta stressCta, LocalDate localDate) {
        EnumC16313m0 enumC16313m0;
        TrendKey trendKey;
        TrendKey trendKey2 = null;
        String str = localDate != null ? localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) : null;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(stressCta.getTitle());
        String icon = stressCta.getIcon();
        EnumC16313m0 enumC16313m1 = EnumC16313m0.ARROW_FORWARD;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        String trendKey3 = stressCta.getTrendKey();
        if (trendKey3 != null) {
            trendKey = TrendKey.LOW_STRESS_DURATION;
            for (TrendKey trendKey4 : TrendKey.values()) {
                if (AbstractC22676k.m65745e(trendKey4.name(), trendKey3)) {
                    trendKey2 = trendKey4;
                    break;
                }
            }
            if (trendKey2 != null) {
                trendKey = trendKey2;
            }
            if (trendKey == null) {
                trendKey = TrendKey.LOW_STRESS_DURATION;
            }
        } else {
            trendKey = TrendKey.LOW_STRESS_DURATION;
        }
        return new C26774u(textResourceM21278l, enumC16313m1, str, trendKey);
    }

    /* JADX INFO: renamed from: b */
    public static final List<C26776w> m75392b(List<StressTrendSegment> segments, boolean z4) {
        AbstractC22676k.m65750j(segments, "segments");
        ArrayList arrayList = new ArrayList();
        float f13 = z4 ? 0.5f : 1.0f;
        C18284j c18284jM118950B = AbstractC37056f.m118950B(segments);
        ArrayList<StressTrendSegment> arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c18284jM118950B, 10));
        Iterator it = c18284jM118950B.iterator();
        while (((C18283i) it).f71138y) {
            arrayList2.add(segments.get((segments.size() - 1) - ((AbstractC25243e0) it).nextInt()));
        }
        for (StressTrendSegment stressTrendSegment : arrayList2) {
            float fAbs = Math.abs(stressTrendSegment.getStartX() - stressTrendSegment.getEndX());
            if (fAbs > 0.0f) {
                arrayList.add(new C26776w(fAbs, m75395e(stressTrendSegment.getStyle(), f13)));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private static final List<C26777x> m75393c(Map<StressTrendStatKey, StressTrendStat> map) {
        StressTrendStat stressTrendStat = map.get(StressTrendStatKey.LOW);
        C26777x c26777xM75394d = stressTrendStat != null ? m75394d(stressTrendStat) : null;
        StressTrendStat stressTrendStat2 = map.get(StressTrendStatKey.MEDIUM);
        C26777x c26777xM75394d2 = stressTrendStat2 != null ? m75394d(stressTrendStat2) : null;
        StressTrendStat stressTrendStat3 = map.get(StressTrendStatKey.HIGH);
        C26777x c26777xM75394d3 = stressTrendStat3 != null ? m75394d(stressTrendStat3) : null;
        ArrayList arrayList = new ArrayList();
        if (c26777xM75394d != null) {
            arrayList.add(c26777xM75394d);
        }
        if (c26777xM75394d2 != null) {
            arrayList.add(c26777xM75394d2);
        }
        if (c26777xM75394d3 != null) {
            arrayList.add(c26777xM75394d3);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static final C26777x m75394d(StressTrendStat stat) {
        EnumC17727b2 enumC17727b2;
        EnumC17727b2 enumC17727b3;
        AbstractC22676k.m65750j(stat, "stat");
        String statTrend = stat.getStatTrend();
        if (statTrend != null) {
            EnumC17727b2 enumC17727b4 = EnumC17727b2.NEUTRAL;
            EnumC17727b2[] enumC17727b2ArrValues = EnumC17727b2.values();
            int length = enumC17727b2ArrValues.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    enumC17727b3 = null;
                    break;
                }
                enumC17727b3 = enumC17727b2ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC17727b3.name(), statTrend)) {
                    break;
                }
                i13++;
            }
            if (enumC17727b3 != null) {
                enumC17727b4 = enumC17727b3;
            }
            enumC17727b2 = enumC17727b4;
        } else {
            enumC17727b2 = null;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(stat.getStatDisplay());
        String statChangeDisplay = stat.getStatChangeDisplay();
        return new C26777x(textResourceM21278l, statChangeDisplay != null ? AbstractC8693b.m21278l(statChangeDisplay) : null, enumC17727b2, m75395e(stat.getStyle(), 1.0f), AbstractC8693b.m21278l(stat.getStatLabel()));
    }

    /* JADX INFO: renamed from: e */
    private static final InterfaceC39332e m75395e(StressTrendType stressTrendType, float f13) {
        int i13 = a.f100563a[stressTrendType.ordinal()];
        if (i13 == 1) {
            return p745y81.Function1.m125323a(new b(f13));
        }
        if (i13 == 2) {
            return p745y81.Function1.m125323a(new c(f13));
        }
        if (i13 == 3) {
            return p745y81.Function1.m125323a(new d(f13));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: f */
    public static final C26778y m75396f(StressTrend trend, LocalDate localDate) {
        C26775v c26775v;
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(trend, "trend");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(trend.getTitle());
        String suffix = trend.getSuffix();
        TextResource textResourceM21278l2 = suffix != null ? AbstractC8693b.m21278l(suffix) : null;
        int i13 = 0;
        List<C26776w> listM75392b = m75392b(trend.getTodaySegments(), false);
        List<StressTrendSegment> previousSegments = trend.getPreviousSegments();
        List<C26776w> listM75392b2 = previousSegments != null ? m75392b(previousSegments, true) : null;
        List<C26777x> listM75393c = m75393c(trend.getTrendStats());
        C26774u c26774uM75391a = m75391a(trend.getCta(), localDate);
        StressTrendHeader header = trend.getHeader();
        if (header != null) {
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(header.getTitle());
            String icon = header.getIcon();
            EnumC16313m0 enumC16313m1 = EnumC16313m0.STRESS_MONITOR_DEFAULT;
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            while (true) {
                if (i13 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i13];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                    break;
                }
                i13++;
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            c26775v = new C26775v(textResourceM21278l3, enumC16313m1);
        } else {
            c26775v = null;
        }
        String vow = trend.getVow();
        return new C26778y(textResourceM21278l, textResourceM21278l2, listM75392b, listM75392b2, listM75393c, c26774uM75391a, c26775v, vow != null ? AbstractC8693b.m21278l(vow) : null);
    }
}
