package ca2;

import fi0.InterfaceC14515a;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q92.C30069a;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: ca2.m */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lca2/m;", "", "Lfi0/a;", "baseAnalytics", "Ltr2/n;", "logger", "<init>", "(Lfi0/a;Ltr2/n;)V", "Ll83/a0;", "a", "()V", "Lfi0/a;", "b", "Ltr2/n;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4373m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C4373m(InterfaceC14515a baseAnalytics, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        AbstractC22676k.m65750j(logger, "logger");
        this.baseAnalytics = baseAnalytics;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final void m13763a() {
        try {
            this.baseAnalytics.mo41428k("Connectivity", "", "", "Application Force Closed", AbstractC25247g0.m73989X(new C23465k("strap_status", C30069a.f122700w.m92165k())));
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to track force quit analytics", e5, new AbstractC30556a.a[0]);
        }
    }
}
