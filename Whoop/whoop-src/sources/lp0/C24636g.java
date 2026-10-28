package lp0;

import android.content.res.Resources;
import com.whoop.coaching.sleepcoach.harvard.view.C6223a;
import ih0.AbstractC18489d0;
import kp0.AbstractC22734a;
import kp0.C22736c;
import kp0.C22739f;
import kp0.C22745l;
import kp0.C22747n;
import or2.C28205u0;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qe2.AbstractC30314g;

/* JADX INFO: renamed from: lp0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010!¨\u0006#"}, m65681d2 = {"Llp0/g;", "", "Lor2/u0;", "localizedDateTimeFormatter", "<init>", "(Lor2/u0;)V", "", "optimalSleepInTheScreenPixels", "", "totalPixelsOnScreen", "", "d", "(ID)Z", "Lorg/joda/time/Instant;", "startInstant", "endInstant", "", "a", "(Lorg/joda/time/Instant;Lorg/joda/time/Instant;)Ljava/lang/String;", "Lkp0/a;", "alarmType", "Landroid/content/res/Resources;", "resources", "b", "(Lkp0/a;Landroid/content/res/Resources;)Ljava/lang/String;", "Lcom/whoop/coaching/sleepcoach/harvard/view/a;", "scale", "Llp0/l;", "optimalSleepWindow", "Llp0/f;", "c", "(Lcom/whoop/coaching/sleepcoach/harvard/view/a;Llp0/l;Landroid/content/res/Resources;Lkp0/a;)Llp0/f;", "Lor2/u0;", "D", "sixtyPercent", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24636g {

    /* JADX INFO: renamed from: c */
    public static final int f96379c = C28205u0.f113964d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28205u0 localizedDateTimeFormatter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final double sixtyPercent;

    public C24636g(C28205u0 localizedDateTimeFormatter) {
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.sixtyPercent = 0.6d;
    }

    /* JADX INFO: renamed from: a */
    private final String m71983a(Instant startInstant, Instant endInstant) {
        DateTime dateTime = startInstant.toDateTime();
        DateTime dateTime2 = endInstant.toDateTime();
        C28205u0 c28205u0 = this.localizedDateTimeFormatter;
        AbstractC22676k.m65747g(dateTime);
        String strM85381g = c28205u0.m85381g(dateTime, true);
        C28205u0 c28205u1 = this.localizedDateTimeFormatter;
        AbstractC22676k.m65747g(dateTime2);
        return AbstractC18489d0.m53370k(strM85381g, " - ", c28205u1.m85381g(dateTime2, true));
    }

    /* JADX INFO: renamed from: b */
    private final String m71984b(AbstractC22734a alarmType, Resources resources) {
        if (!(alarmType instanceof C22736c) && !(alarmType instanceof C22747n)) {
            if (!(alarmType instanceof C22739f)) {
                throw new NoWhenBranchMatchedException();
            }
            String string = resources.getString(AbstractC30314g.f124357v0);
            AbstractC22676k.m65749i(string, "getString(...)");
            return string;
        }
        if (alarmType.m65814a() instanceof C22745l) {
            String string2 = resources.getString(AbstractC30314g.f124357v0);
            AbstractC22676k.m65747g(string2);
            return string2;
        }
        String string3 = resources.getString(AbstractC30314g.f124366y0);
        AbstractC22676k.m65747g(string3);
        return string3;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m71985d(int optimalSleepInTheScreenPixels, double totalPixelsOnScreen) {
        return ((double) optimalSleepInTheScreenPixels) > totalPixelsOnScreen * this.sixtyPercent;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC24635f m71986c(C6223a scale, C24641l optimalSleepWindow, Resources resources, AbstractC22734a alarmType) {
        AbstractC22676k.m65750j(scale, "scale");
        AbstractC22676k.m65750j(resources, "resources");
        AbstractC22676k.m65750j(alarmType, "alarmType");
        Instant instant = new Instant(scale.getTimeStampAtLeftmostPixelOnScreen().getMillis() + ((long) scale.getTotalTimeDurationOnScreen()));
        if (optimalSleepWindow == null) {
            String string = resources.getString(AbstractC30314g.f124357v0);
            AbstractC22676k.m65749i(string, "getString(...)");
            String string2 = resources.getString(AbstractC30314g.f124342q0);
            AbstractC22676k.m65749i(string2, "getString(...)");
            return new C24634e(string, string2, (scale.getPixelsPerMilli() * ((double) scale.getTotalTimeDurationOnScreen())) / ((double) 2));
        }
        if (scale.getTimeStampAtLeftmostPixelOnScreen().isBefore(optimalSleepWindow.getStartTime()) && instant.isAfter(optimalSleepWindow.getEndTime())) {
            return new C24631b(m71984b(alarmType, resources), m71983a(optimalSleepWindow.getStartTime(), optimalSleepWindow.getEndTime()), AbstractC24638i.m71989c(optimalSleepWindow.getStartTime(), scale), AbstractC24638i.m71989c(optimalSleepWindow.getEndTime(), scale));
        }
        if (scale.getTimeStampAtLeftmostPixelOnScreen().isAfter(optimalSleepWindow.getStartTime()) && scale.getTimeStampAtLeftmostPixelOnScreen().isBefore(optimalSleepWindow.getEndTime())) {
            int iM71989c = AbstractC24638i.m71989c(optimalSleepWindow.getStartTime(), scale);
            int iM71989c2 = AbstractC24638i.m71989c(optimalSleepWindow.getEndTime(), scale);
            double pixelsPerMilli = scale.getPixelsPerMilli() * ((double) scale.getTotalTimeDurationOnScreen());
            return new C24633d(m71984b(alarmType, resources), m71983a(optimalSleepWindow.getStartTime(), optimalSleepWindow.getEndTime()), EnumC24637h.LEFT, iM71989c, iM71989c2, m71985d(iM71989c2, pixelsPerMilli), (int) pixelsPerMilli);
        }
        if (instant.isBefore(optimalSleepWindow.getEndTime()) && instant.isAfter(optimalSleepWindow.getStartTime())) {
            int iM71989c3 = AbstractC24638i.m71989c(optimalSleepWindow.getStartTime(), scale);
            int iM71989c4 = AbstractC24638i.m71989c(optimalSleepWindow.getEndTime(), scale);
            int pixelsPerMilli2 = (int) (scale.getPixelsPerMilli() * ((double) scale.getTotalTimeDurationOnScreen()));
            return new C24633d(m71984b(alarmType, resources), m71983a(optimalSleepWindow.getStartTime(), optimalSleepWindow.getEndTime()), EnumC24637h.RIGHT, iM71989c3, iM71989c4, m71985d(pixelsPerMilli2 - iM71989c3, scale.getPixelsPerMilli() * ((double) scale.getTotalTimeDurationOnScreen())), pixelsPerMilli2);
        }
        if (scale.getTimeStampAtLeftmostPixelOnScreen().isAfter(optimalSleepWindow.getEndTime())) {
            return new C24632c(m71984b(alarmType, resources), m71983a(optimalSleepWindow.getStartTime(), optimalSleepWindow.getEndTime()), EnumC24637h.LEFT, 0);
        }
        if (instant.isBefore(optimalSleepWindow.getStartTime())) {
            return new C24632c(m71984b(alarmType, resources), m71983a(optimalSleepWindow.getStartTime(), optimalSleepWindow.getEndTime()), EnumC24637h.RIGHT, (int) (scale.getPixelsPerMilli() * ((double) scale.getTotalTimeDurationOnScreen())));
        }
        String string3 = resources.getString(AbstractC30314g.f124357v0);
        AbstractC22676k.m65749i(string3, "getString(...)");
        String string4 = resources.getString(AbstractC30314g.f124342q0);
        AbstractC22676k.m65749i(string4, "getString(...)");
        return new C24634e(string3, string4, (scale.getPixelsPerMilli() * ((double) scale.getTotalTimeDurationOnScreen())) / ((double) 2));
    }
}
