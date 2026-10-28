package wd1;

import androidx.core.app.NotificationCompat;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wd1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJU\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\n2\u0006\u0010\t\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#¨\u0006$"}, m65681d2 = {"Lwd1/c;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lwd1/b;", "baseInfo", "Lwd1/a$e;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "f", "(Lwd1/b;Lwd1/a$e;)V", "", "eventName", "b", "(Lwd1/b;Ljava/lang/String;)V", "action", "", "activityList", "e", "(Lwd1/b;Ljava/lang/String;Ljava/util/List;)V", "", "a", "(Lwd1/b;)Ljava/util/Map;", "g", "(Lwd1/b;Lwd1/a$e;)Ljava/util/Map;", "category", "label", "otherProperties", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lwd1/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lwd1/a;)V", "Lfi0/a;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37166c {

    /* JADX INFO: renamed from: c */
    public static final int f158948c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C37166c(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    private final Map<String, String> m119106a(C37165b baseInfo) {
        String lowerCase = baseInfo.getActivity().toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return AbstractC25247g0.m73990Y(new C23465k("activity", lowerCase), new C23465k("GDC", baseInfo.getGdc()), new C23465k("category", baseInfo.getCategory()));
    }

    /* JADX INFO: renamed from: b */
    private final void m119107b(C37165b baseInfo, String eventName) {
        if (baseInfo != null) {
            m119109d(this, eventName, "Reviewing Data", null, null, AbstractC25247g0.m73996e0(m119106a(baseInfo), new C23465k("source", baseInfo.getSource())), 12, null);
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m119108c(String eventName, String category, String action, String label, Map<String, ? extends Object> otherProperties) {
        this.analytics.mo41428k(category, action, label, eventName, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m119109d(C37166c c37166c, String str, String str2, String str3, String str4, Map map, int i13, Object obj) {
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
            map = null;
        }
        c37166c.m119108c(str, str2, str3, str4, map);
    }

    /* JADX INFO: renamed from: e */
    private final void m119110e(C37165b baseInfo, String action, List<String> activityList) {
        if (baseInfo != null) {
            m119109d(this, "Activity - Edit - Save", "Overlapping Activity Error", action, null, AbstractC25247g0.m73996e0(m119106a(baseInfo), new C23465k("overlap", activityList)), 8, null);
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m119111f(C37165b baseInfo, AbstractC37164a.e event) {
        if (baseInfo != null) {
            m119109d(this, "Activity - Edit - Save", "Reviewing Data", null, null, m119112g(baseInfo, event), 12, null);
        }
    }

    /* JADX INFO: renamed from: g */
    private final Map<String, String> m119112g(C37165b baseInfo, AbstractC37164a.e event) {
        return AbstractC25247g0.m73995d0(m119106a(baseInfo), AbstractC25247g0.m73990Y(new C23465k("previous.startTime", event.getPreviousStartTime()), new C23465k("previous.endTime", event.getPreviousEndTime()), new C23465k("new.startTime", event.getNewStartTime()), new C23465k("new.endTime", event.getNewEndTime()), new C23465k("activity_id", event.getActivityId())));
    }

    /* JADX INFO: renamed from: h */
    public final void m119113h(AbstractC37164a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC37164a.c) {
            m119107b(((AbstractC37164a.c) event).getBaseInfo(), "Activity - Edit");
            return;
        }
        if (event instanceof AbstractC37164a.e) {
            AbstractC37164a.e eVar = (AbstractC37164a.e) event;
            m119111f(eVar.getBaseInfo(), eVar);
            return;
        }
        if (event instanceof AbstractC37164a.a) {
            m119107b(((AbstractC37164a.a) event).getBaseInfo(), "Activity - Edit - Cancel");
            return;
        }
        if (event instanceof AbstractC37164a.d) {
            AbstractC37164a.d dVar = (AbstractC37164a.d) event;
            m119110e(dVar.getBaseInfo(), "View", dVar.m119092a());
        } else if (event instanceof AbstractC37164a.b) {
            AbstractC37164a.b bVar = (AbstractC37164a.b) event;
            m119110e(bVar.getBaseInfo(), "Dismiss", bVar.m119089a());
        } else {
            if (!(event instanceof AbstractC37164a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC37164a.f fVar = (AbstractC37164a.f) event;
            m119110e(fVar.getBaseInfo(), "Accept", fVar.m119100a());
        }
    }
}
