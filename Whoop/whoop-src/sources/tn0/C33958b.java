package tn0;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fi0.InterfaceC14515a;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: tn0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Ltn0/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "source", "Ll83/a0;", "c", "(Ljava/lang/String;)V", "b", "()V", "Ltn0/a;", NotificationCompat.CATEGORY_EVENT, "a", "(Ltn0/a;)V", "Lfi0/a;", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33958b {

    /* JADX INFO: renamed from: b */
    private static final a f142389b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f142390c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: tn0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m65681d2 = {"Ltn0/b$a;", "", "<init>", "()V", "", "AUTH_FLOW", "Ljava/lang/String;", "SCREEN_NAME", "SOURCE", "SOURCE_SETTINGS", "SOURCE_EMAIL", "change-password_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C33958b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m107405b() {
        this.analytics.mo41428k("authentication", "submit", HMSTrackSource.SCREEN, "Auth Flow", AbstractC31061c.m95645u("screen_name", "reset_password"));
    }

    /* JADX INFO: renamed from: c */
    private final void m107406c(String source) {
        this.analytics.mo41428k("authentication", ProfileAnalyticsKt.VIEW, HMSTrackSource.SCREEN, "Auth Flow", AbstractC25247g0.m73990Y(new C23465k("screen_name", "reset_password"), new C23465k("source", source)));
    }

    /* JADX INFO: renamed from: a */
    public final void m107407a(InterfaceC33957a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(InterfaceC33957a.b.f142387a)) {
            m107406c("settings");
        } else if (event.equals(InterfaceC33957a.a.f142386a)) {
            m107406c(NotificationCompat.CATEGORY_EMAIL);
        } else {
            if (!event.equals(InterfaceC33957a.c.f142388a)) {
                throw new NoWhenBranchMatchedException();
            }
            m107405b();
        }
    }
}
