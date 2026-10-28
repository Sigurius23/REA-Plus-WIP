package xk2;

import e93.AbstractC12889b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xk2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lxk2/c;", "", "<init>", "()V", "", "activityInternalName", "", "userWeightKg", "", "activityDurationSeconds", "a", "(Ljava/lang/String;DJ)D", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38437c {

    /* JADX INFO: renamed from: a */
    public static final C38437c f164615a = new C38437c();

    private C38437c() {
    }

    /* JADX INFO: renamed from: a */
    public final double m123137a(String activityInternalName, double userWeightKg, long activityDurationSeconds) {
        C38439e c38439e;
        AbstractC22676k.m65750j(activityInternalName, "activityInternalName");
        if (userWeightKg >= 20.0d && (c38439e = AbstractC38438d.m123138a().get(activityInternalName)) != null) {
            return Math.min(c38439e.getMaxAllowedRawStrain(), ((Math.max(1L, AbstractC12889b.m36259Y(activityDurationSeconds / c38439e.getAverageRepDurationSeconds())) * (c38439e.getFixedLoadKg() + (c38439e.getBodyWeightCorrection() * userWeightKg))) / (userWeightKg * 4000.0d)) * 0.4d);
        }
        return 0.0d;
    }
}
