package p139f7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
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
import p322m7.C25184y0;
import p322m7.C25185z;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: renamed from: f7.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14163a {

    /* JADX INFO: renamed from: a */
    public static final Object f51026a = null;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f51027b;

    static {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Set<Map.Entry> setEntrySet = AbstractC25247g0.m73990Y(new C23465k("ActiveCaloriesBurned", c22673i0.getOrCreateKotlinClass(C25127a.class)), new C23465k("ActivitySession", c22673i0.getOrCreateKotlinClass(C25179w.class)), new C23465k("BasalBodyTemperature", c22673i0.getOrCreateKotlinClass(C25130b.class)), new C23465k("BasalMetabolicRate", c22673i0.getOrCreateKotlinClass(C25133c.class)), new C23465k("BloodGlucose", c22673i0.getOrCreateKotlinClass(C25136d.class)), new C23465k("BloodPressure", c22673i0.getOrCreateKotlinClass(C25139e.class)), new C23465k("BodyFat", c22673i0.getOrCreateKotlinClass(C25142f.class)), new C23465k("BodyTemperature", c22673i0.getOrCreateKotlinClass(C25148h.class)), new C23465k("BodyWaterMass", c22673i0.getOrCreateKotlinClass(C25151i.class)), new C23465k("BoneMass", c22673i0.getOrCreateKotlinClass(C25153j.class)), new C23465k("CervicalMucus", c22673i0.getOrCreateKotlinClass(C25155k.class)), new C23465k("CyclingPedalingCadenceSeries", c22673i0.getOrCreateKotlinClass(C25159m.class)), new C23465k("Distance", c22673i0.getOrCreateKotlinClass(C25161n.class)), new C23465k("ElevationGained", c22673i0.getOrCreateKotlinClass(C25163o.class)), new C23465k("FloorsClimbed", c22673i0.getOrCreateKotlinClass(C25181x.class)), new C23465k("HeartRateSeries", c22673i0.getOrCreateKotlinClass(C25185z.class)), new C23465k("HeartRateVariabilityRmssd", c22673i0.getOrCreateKotlinClass(C25128a0.class)), new C23465k("Height", c22673i0.getOrCreateKotlinClass(C25131b0.class)), new C23465k("Hydration", c22673i0.getOrCreateKotlinClass(C25137d0.class)), new C23465k("LeanBodyMass", c22673i0.getOrCreateKotlinClass(C25149h0.class)), new C23465k("Menstruation", c22673i0.getOrCreateKotlinClass(C25154j0.class)), new C23465k("MenstruationPeriod", c22673i0.getOrCreateKotlinClass(C25156k0.class)), new C23465k("Nutrition", c22673i0.getOrCreateKotlinClass(C25160m0.class)), new C23465k("OvulationTest", c22673i0.getOrCreateKotlinClass(C25162n0.class)), new C23465k("OxygenSaturation", c22673i0.getOrCreateKotlinClass(C25164o0.class)), new C23465k("PowerSeries", c22673i0.getOrCreateKotlinClass(C25168q0.class)), new C23465k("RespiratoryRate", c22673i0.getOrCreateKotlinClass(C25172s0.class)), new C23465k("RestingHeartRate", c22673i0.getOrCreateKotlinClass(C25174t0.class)), new C23465k("SexualActivity", c22673i0.getOrCreateKotlinClass(C25178v0.class)), new C23465k("SleepSession", c22673i0.getOrCreateKotlinClass(C25182x0.class)), new C23465k("SleepStage", c22673i0.getOrCreateKotlinClass(C25184y0.class)), new C23465k("SpeedSeries", c22673i0.getOrCreateKotlinClass(C25129a1.class)), new C23465k("IntermenstrualBleeding", c22673i0.getOrCreateKotlinClass(C25143f0.class)), new C23465k("Steps", c22673i0.getOrCreateKotlinClass(C25138d1.class)), new C23465k("StepsCadenceSeries", c22673i0.getOrCreateKotlinClass(C25135c1.class)), new C23465k("TotalCaloriesBurned", c22673i0.getOrCreateKotlinClass(C25141e1.class)), new C23465k("Vo2Max", c22673i0.getOrCreateKotlinClass(C25144f1.class)), new C23465k("WheelchairPushes", c22673i0.getOrCreateKotlinClass(C25150h1.class)), new C23465k("Weight", c22673i0.getOrCreateKotlinClass(C25147g1.class))).entrySet();
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(setEntrySet, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getValue(), entry.getKey());
        }
        f51027b = linkedHashMap;
    }
}
