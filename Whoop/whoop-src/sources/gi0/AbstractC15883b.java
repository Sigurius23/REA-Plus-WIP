package gi0;

import com.whoop.analytics.strain.model.BiologicalSex;
import com.whoop.analytics.strain.model.Calories;
import com.whoop.analytics.strain.model.HeartRateTimestamp;
import com.whoop.analytics.strain.model.UserProfile;
import com.whoop.analytics.strain.model.WorkoutBurnRate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gi0.b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC15883b {

    /* JADX INFO: renamed from: a */
    public static double f60004a = 0.3d;

    /* JADX INFO: renamed from: a */
    public static double m44783a(BiologicalSex biologicalSex, double d3, double d14, long j7) {
        double calorieRestingHeightValue;
        double calorieRestingAgeValue;
        double dM44795f = AbstractC15884c.m44795f(j7);
        if (biologicalSex.equals(BiologicalSex.femaleNew) || biologicalSex.equals(BiologicalSex.maleNew) || biologicalSex.equals(BiologicalSex.nonBinaryNew)) {
            calorieRestingHeightValue = (biologicalSex.getCalorieRestingHeightValue() * d14) + (biologicalSex.getCalorieRestingWeightValue() * d3) + biologicalSex.getCalorieRestingAlphaValue();
            calorieRestingAgeValue = biologicalSex.getCalorieRestingAgeValue();
        } else {
            double dM44788f = m44788f(d3);
            double dM44789g = m44789g(d14);
            calorieRestingHeightValue = (biologicalSex.getCalorieRestingHeightValue() * dM44789g) + (biologicalSex.getCalorieRestingWeightValue() * dM44788f) + biologicalSex.getCalorieRestingAlphaValue();
            calorieRestingAgeValue = biologicalSex.getCalorieRestingAgeValue();
        }
        double d15 = calorieRestingHeightValue - (calorieRestingAgeValue * dM44795f);
        if (d15 < 0.0d) {
            return 0.0d;
        }
        return d15 / 86400.0d;
    }

    /* JADX INFO: renamed from: b */
    public static WorkoutBurnRate m44784b(BiologicalSex biologicalSex, double d3, long j7, double d14, double d15, double d16) {
        double dM44795f = AbstractC15884c.m44795f(j7);
        double calorieWorkoutAgeValue = ((((biologicalSex.getCalorieWorkoutAgeValue() * dM44795f) + ((biologicalSex.getCalorieWorkoutWeightValue() * d3) + ((biologicalSex.getCalorieWorkoutHeartRateValue() * d14) + biologicalSex.getCalorieWorkoutAlphaValue()))) / 251.04000000000002d) - d15) / (d14 - d16);
        return new WorkoutBurnRate(calorieWorkoutAgeValue, d15 - (d16 * calorieWorkoutAgeValue));
    }

    /* JADX INFO: renamed from: c */
    public static double m44785c(BiologicalSex biologicalSex, double d3, long j7, double d14, double d15) {
        double dM44795f = AbstractC15884c.m44795f(j7);
        double calorieWorkoutAlphaValue = biologicalSex.getCalorieWorkoutAlphaValue() + (biologicalSex.getCalorieWorkoutAgeValue() * dM44795f) + (biologicalSex.getCalorieWorkoutWeightValue() * d3) + (Math.min(d14, d15) * biologicalSex.getCalorieWorkoutHeartRateValue());
        if (calorieWorkoutAlphaValue < 0.0d) {
            return 0.0d;
        }
        return calorieWorkoutAlphaValue / 251.04000000000002d;
    }

    /* JADX INFO: renamed from: d */
    public static Calories m44786d(UserProfile userProfile, List<HeartRateTimestamp> list, long j7) {
        ArrayList arrayList = new ArrayList();
        double dM44783a = m44783a(userProfile.getBiologicalSex(), userProfile.getWeight(), userProfile.getHeight(), userProfile.getBirthday());
        int i13 = 0;
        if (userProfile.getBiologicalSex().equals(BiologicalSex.maleNew) || userProfile.getBiologicalSex().equals(BiologicalSex.femaleNew) || userProfile.getBiologicalSex().equals(BiologicalSex.nonBinaryNew)) {
            List<Double> listM44811l = AbstractC15887f.m44811l(list, j7);
            double restingHeartRate = userProfile.getRestingHeartRate() + ((userProfile.getMaxHeartRate() - userProfile.getRestingHeartRate()) * f60004a);
            WorkoutBurnRate workoutBurnRateM44784b = m44784b(userProfile.getBiologicalSex(), userProfile.getWeight(), userProfile.getBirthday(), userProfile.getMaxHeartRate(), dM44783a, restingHeartRate);
            while (i13 < list.size()) {
                double heartRate = list.get(i13).getHeartRate();
                double dDoubleValue = listM44811l.get(i13).doubleValue();
                if (heartRate < restingHeartRate) {
                    arrayList.add(Double.valueOf(dDoubleValue * dM44783a));
                } else {
                    arrayList.add(Double.valueOf((workoutBurnRateM44784b.getIntercept() + (workoutBurnRateM44784b.getSlope() * heartRate)) * dDoubleValue));
                }
                i13++;
            }
        } else {
            List<HeartRateTimestamp> listM44808i = AbstractC15887f.m44808i(list, userProfile.getRestingHeartRate(), userProfile.getMaxHeartRate());
            List<Double> listM44811l2 = AbstractC15887f.m44811l(listM44808i, j7);
            while (i13 < listM44808i.size()) {
                double heartRate2 = listM44808i.get(i13).getHeartRate();
                double dDoubleValue2 = listM44811l2.get(i13).doubleValue();
                if (heartRate2 < f60004a) {
                    arrayList.add(Double.valueOf(dDoubleValue2 * dM44783a));
                } else {
                    arrayList.add(Double.valueOf(dDoubleValue2 * m44785c(userProfile.getBiologicalSex(), userProfile.getWeight(), userProfile.getBirthday(), list.get(i13).getHeartRate(), userProfile.getMaxHeartRate())));
                }
                i13++;
            }
        }
        double dSum = arrayList.stream().mapToDouble(new C15882a(0)).sum();
        return Calories.builder().setTotalKilocalories(dSum).setTotalKilojoules(dSum * 4.184d).build();
    }

    /* JADX INFO: renamed from: e */
    public static double m44787e(double d3) {
        return d3 / 4.184d;
    }

    /* JADX INFO: renamed from: f */
    public static double m44788f(double d3) {
        return d3 * 2.20462d;
    }

    /* JADX INFO: renamed from: g */
    public static double m44789g(double d3) {
        return d3 * 39.3701d;
    }
}
