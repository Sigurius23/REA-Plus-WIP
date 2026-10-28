package wu0;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q92.C30076h;

/* JADX INFO: renamed from: wu0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, m65681d2 = {"Lwu0/a;", "", "Lfi0/a;", "analytics", "Lq92/h;", "whoopStrapSharedPrefs", "<init>", "(Lfi0/a;Lq92/h;)V", "", "label", "value", "strapGen", "", "isOnBody", "Ll83/a0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lfi0/a;", "Ljava/lang/String;", "maximVersion", "c", "nordicVersion", "connectivity-notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37638a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String maximVersion;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String nordicVersion;

    public C37638a(InterfaceC14515a analytics, C30076h whoopStrapSharedPrefs) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(whoopStrapSharedPrefs, "whoopStrapSharedPrefs");
        this.analytics = analytics;
        this.maximVersion = whoopStrapSharedPrefs.m92198d();
        this.nordicVersion = whoopStrapSharedPrefs.m92199e();
    }

    /* JADX INFO: renamed from: a */
    public final void m120960a(String label, String value, String strapGen) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        this.analytics.mo41421c("Local Notification", "Off-body", this.maximVersion, this.nordicVersion, strapGen, "Sent", label, value, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m120961b(String label, String value, String strapGen, boolean isOnBody) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        this.analytics.mo41421c("Local Notification", isOnBody ? "On-body" : "Off-body", this.maximVersion, this.nordicVersion, strapGen, "Triggered", label, value, null);
    }
}
