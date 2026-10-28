package h62;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h62.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lh62/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lh62/a;", NotificationCompat.CATEGORY_EVENT, "", "source", "Ll83/a0;", "a", "(Lh62/a;Ljava/lang/String;)V", "Lfi0/a;", "b", "refer-a-friend_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16982b {

    /* JADX INFO: renamed from: c */
    public static final int f65200c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C16982b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m47809a(AbstractC16981a event, String source) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(source, "source");
        this.analytics.mo41422d(event.getCategory(), event.getAction(), source, event.getEventName(), event.getValue(), event.mo47807d());
    }
}
