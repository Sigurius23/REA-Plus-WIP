package af2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: af2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJL\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001d\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001b\u0010\u000f¨\u0006!"}, m65681d2 = {"Laf2/c;", "", "", "wakeTimeLabelDisplay", "wakeTimeSaveButtonLabelDisplay", "sleepGoalWakeTimeTemplate", "inTheGreenWakeTimeTemplate", "Lorg/joda/time/LocalTime;", "latestWakeTime", "helpIconLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalTime;Ljava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalTime;Ljava/lang/String;)Laf2/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "g", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "c", "f", "d", "e", "Lorg/joda/time/LocalTime;", "()Lorg/joda/time/LocalTime;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C0813c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String wakeTimeLabelDisplay;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String wakeTimeSaveButtonLabelDisplay;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String sleepGoalWakeTimeTemplate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String inTheGreenWakeTimeTemplate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final LocalTime latestWakeTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String helpIconLink;

    public C0813c(String wakeTimeLabelDisplay, String wakeTimeSaveButtonLabelDisplay, String sleepGoalWakeTimeTemplate, String inTheGreenWakeTimeTemplate, LocalTime latestWakeTime, String helpIconLink) {
        AbstractC22676k.m65750j(wakeTimeLabelDisplay, "wakeTimeLabelDisplay");
        AbstractC22676k.m65750j(wakeTimeSaveButtonLabelDisplay, "wakeTimeSaveButtonLabelDisplay");
        AbstractC22676k.m65750j(sleepGoalWakeTimeTemplate, "sleepGoalWakeTimeTemplate");
        AbstractC22676k.m65750j(inTheGreenWakeTimeTemplate, "inTheGreenWakeTimeTemplate");
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        this.wakeTimeLabelDisplay = wakeTimeLabelDisplay;
        this.wakeTimeSaveButtonLabelDisplay = wakeTimeSaveButtonLabelDisplay;
        this.sleepGoalWakeTimeTemplate = sleepGoalWakeTimeTemplate;
        this.inTheGreenWakeTimeTemplate = inTheGreenWakeTimeTemplate;
        this.latestWakeTime = latestWakeTime;
        this.helpIconLink = helpIconLink;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C0813c m1974b(C0813c c0813c, String str, String str2, String str3, String str4, LocalTime localTime, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c0813c.wakeTimeLabelDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = c0813c.wakeTimeSaveButtonLabelDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = c0813c.sleepGoalWakeTimeTemplate;
        }
        if ((i13 & 8) != 0) {
            str4 = c0813c.inTheGreenWakeTimeTemplate;
        }
        if ((i13 & 16) != 0) {
            localTime = c0813c.latestWakeTime;
        }
        if ((i13 & 32) != 0) {
            str5 = c0813c.helpIconLink;
        }
        LocalTime localTime2 = localTime;
        String str6 = str5;
        return c0813c.m1975a(str, str2, str3, str4, localTime2, str6);
    }

    /* JADX INFO: renamed from: a */
    public final C0813c m1975a(String wakeTimeLabelDisplay, String wakeTimeSaveButtonLabelDisplay, String sleepGoalWakeTimeTemplate, String inTheGreenWakeTimeTemplate, LocalTime latestWakeTime, String helpIconLink) {
        AbstractC22676k.m65750j(wakeTimeLabelDisplay, "wakeTimeLabelDisplay");
        AbstractC22676k.m65750j(wakeTimeSaveButtonLabelDisplay, "wakeTimeSaveButtonLabelDisplay");
        AbstractC22676k.m65750j(sleepGoalWakeTimeTemplate, "sleepGoalWakeTimeTemplate");
        AbstractC22676k.m65750j(inTheGreenWakeTimeTemplate, "inTheGreenWakeTimeTemplate");
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        return new C0813c(wakeTimeLabelDisplay, wakeTimeSaveButtonLabelDisplay, sleepGoalWakeTimeTemplate, inTheGreenWakeTimeTemplate, latestWakeTime, helpIconLink);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInTheGreenWakeTimeTemplate() {
        return this.inTheGreenWakeTimeTemplate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalTime getLatestWakeTime() {
        return this.latestWakeTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0813c)) {
            return false;
        }
        C0813c c0813c = (C0813c) other;
        return AbstractC22676k.m65745e(this.wakeTimeLabelDisplay, c0813c.wakeTimeLabelDisplay) && AbstractC22676k.m65745e(this.wakeTimeSaveButtonLabelDisplay, c0813c.wakeTimeSaveButtonLabelDisplay) && AbstractC22676k.m65745e(this.sleepGoalWakeTimeTemplate, c0813c.sleepGoalWakeTimeTemplate) && AbstractC22676k.m65745e(this.inTheGreenWakeTimeTemplate, c0813c.inTheGreenWakeTimeTemplate) && AbstractC22676k.m65745e(this.latestWakeTime, c0813c.latestWakeTime) && AbstractC22676k.m65745e(this.helpIconLink, c0813c.helpIconLink);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSleepGoalWakeTimeTemplate() {
        return this.sleepGoalWakeTimeTemplate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getWakeTimeLabelDisplay() {
        return this.wakeTimeLabelDisplay;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getWakeTimeSaveButtonLabelDisplay() {
        return this.wakeTimeSaveButtonLabelDisplay;
    }

    public int hashCode() {
        return this.helpIconLink.hashCode() + ((this.latestWakeTime.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.wakeTimeLabelDisplay.hashCode() * 31, 31, this.wakeTimeSaveButtonLabelDisplay), 31, this.sleepGoalWakeTimeTemplate), 31, this.inTheGreenWakeTimeTemplate)) * 31);
    }

    public String toString() {
        String str = this.wakeTimeLabelDisplay;
        String str2 = this.wakeTimeSaveButtonLabelDisplay;
        String str3 = this.sleepGoalWakeTimeTemplate;
        String str4 = this.inTheGreenWakeTimeTemplate;
        LocalTime localTime = this.latestWakeTime;
        String str5 = this.helpIconLink;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LatestWakeTimeDomainObject(wakeTimeLabelDisplay=", str, ", wakeTimeSaveButtonLabelDisplay=", str2, ", sleepGoalWakeTimeTemplate=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", inTheGreenWakeTimeTemplate=", str4, ", latestWakeTime=");
        sbM32001t.append(localTime);
        sbM32001t.append(", helpIconLink=");
        sbM32001t.append(str5);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
