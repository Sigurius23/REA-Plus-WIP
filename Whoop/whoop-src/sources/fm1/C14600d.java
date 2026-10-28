package fm1;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.LocalDate;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xl1.EnumC38451a;

/* JADX INFO: renamed from: fm1.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b1\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b3\u0010/R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b,\u0010/R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b(\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b4\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b5\u0010DR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\b:\u0010/R\u0017\u0010\u0016\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\b6\u00109R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bF\u00100\u001a\u0004\bB\u0010!R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bE\u0010IR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b;\u0010LR\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010LR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006S"}, m65681d2 = {"Lfm1/d;", "", "", "cycleId", "Ljava/time/LocalDate;", "currentDay", "", "currentDayDisplay", "previousCycleStartDay", "previousCycleEndDay", "currentCycleStartDay", "currentCycleEndDay", "", "hasCycle", "hasRecovery", "Lfm1/k;", "userMetaData", "Lfm1/l;", "whoopLiveMetaData", "Lfm1/e;", "journalMeta", "nextCycleStartDay", "multiDayCycle", "sleepState", "isGDCFlow", "", "notificationAnalytics", "experimentIds", "Lxl1/a;", "displayCycleState", "<init>", "(JLjava/time/LocalDate;Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;ZZLfm1/k;Lfm1/l;Lfm1/e;Ljava/time/LocalDate;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lxl1/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "e", "()J", "b", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "Ljava/lang/String;", "d", "k", "getPreviousCycleEndDay", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Z", "getHasCycle", "()Z", "i", "j", "Lfm1/k;", "getUserMetaData", "()Lfm1/k;", "Lfm1/l;", "m", "()Lfm1/l;", "l", "Lfm1/e;", "()Lfm1/e;", "n", "o", "p", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "q", "Ljava/util/List;", "()Ljava/util/List;", "r", "getExperimentIds", "s", "Lxl1/a;", "getDisplayCycleState", "()Lxl1/a;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14600d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long cycleId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final LocalDate currentDay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String currentDayDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LocalDate previousCycleStartDay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final LocalDate previousCycleEndDay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final LocalDate currentCycleStartDay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final LocalDate currentCycleEndDay;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean hasCycle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean hasRecovery;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C14607k userMetaData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C14608l whoopLiveMetaData;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C14601e journalMeta;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final LocalDate nextCycleStartDay;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final boolean multiDayCycle;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String sleepState;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final Boolean isGDCFlow;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final List<String> notificationAnalytics;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final List<String> experimentIds;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final EnumC38451a displayCycleState;

    public C14600d(long j7, LocalDate currentDay, String currentDayDisplay, LocalDate previousCycleStartDay, LocalDate previousCycleEndDay, LocalDate currentCycleStartDay, LocalDate currentCycleEndDay, boolean z4, boolean z13, C14607k userMetaData, C14608l whoopLiveMetaData, C14601e journalMeta, LocalDate nextCycleStartDay, boolean z14, String str, Boolean bool, List<String> notificationAnalytics, List<String> list, EnumC38451a displayCycleState) {
        AbstractC22676k.m65750j(currentDay, "currentDay");
        AbstractC22676k.m65750j(currentDayDisplay, "currentDayDisplay");
        AbstractC22676k.m65750j(previousCycleStartDay, "previousCycleStartDay");
        AbstractC22676k.m65750j(previousCycleEndDay, "previousCycleEndDay");
        AbstractC22676k.m65750j(currentCycleStartDay, "currentCycleStartDay");
        AbstractC22676k.m65750j(currentCycleEndDay, "currentCycleEndDay");
        AbstractC22676k.m65750j(userMetaData, "userMetaData");
        AbstractC22676k.m65750j(whoopLiveMetaData, "whoopLiveMetaData");
        AbstractC22676k.m65750j(journalMeta, "journalMeta");
        AbstractC22676k.m65750j(nextCycleStartDay, "nextCycleStartDay");
        AbstractC22676k.m65750j(notificationAnalytics, "notificationAnalytics");
        AbstractC22676k.m65750j(displayCycleState, "displayCycleState");
        this.cycleId = j7;
        this.currentDay = currentDay;
        this.currentDayDisplay = currentDayDisplay;
        this.previousCycleStartDay = previousCycleStartDay;
        this.previousCycleEndDay = previousCycleEndDay;
        this.currentCycleStartDay = currentCycleStartDay;
        this.currentCycleEndDay = currentCycleEndDay;
        this.hasCycle = z4;
        this.hasRecovery = z13;
        this.userMetaData = userMetaData;
        this.whoopLiveMetaData = whoopLiveMetaData;
        this.journalMeta = journalMeta;
        this.nextCycleStartDay = nextCycleStartDay;
        this.multiDayCycle = z14;
        this.sleepState = str;
        this.isGDCFlow = bool;
        this.notificationAnalytics = notificationAnalytics;
        this.experimentIds = list;
        this.displayCycleState = displayCycleState;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getCurrentCycleEndDay() {
        return this.currentCycleEndDay;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getCurrentCycleStartDay() {
        return this.currentCycleStartDay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getCurrentDay() {
        return this.currentDay;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCurrentDayDisplay() {
        return this.currentDayDisplay;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getCycleId() {
        return this.cycleId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14600d)) {
            return false;
        }
        C14600d c14600d = (C14600d) other;
        return this.cycleId == c14600d.cycleId && AbstractC22676k.m65745e(this.currentDay, c14600d.currentDay) && AbstractC22676k.m65745e(this.currentDayDisplay, c14600d.currentDayDisplay) && AbstractC22676k.m65745e(this.previousCycleStartDay, c14600d.previousCycleStartDay) && AbstractC22676k.m65745e(this.previousCycleEndDay, c14600d.previousCycleEndDay) && AbstractC22676k.m65745e(this.currentCycleStartDay, c14600d.currentCycleStartDay) && AbstractC22676k.m65745e(this.currentCycleEndDay, c14600d.currentCycleEndDay) && this.hasCycle == c14600d.hasCycle && this.hasRecovery == c14600d.hasRecovery && AbstractC22676k.m65745e(this.userMetaData, c14600d.userMetaData) && AbstractC22676k.m65745e(this.whoopLiveMetaData, c14600d.whoopLiveMetaData) && AbstractC22676k.m65745e(this.journalMeta, c14600d.journalMeta) && AbstractC22676k.m65745e(this.nextCycleStartDay, c14600d.nextCycleStartDay) && this.multiDayCycle == c14600d.multiDayCycle && AbstractC22676k.m65745e(this.sleepState, c14600d.sleepState) && AbstractC22676k.m65745e(this.isGDCFlow, c14600d.isGDCFlow) && AbstractC22676k.m65745e(this.notificationAnalytics, c14600d.notificationAnalytics) && AbstractC22676k.m65745e(this.experimentIds, c14600d.experimentIds) && this.displayCycleState == c14600d.displayCycleState;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getHasRecovery() {
        return this.hasRecovery;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C14601e getJournalMeta() {
        return this.journalMeta;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getMultiDayCycle() {
        return this.multiDayCycle;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC13673n.m38558e(this.nextCycleStartDay, (this.journalMeta.hashCode() + ((this.whoopLiveMetaData.hashCode() + ((this.userMetaData.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC13673n.m38558e(this.currentCycleEndDay, AbstractC13673n.m38558e(this.currentCycleStartDay, AbstractC13673n.m38558e(this.previousCycleEndDay, AbstractC13673n.m38558e(this.previousCycleStartDay, AbstractC11266d.m30450d(AbstractC13673n.m38558e(this.currentDay, Long.hashCode(this.cycleId) * 31, 31), 31, this.currentDayDisplay), 31), 31), 31), 31), 31, this.hasCycle), 31, this.hasRecovery)) * 31)) * 31)) * 31, 31), 31, this.multiDayCycle);
        String str = this.sleepState;
        int iHashCode = (iM8289b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isGDCFlow;
        int iM31983b = AbstractC11895b.m31983b((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.notificationAnalytics);
        List<String> list = this.experimentIds;
        return this.displayCycleState.hashCode() + ((iM31983b + (list != null ? list.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final LocalDate getNextCycleStartDay() {
        return this.nextCycleStartDay;
    }

    /* JADX INFO: renamed from: j */
    public final List<String> m41779j() {
        return this.notificationAnalytics;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final LocalDate getPreviousCycleStartDay() {
        return this.previousCycleStartDay;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getSleepState() {
        return this.sleepState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C14608l getWhoopLiveMetaData() {
        return this.whoopLiveMetaData;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Boolean getIsGDCFlow() {
        return this.isGDCFlow;
    }

    public String toString() {
        return "HomeMetaData(cycleId=" + this.cycleId + ", currentDay=" + this.currentDay + ", currentDayDisplay=" + this.currentDayDisplay + ", previousCycleStartDay=" + this.previousCycleStartDay + ", previousCycleEndDay=" + this.previousCycleEndDay + ", currentCycleStartDay=" + this.currentCycleStartDay + ", currentCycleEndDay=" + this.currentCycleEndDay + ", hasCycle=" + this.hasCycle + ", hasRecovery=" + this.hasRecovery + ", userMetaData=" + this.userMetaData + ", whoopLiveMetaData=" + this.whoopLiveMetaData + ", journalMeta=" + this.journalMeta + ", nextCycleStartDay=" + this.nextCycleStartDay + ", multiDayCycle=" + this.multiDayCycle + ", sleepState=" + this.sleepState + ", isGDCFlow=" + this.isGDCFlow + ", notificationAnalytics=" + this.notificationAnalytics + ", experimentIds=" + this.experimentIds + ", displayCycleState=" + this.displayCycleState + ")";
    }
}
