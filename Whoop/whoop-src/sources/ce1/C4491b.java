package ce1;

import androidx.core.app.NotificationCompat;
import c62.C4273a;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ce1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ?\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u00162\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lce1/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()V", "Lce1/a$a;", NotificationCompat.CATEGORY_EVENT, "f", "(Lce1/a$a;)V", "Lce1/a$b;", "g", "(Lce1/a$b;)V", "Lce1/a$d;", "j", "(Lce1/a$d;)V", "Lce1/a$e;", "k", "(Lce1/a$e;)V", "", "eventName", "action", "", "Lce1/c;", "activities", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "label", "", "properties", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Lce1/a;", "i", "(Lce1/a;)V", "a", "Lfi0/a;", "b", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4491b {

    /* JADX INFO: renamed from: c */
    public static final int f18089c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C4491b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: c */
    private final void m14062c(String eventName, String action, List<C4492c> activities) {
        for (C4492c c4492c : activities) {
            m14063d(eventName, action, "bulk delete activities", AbstractC25247g0.m73990Y(new C23465k("activity", c4492c.getActivityName()), new C23465k("activity_id", c4492c.getActivityV2Id())));
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m14063d(String eventName, String action, String label, Map<String, ? extends Object> properties) {
        this.analytics.mo41428k("Activity, Edit Activities", action, label, eventName, AbstractC25247g0.m73995d0(AbstractC25247g0.m73989X(new C23465k(HMSTrackSource.SCREEN, "overview")), properties));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m14064e(C4491b c4491b, String str, String str2, String str3, Map map, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str3 = "";
        }
        if ((i13 & 8) != 0) {
            map = C25272z.f99163w;
        }
        c4491b.m14063d(str, str2, str3, map);
    }

    /* JADX INFO: renamed from: f */
    private final void m14065f(InterfaceC4490a.a event) {
        m14062c("Activity - Delete", "Delete", event.m14056a());
    }

    /* JADX INFO: renamed from: g */
    private final void m14066g(InterfaceC4490a.b event) {
        m14062c("Activity - Delete - Confirm", "Confirm", event.m14057a());
    }

    /* JADX INFO: renamed from: h */
    private final void m14067h() {
        m14064e(this, "Activity - Edit", "Edit", "bulk edit activities", null, 8, null);
    }

    /* JADX INFO: renamed from: j */
    private final void m14068j(InterfaceC4490a.d event) {
        m14063d("Activity - Merge", "Merge", "merge activities", AbstractC25247g0.m73989X(new C23465k("num_activities_merged", Integer.valueOf(event.m14058a().size()))));
    }

    /* JADX INFO: renamed from: k */
    private final void m14069k(InterfaceC4490a.e event) {
        m14063d("Activity - Merge - Confirm", "Merge Confirm", AbstractC25265s.m74110N0(event.m14059a(), ", ", null, null, new C4273a(5), 30), AbstractC25247g0.m73990Y(new C23465k("num_activities_merged", Integer.valueOf(event.m14059a().size())), new C23465k("activity_id", AbstractC25265s.m74110N0(event.m14059a(), ", ", null, null, new C4273a(6), 30))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final CharSequence m14070l(C4492c it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getActivityName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final CharSequence m14071m(C4492c it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getActivityV2Id();
    }

    /* JADX INFO: renamed from: i */
    public final void m14072i(InterfaceC4490a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC4490a.c) {
            m14067h();
            return;
        }
        if (event instanceof InterfaceC4490a.a) {
            m14065f((InterfaceC4490a.a) event);
            return;
        }
        if (event instanceof InterfaceC4490a.b) {
            m14066g((InterfaceC4490a.b) event);
        } else if (event instanceof InterfaceC4490a.d) {
            m14068j((InterfaceC4490a.d) event);
        } else {
            if (!(event instanceof InterfaceC4490a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            m14069k((InterfaceC4490a.e) event);
        }
    }
}
