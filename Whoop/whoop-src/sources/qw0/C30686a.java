package qw0;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qw0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lqw0/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "customBehaviorId", "Ll83/a0;", "a", "(Ljava/lang/String;)V", "Lfi0/a;", "custombottomsheet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30686a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C30686a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m94286a(String customBehaviorId) {
        AbstractC22676k.m65750j(customBehaviorId, "customBehaviorId");
        InterfaceC14515a.m41418i(this.analytics, "journal", "stop_tracking_custom_behavior", null, "Customize Journal screen", customBehaviorId, null, 36, null);
    }
}
