package ho1;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import java.util.Map;
import lo1.InterfaceC24616a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import yn1.AbstractC39672a;
import yn1.C39673b;

/* JADX INFO: renamed from: ho1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\fJW\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lho1/a;", "", "Lfi0/a;", "analytics", "Lyn1/b;", "hormonalInsightsAnalyticsHelper", "<init>", "(Lfi0/a;Lyn1/b;)V", "", "source", "Ll83/a0;", "d", "(Ljava/lang/String;)V", "phaseLabel", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "tabId", "e", "category", "action", "label", "eventName", "value", "", "otherProperties", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Llo1/a$a;", NotificationCompat.CATEGORY_EVENT, "f", "(Llo1/a$a;)V", "Lfi0/a;", "b", "Lyn1/b;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17537a {

    /* JADX INFO: renamed from: d */
    public static final int f67819d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C39673b hormonalInsightsAnalyticsHelper;

    public C17537a(InterfaceC14515a analytics, C39673b c39673b) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
        this.hormonalInsightsAnalyticsHelper = c39673b;
    }

    /* JADX INFO: renamed from: a */
    private final void m49835a(String category, String action, String label, String eventName, String value, Map<String, ? extends Object> otherProperties) {
        this.analytics.mo41422d(category, action, label, eventName, value, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49836b(C17537a c17537a, String str, String str2, String str3, String str4, String str5, Map map, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 16) != 0) {
            str5 = null;
        }
        if ((i13 & 32) != 0) {
            map = null;
        }
        c17537a.m49835a(str, str2, str3, str4, str5, map);
    }

    /* JADX INFO: renamed from: c */
    private final void m49837c(String phaseLabel, String source) {
        C39673b c39673b;
        C39673b c39673b2 = this.hormonalInsightsAnalyticsHelper;
        if (c39673b2 != null) {
            c39673b2.m126872M(AbstractC39672a.i.f170749a);
        }
        if (phaseLabel == null || (c39673b = this.hormonalInsightsAnalyticsHelper) == null) {
            return;
        }
        c39673b.m126872M(new AbstractC39672a.j(phaseLabel, source));
    }

    /* JADX INFO: renamed from: d */
    private final void m49838d(String source) {
        m49836b(this, "symptom_drawer", "log_symptom_drawer", null, "MCI", null, AbstractC31061c.m95645u("source", source), 20, null);
    }

    /* JADX INFO: renamed from: e */
    private final void m49839e(String tabId) {
        m49836b(this, "symptom_drawer", "click", tabId, "MCI", null, AbstractC31061c.m95645u("source", "mci"), 16, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m49840f(InterfaceC24616a.a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC24616a.e) {
            m49838d(((InterfaceC24616a.e) event).getSource());
            return;
        }
        if (event instanceof InterfaceC24616a.j) {
            m49839e(((InterfaceC24616a.j) event).getTabId());
        } else {
            if (!(event instanceof InterfaceC24616a.i)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC24616a.i iVar = (InterfaceC24616a.i) event;
            m49837c(iVar.getPhaseLabel(), iVar.getSource());
        }
    }
}
