package p274k7;

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
import p322m7.C25184y0;
import p322m7.C25185z;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.C22673i0;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: k7.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22238b {

    /* JADX INFO: renamed from: a */
    public static final Object f86659a;

    static {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        f86659a = AbstractC25247g0.m73990Y(new C23465k(c22673i0.getOrCreateKotlinClass(C25127a.class), AbstractC39414r.m125859E0("android.permission.health.READ_ACTIVE_CALORIES_BURNED", "android.permission.health.READ_", "android.permission.health.READ_ACTIVE_CALORIES_BURNED")), new C23465k(c22673i0.getOrCreateKotlinClass(C25130b.class), AbstractC39414r.m125859E0("android.permission.health.READ_BASAL_BODY_TEMPERATURE", "android.permission.health.READ_", "android.permission.health.READ_BASAL_BODY_TEMPERATURE")), new C23465k(c22673i0.getOrCreateKotlinClass(C25133c.class), AbstractC39414r.m125859E0("android.permission.health.READ_BASAL_METABOLIC_RATE", "android.permission.health.READ_", "android.permission.health.READ_BASAL_METABOLIC_RATE")), new C23465k(c22673i0.getOrCreateKotlinClass(C25136d.class), AbstractC39414r.m125859E0("android.permission.health.READ_BLOOD_GLUCOSE", "android.permission.health.READ_", "android.permission.health.READ_BLOOD_GLUCOSE")), new C23465k(c22673i0.getOrCreateKotlinClass(C25139e.class), AbstractC39414r.m125859E0("android.permission.health.READ_BLOOD_PRESSURE", "android.permission.health.READ_", "android.permission.health.READ_BLOOD_PRESSURE")), new C23465k(c22673i0.getOrCreateKotlinClass(C25142f.class), AbstractC39414r.m125859E0("android.permission.health.READ_BODY_FAT", "android.permission.health.READ_", "android.permission.health.READ_BODY_FAT")), new C23465k(c22673i0.getOrCreateKotlinClass(C25148h.class), AbstractC39414r.m125859E0("android.permission.health.READ_BODY_TEMPERATURE", "android.permission.health.READ_", "android.permission.health.READ_BODY_TEMPERATURE")), new C23465k(c22673i0.getOrCreateKotlinClass(C25151i.class), AbstractC39414r.m125859E0("android.permission.health.READ_BODY_WATER_MASS", "android.permission.health.READ_", "android.permission.health.READ_BODY_WATER_MASS")), new C23465k(c22673i0.getOrCreateKotlinClass(C25153j.class), AbstractC39414r.m125859E0("android.permission.health.READ_BONE_MASS", "android.permission.health.READ_", "android.permission.health.READ_BONE_MASS")), new C23465k(c22673i0.getOrCreateKotlinClass(C25155k.class), AbstractC39414r.m125859E0("android.permission.health.READ_CERVICAL_MUCUS", "android.permission.health.READ_", "android.permission.health.READ_CERVICAL_MUCUS")), new C23465k(c22673i0.getOrCreateKotlinClass(C25159m.class), AbstractC39414r.m125859E0("android.permission.health.READ_EXERCISE", "android.permission.health.READ_", "android.permission.health.READ_EXERCISE")), new C23465k(c22673i0.getOrCreateKotlinClass(C25161n.class), AbstractC39414r.m125859E0("android.permission.health.READ_DISTANCE", "android.permission.health.READ_", "android.permission.health.READ_DISTANCE")), new C23465k(c22673i0.getOrCreateKotlinClass(C25163o.class), AbstractC39414r.m125859E0("android.permission.health.READ_ELEVATION_GAINED", "android.permission.health.READ_", "android.permission.health.READ_ELEVATION_GAINED")), new C23465k(c22673i0.getOrCreateKotlinClass(C25179w.class), AbstractC39414r.m125859E0("android.permission.health.READ_EXERCISE", "android.permission.health.READ_", "android.permission.health.READ_EXERCISE")), new C23465k(c22673i0.getOrCreateKotlinClass(C25181x.class), AbstractC39414r.m125859E0("android.permission.health.READ_FLOORS_CLIMBED", "android.permission.health.READ_", "android.permission.health.READ_FLOORS_CLIMBED")), new C23465k(c22673i0.getOrCreateKotlinClass(C25185z.class), AbstractC39414r.m125859E0("android.permission.health.READ_HEART_RATE", "android.permission.health.READ_", "android.permission.health.READ_HEART_RATE")), new C23465k(c22673i0.getOrCreateKotlinClass(C25128a0.class), AbstractC39414r.m125859E0("android.permission.health.READ_HEART_RATE_VARIABILITY", "android.permission.health.READ_", "android.permission.health.READ_HEART_RATE_VARIABILITY")), new C23465k(c22673i0.getOrCreateKotlinClass(C25131b0.class), AbstractC39414r.m125859E0("android.permission.health.READ_HEIGHT", "android.permission.health.READ_", "android.permission.health.READ_HEIGHT")), new C23465k(c22673i0.getOrCreateKotlinClass(C25137d0.class), AbstractC39414r.m125859E0("android.permission.health.READ_HYDRATION", "android.permission.health.READ_", "android.permission.health.READ_HYDRATION")), new C23465k(c22673i0.getOrCreateKotlinClass(C25143f0.class), AbstractC39414r.m125859E0("android.permission.health.READ_INTERMENSTRUAL_BLEEDING", "android.permission.health.READ_", "android.permission.health.READ_INTERMENSTRUAL_BLEEDING")), new C23465k(c22673i0.getOrCreateKotlinClass(C25149h0.class), AbstractC39414r.m125859E0("android.permission.health.READ_LEAN_BODY_MASS", "android.permission.health.READ_", "android.permission.health.READ_LEAN_BODY_MASS")), new C23465k(c22673i0.getOrCreateKotlinClass(C25154j0.class), AbstractC39414r.m125859E0("android.permission.health.READ_MENSTRUATION", "android.permission.health.READ_", "android.permission.health.READ_MENSTRUATION")), new C23465k(c22673i0.getOrCreateKotlinClass(C25156k0.class), AbstractC39414r.m125859E0("android.permission.health.READ_MENSTRUATION", "android.permission.health.READ_", "android.permission.health.READ_MENSTRUATION")), new C23465k(c22673i0.getOrCreateKotlinClass(C25160m0.class), AbstractC39414r.m125859E0("android.permission.health.READ_NUTRITION", "android.permission.health.READ_", "android.permission.health.READ_NUTRITION")), new C23465k(c22673i0.getOrCreateKotlinClass(C25162n0.class), AbstractC39414r.m125859E0("android.permission.health.READ_OVULATION_TEST", "android.permission.health.READ_", "android.permission.health.READ_OVULATION_TEST")), new C23465k(c22673i0.getOrCreateKotlinClass(C25164o0.class), AbstractC39414r.m125859E0("android.permission.health.READ_OXYGEN_SATURATION", "android.permission.health.READ_", "android.permission.health.READ_OXYGEN_SATURATION")), new C23465k(c22673i0.getOrCreateKotlinClass(C25168q0.class), AbstractC39414r.m125859E0("android.permission.health.READ_POWER", "android.permission.health.READ_", "android.permission.health.READ_POWER")), new C23465k(c22673i0.getOrCreateKotlinClass(C25172s0.class), AbstractC39414r.m125859E0("android.permission.health.READ_RESPIRATORY_RATE", "android.permission.health.READ_", "android.permission.health.READ_RESPIRATORY_RATE")), new C23465k(c22673i0.getOrCreateKotlinClass(C25174t0.class), AbstractC39414r.m125859E0("android.permission.health.READ_RESTING_HEART_RATE", "android.permission.health.READ_", "android.permission.health.READ_RESTING_HEART_RATE")), new C23465k(c22673i0.getOrCreateKotlinClass(C25178v0.class), AbstractC39414r.m125859E0("android.permission.health.READ_SEXUAL_ACTIVITY", "android.permission.health.READ_", "android.permission.health.READ_SEXUAL_ACTIVITY")), new C23465k(c22673i0.getOrCreateKotlinClass(C25182x0.class), AbstractC39414r.m125859E0("android.permission.health.READ_SLEEP", "android.permission.health.READ_", "android.permission.health.READ_SLEEP")), new C23465k(c22673i0.getOrCreateKotlinClass(C25184y0.class), AbstractC39414r.m125859E0("android.permission.health.READ_SLEEP", "android.permission.health.READ_", "android.permission.health.READ_SLEEP")), new C23465k(c22673i0.getOrCreateKotlinClass(C25129a1.class), AbstractC39414r.m125859E0("android.permission.health.READ_SPEED", "android.permission.health.READ_", "android.permission.health.READ_SPEED")), new C23465k(c22673i0.getOrCreateKotlinClass(C25135c1.class), AbstractC39414r.m125859E0("android.permission.health.READ_STEPS", "android.permission.health.READ_", "android.permission.health.READ_STEPS")), new C23465k(c22673i0.getOrCreateKotlinClass(C25138d1.class), AbstractC39414r.m125859E0("android.permission.health.READ_STEPS", "android.permission.health.READ_", "android.permission.health.READ_STEPS")), new C23465k(c22673i0.getOrCreateKotlinClass(C25141e1.class), AbstractC39414r.m125859E0("android.permission.health.READ_TOTAL_CALORIES_BURNED", "android.permission.health.READ_", "android.permission.health.READ_TOTAL_CALORIES_BURNED")), new C23465k(c22673i0.getOrCreateKotlinClass(C25144f1.class), AbstractC39414r.m125859E0("android.permission.health.READ_VO2_MAX", "android.permission.health.READ_", "android.permission.health.READ_VO2_MAX")), new C23465k(c22673i0.getOrCreateKotlinClass(C25147g1.class), AbstractC39414r.m125859E0("android.permission.health.READ_WEIGHT", "android.permission.health.READ_", "android.permission.health.READ_WEIGHT")), new C23465k(c22673i0.getOrCreateKotlinClass(C25150h1.class), AbstractC39414r.m125859E0("android.permission.health.READ_WHEELCHAIR_PUSHES", "android.permission.health.READ_", "android.permission.health.READ_WHEELCHAIR_PUSHES")));
    }
}
