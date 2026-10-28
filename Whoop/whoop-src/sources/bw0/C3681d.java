package bw0;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;
import z82.InterfaceC40188b;

/* JADX INFO: renamed from: bw0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\bJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\bJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R.\u0010*\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, m65681d2 = {"Lbw0/d;", "", "Lz82/b;", "analyticsManager", "<init>", "(Lz82/b;)V", "Ll83/a0;", "f", "()V", "d", "e", "c", "b", "i", "", "stageName", "selectionState", "expanded", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "trendLabel", "l", "(Ljava/lang/String;)V", "a", "sleepMetricTitleDisplay", "k", "p", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "g", "m", "Lbw0/c;", NotificationCompat.CATEGORY_EVENT, "n", "(Lbw0/c;)V", "Lz82/b;", "Lbw0/d$a;", "value", "Lbw0/d$a;", "getBaseInfo", "()Lbw0/d$a;", "o", "(Lbw0/d$a;)V", "baseInfo", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3681d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private a baseInfo;

    /* JADX INFO: renamed from: bw0.d$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\f¨\u0006\u001b"}, m65681d2 = {"Lbw0/d$a;", "", "", "sleepIdV2", "activity", "activityType", "", "isNewHome", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "Z", "e", "()Z", "core-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String sleepIdV2;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String activity;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String activityType;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final boolean isNewHome;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final String source;

        public a(String sleepIdV2, String activity, String activityType, boolean z4, String source) {
            AbstractC22676k.m65750j(sleepIdV2, "sleepIdV2");
            AbstractC22676k.m65750j(activity, "activity");
            AbstractC22676k.m65750j(activityType, "activityType");
            AbstractC22676k.m65750j(source, "source");
            this.sleepIdV2 = sleepIdV2;
            this.activity = activity;
            this.activityType = activityType;
            this.isNewHome = z4;
            this.source = source;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getActivity() {
            return this.activity;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getActivityType() {
            return this.activityType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getSleepIdV2() {
            return this.sleepIdV2;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsNewHome() {
            return this.isNewHome;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.sleepIdV2, aVar.sleepIdV2) && AbstractC22676k.m65745e(this.activity, aVar.activity) && AbstractC22676k.m65745e(this.activityType, aVar.activityType) && this.isNewHome == aVar.isNewHome && AbstractC22676k.m65745e(this.source, aVar.source);
        }

        public int hashCode() {
            return this.source.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.sleepIdV2.hashCode() * 31, 31, this.activity), 31, this.activityType), 31, this.isNewHome);
        }

        public String toString() {
            String str = this.sleepIdV2;
            String str2 = this.activity;
            String str3 = this.activityType;
            boolean z4 = this.isNewHome;
            String str4 = this.source;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("SleepDetailsBaseAnalyticsInformation(sleepIdV2=", str, ", activity=", str2, ", activityType=");
            AbstractC38963t7.m124390t(sbM32001t, str3, ", isNewHome=", z4, ", source=");
            return AbstractC25012a.m73376i(str4, ")", sbM32001t);
        }
    }

    public C3681d(InterfaceC40188b analyticsManager) {
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        this.analyticsManager = analyticsManager;
    }

    /* JADX INFO: renamed from: a */
    private final void m11420a() {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Navigation", "Close", "X", "Navigation - Close Activity", AbstractC25247g0.m73990Y(new C23465k("activityIDV2", aVar.getSleepIdV2()), new C23465k("activity", aVar.getActivity()), new C23465k("type", aVar.getActivityType()), new C23465k("object", "Activity")));
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m11421b() {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Edit Activities", "Cancel Edit Activity", null, "Activity - Edit - Cancel", AbstractC31061c.m95645u("activity", aVar.getActivity()));
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m11422c() {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Edit Activities", "Confirm", null, "Activity - Delete - Confirm", AbstractC31061c.m95645u("activity", aVar.getActivity()));
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m11423d() {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Edit Activities", "Cancel Edit Activity", null, "Activity - Edit - Cancel", AbstractC31061c.m95645u("activity", aVar.getActivityType()));
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m11424e() {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Edit Activities", "Delete", null, "Activity - Delete", AbstractC31061c.m95645u("activity", aVar.getActivityType()));
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m11425f() {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Edit Activities", "Edit", null, "Activity - Edit", AbstractC31061c.m95645u("activity", aVar.getActivityType()));
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m11426g() {
        if (this.baseInfo != null) {
            this.analyticsManager.mo41424f("Nap to Sleep", "Cancel", "", "Sleep");
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m11427h() {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Activity Details", "Confirm", "Convert", "Activity Details - Confirm Nap To Sleep Conversion", AbstractC25247g0.m73990Y(new C23465k("object", "Nap To Sleep Conversion"), new C23465k("activity", aVar.getActivityType())));
        }
    }

    /* JADX INFO: renamed from: i */
    private final void m11428i() {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Activity", "Open", null, "Activity - Open", AbstractC25247g0.m73990Y(new C23465k("activityIDV2", aVar.getSleepIdV2()), new C23465k("activity", aVar.getActivity()), new C23465k("type", aVar.getActivityType()), new C23465k("Source", aVar.getSource()), new C23465k("new_home", Boolean.valueOf(aVar.getIsNewHome()))));
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m11429j(String stageName, String selectionState, String expanded) {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Activity", "Open", stageName, "Activity - Press Horizontal Bar Graph", AbstractC25247g0.m73990Y(new C23465k("activityIDV2", aVar.getSleepIdV2()), new C23465k("activity", aVar.getActivity()), new C23465k("type", aVar.getActivityType()), new C23465k("state", selectionState), new C23465k(ProfileAnalyticsKt.VIEW, expanded), new C23465k("object", "Horizontal Bar Graph")));
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m11430k(String sleepMetricTitleDisplay) {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Activity", "Open", sleepMetricTitleDisplay, "Activity - Press Trend Tooltip", AbstractC25247g0.m73990Y(new C23465k("activityIDV2", aVar.getSleepIdV2()), new C23465k("activity", aVar.getActivity()), new C23465k("type", aVar.getActivityType()), new C23465k("object", "Session Metric")));
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m11431l(String trendLabel) {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Activity", "Open", trendLabel, "Activity - Press Trend Tooltip", AbstractC25247g0.m73990Y(new C23465k("activityIDV2", aVar.getSleepIdV2()), new C23465k("activity", aVar.getActivity()), new C23465k("type", aVar.getActivityType()), new C23465k("object", "Trend Tooltip")));
        }
    }

    /* JADX INFO: renamed from: m */
    private final void m11432m() {
        a aVar = this.baseInfo;
        if (aVar != null) {
            Map<String, ? extends Object> mapM95645u = AbstractC31061c.m95645u("type", aVar.getActivityType());
            InterfaceC40188b interfaceC40188b = this.analyticsManager;
            a aVar2 = this.baseInfo;
            interfaceC40188b.mo41428k(aVar2 != null ? aVar2.getActivity() : null, "Press", "Activity Details", "Data Scrubbing", mapM95645u);
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m11433p() {
        a aVar = this.baseInfo;
        if (aVar != null) {
            this.analyticsManager.mo41428k("Activity", "Press", null, "Activity - Press More", AbstractC25247g0.m73990Y(new C23465k("activityIDV2", aVar.getSleepIdV2()), new C23465k("activity", aVar.getActivity()), new C23465k("type", aVar.getActivityType())));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m11434n(AbstractC3680c event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC3680c.m) {
            AbstractC3680c.m mVar = (AbstractC3680c.m) event;
            m11429j(mVar.getStageName(), mVar.getIsSelected() ? "selected" : "unselected", mVar.getIsExpanded() ? "expanded" : "collapsed");
            return;
        }
        if (event instanceof AbstractC3680c.k) {
            m11431l(((AbstractC3680c.k) event).getTrendLabel());
            return;
        }
        if (event.equals(AbstractC3680c.a.f15000a)) {
            m11420a();
            return;
        }
        if (event.equals(AbstractC3680c.h.f15007a)) {
            m11433p();
            return;
        }
        if (event instanceof AbstractC3680c.g) {
            m11430k(((AbstractC3680c.g) event).getSleepMetricTitleDisplay());
            return;
        }
        if (event.equals(AbstractC3680c.b.f15001a)) {
            m11421b();
            return;
        }
        if (event.equals(AbstractC3680c.c.f15002a)) {
            m11422c();
            return;
        }
        if (event.equals(AbstractC3680c.d.f15003a)) {
            m11424e();
            return;
        }
        if (event.equals(AbstractC3680c.e.f15004a)) {
            m11423d();
            return;
        }
        if (event.equals(AbstractC3680c.f.f15005a)) {
            m11425f();
            return;
        }
        if (event.equals(AbstractC3680c.i.f15008a)) {
            m11426g();
        } else if (event.equals(AbstractC3680c.j.f15009a)) {
            m11427h();
        } else {
            if (!event.equals(AbstractC3680c.l.f15011a)) {
                throw new NoWhenBranchMatchedException();
            }
            m11432m();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m11435o(a aVar) {
        if (AbstractC22676k.m65745e(this.baseInfo, aVar)) {
            return;
        }
        this.baseInfo = aVar;
        if (aVar != null) {
            m11428i();
        }
    }
}
