package org.joda.time;

import org.joda.time.format.DateTimeFormat;
import p088dc.AbstractC11895b;

/* JADX INFO: loaded from: classes5.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(String str) {
        super(str);
    }

    private static String createMessage(long j7, String str) {
        return AbstractC11895b.m31996o("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSS").print(new Instant(j7)), str != null ? AbstractC11895b.m31996o(" (", str, ")") : "");
    }

    public static boolean isIllegalInstant(Throwable th3) {
        if (th3 instanceof IllegalInstantException) {
            return true;
        }
        if (th3.getCause() == null || th3.getCause() == th3) {
            return false;
        }
        return isIllegalInstant(th3.getCause());
    }

    public IllegalInstantException(long j7, String str) {
        super(createMessage(j7, str));
    }
}
