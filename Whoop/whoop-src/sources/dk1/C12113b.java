package dk1;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: dk1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u000eJG\u0010\"\u001a\u00020\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(¨\u0006)"}, m65681d2 = {"Ldk1/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "isLocked", "Ll83/a0;", "j", "(Z)V", "", "name", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;)V", "c", "()V", "Lcom/whoop/navigation/e;", "location", "g", "(Lcom/whoop/navigation/e;)V", "b", "d", "source", "k", "isExpanded", "category", "i", "(ZLjava/lang/String;)V", "a", "action", "label", "eventName", "value", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ldk1/a;", NotificationCompat.CATEGORY_EVENT, "l", "(Ldk1/a;)V", "Lfi0/a;", "healthspan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12113b {

    /* JADX INFO: renamed from: c */
    public static final int f40328c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C12113b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final void m33478a(String category) {
        m33483f(this, category, "CTA", "advanced_labs_card", "Healthspan", null, 16, null);
    }

    /* JADX INFO: renamed from: b */
    private final void m33479b() {
        m33483f(this, "healthspan", "Click", "create_custom_plan", "Weekly Plan", null, 16, null);
    }

    /* JADX INFO: renamed from: c */
    private final void m33480c() {
        m33483f(this, null, "dismiss", "Calibration", "Healthspan", null, 17, null);
    }

    /* JADX INFO: renamed from: d */
    private final void m33481d() {
        m33483f(this, "healthspan", "Click", "edit_current_plan", "Weekly Plan", null, 16, null);
    }

    /* JADX INFO: renamed from: e */
    private final void m33482e(String category, String action, String label, String eventName, String value) {
        this.analytics.mo41422d(category, action, label, eventName, value, null);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m33483f(C12113b c12113b, String str, String str2, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 16) != 0) {
            str5 = null;
        }
        c12113b.m33482e(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: g */
    private final void m33484g(C9598e location) {
        m33483f(this, location.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() instanceof AppScreen.C9358l6 ? "view_plan" : "start_plan", "CTA", "VoW", "Healthspan", null, 16, null);
    }

    /* JADX INFO: renamed from: h */
    private final void m33485h(String name) {
        m33483f(this, name, "Open", "Contributor", "Healthspan", null, 16, null);
    }

    /* JADX INFO: renamed from: i */
    private final void m33486i(boolean isExpanded, String category) {
        m33483f(this, category, isExpanded ? "Open" : "close", "advanced_labs_card", "Healthspan", null, 16, null);
    }

    /* JADX INFO: renamed from: j */
    private final void m33487j(boolean isLocked) {
        m33483f(this, null, "View", isLocked ? "Locked" : null, "Healthspan", null, 17, null);
    }

    /* JADX INFO: renamed from: k */
    private final void m33488k(String source) {
        this.analytics.mo41422d("main_screen", "View", "education", "Healthspan", null, AbstractC31061c.m95645u("source", source));
    }

    /* JADX INFO: renamed from: l */
    public final void m33489l(AbstractC12112a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC12112a.i) {
            m33487j(((AbstractC12112a.i) event).getIsLocked());
            return;
        }
        if (event instanceof AbstractC12112a.f) {
            m33485h(((AbstractC12112a.f) event).getName());
            return;
        }
        if (event.equals(AbstractC12112a.c.f40318a)) {
            m33480c();
            return;
        }
        if (event instanceof AbstractC12112a.e) {
            m33484g(((AbstractC12112a.e) event).getLocation());
            return;
        }
        if (event.equals(AbstractC12112a.b.f40317a)) {
            m33479b();
            return;
        }
        if (event.equals(AbstractC12112a.d.f40319a)) {
            m33481d();
            return;
        }
        if (event instanceof AbstractC12112a.h) {
            m33488k(((AbstractC12112a.h) event).getSource());
            return;
        }
        if (event instanceof AbstractC12112a.g) {
            AbstractC12112a.g gVar = (AbstractC12112a.g) event;
            m33486i(gVar.getIsExpanded(), gVar.getCategory());
        } else {
            if (!(event instanceof AbstractC12112a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m33478a(((AbstractC12112a.a) event).getCategory());
        }
    }
}
