package kq1;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.squareup.wire.AbstractC5583n;
import gq1.C16081a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kq1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lkq1/b;", "", "Landroidx/fragment/app/m0;", "fragment", "Lgq1/a;", "analytics", "<init>", "(Landroidx/fragment/app/m0;Lgq1/a;)V", "Lkq1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lkq1/a;)V", "Landroidx/fragment/app/m0;", "b", "Lgq1/a;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22774b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C16081a analytics;

    public C22774b(AbstractComponentCallbacksC1320m0 fragment, C16081a analytics) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.fragment = fragment;
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m65981a(AbstractC22773a event) {
        AbstractC22676k.m65750j(event, "event");
        if (!(event instanceof AbstractC22773a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.analytics.m45430a(((AbstractC22773a.a) event).getMetadata().getImpactId(), C16081a.c.RECOVERY);
        AbstractC5583n.m16799z(this.fragment).m36410z();
    }
}
