package lv2;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import uu2.C35247e;

/* JADX INFO: renamed from: lv2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Llv2/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Luu2/e;", "analyticsContext", "Ll83/a0;", "b", "(Luu2/e;)V", "", "expanded", "", "analyticsActionFromBackend", "a", "(ZLuu2/e;Ljava/lang/String;)V", "Lfi0/a;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24763a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C24763a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m72505a(boolean expanded, C35247e analyticsContext, String analyticsActionFromBackend) {
        AbstractC22676k.m65750j(analyticsContext, "analyticsContext");
        if (expanded) {
            this.analytics.mo41428k("Exercise Details", analyticsActionFromBackend, analyticsContext.getExerciseName(), "Workout Builder", AbstractC31061c.m95645u("exercise_type", analyticsContext.getExerciseType()));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m72506b(C35247e analyticsContext) {
        AbstractC22676k.m65750j(analyticsContext, "analyticsContext");
        this.analytics.mo41428k("Exercise Details", "Show More Workouts", analyticsContext.getExerciseName(), "Workout Builder", AbstractC31061c.m95645u("exercise_type", analyticsContext.getExerciseType()));
    }
}
