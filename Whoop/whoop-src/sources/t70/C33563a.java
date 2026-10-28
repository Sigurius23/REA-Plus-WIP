package t70;

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
import y70.InterfaceC39265a;

/* JADX INFO: renamed from: t70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lt70/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "source", "Ll83/a0;", "a", "(Ljava/lang/String;)V", "Ly70/a$i;", NotificationCompat.CATEGORY_EVENT, "c", "(Ly70/a$i;)V", "Ly70/a$a;", "b", "(Ly70/a$a;)V", "Lfi0/a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33563a {

    /* JADX INFO: renamed from: b */
    private static final a f140043b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final int f140044c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: t70.a$a */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, m65681d2 = {"Lt70/a$a;", "", "<init>", "()V", "", "ORDERED_SCREEN_EVENT", "Ljava/lang/String;", "ORDER_STATUS_SCREEN", "SCREEN_NAME", "SOURCE_KEY", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C33563a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final void m105979a(String source) {
        this.analytics.mo41428k("Ordered Screen", ProfileAnalyticsKt.VIEW, HMSTrackSource.SCREEN, "Ordered Screen", AbstractC25247g0.m73990Y(new C23465k("screen_name", "order_status"), new C23465k("source", source)));
    }

    /* JADX INFO: renamed from: c */
    private final void m105980c(InterfaceC39265a.i event) {
    }

    /* JADX INFO: renamed from: b */
    public final void m105981b(InterfaceC39265a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC39265a.k) {
            m105979a(((InterfaceC39265a.k) event).getSource());
        } else {
            if (!(event instanceof InterfaceC39265a.i)) {
                throw new NoWhenBranchMatchedException();
            }
            m105980c((InterfaceC39265a.i) event);
        }
    }
}
