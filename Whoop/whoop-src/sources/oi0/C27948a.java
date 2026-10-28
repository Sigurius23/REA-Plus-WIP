package oi0;

import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import n83.C26463f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import ri0.InterfaceC31443b;
import u82.AbstractC34647h;

/* JADX INFO: renamed from: oi0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Loi0/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lcom/whoop/analytics/AnalyticEventModel;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "d", "(Lcom/whoop/analytics/AnalyticEventModel;)V", "b", "Lri0/b$j;", "c", "(Lri0/b$j;)V", "Lri0/b$a;", "a", "(Lri0/b$a;)V", "Lfi0/a;", "getAnalytics$arch_v2_release", "()Lfi0/a;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27948a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C27948a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: b */
    private final void m84379b(AnalyticEventModel event) {
        AbstractC14516b.m41429a(this.analytics, event);
    }

    /* JADX INFO: renamed from: c */
    private final void m84380c(InterfaceC31443b.j event) {
    }

    /* JADX INFO: renamed from: d */
    private final void m84381d(AnalyticEventModel event) {
        Object objM109488c;
        C26463f c26463f = new C26463f();
        c26463f.put("category", event.getCategory());
        String action = event.getAction();
        if (action != null) {
            c26463f.put("action", action);
        }
        String label = event.getLabel();
        if (label != null) {
            c26463f.put("label", label);
        }
        String value = event.getValue();
        if (value != null) {
            c26463f.put("value", value);
        }
        String source = event.getSource();
        if (source != null) {
            c26463f.put("source", source);
        }
        for (Map.Entry<String, JsonElement> entry : event.getProperties().entrySet()) {
            String key = entry.getKey();
            JsonElement value2 = entry.getValue();
            if (value2 != null && (objM109488c = AbstractC34647h.m109488c(value2)) != null) {
                c26463f.put(key, objM109488c);
            }
        }
        this.analytics.mo41423e(event.getName(), c26463f.m78380b());
    }

    /* JADX INFO: renamed from: a */
    public final void m84382a(InterfaceC31443b.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC31443b.g) {
            m84379b(((InterfaceC31443b.g) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        } else if (event instanceof InterfaceC31443b.v) {
            m84381d(((InterfaceC31443b.v) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        } else {
            if (!(event instanceof InterfaceC31443b.j)) {
                throw new NoWhenBranchMatchedException();
            }
            m84380c((InterfaceC31443b.j) event);
        }
    }
}
