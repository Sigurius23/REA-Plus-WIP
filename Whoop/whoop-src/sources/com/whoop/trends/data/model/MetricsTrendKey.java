package com.whoop.trends.data.model;

import ge3.AbstractC15751g;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wi0.C37312d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\bM\b\u0087\u0081\u0002\u0018\u0000 M2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001MB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bL¨\u0006N"}, m65681d2 = {"Lcom/whoop/trends/data/model/MetricsTrendKey;", "", "<init>", "(Ljava/lang/String;I)V", "AROUSAL_TIME", "AVERAGE_HR", "BASELINE_SLEEP_NEED", "BODY_COMPOSITION_FAT", "BODY_COMPOSITION_LEAN", "CALORIES", "CHRONOLOGICAL_AGE", "DAY_KILOJOULES", "DAY_STRAIN", "DEEP_SLEEP", "DISTURBANCES", "EXERCISE_PROGRESS", "HIGH_STRESS", "HIGH_STRESS_DURATION", "HIGH_STRESS_NON_STRAIN", "HIGH_STRESS_NON_STRAIN_DURATION", "HIGH_STRESS_SLEEP", "HIGH_STRESS_SLEEP_DURATION", "HOURS_V_NEEDED", "HRV", "HR_ZONES_1_3", "HR_ZONES_4_5", "HR_ZONES_ALL", "IN_SLEEP_EFFICIENCY", "LIGHT_SLEEP_DURATION", "LOW_STRESS", "LOW_STRESS_DURATION", "LOW_STRESS_NON_STRAIN", "LOW_STRESS_NON_STRAIN_DURATION", "LOW_STRESS_SLEEP", "LOW_STRESS_SLEEP_DURATION", "MAX_HR", "MEDIUM_STRESS", "MEDIUM_STRESS_DURATION", "MEDIUM_STRESS_NON_STRAIN", "MEDIUM_STRESS_NON_STRAIN_DURATION", "MEDIUM_STRESS_SLEEP", "MEDIUM_STRESS_SLEEP_DURATION", "MENSTRUAL_CYCLE_INSIGHTS", "NO_SLEEP_DATA_DURATION", "PACE_OF_AGING", "PREGNANCY_WEEK", "RECOVERY", "REM_SLEEP", "REM_SLEEP_DURATION", "RESTORATIVE_SLEEP_PERCENT", "RESPIRATORY_RATE", "RHR", "SAGE", "SCALED_DAY_STRAIN", "SKIN_TEMP_CELSIUS", "SLEEP_CONSISTENCY", "SLEEP_HOURS", "SLEEP_HOURS_GOAL", "SLEEP_LATENCY", "SLEEP_NEED", "SLEEP_NEED_FROM_RECENT_NAPS", "SLEEP_NEED_FROM_SLEEP_DEBT", "SLEEP_NEED_FROM_SLEEP_DEBT_POST", "SLEEP_NEED_FROM_STRAIN", "SLEEP_PERFORMANCE", "SLOW_WAVE_SLEEP_DURATION", "SPO2", "STEPS", "STRENGTH_ACTIVITY_TIME", "STRENGTH_TRAINING_TIME", "TIME_IN_BED", "TOTAL_VOLUME_LOAD", "VO2_MAX", "WAKE_DURATION", "WEIGHT", "WHOOP_AGE", "NONE", "Companion", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public enum MetricsTrendKey {
    AROUSAL_TIME,
    AVERAGE_HR,
    BASELINE_SLEEP_NEED,
    BODY_COMPOSITION_FAT,
    BODY_COMPOSITION_LEAN,
    CALORIES,
    CHRONOLOGICAL_AGE,
    DAY_KILOJOULES,
    DAY_STRAIN,
    DEEP_SLEEP,
    DISTURBANCES,
    EXERCISE_PROGRESS,
    HIGH_STRESS,
    HIGH_STRESS_DURATION,
    HIGH_STRESS_NON_STRAIN,
    HIGH_STRESS_NON_STRAIN_DURATION,
    HIGH_STRESS_SLEEP,
    HIGH_STRESS_SLEEP_DURATION,
    HOURS_V_NEEDED,
    HRV,
    HR_ZONES_1_3,
    HR_ZONES_4_5,
    HR_ZONES_ALL,
    IN_SLEEP_EFFICIENCY,
    LIGHT_SLEEP_DURATION,
    LOW_STRESS,
    LOW_STRESS_DURATION,
    LOW_STRESS_NON_STRAIN,
    LOW_STRESS_NON_STRAIN_DURATION,
    LOW_STRESS_SLEEP,
    LOW_STRESS_SLEEP_DURATION,
    MAX_HR,
    MEDIUM_STRESS,
    MEDIUM_STRESS_DURATION,
    MEDIUM_STRESS_NON_STRAIN,
    MEDIUM_STRESS_NON_STRAIN_DURATION,
    MEDIUM_STRESS_SLEEP,
    MEDIUM_STRESS_SLEEP_DURATION,
    MENSTRUAL_CYCLE_INSIGHTS,
    NO_SLEEP_DATA_DURATION,
    PACE_OF_AGING,
    PREGNANCY_WEEK,
    RECOVERY,
    REM_SLEEP,
    REM_SLEEP_DURATION,
    RESTORATIVE_SLEEP_PERCENT,
    RESPIRATORY_RATE,
    RHR,
    SAGE,
    SCALED_DAY_STRAIN,
    SKIN_TEMP_CELSIUS,
    SLEEP_CONSISTENCY,
    SLEEP_HOURS,
    SLEEP_HOURS_GOAL,
    SLEEP_LATENCY,
    SLEEP_NEED,
    SLEEP_NEED_FROM_RECENT_NAPS,
    SLEEP_NEED_FROM_SLEEP_DEBT,
    SLEEP_NEED_FROM_SLEEP_DEBT_POST,
    SLEEP_NEED_FROM_STRAIN,
    SLEEP_PERFORMANCE,
    SLOW_WAVE_SLEEP_DURATION,
    SPO2,
    STEPS,
    STRENGTH_ACTIVITY_TIME,
    STRENGTH_TRAINING_TIME,
    TIME_IN_BED,
    TOTAL_VOLUME_LOAD,
    VO2_MAX,
    WAKE_DURATION,
    WEIGHT,
    WHOOP_AGE,
    NONE;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37312d(26));

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/MetricsTrendKey$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/MetricsTrendKey;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) MetricsTrendKey.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.trends.data.model.MetricsTrendKey", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
