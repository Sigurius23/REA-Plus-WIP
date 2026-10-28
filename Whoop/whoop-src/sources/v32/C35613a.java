package v32;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: v32.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\bJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lv32/a;", "", "Lz82/b;", "analyticsManager", "<init>", "(Lz82/b;)V", "Ll83/a0;", "a", "()V", "b", "c", "d", "e", "f", "g", "Lz82/b;", "getAnalyticsManager", "()Lz82/b;", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35613a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    public C35613a(InterfaceC40188b analyticsManager) {
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        this.analyticsManager = analyticsManager;
    }

    /* JADX INFO: renamed from: a */
    public final void m112825a() {
        this.analyticsManager.mo41424f("Feature Onboarding", "", "", "PREGNANCY_STORY - Completed Onboarding");
    }

    /* JADX INFO: renamed from: b */
    public final void m112826b() {
        this.analyticsManager.mo41424f("Pregnancy Coaching", "Enter Setup", "", "Pregnancy Coaching");
    }

    /* JADX INFO: renamed from: c */
    public final void m112827c() {
        this.analyticsManager.mo41424f("Pregnancy Coaching", "Exit Setup", "", "Pregnancy Coaching");
    }

    /* JADX INFO: renamed from: d */
    public final void m112828d() {
        this.analyticsManager.mo41424f("Pregnancy Coaching", "Disable - Share Feedback", "", "Pregnancy Coaching");
    }

    /* JADX INFO: renamed from: e */
    public final void m112829e() {
        this.analyticsManager.mo41424f("Pregnancy Coaching", "View", "", "Pregnancy Coaching");
    }

    /* JADX INFO: renamed from: f */
    public final void m112830f() {
        this.analyticsManager.mo41424f("Pregnancy Coaching", "View", "", "PREGNANCY_IN_APP - Onboarding");
    }

    /* JADX INFO: renamed from: g */
    public final void m112831g() {
        this.analyticsManager.mo41424f("Feature Onboarding", "View", "", "PREGNANCY_STORY - Viewed Onboarding Screen");
    }
}
