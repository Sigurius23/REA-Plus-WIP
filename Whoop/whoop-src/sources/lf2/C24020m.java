package lf2;

import jh3.AbstractC21702c;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;

/* JADX INFO: renamed from: lf2.m */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0019\u0010\u000e¨\u0006!"}, m65681d2 = {"Llf2/m;", "", "", "bottomSheetTitle", "alarmToWakeTimeDescription", "wakeTimeSaveButton", "Lorg/joda/time/LocalTime;", "latestWakeTime", "Ly81/f;", "wakeTimeButtonColor", "helpIconLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalTime;Ly81/f;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "f", "d", "Lorg/joda/time/LocalTime;", "()Lorg/joda/time/LocalTime;", "e", "Ly81/f;", "()Ly81/f;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C24020m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String bottomSheetTitle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String alarmToWakeTimeDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String wakeTimeSaveButton;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LocalTime latestWakeTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EnumC39333f wakeTimeButtonColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String helpIconLink;

    public C24020m(String bottomSheetTitle, String alarmToWakeTimeDescription, String wakeTimeSaveButton, LocalTime latestWakeTime, EnumC39333f wakeTimeButtonColor, String helpIconLink) {
        AbstractC22676k.m65750j(bottomSheetTitle, "bottomSheetTitle");
        AbstractC22676k.m65750j(alarmToWakeTimeDescription, "alarmToWakeTimeDescription");
        AbstractC22676k.m65750j(wakeTimeSaveButton, "wakeTimeSaveButton");
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        AbstractC22676k.m65750j(wakeTimeButtonColor, "wakeTimeButtonColor");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        this.bottomSheetTitle = bottomSheetTitle;
        this.alarmToWakeTimeDescription = alarmToWakeTimeDescription;
        this.wakeTimeSaveButton = wakeTimeSaveButton;
        this.latestWakeTime = latestWakeTime;
        this.wakeTimeButtonColor = wakeTimeButtonColor;
        this.helpIconLink = helpIconLink;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAlarmToWakeTimeDescription() {
        return this.alarmToWakeTimeDescription;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalTime getLatestWakeTime() {
        return this.latestWakeTime;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final EnumC39333f getWakeTimeButtonColor() {
        return this.wakeTimeButtonColor;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C24020m)) {
            return false;
        }
        C24020m c24020m = (C24020m) other;
        return AbstractC22676k.m65745e(this.bottomSheetTitle, c24020m.bottomSheetTitle) && AbstractC22676k.m65745e(this.alarmToWakeTimeDescription, c24020m.alarmToWakeTimeDescription) && AbstractC22676k.m65745e(this.wakeTimeSaveButton, c24020m.wakeTimeSaveButton) && AbstractC22676k.m65745e(this.latestWakeTime, c24020m.latestWakeTime) && this.wakeTimeButtonColor == c24020m.wakeTimeButtonColor && AbstractC22676k.m65745e(this.helpIconLink, c24020m.helpIconLink);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getWakeTimeSaveButton() {
        return this.wakeTimeSaveButton;
    }

    public int hashCode() {
        return this.helpIconLink.hashCode() + AbstractC21702c.m61132c(this.wakeTimeButtonColor, (this.latestWakeTime.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.bottomSheetTitle.hashCode() * 31, 31, this.alarmToWakeTimeDescription), 31, this.wakeTimeSaveButton)) * 31, 31);
    }

    public String toString() {
        String str = this.bottomSheetTitle;
        String str2 = this.alarmToWakeTimeDescription;
        String str3 = this.wakeTimeSaveButton;
        LocalTime localTime = this.latestWakeTime;
        EnumC39333f enumC39333f = this.wakeTimeButtonColor;
        String str4 = this.helpIconLink;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WakeTimeViewState(bottomSheetTitle=", str, ", alarmToWakeTimeDescription=", str2, ", wakeTimeSaveButton=");
        sbM32001t.append(str3);
        sbM32001t.append(", latestWakeTime=");
        sbM32001t.append(localTime);
        sbM32001t.append(", wakeTimeButtonColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", helpIconLink=");
        sbM32001t.append(str4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
