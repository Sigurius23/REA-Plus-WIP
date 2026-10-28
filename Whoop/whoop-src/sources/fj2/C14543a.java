package fj2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: fj2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010$\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0018J!\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0015J\u0015\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0018J\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0018J\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u0018J\u0015\u0010!\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\u0018J-\u0010$\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010\u0011J\u0015\u0010%\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b%\u0010\u0018J\u0015\u0010&\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u0018J\u0015\u0010'\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0018J\u0015\u0010(\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b(\u0010\u0018J\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\u001aJ\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010\u001aJ\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010\u001aJ\u0015\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0004¢\u0006\u0004\b-\u0010\u0018J\r\u0010.\u001a\u00020\n¢\u0006\u0004\b.\u0010\u001aJ\r\u0010/\u001a\u00020\n¢\u0006\u0004\b/\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b4\u00105R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00107¨\u00069"}, m65681d2 = {"Lfj2/a;", "", "Lz82/b;", "analyticsManager", "", "loadingId", "<init>", "(Lz82/b;Ljava/lang/String;)V", "", "isCurrentTwelve", "Ll83/a0;", "f", "(Z)V", "stressLabel", "stressScore", "source", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "titleOfTile", "tileNumber", "u", "(Ljava/lang/String;Ljava/lang/String;)V", "maxScrollDepth", "k", "(Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()V", "d", "j", "interventionType", "m", "n", "x", "e", "speedSetting", "cycleCount", "p", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "o", "g", "s", "r", "i", "t", "dateSelected", "c", "a", "b", "Lz82/b;", "getAnalyticsManager", "()Lz82/b;", "Ljava/lang/String;", "getLoadingId", "()Ljava/lang/String;", "", "Ljava/util/Map;", "loadingIdMap", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14543a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String loadingId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, String> loadingIdMap;

    public C14543a(InterfaceC40188b analyticsManager, String loadingId) {
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(loadingId, "loadingId");
        this.analyticsManager = analyticsManager;
        this.loadingId = loadingId;
        this.loadingIdMap = AbstractC31061c.m95645u("loading_id", loadingId);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m41532l(C14543a c14543a, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "";
        }
        c14543a.m41544k(str);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m41533q(C14543a c14543a, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        c14543a.m41548p(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final void m41534a() {
        this.analyticsManager.mo41428k("Activity Details", "Open", "Activity Details", "Activity Details", AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("Source", "Stress Monitor"), this.loadingIdMap));
    }

    /* JADX INFO: renamed from: b */
    public final void m41535b() {
        this.analyticsManager.mo41428k("Expand graph window", "Press", "Stress Monitor Change View", "Stress Monitor", AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("Source", "Stress Monitor"), this.loadingIdMap));
    }

    /* JADX INFO: renamed from: c */
    public final void m41536c(String dateSelected) {
        AbstractC22676k.m65750j(dateSelected, "dateSelected");
        this.analyticsManager.mo41428k("Navigation", "Select", dateSelected, "Navigation - Select Calendar Date", AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("Source", "Stress Monitor"), this.loadingIdMap));
    }

    /* JADX INFO: renamed from: d */
    public final void m41537d(String maxScrollDepth) {
        AbstractC22676k.m65750j(maxScrollDepth, "maxScrollDepth");
        this.analyticsManager.mo41422d("Stress Monitor", "Close", "", "Explainer Page", maxScrollDepth, this.loadingIdMap);
    }

    /* JADX INFO: renamed from: e */
    public final void m41538e(String interventionType) {
        AbstractC22676k.m65750j(interventionType, "interventionType");
        this.analyticsManager.mo41428k("Guided Sessions", "Close Video", interventionType, "Recovery Session", this.loadingIdMap);
    }

    /* JADX INFO: renamed from: f */
    public final void m41539f(boolean isCurrentTwelve) {
        this.analyticsManager.mo41422d("Stress Monitor", "Press", "Stress Monitor", "Data Scrubbing", "", AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("Time Period", isCurrentTwelve ? "Current Twelve" : "Previous Twelve"), this.loadingIdMap));
    }

    /* JADX INFO: renamed from: g */
    public final void m41540g(String interventionType) {
        AbstractC22676k.m65750j(interventionType, "interventionType");
        this.analyticsManager.mo41428k("Guided Sessions", "Discard", interventionType, "Recovery Session", this.loadingIdMap);
    }

    /* JADX INFO: renamed from: h */
    public final void m41541h(String interventionType) {
        AbstractC22676k.m65750j(interventionType, "interventionType");
        this.analyticsManager.mo41428k("Guided Sessions", "End", interventionType, "Recovery Session", this.loadingIdMap);
    }

    /* JADX INFO: renamed from: i */
    public final void m41542i() {
        this.analyticsManager.mo41422d("Stress Monitor", "Force Sync Complete", null, "Stress Monitor", null, this.loadingIdMap);
    }

    /* JADX INFO: renamed from: j */
    public final void m41543j(String titleOfTile, String tileNumber) {
        AbstractC22676k.m65750j(titleOfTile, "titleOfTile");
        AbstractC22676k.m65750j(tileNumber, "tileNumber");
        this.analyticsManager.mo41422d("Stress Monitor", "TAP", titleOfTile, "Education Tile", tileNumber, this.loadingIdMap);
    }

    /* JADX INFO: renamed from: k */
    public final void m41544k(String maxScrollDepth) {
        AbstractC22676k.m65750j(maxScrollDepth, "maxScrollDepth");
        this.analyticsManager.mo41422d("Stress Monitor", "Dismiss", "", "Onboarding Tile", maxScrollDepth, this.loadingIdMap);
    }

    /* JADX INFO: renamed from: m */
    public final void m41545m(String interventionType) {
        AbstractC22676k.m65750j(interventionType, "interventionType");
        this.analyticsManager.mo41428k("Guided Sessions", "Open", interventionType, "Recovery Session", this.loadingIdMap);
    }

    /* JADX INFO: renamed from: n */
    public final void m41546n(String interventionType) {
        AbstractC22676k.m65750j(interventionType, "interventionType");
        this.analyticsManager.mo41428k("Guided Sessions", "Open Video", interventionType, "Recovery Session", this.loadingIdMap);
    }

    /* JADX INFO: renamed from: o */
    public final void m41547o(String interventionType) {
        AbstractC22676k.m65750j(interventionType, "interventionType");
        this.analyticsManager.mo41428k("Guided Sessions", "Save", interventionType, "Recovery Session", this.loadingIdMap);
    }

    /* JADX INFO: renamed from: p */
    public final void m41548p(String interventionType, String speedSetting, String cycleCount) {
        AbstractC22676k.m65750j(interventionType, "interventionType");
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("speed_setting", speedSetting), new C23465k("cycle_count_setting", cycleCount));
        if (speedSetting == null && cycleCount == null) {
            mapM73990Y = null;
        }
        this.analyticsManager.mo41428k("Guided Sessions", "Start", interventionType, "Recovery Session", mapM73990Y != null ? AbstractC25247g0.m73995d0(mapM73990Y, this.loadingIdMap) : this.loadingIdMap);
    }

    /* JADX INFO: renamed from: r */
    public final void m41549r() {
        this.analyticsManager.mo41422d("Stress Monitor", "Score Update Fail", null, "Stress Monitor", null, this.loadingIdMap);
    }

    /* JADX INFO: renamed from: s */
    public final void m41550s(String stressScore) {
        AbstractC22676k.m65750j(stressScore, "stressScore");
        this.analyticsManager.mo41422d("Stress Monitor", "Score Update Success", null, "Stress Monitor", stressScore, this.loadingIdMap);
    }

    /* JADX INFO: renamed from: t */
    public final void m41551t() {
        this.analyticsManager.mo41428k("Navigation", "View", "Stress", "Navigation - View Calendar Date Selector", AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("Source", "Stress Monitor"), this.loadingIdMap));
    }

    /* JADX INFO: renamed from: u */
    public final void m41552u(String titleOfTile, String tileNumber) {
        AbstractC22676k.m65750j(titleOfTile, "titleOfTile");
        AbstractC22676k.m65750j(tileNumber, "tileNumber");
        this.analyticsManager.mo41422d("Stress Monitor", "TAP", titleOfTile, "Onboarding Tile", tileNumber, this.loadingIdMap);
    }

    /* JADX INFO: renamed from: v */
    public final void m41553v(String stressLabel, String stressScore, String source) {
        AbstractC22676k.m65750j(stressLabel, "stressLabel");
        AbstractC22676k.m65750j(stressScore, "stressScore");
        AbstractC22676k.m65750j(source, "source");
        this.analyticsManager.mo41422d("Stress Monitor", "Open", stressLabel, "Stress Monitor", stressScore, AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("source", source), this.loadingIdMap));
    }

    /* JADX INFO: renamed from: w */
    public final void m41554w() {
        this.analyticsManager.mo41428k("Stress Monitor", "Open", "", "Explainer Page", this.loadingIdMap);
    }

    /* JADX INFO: renamed from: x */
    public final void m41555x(String interventionType) {
        AbstractC22676k.m65750j(interventionType, "interventionType");
        this.analyticsManager.mo41428k("Guided Sessions", "Viewed Full Video", interventionType, "Recovery Session", this.loadingIdMap);
    }
}
