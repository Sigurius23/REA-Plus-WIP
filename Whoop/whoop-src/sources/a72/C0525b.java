package a72;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: a72.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u0017\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#<B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!J#\u0010#\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b#\u0010$JW\u0010*\u001a\u00020\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\fJ\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\fJ\u0017\u0010.\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b.\u0010!J\u001f\u0010/\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u0010!J\u001f\u00102\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u00100J\u0017\u00103\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u0010!J\u001f\u00104\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u00100J\u001f\u00105\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b5\u00100J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010!J\u001f\u00107\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u00100J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\fJ\u0017\u00109\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u000eH\u0002¢\u0006\u0004\b9\u0010!J\u000f\u0010:\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010\fJ\u000f\u0010;\u001a\u00020\bH\u0002¢\u0006\u0004\b;\u0010\fJ\u0017\u0010<\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010>¨\u0006?"}, m65681d2 = {"La72/b;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "La72/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "B", "(La72/a;)V", "j", "()V", "l", "", "tagSelection", "", "index", "m", "(Ljava/lang/String;I)V", "", "dateIncrease", "c", "(Z)V", "d", "(I)V", "isLocked", "source", "v", "(ZLjava/lang/String;)V", "r", "category", "k", "(Ljava/lang/String;)V", "tag", "b", "(Ljava/lang/Integer;Ljava/lang/String;)V", "action", "label", "value", "", "otherProperties", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "s", "p", "A", "i", "(Ljava/lang/String;Ljava/lang/String;)V", "z", "g", "y", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "x", "e", "t", "u", "q", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lfi0/a;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0525b {

    /* JADX INFO: renamed from: c */
    public static final int f1819c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: a72.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"La72/b$b;", "", "", "analyticsLabel", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getAnalyticsLabel", "()Ljava/lang/String;", "Companion", "a", "SLEEP", "PERFORMANCE", "RESILIENCE", "WELLBEING", "UNKNOWN", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        SLEEP(UserState.States.SLEEP),
        PERFORMANCE("performance"),
        RESILIENCE("resilience"),
        WELLBEING("wellbeing"),
        UNKNOWN("unknown");

        private final String analyticsLabel;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a72.b$b$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"La72/b$b$a;", "", "<init>", "()V", "", "name", "La72/b$b;", "a", "(Ljava/lang/String;)La72/b$b;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: a */
            public final b m1290a(String name) {
                AbstractC22676k.m65750j(name, "name");
                try {
                    return b.valueOf(name);
                } catch (IllegalArgumentException unused) {
                    return b.UNKNOWN;
                }
            }

            private Companion() {
            }
        }

        b(String str) {
            this.analyticsLabel = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getAnalyticsLabel() {
            return this.analyticsLabel;
        }
    }

    public C0525b(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: A */
    private final void m1262A(String source) {
        m1277o(this, "onboarding", ProfileAnalyticsKt.VIEW, null, null, AbstractC31061c.m95645u("source", source), 12, null);
    }

    /* JADX INFO: renamed from: a */
    private final String m1263a(String tag) {
        return b.INSTANCE.m1290a(tag).getAnalyticsLabel();
    }

    /* JADX INFO: renamed from: b */
    private final void m1264b(Integer index, String tag) {
        m1277o(this, "education", "click", index != null ? AbstractC2875y.m8295h(index.intValue() + 1, "module") : null, null, tag != null ? AbstractC31061c.m95645u("property", tag) : null, 8, null);
    }

    /* JADX INFO: renamed from: c */
    private final void m1265c(boolean dateIncrease) {
        m1277o(this, "graph", "click", dateIncrease ? "time_period_back" : "time_period_forward", null, null, 24, null);
    }

    /* JADX INFO: renamed from: d */
    private final void m1266d(int index) {
        String str;
        if (index == 0) {
            str = "week";
        } else if (index != 1) {
            str = index != 2 ? "" : "6_month";
        } else {
            str = "month";
        }
        m1277o(this, "graph", "click", str, null, null, 24, null);
    }

    /* JADX INFO: renamed from: e */
    private final void m1267e(String source, String label) {
        m1277o(this, "onboarding", "click", label, null, AbstractC31061c.m95645u("source", source), 8, null);
    }

    /* JADX INFO: renamed from: f */
    private final void m1268f(String source, String label) {
        m1277o(this, "onboarding", "click", label, null, AbstractC31061c.m95645u("source", source), 8, null);
    }

    /* JADX INFO: renamed from: g */
    private final void m1269g(String source, String label) {
        m1277o(this, "onboarding", "click", label, null, AbstractC31061c.m95645u("source", source), 8, null);
    }

    /* JADX INFO: renamed from: h */
    private final void m1270h(String source, String label) {
        m1277o(this, "onboarding", "click", label, null, AbstractC31061c.m95645u("source", source), 8, null);
    }

    /* JADX INFO: renamed from: i */
    private final void m1271i(String source, String label) {
        m1277o(this, "onboarding", "click", label, null, AbstractC31061c.m95645u("source", source), 8, null);
    }

    /* JADX INFO: renamed from: j */
    private final void m1272j() {
        m1277o(this, "DWL", "click", "sign_up", null, null, 24, null);
    }

    /* JADX INFO: renamed from: k */
    private final void m1273k(String category) {
        m1277o(this, "wellness_headers", "click", m1263a(category), null, null, 24, null);
    }

    /* JADX INFO: renamed from: l */
    private final void m1274l() {
        m1277o(this, "wellness", "click", "view_sources", null, null, 24, null);
    }

    /* JADX INFO: renamed from: m */
    private final void m1275m(String tagSelection, int index) {
        m1277o(this, "wellness_subheaders", "click", m1263a(tagSelection), String.valueOf(index + 1), null, 16, null);
    }

    /* JADX INFO: renamed from: n */
    private final void m1276n(String category, String action, String label, String value, Map<String, ? extends Object> otherProperties) {
        this.analytics.mo41422d(category, action, label, "Sage", value, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m1277o(C0525b c0525b, String str, String str2, String str3, String str4, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
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
            map = null;
        }
        c0525b.m1276n(str, str2, str3, str4, map);
    }

    /* JADX INFO: renamed from: p */
    private final void m1278p() {
        m1277o(this, "onboarding", "finish_onboarding", null, null, AbstractC31061c.m95645u("source", "sage"), 12, null);
    }

    /* JADX INFO: renamed from: q */
    private final void m1279q() {
        m1277o(this, null, "click", "manual_entry", null, null, 25, null);
    }

    /* JADX INFO: renamed from: r */
    private final void m1280r() {
        m1277o(this, "interaction", "scrub", "graph", null, null, 24, null);
    }

    /* JADX INFO: renamed from: s */
    private final void m1281s() {
        m1277o(this, "onboarding", "start_onboarding", null, null, AbstractC31061c.m95645u("source", "sage"), 12, null);
    }

    /* JADX INFO: renamed from: t */
    private final void m1282t() {
        m1277o(this, "out_of_range", "error", null, null, null, 28, null);
    }

    /* JADX INFO: renamed from: u */
    private final void m1283u(String label) {
        m1277o(this, "out_of_range", "click", label, null, null, 24, null);
    }

    /* JADX INFO: renamed from: v */
    private final void m1284v(boolean isLocked, String source) {
        m1277o(this, null, ProfileAnalyticsKt.VIEW, isLocked ? "locked" : "entered", null, source != null ? AbstractC31061c.m95645u("source", source) : null, 9, null);
    }

    /* JADX INFO: renamed from: w */
    private final void m1285w() {
        m1277o(this, null, ProfileAnalyticsKt.VIEW, "beta_tag", null, AbstractC31061c.m95645u("source", "feature_page"), 9, null);
    }

    /* JADX INFO: renamed from: x */
    private final void m1286x(String source) {
        m1277o(this, "onboarding", ProfileAnalyticsKt.VIEW, null, null, AbstractC31061c.m95645u("source", source), 12, null);
    }

    /* JADX INFO: renamed from: y */
    private final void m1287y(String source) {
        m1277o(this, "onboarding", ProfileAnalyticsKt.VIEW, null, null, AbstractC31061c.m95645u("source", source), 12, null);
    }

    /* JADX INFO: renamed from: z */
    private final void m1288z(String source) {
        m1277o(this, "onboarding", ProfileAnalyticsKt.VIEW, null, null, AbstractC31061c.m95645u("source", source), 12, null);
    }

    /* JADX INFO: renamed from: B */
    public final void m1289B(AbstractC0524a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC0524a.a) {
            AbstractC0524a.a aVar = (AbstractC0524a.a) event;
            m1264b(aVar.getIndex(), aVar.getId());
            return;
        }
        if (event instanceof AbstractC0524a.n) {
            m1273k(((AbstractC0524a.n) event).getTagSelection());
            return;
        }
        if (event.equals(AbstractC0524a.p.f1808a)) {
            m1280r();
            return;
        }
        if (event instanceof AbstractC0524a.x) {
            AbstractC0524a.x xVar = (AbstractC0524a.x) event;
            m1284v(xVar.getIsLocked(), xVar.getSource());
            return;
        }
        if (event instanceof AbstractC0524a.d) {
            m1266d(((AbstractC0524a.d) event).getIndex());
            return;
        }
        if (event instanceof AbstractC0524a.c) {
            m1265c(((AbstractC0524a.c) event).getIsDateIncrease());
            return;
        }
        if (event instanceof AbstractC0524a.m) {
            AbstractC0524a.m mVar = (AbstractC0524a.m) event;
            m1275m(mVar.getTagSelection(), mVar.getIndex());
            return;
        }
        if (event instanceof AbstractC0524a.l) {
            m1274l();
            return;
        }
        if (event instanceof AbstractC0524a.k) {
            m1272j();
            return;
        }
        if (event.equals(AbstractC0524a.q.f1809a)) {
            m1281s();
            return;
        }
        if (event.equals(AbstractC0524a.o.f1807a)) {
            m1278p();
            return;
        }
        if (event instanceof AbstractC0524a.w) {
            m1262A(((AbstractC0524a.w) event).getSource());
            return;
        }
        if (event instanceof AbstractC0524a.j) {
            AbstractC0524a.j jVar = (AbstractC0524a.j) event;
            m1271i(jVar.getSource(), jVar.getLabel());
            return;
        }
        if (event instanceof AbstractC0524a.v) {
            m1288z(((AbstractC0524a.v) event).getSource());
            return;
        }
        if (event instanceof AbstractC0524a.i) {
            AbstractC0524a.i iVar = (AbstractC0524a.i) event;
            m1269g(iVar.getSource(), iVar.getLabel());
            return;
        }
        if (event instanceof AbstractC0524a.u) {
            m1287y(((AbstractC0524a.u) event).getSource());
            return;
        }
        if (event instanceof AbstractC0524a.h) {
            AbstractC0524a.h hVar = (AbstractC0524a.h) event;
            m1268f(hVar.getSource(), hVar.getLabel());
            return;
        }
        if (event instanceof AbstractC0524a.t) {
            m1286x(((AbstractC0524a.t) event).getSource());
            return;
        }
        if (event instanceof AbstractC0524a.g) {
            AbstractC0524a.g gVar = (AbstractC0524a.g) event;
            m1267e(gVar.getSource(), gVar.getLabel());
            return;
        }
        if (event.equals(AbstractC0524a.s.f1811a)) {
            m1282t();
            return;
        }
        if (event instanceof AbstractC0524a.b) {
            m1283u(((AbstractC0524a.b) event).getLabel());
            return;
        }
        if (event instanceof AbstractC0524a.e) {
            AbstractC0524a.e eVar = (AbstractC0524a.e) event;
            m1270h(eVar.getSource(), eVar.getLabel());
        } else if (event.equals(AbstractC0524a.f.f1793a)) {
            m1279q();
        } else {
            if (!event.equals(AbstractC0524a.r.f1810a)) {
                throw new NoWhenBranchMatchedException();
            }
            m1285w();
        }
    }
}
