package gi0;

import com.whoop.analytics.strain.model.HeartRateTimestamp;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p087db.C11858k0;

/* JADX INFO: renamed from: gi0.c */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC15884c {
    @SafeVarargs
    /* JADX INFO: renamed from: a */
    public static final <T> List<T> m44790a(T... tArr) {
        return Arrays.asList(tArr);
    }

    /* JADX INFO: renamed from: b */
    public static double m44791b(double d3, double d14, double d15) {
        double dMin = Math.min(1.0d, Math.max(0.0d, (d3 - d14) / (d15 - d14)));
        if (dMin <= 0.3d) {
            return 0.0d;
        }
        return dMin;
    }

    /* JADX INFO: renamed from: c */
    public static double m44792c(double d3, double d14, double d15) {
        return Math.min(d15, Math.max(d14, d3));
    }

    /* JADX INFO: renamed from: d */
    public static int m44793d(List<HeartRateTimestamp> list, Long l7) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (list.get(i13).getTime() == l7.longValue()) {
                return i13;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static int m44794e(List<Long> list, Long l7) {
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (list.get(i13).equals(l7)) {
                return i13;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static double m44795f(long j7) {
        return m44792c(ChronoUnit.DAYS.between(OffsetDateTime.ofInstant(Instant.ofEpochMilli(j7), ZoneOffset.UTC).toLocalDate(), OffsetDateTime.now()) / 365.242d, 12.0d, 120.0d);
    }

    /* JADX INFO: renamed from: g */
    public static List<Long> m44796g(List<Long> list) {
        return m44798i(list, 1L);
    }

    /* JADX INFO: renamed from: h */
    public static List<Double> m44797h(List<Long> list, long j7) {
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < list.size()) {
            int i14 = i13 + 1;
            int iMin = Math.min(i14, list.size() - 1);
            if (iMin != i13) {
                arrayList.add(Double.valueOf((list.get(iMin).longValue() - list.get(i13).longValue()) / j7));
            }
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    private static List<Long> m44798i(List<Long> list, long j7) {
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        while (i13 < list.size()) {
            int i14 = i13 + 1;
            arrayList.add(Long.valueOf((list.get(Math.min(i14, list.size() - 1)).longValue() - list.get(i13).longValue()) / j7));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static Double m44799j(List<Double> list, double d3) {
        if (list.size() == 0) {
            return Double.valueOf(0.0d);
        }
        if (list.size() == 1) {
            return list.get(0);
        }
        list.sort(new C11858k0(3));
        if (d3 <= 0.0d) {
            return list.get(0);
        }
        if (d3 >= 1.0d) {
            return list.get(Math.min(list.size(), list.size() - 1));
        }
        double size = d3 * ((double) (list.size() - 1));
        int i13 = (int) size;
        double d14 = size - ((double) i13);
        double dDoubleValue = list.get(i13).doubleValue();
        return Double.valueOf(((list.get(Math.min(list.size(), i13 + 1)).doubleValue() - dDoubleValue) * d14) + dDoubleValue);
    }
}
