package or2;

import androidx.core.app.NotificationCompat;
import com.whoop.service.network.model.UserSessionDtoKt;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.models.MessageType;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: or2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJc\u0010\u001d\u001a\u00020\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#¨\u0006$"}, m65681d2 = {"Lor2/e;", "", "Lfi0/a;", "baseAnalytics", "<init>", "(Lfi0/a;)V", "Ll83/a0;", "i", "()V", "", "success", "", "reason", "f", "(ZLjava/lang/String;)V", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "(Z)V", "isValid", "b", "j", "eventName", "category", "action", "label", "value", "", "otherProperties", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lor2/d;", NotificationCompat.CATEGORY_EVENT, "c", "(Lor2/d;)V", "Lfi0/a;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28156e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a baseAnalytics;

    public C28156e(InterfaceC14515a baseAnalytics) {
        AbstractC22676k.m65750j(baseAnalytics, "baseAnalytics");
        this.baseAnalytics = baseAnalytics;
    }

    /* JADX INFO: renamed from: a */
    private final void m85197a(boolean success) {
        m85200e(this, null, "change_password_screen", "change_password", null, success ? "success" : MessageType.FAILED, null, 41, null);
    }

    /* JADX INFO: renamed from: b */
    private final void m85198b(boolean isValid) {
        m85200e(this, null, "change_password_screen", isValid ? "enters_confirm_password" : "invalid_confirm_password", null, null, null, 57, null);
    }

    /* JADX INFO: renamed from: d */
    private final void m85199d(String eventName, String category, String action, String label, String value, Map<String, ? extends Object> otherProperties) {
        this.baseAnalytics.mo41422d(category, action, label, eventName, value, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m85200e(C28156e c28156e, String str, String str2, String str3, String str4, String str5, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "Auth Flow";
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            str4 = null;
        }
        if ((i13 & 16) != 0) {
            str5 = null;
        }
        c28156e.m85199d(str, str2, str3, str4, str5, (i13 & 32) != 0 ? null : map);
    }

    /* JADX INFO: renamed from: f */
    private final void m85201f(boolean success, String reason) {
        m85200e(this, null, "anywhere", UserSessionDtoKt.REFRESH_TOKEN, null, success ? "success" : MessageType.FAILED, AbstractC31061c.m95645u("reason", reason), 9, null);
    }

    /* JADX INFO: renamed from: g */
    private final void m85202g() {
        m85200e(this, null, "Settings", "sign_out", null, "pressed_sign_out", null, 41, null);
    }

    /* JADX INFO: renamed from: h */
    private final void m85203h() {
        m85200e(this, null, "change_password_screen", "View", null, null, null, 57, null);
    }

    /* JADX INFO: renamed from: i */
    private final void m85204i() {
        m85200e(this, null, "forgot_password_screen", "View", null, null, null, 57, null);
    }

    /* JADX INFO: renamed from: j */
    private final void m85205j() {
        m85200e(this, null, "sign_in_screen", "View", null, null, AbstractC31061c.m95645u("Welcome Screen Enabled", "No"), 25, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m85206c(AbstractC28153d event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC28153d.g.f113837a)) {
            m85205j();
            return;
        }
        if (event instanceof AbstractC28153d.b) {
            m85198b(((AbstractC28153d.b) event).getIsValid());
            return;
        }
        if (event instanceof AbstractC28153d.a) {
            m85197a(((AbstractC28153d.a) event).getSuccess());
            return;
        }
        if (event.equals(AbstractC28153d.e.f113835a)) {
            m85203h();
            return;
        }
        if (event.equals(AbstractC28153d.d.f113834a)) {
            m85202g();
            return;
        }
        if (event instanceof AbstractC28153d.c) {
            AbstractC28153d.c cVar = (AbstractC28153d.c) event;
            m85201f(cVar.getSuccess(), cVar.getReason());
        } else {
            if (!event.equals(AbstractC28153d.f.f113836a)) {
                throw new NoWhenBranchMatchedException();
            }
            m85204i();
        }
    }
}
