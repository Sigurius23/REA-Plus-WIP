package su0;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: su0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lsu0/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "level", "Ll83/a0;", "a", "(I)V", "Lfi0/a;", "b", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33011a {

    /* JADX INFO: renamed from: c */
    public static final int f137443c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C33011a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m104223a(int level) {
        this.analytics.mo41422d("Notification", "Send", "dead battery", "Local Notification", String.valueOf(level), AbstractC31061c.m95645u("campaignName", "deadBattery"));
    }
}
