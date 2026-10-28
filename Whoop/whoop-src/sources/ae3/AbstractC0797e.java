package ae3;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: ae3.e */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC0797e {

    /* JADX INFO: renamed from: a */
    public static final C0796d f2946a = new C0796d(0);

    /* JADX INFO: renamed from: b */
    public static final String[] f2947b;

    /* JADX INFO: renamed from: c */
    public static final DateFormat[] f2948c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f2947b = strArr;
        f2948c = new DateFormat[strArr.length];
    }

    /* JADX INFO: renamed from: a */
    public static final Date m1919a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = ((DateFormat) f2946a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f2947b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i13 = 0; i13 < length; i13++) {
                    DateFormat[] dateFormatArr = f2948c;
                    DateFormat simpleDateFormat = dateFormatArr[i13];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(f2947b[i13], Locale.US);
                        simpleDateFormat.setTimeZone(AbstractC37174h.f158962a);
                        dateFormatArr[i13] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date date2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return date2;
                    }
                }
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
