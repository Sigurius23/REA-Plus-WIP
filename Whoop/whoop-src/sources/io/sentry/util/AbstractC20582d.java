package io.sentry.util;

import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: renamed from: io.sentry.util.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20582d {

    /* JADX INFO: renamed from: a */
    public static final Charset f77083a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public static HashMap m56713a(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
