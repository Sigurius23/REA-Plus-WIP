package ze2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;
import ye2.C39479a;
import ye2.C39480b;

/* JADX INFO: renamed from: ze2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001e\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b*\u0010-R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, m65681d2 = {"Lze2/e;", "", "", "allAlarmScheduleLabelDisplay", "", "Lze2/b;", "alarmScheduleList", "Lze2/a;", "alarmScheduleFooter", "Lze2/c;", "scheduleButtonComponent", "", "isScheduleEnabled", "shouldShowOverlay", "scheduleDisabledText", "Lye2/a;", "deleteScheduleSaveSuccessModal", "deleteScheduleLoadingModal", "Lye2/b;", "deleteScheduleSaveErrorModal", "<init>", "(Ljava/lang/String;Ljava/util/List;Lze2/a;Lze2/c;ZZLjava/lang/String;Lye2/a;Lye2/a;Lye2/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAllAlarmScheduleLabelDisplay", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lze2/a;", "()Lze2/a;", "d", "Lze2/c;", "()Lze2/c;", "e", "Z", "f", "()Z", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lye2/a;", "getDeleteScheduleSaveSuccessModal", "()Lye2/a;", "i", "getDeleteScheduleLoadingModal", "j", "Lye2/b;", "getDeleteScheduleSaveErrorModal", "()Lye2/b;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C40593e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String allAlarmScheduleLabelDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<C40590b> alarmScheduleList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C40589a alarmScheduleFooter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C40591c scheduleButtonComponent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isScheduleEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final boolean shouldShowOverlay;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String scheduleDisabledText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C39479a deleteScheduleSaveSuccessModal;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C39479a deleteScheduleLoadingModal;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C39480b deleteScheduleSaveErrorModal;

    public C40593e(String allAlarmScheduleLabelDisplay, List<C40590b> alarmScheduleList, C40589a alarmScheduleFooter, C40591c scheduleButtonComponent, boolean z4, boolean z13, String scheduleDisabledText, C39479a deleteScheduleSaveSuccessModal, C39479a deleteScheduleLoadingModal, C39480b deleteScheduleSaveErrorModal) {
        AbstractC22676k.m65750j(allAlarmScheduleLabelDisplay, "allAlarmScheduleLabelDisplay");
        AbstractC22676k.m65750j(alarmScheduleList, "alarmScheduleList");
        AbstractC22676k.m65750j(alarmScheduleFooter, "alarmScheduleFooter");
        AbstractC22676k.m65750j(scheduleButtonComponent, "scheduleButtonComponent");
        AbstractC22676k.m65750j(scheduleDisabledText, "scheduleDisabledText");
        AbstractC22676k.m65750j(deleteScheduleSaveSuccessModal, "deleteScheduleSaveSuccessModal");
        AbstractC22676k.m65750j(deleteScheduleLoadingModal, "deleteScheduleLoadingModal");
        AbstractC22676k.m65750j(deleteScheduleSaveErrorModal, "deleteScheduleSaveErrorModal");
        this.allAlarmScheduleLabelDisplay = allAlarmScheduleLabelDisplay;
        this.alarmScheduleList = alarmScheduleList;
        this.alarmScheduleFooter = alarmScheduleFooter;
        this.scheduleButtonComponent = scheduleButtonComponent;
        this.isScheduleEnabled = z4;
        this.shouldShowOverlay = z13;
        this.scheduleDisabledText = scheduleDisabledText;
        this.deleteScheduleSaveSuccessModal = deleteScheduleSaveSuccessModal;
        this.deleteScheduleLoadingModal = deleteScheduleLoadingModal;
        this.deleteScheduleSaveErrorModal = deleteScheduleSaveErrorModal;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C40589a getAlarmScheduleFooter() {
        return this.alarmScheduleFooter;
    }

    /* JADX INFO: renamed from: b */
    public final List<C40590b> m131644b() {
        return this.alarmScheduleList;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C40591c getScheduleButtonComponent() {
        return this.scheduleButtonComponent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getScheduleDisabledText() {
        return this.scheduleDisabledText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getShouldShowOverlay() {
        return this.shouldShowOverlay;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C40593e)) {
            return false;
        }
        C40593e c40593e = (C40593e) other;
        return AbstractC22676k.m65745e(this.allAlarmScheduleLabelDisplay, c40593e.allAlarmScheduleLabelDisplay) && AbstractC22676k.m65745e(this.alarmScheduleList, c40593e.alarmScheduleList) && AbstractC22676k.m65745e(this.alarmScheduleFooter, c40593e.alarmScheduleFooter) && AbstractC22676k.m65745e(this.scheduleButtonComponent, c40593e.scheduleButtonComponent) && this.isScheduleEnabled == c40593e.isScheduleEnabled && this.shouldShowOverlay == c40593e.shouldShowOverlay && AbstractC22676k.m65745e(this.scheduleDisabledText, c40593e.scheduleDisabledText) && AbstractC22676k.m65745e(this.deleteScheduleSaveSuccessModal, c40593e.deleteScheduleSaveSuccessModal) && AbstractC22676k.m65745e(this.deleteScheduleLoadingModal, c40593e.deleteScheduleLoadingModal) && AbstractC22676k.m65745e(this.deleteScheduleSaveErrorModal, c40593e.deleteScheduleSaveErrorModal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsScheduleEnabled() {
        return this.isScheduleEnabled;
    }

    public int hashCode() {
        return this.deleteScheduleSaveErrorModal.hashCode() + ((this.deleteScheduleLoadingModal.hashCode() + ((this.deleteScheduleSaveSuccessModal.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.scheduleButtonComponent.hashCode() + ((this.alarmScheduleFooter.hashCode() + AbstractC11895b.m31983b(this.allAlarmScheduleLabelDisplay.hashCode() * 31, 31, this.alarmScheduleList)) * 31)) * 31, 31, this.isScheduleEnabled), 31, this.shouldShowOverlay), 31, this.scheduleDisabledText)) * 31)) * 31);
    }

    public String toString() {
        String str = this.allAlarmScheduleLabelDisplay;
        List<C40590b> list = this.alarmScheduleList;
        C40589a c40589a = this.alarmScheduleFooter;
        C40591c c40591c = this.scheduleButtonComponent;
        boolean z4 = this.isScheduleEnabled;
        boolean z13 = this.shouldShowOverlay;
        String str2 = this.scheduleDisabledText;
        C39479a c39479a = this.deleteScheduleSaveSuccessModal;
        C39479a c39479a2 = this.deleteScheduleLoadingModal;
        C39480b c39480b = this.deleteScheduleSaveErrorModal;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("SleepScheduleDomain(allAlarmScheduleLabelDisplay=", str, ", alarmScheduleList=", ", alarmScheduleFooter=", list);
        sbM94766o.append(c40589a);
        sbM94766o.append(", scheduleButtonComponent=");
        sbM94766o.append(c40591c);
        sbM94766o.append(", isScheduleEnabled=");
        AbstractC38963t7.m124392v(sbM94766o, z4, ", shouldShowOverlay=", z13, ", scheduleDisabledText=");
        sbM94766o.append(str2);
        sbM94766o.append(", deleteScheduleSaveSuccessModal=");
        sbM94766o.append(c39479a);
        sbM94766o.append(", deleteScheduleLoadingModal=");
        sbM94766o.append(c39479a2);
        sbM94766o.append(", deleteScheduleSaveErrorModal=");
        sbM94766o.append(c39480b);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }
}
