package xk2;

import e93.AbstractC12889b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25243e0;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: xk2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Lxk2/g;", "", "<init>", "()V", "", "heartRate", "restingHeartRate", "maximumHeartRate", "b", "(DDD)D", "reserve", "e", "(D)D", "", "", "timestampsMillis", "nextTimestampMillis", "d", "(Ljava/util/List;Ljava/lang/Long;)Ljava/util/List;", "heartRates", "a", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Long;DD)D", "raw", "", "c", "(D)F", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38441g {

    /* JADX INFO: renamed from: a */
    public static final C38441g f164625a = new C38441g();

    private C38441g() {
    }

    /* JADX INFO: renamed from: a */
    public final double m123148a(List<Double> heartRates, List<Long> timestampsMillis, Long nextTimestampMillis, double restingHeartRate, double maximumHeartRate) {
        AbstractC22676k.m65750j(heartRates, "heartRates");
        AbstractC22676k.m65750j(timestampsMillis, "timestampsMillis");
        List<Double> listM123151d = m123151d(timestampsMillis, nextTimestampMillis);
        Iterator it = AbstractC37056f.m118950B(heartRates).iterator();
        double dMax = 0.0d;
        while (it.hasNext()) {
            int iNextInt = ((AbstractC25243e0) it).nextInt();
            C38441g c38441g = f164625a;
            dMax += Math.max(0.0d, listM123151d.get(iNextInt).doubleValue() * (c38441g.m123152e(c38441g.m123149b(heartRates.get(iNextInt).doubleValue(), restingHeartRate, maximumHeartRate)) / 691200.0d));
        }
        return dMax;
    }

    /* JADX INFO: renamed from: b */
    public final double m123149b(double heartRate, double restingHeartRate, double maximumHeartRate) {
        return AbstractC12889b.m36282l((heartRate - restingHeartRate) / ((maximumHeartRate + 3.0d) - restingHeartRate), 0.0d, 1.0d);
    }

    /* JADX INFO: renamed from: c */
    public final float m123150c(double raw) {
        int length = AbstractC38443i.m123159a().length;
        double d3 = 0.0d;
        int i13 = 0;
        double d14 = 0.0d;
        while (i13 < length) {
            double d15 = AbstractC38443i.m123159a()[i13];
            if (raw < d15) {
                return raw < (d14 + d15) / 2.0d ? (float) d3 : (float) (((double) i13) * 0.1d);
            }
            d3 = ((double) i13) * 0.1d;
            i13++;
            d14 = d15;
        }
        return (float) d3;
    }

    /* JADX INFO: renamed from: d */
    public final List<Double> m123151d(List<Long> timestampsMillis, Long nextTimestampMillis) {
        AbstractC22676k.m65750j(timestampsMillis, "timestampsMillis");
        List<Long> listM74128f1 = nextTimestampMillis != null ? AbstractC25265s.m74128f1(nextTimestampMillis, timestampsMillis) : timestampsMillis;
        if (listM74128f1.isEmpty()) {
            return AbstractC37056f.m118958J(Double.valueOf(0.0d));
        }
        if (listM74128f1.size() == 1) {
            return AbstractC37056f.m118958J(Double.valueOf(1.0d));
        }
        ArrayList arrayList = new ArrayList();
        int size = listM74128f1.size() - 1;
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            arrayList.add(Double.valueOf(Math.min((listM74128f1.get(i14).longValue() - listM74128f1.get(i13).longValue()) / 1000.0d, 3.0d)));
            i13 = i14;
        }
        if (arrayList.size() != timestampsMillis.size()) {
            arrayList.add(AbstractC25265s.m74112P0(arrayList));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public final double m123152e(double reserve) {
        if (reserve <= 0.3d) {
            return 0.0d;
        }
        return 16.0d / (Math.exp((1.0d - reserve) / 0.15d) + 1.0d);
    }
}
