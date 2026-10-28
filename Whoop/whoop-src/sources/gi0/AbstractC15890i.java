package gi0;

import com.whoop.analytics.strain.model.AnalyticsState;
import com.whoop.analytics.strain.model.HeartRateTimestamp;
import fg3.AbstractC14476d;
import fg3.InterfaceC14474b;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: renamed from: gi0.i */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC15890i {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC14474b f60011a = AbstractC14476d.m41338b(AbstractC15890i.class);

    /* JADX INFO: renamed from: b */
    public static List<HeartRateTimestamp> m44822b(int i13, List<HeartRateTimestamp> list) {
        List<HeartRateTimestamp> list2 = (List) list.stream().sorted(Comparator.comparingLong(new C15889h(1))).collect(Collectors.toList());
        if (!list.equals(list2)) {
            InterfaceC14474b interfaceC14474b = f60011a;
            interfaceC14474b.mo41336v("Heart rates were out of order userId={}", Integer.valueOf(i13));
            interfaceC14474b.mo41331q("Heart rates were out of order userId={} original={}", Integer.valueOf(i13), list);
        }
        return list2;
    }

    /* JADX INFO: renamed from: c */
    public static List<List<Long>> m44823c(int i13, AnalyticsState analyticsState) {
        List<List<Long>> list = (List) analyticsState.getLeftOvers().stream().sorted(Comparator.comparingLong(new C15889h(0))).collect(Collectors.toList());
        if (!analyticsState.getLeftOvers().equals(list)) {
            InterfaceC14474b interfaceC14474b = f60011a;
            interfaceC14474b.mo41336v("Left overs were out of order userId={}", Integer.valueOf(i13));
            interfaceC14474b.mo41331q("Left overs were out of order userId={} original={}", Integer.valueOf(i13), analyticsState.getLeftOvers());
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ long m44824d(List list) {
        return ((Long) list.get(0)).longValue();
    }
}
