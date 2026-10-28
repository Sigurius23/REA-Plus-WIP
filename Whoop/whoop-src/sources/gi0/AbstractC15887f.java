package gi0;

import com.whoop.analytics.strain.model.AnalyticsState;
import com.whoop.analytics.strain.model.BiologicalSex;
import com.whoop.analytics.strain.model.Calories;
import com.whoop.analytics.strain.model.FitnessLevel;
import com.whoop.analytics.strain.model.HeartRateTimestamp;
import com.whoop.analytics.strain.model.SmoothingResult;
import com.whoop.analytics.strain.model.StrainScore;
import com.whoop.analytics.strain.model.UserProfile;
import com.whoop.analytics.strain.model.util.ModelUtilities;
import fg3.AbstractC14476d;
import fg3.InterfaceC14474b;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import p000.AbstractC11266d;
import p087db.C11858k0;

/* JADX INFO: renamed from: gi0.f */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC15887f {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC14474b f60008a = AbstractC14476d.m41338b(AbstractC15890i.class);

    /* JADX INFO: renamed from: g */
    private static double m44806g(double d3, BiologicalSex biologicalSex, FitnessLevel fitnessLevel) {
        return fitnessLevel.getWeightForHeartRate() + biologicalSex.getHeartRateWeightValue() + (d3 * (-0.27261915450538377d)) + 204.4271407036521d;
    }

    /* JADX INFO: renamed from: h */
    public static double m44807h(List<HeartRateTimestamp> list, double d3, double d14, long j7) {
        List<HeartRateTimestamp> listM44808i = m44808i(list, d3, d14 + 3.0d);
        double dSum = ((List) m44812m(listM44808i, m44811l(listM44808i, j7)).stream().mapToDouble(new C15882a(2)).boxed().collect(Collectors.toList())).stream().mapToDouble(new C15882a(0)).sum() / 691200.0d;
        if (dSum < 0.0d) {
            f60008a.mo41336v("Calculated negative strain, this should not happen. raw={}", Double.valueOf(dSum));
        }
        return Math.min(Math.max(0.0d, dSum), 1.0d);
    }

    /* JADX INFO: renamed from: i */
    public static List<HeartRateTimestamp> m44808i(List<HeartRateTimestamp> list, final double d3, final double d14) {
        return (List) list.stream().map(new Function() { // from class: gi0.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractC15887f.m44814o(d3, d14, (HeartRateTimestamp) obj);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: renamed from: j */
    public static double m44809j(double d3) {
        int i13 = 0;
        while (true) {
            List<List<Double>> list = AbstractC15888g.f60009a;
            if (i13 >= list.size()) {
                return 0.0d;
            }
            double dDoubleValue = list.get(i13).get(0).doubleValue();
            int i14 = i13 + 1;
            int iMin = Math.min(i14, list.size() - 1);
            double dDoubleValue2 = list.get(iMin).get(0).doubleValue();
            if ((d3 < dDoubleValue || d3 >= dDoubleValue2) && i13 != iMin) {
                i13 = i14;
            }
            return list.get(i13).get(1).doubleValue();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public static StrainScore m44810k(UserProfile userProfile, List<HeartRateTimestamp> list, AnalyticsState analyticsState) throws Exception {
        int i13;
        int id4 = userProfile.getId();
        BiologicalSex biologicalSex = userProfile.getBiologicalSex();
        long birthday = userProfile.getBirthday();
        double restingHeartRate = userProfile.getRestingHeartRate();
        FitnessLevel fitnessLevel = userProfile.getFitnessLevel();
        double maxHeartRate = userProfile.getMaxHeartRate();
        InterfaceC14474b interfaceC14474b = f60008a;
        interfaceC14474b.mo41331q("Calculate strain score for user userId={} heartRates={}", Integer.valueOf(id4), list);
        double dM44795f = AbstractC15884c.m44795f(birthday);
        interfaceC14474b.mo41322h("Calculated age for user userId={} using birthday={} to be age={}", Integer.valueOf(id4), Long.valueOf(birthday), Double.valueOf(dM44795f));
        double dM44806g = m44806g(dM44795f, biologicalSex, fitnessLevel);
        interfaceC14474b.mo41331q("Max heart rate estimate for userId={} is {}", Integer.valueOf(id4), Double.valueOf(dM44806g));
        StrainScore.Builder avgHr = StrainScore.builder().setMaxHr(Double.valueOf(dM44806g)).setAvgHr(Double.valueOf(restingHeartRate));
        Double dValueOf = Double.valueOf(0.0d);
        StrainScore strainScoreBuild = avgHr.setKilojoules(dValueOf).setStrainScore(dValueOf).setState(analyticsState).build();
        if (list.size() == 0) {
            interfaceC14474b.mo41329o("No rate data supplied to calculate strain for userId={} score={}", Integer.valueOf(id4), strainScoreBuild);
            return strainScoreBuild;
        }
        if (list.size() < 3) {
            interfaceC14474b.mo41329o("Only had {} heart rate data supplied to calculate strain for userId={}", Integer.valueOf(list.size()), Integer.valueOf(id4));
        }
        List<HeartRateTimestamp> list2 = (List) AbstractC15890i.m44823c(id4, analyticsState).stream().map(new C15885d(0)).collect(Collectors.toList());
        Long lOrElse = analyticsState.getLastUsed().orElse(0L);
        long jLongValue = lOrElse.longValue();
        ArrayList arrayList = new ArrayList();
        for (HeartRateTimestamp heartRateTimestamp : list2) {
            if (arrayList.contains(heartRateTimestamp)) {
                f60008a.mo41329o("Found duplicate leftover data for ts={} hr={}", Long.valueOf(heartRateTimestamp.getTime()), Double.valueOf(heartRateTimestamp.getHeartRate()));
            } else {
                arrayList.add(heartRateTimestamp);
            }
            dM44806g = dM44806g;
        }
        double d3 = dM44806g;
        for (HeartRateTimestamp heartRateTimestamp2 : list) {
            if (arrayList.contains(heartRateTimestamp2)) {
                f60008a.mo41329o("Found duplicate heart rate data for ts={} hr={}", Long.valueOf(heartRateTimestamp2.getTime()), Double.valueOf(heartRateTimestamp2.getHeartRate()));
            } else {
                arrayList.add(heartRateTimestamp2);
            }
        }
        List<HeartRateTimestamp> listM44822b = AbstractC15890i.m44822b(id4, arrayList);
        SmoothingResult smoothingResultM44819t = m44819t(jLongValue, listM44822b);
        if (smoothingResultM44819t.getSmoothedHrs().size() == 0) {
            f60008a.mo41317c("No heart rates available after smoothing - no score for this. userId={} lastUsed={} heartRates={}", Integer.valueOf(id4), lOrElse, listM44822b);
            return strainScoreBuild.withState(strainScoreBuild.getState().orElse(ModelUtilities.DefaultAnalyticsState).withLastUsed(Long.valueOf(smoothingResultM44819t.getLastUsedTime())).withLeftOvers((Iterable<? extends List<Long>>) listM44822b.stream().map(new C15885d(1)).collect(Collectors.toList())));
        }
        InterfaceC14474b interfaceC14474b2 = f60008a;
        interfaceC14474b2.mo41322h("Heart rates smoothed userId={} heartRates={} smoothed={}", Integer.valueOf(id4), listM44822b, smoothingResultM44819t.getSmoothedHrs());
        DoubleSummaryStatistics doubleSummaryStatistics = (DoubleSummaryStatistics) smoothingResultM44819t.getSmoothedHrs().stream().collect(Collectors.summarizingDouble(new C15882a(1)));
        double max = doubleSummaryStatistics.getMax();
        double d14 = d3 + 10.0d;
        double dMax = Math.max(d14, max);
        if (max > d14) {
            i13 = id4;
            interfaceC14474b2.mo41317c("User logged heart rate greater than max estimate userId={} currentMaxHr={} estimate={}", Integer.valueOf(i13), Double.valueOf(max), Double.valueOf(d14));
        } else {
            i13 = id4;
        }
        if (max > maxHeartRate) {
            interfaceC14474b2.mo41317c("User logged new max heart rate userId={} maxHeartRateFromProfile={} newLifetimeMax={}", Integer.valueOf(i13), Double.valueOf(maxHeartRate), Double.valueOf(max));
            maxHeartRate = max;
        }
        double average = doubleSummaryStatistics.getAverage();
        interfaceC14474b2.mo41322h("Calculating strain for userId={}. restingHeartRate={} currentMaxHeartRate={} lifetimeMaxHeartRate={} averageCurrentHeartRate={}", Integer.valueOf(i13), Double.valueOf(restingHeartRate), Double.valueOf(max), Double.valueOf(dMax), Double.valueOf(average));
        if (restingHeartRate > dMax) {
            throw new Exception(String.format("Resting heart rate must be less than max. restingHeartRate=%f maxHeartRate=%f", Double.valueOf(restingHeartRate), Double.valueOf(dMax)));
        }
        double dM44807h = m44807h(smoothingResultM44819t.getSmoothedHrs(), restingHeartRate, maxHeartRate, smoothingResultM44819t.getLastUsedTime());
        interfaceC14474b2.mo41331q("Calculated raw strain for userId={}. rawStrainScore={}", Integer.valueOf(i13), Double.valueOf(dM44807h));
        double dM44809j = m44809j(dM44807h);
        interfaceC14474b2.mo41322h("Calculated scaled strain for userId={}. rawStrainScore={} scaledStrainScore={}", Integer.valueOf(i13), Double.valueOf(dM44807h), Double.valueOf(dM44809j));
        Calories caloriesM44786d = AbstractC15883b.m44786d(userProfile, smoothingResultM44819t.getSmoothedHrs(), smoothingResultM44819t.getLastUsedTime());
        interfaceC14474b2.mo41331q("Calculated calories for userId={}. totalKilojoules={}", Integer.valueOf(i13), Double.valueOf(caloriesM44786d.getTotalKilojoules()));
        return StrainScore.copyOf(strainScoreBuild).withStrainScore(Double.valueOf(dM44807h)).withState(AnalyticsState.copyOf(strainScoreBuild.getState().orElse(ModelUtilities.DefaultAnalyticsState)).withLastUsed(Long.valueOf(smoothingResultM44819t.getLastUsedTime())).withLeftOvers(((List) listM44822b.stream().map(new C15885d(2)).collect(Collectors.toList())).subList(Math.max(0, AbstractC15884c.m44793d(listM44822b, Long.valueOf(smoothingResultM44819t.getLastUsedTime())) - 60), listM44822b.size()))).withScaledScore(Double.valueOf(dM44809j)).withKilojoules(Double.valueOf(caloriesM44786d.getTotalKilojoules())).withMaxHr(Double.valueOf(maxHeartRate)).withAvgHr(Double.valueOf(average));
    }

    /* JADX INFO: renamed from: l */
    public static List<Double> m44811l(List<HeartRateTimestamp> list, long j7) {
        if (list.size() == 0) {
            return AbstractC15884c.m44790a(new Double[0]);
        }
        if (list.size() == 1) {
            return j7 == -1 ? AbstractC15884c.m44790a(Double.valueOf(1.0d)) : AbstractC15884c.m44790a(Double.valueOf(Math.min(j7 - (((HeartRateTimestamp) AbstractC11266d.m30455i(1, list)).getTime() / 1000), 3.0d)));
        }
        List list2 = (List) list.stream().map(new C15885d(3)).collect(Collectors.toList());
        List<Double> listM44797h = AbstractC15884c.m44797h(list2, 1000L);
        if (j7 == 0) {
            listM44797h.add((Double) AbstractC11266d.m30455i(1, listM44797h));
        } else {
            listM44797h.add(Double.valueOf((j7 - ((Long) AbstractC11266d.m30455i(1, list2)).longValue()) / 1000.0d));
        }
        List<Double> list3 = (List) listM44797h.stream().map(new C15885d(5)).collect(Collectors.toList());
        f60008a.mo41322h("Timescales for heart rates reserves={} scales={} timestampDiffs={}", list, list3, listM44797h);
        return list3;
    }

    /* JADX INFO: renamed from: m */
    public static List<Double> m44812m(List<HeartRateTimestamp> list, List<Double> list2) {
        ArrayList arrayList = new ArrayList(new ArrayList());
        for (int i13 = 0; i13 < list.size(); i13++) {
            double heartRate = list.get(i13).getHeartRate();
            Double d3 = list2.get(i13);
            if (heartRate > 0.0d) {
                arrayList.add(Double.valueOf(m44820u(heartRate, d3.doubleValue())));
            } else {
                arrayList.add(Double.valueOf(0.0d));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ HeartRateTimestamp m44814o(double d3, double d14, HeartRateTimestamp heartRateTimestamp) {
        return HeartRateTimestamp.builder().setTime(heartRateTimestamp.getTime()).setHeartRate(AbstractC15884c.m44791b(heartRateTimestamp.getHeartRate(), d3, d14)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ HeartRateTimestamp m44815p(List list) {
        return HeartRateTimestamp.builder().setTime(((Long) list.get(0)).longValue()).setHeartRate(((Long) list.get(1)).longValue()).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ List m44816q(HeartRateTimestamp heartRateTimestamp) {
        return AbstractC15884c.m44790a(Long.valueOf(heartRateTimestamp.getTime()), Long.valueOf((long) heartRateTimestamp.getHeartRate()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ List m44817r(HeartRateTimestamp heartRateTimestamp) {
        return AbstractC15884c.m44790a(Long.valueOf(heartRateTimestamp.getTime()), Long.valueOf((long) heartRateTimestamp.getHeartRate()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ Double m44818s(Double d3) {
        return Double.valueOf(d3.doubleValue() < 3.0d ? d3.doubleValue() : 3.0d);
    }

    /* JADX INFO: renamed from: t */
    public static SmoothingResult m44819t(long j7, List<HeartRateTimestamp> list) {
        int iMax = Math.max(0, AbstractC15884c.m44793d(list, Long.valueOf(j7)));
        ArrayList arrayList = new ArrayList();
        List list2 = (List) list.stream().map(new C15885d(3)).collect(Collectors.toList());
        int i13 = iMax;
        while (iMax < list.size() - 30) {
            long time = list.get(iMax).getTime();
            int iMax2 = Math.max(0, iMax - 30);
            int i14 = iMax + 30;
            List<HeartRateTimestamp> listSubList = list.subList(iMax2, i14);
            List<Long> listM44796g = AbstractC15884c.m44796g(list2.subList(iMax2, i14));
            Long lOrElse = listM44796g.stream().max(new C11858k0(4)).orElse(0L);
            if (lOrElse.longValue() >= 30000) {
                int iM44794e = AbstractC15884c.m44794e(listM44796g, lOrElse);
                listSubList = iM44794e >= 30 ? (List) listSubList.stream().limit(iM44794e).collect(Collectors.toList()) : (List) listSubList.stream().skip(iM44794e + 1).limit(listSubList.size() - 1).collect(Collectors.toList());
            }
            if (listSubList.size() > 0) {
                arrayList.add(HeartRateTimestamp.builder().setTime(time).setHeartRate(AbstractC15884c.m44799j((List) listSubList.stream().map(new C15885d(4)).collect(Collectors.toList()), 0.25d).doubleValue()).build());
            }
            i13 = iMax;
            iMax++;
        }
        return SmoothingResult.builder().setSmoothedHrs(arrayList).setLastUsedIndex(i13).setLastUsedTime(list.get(i13).getTime()).build();
    }

    /* JADX INFO: renamed from: u */
    private static double m44820u(double d3, double d14) {
        return (16.0d / (Math.exp(((1.0d - d3) * 1.0d) / 0.15d) + 1.0d)) * d14;
    }
}
