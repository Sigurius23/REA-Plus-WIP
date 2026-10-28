package com.fatboyindustrial.gsonjodatime;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;

/* JADX INFO: renamed from: com.fatboyindustrial.gsonjodatime.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4968a {

    /* JADX INFO: renamed from: a */
    public static final Type f20349a = new TypeToken<DateMidnight>() { // from class: com.fatboyindustrial.gsonjodatime.Converters$1
    }.getType();

    /* JADX INFO: renamed from: b */
    public static final Type f20350b = new TypeToken<DateTime>() { // from class: com.fatboyindustrial.gsonjodatime.Converters$2
    }.getType();

    /* JADX INFO: renamed from: c */
    public static final Type f20351c = new TypeToken<LocalDate>() { // from class: com.fatboyindustrial.gsonjodatime.Converters$3
    }.getType();

    /* JADX INFO: renamed from: d */
    public static final Type f20352d = new TypeToken<LocalDateTime>() { // from class: com.fatboyindustrial.gsonjodatime.Converters$4
    }.getType();

    /* JADX INFO: renamed from: e */
    public static final Type f20353e = new TypeToken<LocalTime>() { // from class: com.fatboyindustrial.gsonjodatime.Converters$5
    }.getType();

    /* JADX INFO: renamed from: f */
    public static final Type f20354f = new TypeToken<Interval>() { // from class: com.fatboyindustrial.gsonjodatime.Converters$6
    }.getType();

    /* JADX INFO: renamed from: g */
    public static final Type f20355g = new TypeToken<Duration>() { // from class: com.fatboyindustrial.gsonjodatime.Converters$7
    }.getType();

    /* JADX INFO: renamed from: h */
    public static final Type f20356h = new TypeToken<Period>() { // from class: com.fatboyindustrial.gsonjodatime.Converters$8
    }.getType();

    /* JADX INFO: renamed from: i */
    public static final Type f20357i = new TypeToken<Instant>() { // from class: com.fatboyindustrial.gsonjodatime.Converters$9
    }.getType();

    /* JADX INFO: renamed from: j */
    public static final Type f20358j = new TypeToken<DateTimeZone>() { // from class: com.fatboyindustrial.gsonjodatime.Converters$10
    }.getType();
}
