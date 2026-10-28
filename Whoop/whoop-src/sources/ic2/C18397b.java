package ic2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import fi0.InterfaceC14515a;
import fi0.InterfaceC14517c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: ic2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001f¨\u0006 "}, m65681d2 = {"Lic2/b;", "", "Lfi0/a;", "analytics", "Lfi0/c;", "amplitude", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "<init>", "(Lfi0/a;Lfi0/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "label", "value", "action", "Ll83/a0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "nameSpace", "a", "(Ljava/lang/String;)Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "d", "", "isNotificationOn", "e", "(Ljava/lang/String;Z)V", "f", "()V", "Lfi0/a;", "Lfi0/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18397b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14517c amplitude;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    public C18397b(InterfaceC14515a analytics, InterfaceC14517c amplitude, FeatureFlagChecker ffChecker) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(amplitude, "amplitude");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        this.analytics = analytics;
        this.amplitude = amplitude;
        this.ffChecker = ffChecker;
    }

    /* JADX INFO: renamed from: a */
    private final String m52900a(String nameSpace) {
        return AbstractC22676k.m65745e(nameSpace, "StressSummary") ? "Stress Monitor" : nameSpace;
    }

    /* JADX INFO: renamed from: b */
    private final void m52901b(String label, String value, String action) {
        if (this.ffChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NOTIFICATION_UNSUB_MONITORING)) {
            this.amplitude.mo41422d("notification_permissions", action, label, "Push Notification", value, AbstractC31061c.m95645u("screen_name", "notification_settings"));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m52902c(String label) {
        AbstractC22676k.m65750j(label, "label");
        m52901b(label, "disabled", "changed_notification_status");
    }

    /* JADX INFO: renamed from: d */
    public final void m52903d(String label) {
        AbstractC22676k.m65750j(label, "label");
        m52901b(label, "enabled", "changed_notification_status");
    }

    /* JADX INFO: renamed from: e */
    public final void m52904e(String nameSpace, boolean isNotificationOn) {
        AbstractC22676k.m65750j(nameSpace, "nameSpace");
        if (this.ffChecker.isFeatureEnabled(FeatureFlagRepositoryKt.NOTIFICATION_UNSUB_MONITORING)) {
            m52901b(nameSpace, isNotificationOn ? "enabled" : "disabled", "changed_notification_status");
        } else {
            this.analytics.mo41424f("Settings", isNotificationOn ? "Enable" : "Disable", m52900a(nameSpace), "Notifications");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m52905f() {
        m52901b(null, null, "view_pn_settings_screen");
    }
}
