package ah2;

import eh2.EnumC13196a;
import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ah2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lah2/a;", "", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "", "isStealthModeOn", "Ll83/a0;", "b", "(Z)V", "isOn", "Leh2/a;", "metric", "a", "(ZLeh2/a;)V", "Lfi0/a;", "stealth-mode_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0892a {

    /* JADX INFO: renamed from: c */
    public static final int f3275c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    public C0892a(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m2187a(boolean isOn, EnumC13196a metric) {
        AbstractC22676k.m65750j(metric, "metric");
        this.baseAnalytics.mo41424f(null, isOn ? "Enable" : "Disable", metric.name(), "Hide Metrics");
    }

    /* JADX INFO: renamed from: b */
    public final void m2188b(boolean isStealthModeOn) {
        InterfaceC14515a.m41418i(this.baseAnalytics, "Settings", isStealthModeOn ? "Enable" : "Disable", null, "Hide Recovery and Sleep", null, null, 52, null);
    }
}
