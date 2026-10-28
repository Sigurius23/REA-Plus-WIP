package xx0;

import androidx.core.app.NotificationCompat;
import cy0.InterfaceC11182a;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: xx0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lxx0/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lcy0/a$a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lcy0/a$a;)V", "Lfi0/a;", "deep-dive_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38689a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C38689a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m124088a(InterfaceC11182a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC11182a.j) {
            AbstractC38690b.m124090b(this.analytics, AbstractC38690b.m124093e(((InterfaceC11182a.j) event).getSource()));
        } else {
            if (!(event instanceof InterfaceC11182a.i)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC11182a.i iVar = (InterfaceC11182a.i) event;
            AbstractC38690b.m124089a(this.analytics, iVar.getSource(), iVar.getLabel());
        }
    }
}
