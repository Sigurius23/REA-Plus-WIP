package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p023ay.C2125b;

/* JADX INFO: renamed from: com.google.android.material.datepicker.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C5023q implements Comparable, Parcelable {
    public static final Parcelable.Creator<C5023q> CREATOR = new C2125b(13);

    /* JADX INFO: renamed from: E */
    public final int f20960E;

    /* JADX INFO: renamed from: F */
    public final long f20961F;

    /* JADX INFO: renamed from: G */
    public String f20962G;

    /* JADX INFO: renamed from: w */
    public final Calendar f20963w;

    /* JADX INFO: renamed from: x */
    public final int f20964x;

    /* JADX INFO: renamed from: y */
    public final int f20965y;

    /* JADX INFO: renamed from: z */
    public final int f20966z;

    public C5023q(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM15760a = AbstractC5031y.m15760a(calendar);
        this.f20963w = calendarM15760a;
        this.f20964x = calendarM15760a.get(2);
        this.f20965y = calendarM15760a.get(1);
        this.f20966z = calendarM15760a.getMaximum(7);
        this.f20960E = calendarM15760a.getActualMaximum(5);
        this.f20961F = calendarM15760a.getTimeInMillis();
    }

    /* JADX INFO: renamed from: b */
    public static C5023q m15753b(int i13, int i14) {
        Calendar calendarM15762c = AbstractC5031y.m15762c(null);
        calendarM15762c.set(1, i13);
        calendarM15762c.set(2, i14);
        return new C5023q(calendarM15762c);
    }

    /* JADX INFO: renamed from: f */
    public static C5023q m15754f(long j7) {
        Calendar calendarM15762c = AbstractC5031y.m15762c(null);
        calendarM15762c.setTimeInMillis(j7);
        return new C5023q(calendarM15762c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f20963w.compareTo(((C5023q) obj).f20963w);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5023q)) {
            return false;
        }
        C5023q c5023q = (C5023q) obj;
        return this.f20964x == c5023q.f20964x && this.f20965y == c5023q.f20965y;
    }

    /* JADX INFO: renamed from: h */
    public final String m15755h() {
        if (this.f20962G == null) {
            long timeInMillis = this.f20963w.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = AbstractC5031y.f20981a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f20962G = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f20962G;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20964x), Integer.valueOf(this.f20965y)});
    }

    /* JADX INFO: renamed from: i */
    public final int m15756i(C5023q c5023q) {
        if (!(this.f20963w instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c5023q.f20964x - this.f20964x) + ((c5023q.f20965y - this.f20965y) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.f20965y);
        parcel.writeInt(this.f20964x);
    }
}
