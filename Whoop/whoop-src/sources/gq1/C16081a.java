package gq1;

import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import java.util.LinkedHashMap;
import live.hms.video.utils.HMSConstantsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: gq1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0014\u0016\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lgq1/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "numImpacts", "Lgq1/a$c;", "targetMetric", "source", "Ll83/a0;", "d", "(Ljava/lang/String;Lgq1/a$c;Ljava/lang/String;)V", "behaviorId", "Lgq1/a$b;", "impact", "behaviorTitle", "c", "(Ljava/lang/String;Lgq1/a$b;Ljava/lang/String;Lgq1/a$c;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Lgq1/a$c;)V", "b", "()V", "Lfi0/a;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16081a {

    /* JADX INFO: renamed from: c */
    public static final int f60860c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: gq1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m65681d2 = {"Lgq1/a$b;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "a", "COACHING_TAB", "DEEPLINK", "OVERVIEW", "IMPACTS_SUMMARY", "JOURNAL", "JOURNAL_V2", "RECOVERY_DETAILS", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum b {
        COACHING_TAB("Coaching Tab"),
        DEEPLINK("Deeplink"),
        OVERVIEW("Overview"),
        IMPACTS_SUMMARY("Impacts Summary"),
        JOURNAL("Journal"),
        JOURNAL_V2("journal"),
        RECOVERY_DETAILS("Recovery Details");

        private final String value;
        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: gq1.a$b$a, reason: from kotlin metadata */
        @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lgq1/a$b$a;", "", "<init>", "()V", "", "type", "Lgq1/a$b;", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "a", "(Ljava/lang/String;Lgq1/a$b;)Lgq1/a$b;", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0020 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:11:0x0021 A[RETURN] */
            /* JADX INFO: renamed from: a */
            public final b m45434a(String type, b bVar) {
                AbstractC22676k.m65750j(bVar, "default");
                for (b bVar2 : b.values()) {
                    if (AbstractC22676k.m65745e(bVar2.getValue(), type)) {
                        if (bVar2 == null) {
                            return bVar;
                        }
                        return bVar2;
                    }
                }
                bVar2 = null;
                if (bVar2 == null) {
                    return bVar;
                }
                return bVar2;
            }

            private Companion() {
            }
        }

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

    /* JADX INFO: renamed from: gq1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Lgq1/a$c;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "RECOVERY", "behavior-impact_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum c {
        RECOVERY("Recovery");

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
        private final String value;

        c(String str) {
            this.value = str;
        }

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public C16081a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: a */
    public final void m45430a(String behaviorId, c targetMetric) {
        AbstractC22676k.m65750j(behaviorId, "behaviorId");
        AbstractC22676k.m65750j(targetMetric, "targetMetric");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Target Metric", targetMetric.getValue());
        this.analytics.mo41422d("Behavior Details", "Close", behaviorId, "Impacts", null, linkedHashMap);
    }

    /* JADX INFO: renamed from: b */
    public final void m45431b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Source", "Impacts Summary");
        this.analytics.mo41422d(null, "Open", null, "Settings - Journal", null, linkedHashMap);
    }

    /* JADX INFO: renamed from: c */
    public final void m45432c(String behaviorId, b source, String impact, c targetMetric, String behaviorTitle) {
        AbstractC22676k.m65750j(behaviorId, "behaviorId");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(impact, "impact");
        AbstractC22676k.m65750j(targetMetric, "targetMetric");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Source", source.getValue());
        linkedHashMap.put("Target Metric", targetMetric.getValue());
        if (behaviorTitle != null) {
            linkedHashMap.put("Behavior Title", behaviorTitle);
        }
        this.analytics.mo41422d("Behavior Details", "View", behaviorId, "Impacts", impact, linkedHashMap);
    }

    /* JADX INFO: renamed from: d */
    public final void m45433d(String numImpacts, c targetMetric, String source) {
        AbstractC22676k.m65750j(numImpacts, "numImpacts");
        AbstractC22676k.m65750j(targetMetric, "targetMetric");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Target Metric", targetMetric.getValue());
        if (source != null) {
            linkedHashMap.put("Source", source);
        }
        this.analytics.mo41422d("Impacts Summary", "View", null, "Impacts", numImpacts, linkedHashMap);
    }
}
