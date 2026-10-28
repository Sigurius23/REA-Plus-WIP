package qh0;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: qh0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lqh0/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lqh0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lqh0/a;)V", "Lfi0/a;", "b", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30365b {

    /* JADX INFO: renamed from: c */
    public static final int f124571c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C30365b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m92836a(AbstractC30364a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC30364a.c) {
            this.analytics.mo41428k("coach_recommendation_drawer", ProfileAnalyticsKt.OPEN, ((AbstractC30364a.c) event).getActivityName(), "AI_COACH", AbstractC25247g0.m73990Y(new C23465k("daily_outlook_tile", Boolean.FALSE), new C23465k("source_type", "ACTIVITY_RECOMMENDATION_REVIEW")));
            return;
        }
        if (event instanceof AbstractC30364a.a) {
            this.analytics.mo41428k("coach_recommendation_drawer", "tap", "completed", "AI_COACH", AbstractC31061c.m95645u("value", ((AbstractC30364a.a) event).getActivityName()));
            return;
        }
        if (event instanceof AbstractC30364a.e) {
            this.analytics.mo41428k("coach_recommendation_drawer", "start", "completed", "AI_COACH", AbstractC31061c.m95645u("value", ((AbstractC30364a.e) event).getActivityName()));
        } else if (event instanceof AbstractC30364a.b) {
            this.analytics.mo41428k("chat_entry", "chat_entered", "completed", "AI_COACH", AbstractC25247g0.m73990Y(new C23465k("daily_outlook_tile", Boolean.FALSE), new C23465k("source", "generate_alternatives")));
        } else {
            if (!event.equals(AbstractC30364a.d.f124568a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC14515a.m41418i(this.analytics, null, "activity_deleted", "activity_recommendation", "AI_COACH", null, null, 49, null);
        }
    }
}
