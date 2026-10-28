package j01;

import c41.C4118t0;
import com.whoop.navigation.C9598e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: j01.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b#\u0010\u0011R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b$\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001a\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b!\u0010(¨\u0006)"}, m65681d2 = {"Lj01/d;", "Lm91/u;", "", "title", "bedTime", "bedTimeLabel", "timeInBed", "timeInBedLabel", "wakeTime", "wakeTimeLabel", "Lc41/t0;", "alarmStatus", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc41/t0;Lcom/whoop/navigation/e;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "b", "c", "d", "f", "e", "g", "i", "j", "Lc41/t0;", "()Lc41/t0;", "Lcom/whoop/navigation/e;", "()Lcom/whoop/navigation/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21127d implements InterfaceC25312u {

    /* JADX INFO: renamed from: j */
    public static final int f80181j = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String bedTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String bedTimeLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String timeInBed;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String timeInBedLabel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String wakeTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String wakeTimeLabel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C4118t0 alarmStatus;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C9598e destination;

    public C21127d(String title, String bedTime, String bedTimeLabel, String timeInBed, String timeInBedLabel, String wakeTime, String wakeTimeLabel, C4118t0 alarmStatus, C9598e c9598e) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(bedTime, "bedTime");
        AbstractC22676k.m65750j(bedTimeLabel, "bedTimeLabel");
        AbstractC22676k.m65750j(timeInBed, "timeInBed");
        AbstractC22676k.m65750j(timeInBedLabel, "timeInBedLabel");
        AbstractC22676k.m65750j(wakeTime, "wakeTime");
        AbstractC22676k.m65750j(wakeTimeLabel, "wakeTimeLabel");
        AbstractC22676k.m65750j(alarmStatus, "alarmStatus");
        this.title = title;
        this.bedTime = bedTime;
        this.bedTimeLabel = bedTimeLabel;
        this.timeInBed = timeInBed;
        this.timeInBedLabel = timeInBedLabel;
        this.wakeTime = wakeTime;
        this.wakeTimeLabel = wakeTimeLabel;
        this.alarmStatus = alarmStatus;
        this.destination = c9598e;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C4118t0 getAlarmStatus() {
        return this.alarmStatus;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBedTime() {
        return this.bedTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBedTimeLabel() {
        return this.bedTimeLabel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21127d)) {
            return false;
        }
        C21127d c21127d = (C21127d) other;
        return AbstractC22676k.m65745e(this.title, c21127d.title) && AbstractC22676k.m65745e(this.bedTime, c21127d.bedTime) && AbstractC22676k.m65745e(this.bedTimeLabel, c21127d.bedTimeLabel) && AbstractC22676k.m65745e(this.timeInBed, c21127d.timeInBed) && AbstractC22676k.m65745e(this.timeInBedLabel, c21127d.timeInBedLabel) && AbstractC22676k.m65745e(this.wakeTime, c21127d.wakeTime) && AbstractC22676k.m65745e(this.wakeTimeLabel, c21127d.wakeTimeLabel) && AbstractC22676k.m65745e(this.alarmStatus, c21127d.alarmStatus) && AbstractC22676k.m65745e(this.destination, c21127d.destination);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTimeInBed() {
        return this.timeInBed;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTimeInBedLabel() {
        return this.timeInBedLabel;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.alarmStatus.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.bedTime), 31, this.bedTimeLabel), 31, this.timeInBed), 31, this.timeInBedLabel), 31, this.wakeTime), 31, this.wakeTimeLabel)) * 31;
        C9598e c9598e = this.destination;
        return iHashCode + (c9598e == null ? 0 : c9598e.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getWakeTime() {
        return this.wakeTime;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getWakeTimeLabel() {
        return this.wakeTimeLabel;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.bedTime;
        String str3 = this.bedTimeLabel;
        String str4 = this.timeInBed;
        String str5 = this.timeInBedLabel;
        String str6 = this.wakeTime;
        String str7 = this.wakeTimeLabel;
        C4118t0 c4118t0 = this.alarmStatus;
        C9598e c9598e = this.destination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SleepPlannerCardViewState(title=", str, ", bedTime=", str2, ", bedTimeLabel=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", timeInBed=", str4, ", timeInBedLabel=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", wakeTime=", str6, ", wakeTimeLabel=");
        sbM32001t.append(str7);
        sbM32001t.append(", alarmStatus=");
        sbM32001t.append(c4118t0);
        sbM32001t.append(", destination=");
        return AbstractC33745d.m106656o(sbM32001t, c9598e, ")");
    }
}
