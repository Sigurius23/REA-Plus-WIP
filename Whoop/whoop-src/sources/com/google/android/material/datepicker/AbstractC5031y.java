package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.material.datepicker.y */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5031y {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f20981a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static Calendar m15760a(Calendar calendar) {
        Calendar calendarM15762c = m15762c(calendar);
        Calendar calendarM15762c2 = m15762c(null);
        calendarM15762c2.set(calendarM15762c.get(1), calendarM15762c.get(2), calendarM15762c.get(5));
        return calendarM15762c2;
    }

    /* JADX INFO: renamed from: b */
    public static Calendar m15761b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m15762c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}
