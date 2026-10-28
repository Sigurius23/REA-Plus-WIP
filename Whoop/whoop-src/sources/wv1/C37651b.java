package wv1;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wv1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lwv1/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lwv1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lwv1/a;)V", "Lfi0/a;", "b", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37651b {

    /* JADX INFO: renamed from: c */
    public static final int f161357c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C37651b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m121036a(AbstractC37650a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC14515a.m41418i(this.analytics, event.getCategory(), event.getAction(), null, event.getEventName(), event.getValue(), event.m121034d(), 4, null);
    }
}
