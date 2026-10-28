package ca0;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import d13.AbstractC11478a;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ca0.b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lca0/b;", "", "Leb/a0;", "navController", "<init>", "(Leb/a0;)V", "Lca0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lca0/a;)V", "Leb/a0;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4360b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    public C4360b(AbstractC12939a0 navController) {
        AbstractC22676k.m65750j(navController, "navController");
        this.navController = navController;
    }

    /* JADX INFO: renamed from: a */
    public final void m13735a(AbstractC4359a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC4359a.a.f17632a)) {
            this.navController.m36410z();
            return;
        }
        if (!(event instanceof AbstractC4359a.b)) {
            if (!event.equals(AbstractC4359a.c.f17634a)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        this.navController.m36410z();
        String strM31996o = AbstractC11895b.m31996o("whoop://strength.builder?screen=linkWorkoutScreen&activityId=", ((AbstractC4359a.b) event).getActivityId(), "&source=Add Activity");
        AbstractC12939a0 abstractC12939a0 = this.navController;
        Uri uri = Uri.parse(strM31996o);
        abstractC12939a0.m36404s(AbstractC11478a.m30854f(uri, "uri", uri, null, null));
    }
}
