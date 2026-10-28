package ze2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import xe2.EnumC38232a;

/* JADX INFO: renamed from: ze2.b */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b#\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b$\u0010\u0012R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b'\u0010\u0012¨\u0006*"}, m65681d2 = {"Lze2/b;", "", "Lxe2/a;", "alarmMode", "", "", "daysScheduledLabelDisplayList", "alarmModeLabelDisplay", "editLabelDisplay", "deleteLabelDisplay", "latestWakeTime", "", "alarmOn", "scheduleDaysList", "scheduleId", "<init>", "(Lxe2/a;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lxe2/a;", "()Lxe2/a;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Ljava/lang/String;", "f", "e", "g", "Z", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getScheduleDaysList", "i", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40590b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final EnumC38232a alarmMode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<String> daysScheduledLabelDisplayList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String alarmModeLabelDisplay;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String editLabelDisplay;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String deleteLabelDisplay;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String latestWakeTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean alarmOn;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<String> scheduleDaysList;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String scheduleId;

    public C40590b(EnumC38232a alarmMode, List<String> daysScheduledLabelDisplayList, String alarmModeLabelDisplay, String editLabelDisplay, String deleteLabelDisplay, String latestWakeTime, boolean z4, List<String> scheduleDaysList, String scheduleId) {
        AbstractC22676k.m65750j(alarmMode, "alarmMode");
        AbstractC22676k.m65750j(daysScheduledLabelDisplayList, "daysScheduledLabelDisplayList");
        AbstractC22676k.m65750j(alarmModeLabelDisplay, "alarmModeLabelDisplay");
        AbstractC22676k.m65750j(editLabelDisplay, "editLabelDisplay");
        AbstractC22676k.m65750j(deleteLabelDisplay, "deleteLabelDisplay");
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        AbstractC22676k.m65750j(scheduleDaysList, "scheduleDaysList");
        AbstractC22676k.m65750j(scheduleId, "scheduleId");
        this.alarmMode = alarmMode;
        this.daysScheduledLabelDisplayList = daysScheduledLabelDisplayList;
        this.alarmModeLabelDisplay = alarmModeLabelDisplay;
        this.editLabelDisplay = editLabelDisplay;
        this.deleteLabelDisplay = deleteLabelDisplay;
        this.latestWakeTime = latestWakeTime;
        this.alarmOn = z4;
        this.scheduleDaysList = scheduleDaysList;
        this.scheduleId = scheduleId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final EnumC38232a getAlarmMode() {
        return this.alarmMode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAlarmModeLabelDisplay() {
        return this.alarmModeLabelDisplay;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAlarmOn() {
        return this.alarmOn;
    }

    /* JADX INFO: renamed from: d */
    public final List<String> m131632d() {
        return this.daysScheduledLabelDisplayList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDeleteLabelDisplay() {
        return this.deleteLabelDisplay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40590b)) {
            return false;
        }
        C40590b c40590b = (C40590b) other;
        return this.alarmMode == c40590b.alarmMode && AbstractC22676k.m65745e(this.daysScheduledLabelDisplayList, c40590b.daysScheduledLabelDisplayList) && AbstractC22676k.m65745e(this.alarmModeLabelDisplay, c40590b.alarmModeLabelDisplay) && AbstractC22676k.m65745e(this.editLabelDisplay, c40590b.editLabelDisplay) && AbstractC22676k.m65745e(this.deleteLabelDisplay, c40590b.deleteLabelDisplay) && AbstractC22676k.m65745e(this.latestWakeTime, c40590b.latestWakeTime) && this.alarmOn == c40590b.alarmOn && AbstractC22676k.m65745e(this.scheduleDaysList, c40590b.scheduleDaysList) && AbstractC22676k.m65745e(this.scheduleId, c40590b.scheduleId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEditLabelDisplay() {
        return this.editLabelDisplay;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLatestWakeTime() {
        return this.latestWakeTime;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getScheduleId() {
        return this.scheduleId;
    }

    public int hashCode() {
        return this.scheduleId.hashCode() + AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b(this.alarmMode.hashCode() * 31, 31, this.daysScheduledLabelDisplayList), 31, this.alarmModeLabelDisplay), 31, this.editLabelDisplay), 31, this.deleteLabelDisplay), 31, this.latestWakeTime), 31, this.alarmOn), 31, this.scheduleDaysList);
    }

    public String toString() {
        EnumC38232a enumC38232a = this.alarmMode;
        List<String> list = this.daysScheduledLabelDisplayList;
        String str = this.alarmModeLabelDisplay;
        String str2 = this.editLabelDisplay;
        String str3 = this.deleteLabelDisplay;
        String str4 = this.latestWakeTime;
        boolean z4 = this.alarmOn;
        List<String> list2 = this.scheduleDaysList;
        String str5 = this.scheduleId;
        StringBuilder sb4 = new StringBuilder("AlarmScheduleListDomain(alarmMode=");
        sb4.append(enumC38232a);
        sb4.append(", daysScheduledLabelDisplayList=");
        sb4.append(list);
        sb4.append(", alarmModeLabelDisplay=");
        AbstractC11266d.m30444B(sb4, str, ", editLabelDisplay=", str2, ", deleteLabelDisplay=");
        AbstractC11266d.m30444B(sb4, str3, ", latestWakeTime=", str4, ", alarmOn=");
        AbstractC25012a.m73391x(", scheduleDaysList=", ", scheduleId=", sb4, list2, z4);
        return AbstractC25012a.m73376i(str5, ")", sb4);
    }
}
