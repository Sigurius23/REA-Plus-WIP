package c61;

import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.util.LinkedHashMap;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: c61.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0003\u000b\u0015\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, m65681d2 = {"Lc61/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "trendName", "Lc61/a$c;", AttachmentExtensionsKt.EXTRA_DURATION, "Ll83/a0;", "b", "(Ljava/lang/String;Lc61/a$c;)V", "category", "Lc61/a$b;", "label", "", "properties", "a", "(Ljava/lang/String;Lc61/a$b;Ljava/util/Map;)V", "Lfi0/a;", "c", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4272a {

    /* JADX INFO: renamed from: c */
    public static final int f17352c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: c61.a$b */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m65681d2 = {"Lc61/a$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "ACTIVITY_DETAILS", "TREND_DETAILS", "STRESS_MONITOR", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        ACTIVITY_DETAILS("Activity Details"),
        TREND_DETAILS("Trend Details"),
        STRESS_MONITOR("Stress Monitor");

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String value;

        b(String str) {
            this.value = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: c61.a$c */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lc61/a$c;", "", "", "value", "code", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getCode", "WEEK", "MONTH", "SIX_MONTH", "ALL", "NONE", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum c {
        WEEK("Week", "W"),
        MONTH("Month", "M"),
        SIX_MONTH("6 Month", "6M"),
        ALL("All", "ALL"),
        NONE("None", "NONE");

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String code;
        private final String value;

        c(String str, String str2) {
            this.value = str;
            this.code = str2;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public C4272a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m13309a(String category, b label, Map<String, ? extends Object> properties) {
        AbstractC22676k.m65750j(category, "category");
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(properties, "properties");
        this.analytics.mo41428k(category, "Press", label.getValue(), "Data Scrubbing", properties);
    }

    /* JADX INFO: renamed from: b */
    public final void m13310b(String trendName, c duration) {
        AbstractC22676k.m65750j(trendName, "trendName");
        AbstractC22676k.m65750j(duration, "duration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Time Period", duration.getValue());
        m13309a(trendName, b.TREND_DETAILS, linkedHashMap);
    }
}
