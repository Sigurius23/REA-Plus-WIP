package e03;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: e03.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Le03/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "widgetName", "Ll83/a0;", "b", "(Ljava/lang/String;)V", "a", "Lfi0/a;", "getAnalytics", "()Lfi0/a;", "widget_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12513a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C12513a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m35160a(String widgetName) {
        AbstractC22676k.m65750j(widgetName, "widgetName");
        this.analytics.mo41428k("", "Disable", "", "widget_update", AbstractC31061c.m95645u("size", widgetName));
    }

    /* JADX INFO: renamed from: b */
    public final void m35161b(String widgetName) {
        AbstractC22676k.m65750j(widgetName, "widgetName");
        this.analytics.mo41428k("", "Enable", "", "widget_update", AbstractC31061c.m95645u("size", widgetName));
    }
}
