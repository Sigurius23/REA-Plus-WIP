package gw2;

import fi0.InterfaceC14515a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: gw2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lgw2/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Ll83/a0;", "c", "()V", "", "unlocked", "", "value", "a", "(ZLjava/lang/String;)V", "b", "(Ljava/lang/String;)V", "Lfi0/a;", "what-to-expect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16269a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C16269a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m46086a(boolean unlocked, String value) {
        AbstractC22676k.m65750j(value, "value");
        this.analytics.mo41426h("what_to_expect", unlocked ? "tap_unlocked_milestone" : "tap_locked_milestone", "milestone", "Onboarding", value);
    }

    /* JADX INFO: renamed from: b */
    public final void m46087b(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.analytics.mo41426h("what_to_expect", "tap_more_to_explore", "feature", "Onboarding", value);
    }

    /* JADX INFO: renamed from: c */
    public final void m46088c() {
        InterfaceC14515a.m41418i(this.analytics, "what_to_expect", "view_what_to_expect", null, "Onboarding", null, AbstractC31061c.m95645u("Screen name", "Onboarding – What to Expect"), 20, null);
    }
}
