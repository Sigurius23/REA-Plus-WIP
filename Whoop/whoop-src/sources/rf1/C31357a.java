package rf1;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wf1.InterfaceC37243a;

/* JADX INFO: renamed from: rf1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lrf1/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lwf1/a$g;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "b", "(Lwf1/a$g;)V", "Lwf1/a$a;", "a", "(Lwf1/a$a;)V", "Lfi0/a;", "feedback-survey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31357a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C31357a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m96429b(InterfaceC37243a.g event) {
    }

    /* JADX INFO: renamed from: a */
    public final void m96430a(InterfaceC37243a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC37243a.e) {
            AbstractC31358b.m96432b(this.analytics, ((InterfaceC37243a.e) event).getSource());
        } else {
            if (!(event instanceof InterfaceC37243a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            m96429b((InterfaceC37243a.g) event);
        }
    }
}
