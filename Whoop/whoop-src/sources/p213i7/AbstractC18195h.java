package p213i7;

import android.health.connect.datatypes.ActiveCaloriesBurnedRecord;
import android.health.connect.datatypes.BasalBodyTemperatureRecord;
import android.health.connect.datatypes.BasalMetabolicRateRecord;
import android.health.connect.datatypes.BloodGlucoseRecord;
import android.health.connect.datatypes.BloodPressureRecord;
import android.health.connect.datatypes.BodyFatRecord;
import android.health.connect.datatypes.BodyTemperatureRecord;
import android.health.connect.datatypes.BodyWaterMassRecord;
import android.health.connect.datatypes.BoneMassRecord;
import android.health.connect.datatypes.CervicalMucusRecord;
import android.health.connect.datatypes.CyclingPedalingCadenceRecord;
import android.health.connect.datatypes.DistanceRecord;
import android.health.connect.datatypes.ElevationGainedRecord;
import android.health.connect.datatypes.ExerciseSessionRecord;
import android.health.connect.datatypes.FloorsClimbedRecord;
import android.health.connect.datatypes.HeartRateRecord;
import android.health.connect.datatypes.HeartRateVariabilityRmssdRecord;
import android.health.connect.datatypes.HeightRecord;
import android.health.connect.datatypes.HydrationRecord;
import android.health.connect.datatypes.IntermenstrualBleedingRecord;
import android.health.connect.datatypes.LeanBodyMassRecord;
import android.health.connect.datatypes.MenstruationFlowRecord;
import android.health.connect.datatypes.MenstruationPeriodRecord;
import android.health.connect.datatypes.NutritionRecord;
import android.health.connect.datatypes.OvulationTestRecord;
import android.health.connect.datatypes.OxygenSaturationRecord;
import android.health.connect.datatypes.PowerRecord;
import android.health.connect.datatypes.RespiratoryRateRecord;
import android.health.connect.datatypes.RestingHeartRateRecord;
import android.health.connect.datatypes.SexualActivityRecord;
import android.health.connect.datatypes.SleepSessionRecord;
import android.health.connect.datatypes.SpeedRecord;
import android.health.connect.datatypes.StepsCadenceRecord;
import android.health.connect.datatypes.StepsRecord;
import android.health.connect.datatypes.TotalCaloriesBurnedRecord;
import android.health.connect.datatypes.Vo2MaxRecord;
import android.health.connect.datatypes.WeightRecord;
import android.health.connect.datatypes.WheelchairPushesRecord;
import l83.C23465k;
import m83.AbstractC25247g0;
import p322m7.C25127a;
import p322m7.C25128a0;
import p322m7.C25129a1;
import p322m7.C25130b;
import p322m7.C25131b0;
import p322m7.C25133c;
import p322m7.C25135c1;
import p322m7.C25136d;
import p322m7.C25137d0;
import p322m7.C25138d1;
import p322m7.C25139e;
import p322m7.C25141e1;
import p322m7.C25142f;
import p322m7.C25143f0;
import p322m7.C25144f1;
import p322m7.C25147g1;
import p322m7.C25148h;
import p322m7.C25149h0;
import p322m7.C25150h1;
import p322m7.C25151i;
import p322m7.C25153j;
import p322m7.C25154j0;
import p322m7.C25155k;
import p322m7.C25156k0;
import p322m7.C25159m;
import p322m7.C25160m0;
import p322m7.C25161n;
import p322m7.C25162n0;
import p322m7.C25163o;
import p322m7.C25164o0;
import p322m7.C25168q0;
import p322m7.C25172s0;
import p322m7.C25174t0;
import p322m7.C25178v0;
import p322m7.C25179w;
import p322m7.C25181x;
import p322m7.C25182x0;
import p322m7.C25185z;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: renamed from: i7.h */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18195h {

    /* JADX INFO: renamed from: a */
    public static final Object f70577a;

    static {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f70577a = AbstractC25247g0.m73990Y(new C23465k(c22673i0.getOrCreateKotlinClass(C25127a.class), ActiveCaloriesBurnedRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25130b.class), BasalBodyTemperatureRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25133c.class), BasalMetabolicRateRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25136d.class), BloodGlucoseRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25139e.class), BloodPressureRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25142f.class), BodyFatRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25148h.class), BodyTemperatureRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25151i.class), BodyWaterMassRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25153j.class), BoneMassRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25155k.class), CervicalMucusRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25159m.class), CyclingPedalingCadenceRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25161n.class), DistanceRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25163o.class), ElevationGainedRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25179w.class), ExerciseSessionRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25181x.class), FloorsClimbedRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25185z.class), HeartRateRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25128a0.class), HeartRateVariabilityRmssdRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25131b0.class), HeightRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25137d0.class), HydrationRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25143f0.class), IntermenstrualBleedingRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25149h0.class), LeanBodyMassRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25154j0.class), MenstruationFlowRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25156k0.class), MenstruationPeriodRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25160m0.class), NutritionRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25162n0.class), OvulationTestRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25164o0.class), OxygenSaturationRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25168q0.class), PowerRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25172s0.class), RespiratoryRateRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25174t0.class), RestingHeartRateRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25178v0.class), SexualActivityRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25182x0.class), SleepSessionRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25129a1.class), SpeedRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25135c1.class), StepsCadenceRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25138d1.class), StepsRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25141e1.class), TotalCaloriesBurnedRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25144f1.class), Vo2MaxRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25147g1.class), WeightRecord.class), new C23465k(c22673i0.getOrCreateKotlinClass(C25150h1.class), WheelchairPushesRecord.class));
    }
}
