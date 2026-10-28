package aa0;

import fi0.InterfaceC14515a;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JU\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Laa0/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "", "eventName", "category", "action", "label", "", "otherProperties", "Ll83/a0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "gdcFlow", "activityName", "type", "b", "(ZLjava/lang/String;Ljava/lang/String;)V", "a", "Lfi0/a;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0591a {

    /* JADX INFO: renamed from: c */
    public static final int f2102c = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    public C0591a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: c */
    private final void m1544c(String eventName, String category, String action, String label, Map<String, ? extends Object> otherProperties) {
        this.analytics.mo41428k(category, action, label, eventName, otherProperties);
    }

    /* JADX INFO: renamed from: a */
    public final void m1545a(boolean gdcFlow, String activityName, String type) {
        AbstractC22676k.m65750j(activityName, "activityName");
        AbstractC22676k.m65750j(type, "type");
        m1544c("Add Activity - Cancel", "Recording Data", "Cancel Add Activity", activityName, AbstractC25247g0.m73990Y(new C23465k("type", type), new C23465k("GDCflow", Boolean.valueOf(gdcFlow))));
    }

    /* JADX INFO: renamed from: b */
    public final void m1546b(boolean gdcFlow, String activityName, String type) {
        AbstractC22676k.m65750j(activityName, "activityName");
        AbstractC22676k.m65750j(type, "type");
        m1544c("Add Activity - Save", "Recording Data", "Save Add Activity", activityName, AbstractC25247g0.m73990Y(new C23465k("type", type), new C23465k("GDCflow", Boolean.valueOf(gdcFlow))));
    }
}
