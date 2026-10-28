package rh1;

import fi0.InterfaceC14515a;
import gi1.C15892b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rh1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m65681d2 = {"Lrh1/a;", "", "Lgi1/b;", "gpsPermissionHelper", "Lfi0/a;", "analytics", "<init>", "(Lgi1/b;Lfi0/a;)V", "", "a", "()Ljava/lang/String;", "Ll83/a0;", "b", "()V", "Lgi1/b;", "Lfi0/a;", "", "c", "Z", "hasSentThisSession", "d", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31439a {

    /* JADX INFO: renamed from: e */
    public static final int f129336e = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C15892b gpsPermissionHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasSentThisSession;

    public C31439a(C15892b gpsPermissionHelper, InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(gpsPermissionHelper, "gpsPermissionHelper");
        AbstractC22676k.m65750j(analytics, "analytics");
        this.gpsPermissionHelper = gpsPermissionHelper;
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final String m96771a() {
        boolean zM44826b = this.gpsPermissionHelper.m44826b();
        boolean zM44825a = this.gpsPermissionHelper.m44825a();
        if (zM44826b) {
            return zM44825a ? "background" : "foreground";
        }
        return "none";
    }

    /* JADX INFO: renamed from: b */
    public final void m96772b() {
        if (this.hasSentThisSession) {
            return;
        }
        this.analytics.mo41424f("Location", "State", m96771a(), "Location Permission - State");
        this.hasSentThisSession = true;
    }
}
