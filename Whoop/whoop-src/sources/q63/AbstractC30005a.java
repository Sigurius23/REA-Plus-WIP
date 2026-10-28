package q63;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import nh3.AbstractC26725a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q63.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC30005a {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f122506a = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: a */
    public static final C30006b m91825a(Long l7) {
        Calendar calendar = Calendar.getInstance(f122506a, Locale.ROOT);
        AbstractC22676k.m65747g(calendar);
        if (l7 != null) {
            calendar.setTimeInMillis(l7.longValue());
        }
        return new C30006b(calendar.get(13), calendar.get(12), calendar.get(11), AbstractC30007c._values()[(calendar.get(7) + 5) % 7], calendar.get(5), calendar.get(6), AbstractC26725a._values()[calendar.get(2)], calendar.get(1), calendar.getTimeInMillis());
    }
}
