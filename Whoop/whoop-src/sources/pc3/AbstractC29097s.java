package pc3;

import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.UtcOffset;
import l83.C23470p;
import lj1.C24473a;
import ou1.C28376a;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: pc3.s */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC29097s {

    /* JADX INFO: renamed from: a */
    public static final C23470p f117690a = AbstractC30060g.m92088H(new C28376a(28));

    /* JADX INFO: renamed from: b */
    public static final C23470p f117691b = AbstractC30060g.m92088H(new C28376a(29));

    /* JADX INFO: renamed from: c */
    public static final C23470p f117692c = AbstractC30060g.m92088H(new C29096r(0));

    /* JADX INFO: renamed from: a */
    public static final UtcOffset m88411a(Integer num, Integer num2, Integer num3) {
        try {
            if (num != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                AbstractC22676k.m65749i(zoneOffsetOfHoursMinutesSeconds, "ofHoursMinutesSeconds(...)");
                return new UtcOffset(zoneOffsetOfHoursMinutesSeconds);
            }
            if (num2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                AbstractC22676k.m65749i(zoneOffsetOfHoursMinutesSeconds2, "ofHoursMinutesSeconds(...)");
                return new UtcOffset(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
            AbstractC22676k.m65749i(zoneOffsetOfTotalSeconds, "ofTotalSeconds(...)");
            return new UtcOffset(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final UtcOffset m88412b(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new UtcOffset((ZoneOffset) dateTimeFormatter.parse(str, new C24473a(1)));
        } catch (DateTimeException e5) {
            throw new DateTimeFormatException(e5);
        }
    }
}
