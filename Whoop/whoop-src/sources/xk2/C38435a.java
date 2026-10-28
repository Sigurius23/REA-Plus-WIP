package xk2;

import com.mapbox.common.HttpHeaders;
import com.whoop.domain.model.GenderBaseline;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25243e0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: xk2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJK\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012Jc\u0010\u0019\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lxk2/a;", "", "<init>", "()V", "Lcom/whoop/domain/model/GenderBaseline;", "baseline", "", "weightKg", "heightM", "", HttpHeaders.AGE, "a", "(Lcom/whoop/domain/model/GenderBaseline;DDI)D", "maximumHeartRate", "restingCaloriesPerSecond", "heartRateThreshold", "Ll83/k;", "c", "(Lcom/whoop/domain/model/GenderBaseline;DIDDD)Ll83/k;", "", "heartRates", "", "timestampsMillis", "nextTimestampMillis", "restingHeartRate", "b", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;DDLcom/whoop/domain/model/GenderBaseline;DDI)D", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38435a {

    /* JADX INFO: renamed from: a */
    public static final C38435a f164608a = new C38435a();

    /* JADX INFO: renamed from: xk2.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f164609a;

        static {
            int[] iArr = new int[GenderBaseline.values().length];
            try {
                iArr[GenderBaseline.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenderBaseline.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GenderBaseline.AVERAGE_OF_BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f164609a = iArr;
        }
    }

    private C38435a() {
    }

    /* JADX INFO: renamed from: a */
    private final double m123127a(GenderBaseline baseline, double weightKg, double heightM, int age) {
        double d3 = age;
        double dMax = Math.max(0.0d, (((479.9d * heightM) + (13.397d * weightKg)) - (5.677d * d3)) + 88.362d);
        double dMax2 = Math.max(0.0d, (((heightM * 309.8d) + (weightKg * 9.247d)) - (d3 * 4.33d)) + 447.593d);
        int i13 = a.f164609a[baseline.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                dMax = dMax2;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                dMax = (dMax + dMax2) / 2.0d;
            }
        }
        return dMax / 86400.0d;
    }

    /* JADX INFO: renamed from: c */
    private final C23465k m123128c(GenderBaseline baseline, double weightKg, int age, double maximumHeartRate, double restingCaloriesPerSecond, double heartRateThreshold) {
        double d3 = age;
        double d14 = ((0.2017d * d3) + ((0.1988d * weightKg) + ((0.6309d * maximumHeartRate) - 55.0969d))) / 251.04000000000002d;
        double d15 = ((d3 * 0.074d) + ((weightKg * (-0.1263d)) + ((0.4472d * maximumHeartRate) - 20.4022d))) / 251.04000000000002d;
        int i13 = a.f164609a[baseline.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                d14 = d15;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                d14 = (d14 + d15) / 2.0d;
            }
        }
        double d16 = (d14 - restingCaloriesPerSecond) / (maximumHeartRate - heartRateThreshold);
        return new C23465k(Double.valueOf(d16), Double.valueOf(restingCaloriesPerSecond - (heartRateThreshold * d16)));
    }

    /* JADX INFO: renamed from: b */
    public final double m123129b(List<Double> heartRates, List<Long> timestampsMillis, Long nextTimestampMillis, double restingHeartRate, double maximumHeartRate, GenderBaseline baseline, double weightKg, double heightM, int age) {
        AbstractC22676k.m65750j(heartRates, "heartRates");
        AbstractC22676k.m65750j(timestampsMillis, "timestampsMillis");
        AbstractC22676k.m65750j(baseline, "baseline");
        double dM123127a = m123127a(baseline, weightKg, heightM, age);
        List<Double> listM123151d = C38441g.f164625a.m123151d(timestampsMillis, nextTimestampMillis);
        double d3 = ((maximumHeartRate - restingHeartRate) * 0.3d) + restingHeartRate;
        C23465k c23465kM123128c = m123128c(baseline, weightKg, age, maximumHeartRate, dM123127a, d3);
        double dDoubleValue = ((Number) c23465kM123128c.f92937w).doubleValue();
        double dDoubleValue2 = ((Number) c23465kM123128c.f92938x).doubleValue();
        Iterator it = AbstractC37056f.m118950B(heartRates).iterator();
        double d14 = 0.0d;
        while (it.hasNext()) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            double dDoubleValue3 = heartRates.get(iNextInt).doubleValue();
            double dDoubleValue4 = listM123151d.get(iNextInt).doubleValue();
            d14 += dDoubleValue3 < d3 ? dDoubleValue4 * dM123127a : dDoubleValue4 * ((dDoubleValue3 * dDoubleValue) + dDoubleValue2);
        }
        return d14;
    }
}
