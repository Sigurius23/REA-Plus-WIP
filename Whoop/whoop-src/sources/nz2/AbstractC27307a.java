package nz2;

import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: nz2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"", "template", "Lorg/joda/time/DateTime;", "dateTime", "Ljava/util/Locale;", "locale", "Ltr2/n;", "logger", "a", "(Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/util/Locale;Ltr2/n;)Ljava/lang/String;", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27307a {
    /* JADX INFO: renamed from: a */
    public static final String m82456a(String str, DateTime dateTime, Locale locale, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(logger, "logger");
        if (str != null && !AbstractC39414r.m125890i0(str) && dateTime != null) {
            DateTime dateTimeWithZone = dateTime.withZone(DateTimeZone.getDefault());
            try {
                return String.format(locale, str, Arrays.copyOf(new Object[]{DateTimeFormat.forPattern(DefaultDateFormatter.TIME_FORMAT_12H).withLocale(locale).print(dateTimeWithZone), DateTimeFormat.forPattern("MMMM d").withLocale(locale).print(dateTimeWithZone)}, 2));
            } catch (IllegalFormatException e5) {
                logger.mo85222m(AbstractC11266d.m30461o("Error formatting template, ", str), new AbstractC30556a.a[0]);
                e5.printStackTrace();
                return "";
            }
        }
        logger.mo85222m("template or date are null: " + str + ", " + (dateTime != null ? dateTime.toDate() : null), new AbstractC30556a.a[0]);
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m82457b(String str, DateTime dateTime, Locale locale, InterfaceC34116n interfaceC34116n, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            locale = Locale.getDefault();
            AbstractC22676k.m65749i(locale, "getDefault(...)");
        }
        if ((i13 & 8) != 0) {
            interfaceC34116n = AbstractC27308b.m82458a("formatDeviceDisconnectionSubtitle");
        }
        return m82456a(str, dateTime, locale, interfaceC34116n);
    }
}
