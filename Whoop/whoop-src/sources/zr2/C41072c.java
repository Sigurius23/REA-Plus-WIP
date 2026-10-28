package zr2;

import c93.InterfaceC4339a;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zr2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lzr2/c;", "Lzr2/a;", "Lkotlin/Function0;", "", "nowProvider", "Lorg/joda/time/DateTimeZone;", "timeZoneProvider", "<init>", "(Lc93/a;Lc93/a;)V", "Lorg/joda/time/LocalDate;", "d", "()Lorg/joda/time/LocalDate;", "Lorg/joda/time/LocalDateTime;", "a", "()Lorg/joda/time/LocalDateTime;", "b", "()J", "Lorg/joda/time/DateTime;", "c", "()Lorg/joda/time/DateTime;", "Lorg/joda/time/Instant;", "f", "()Lorg/joda/time/Instant;", "Lc93/a;", "e", "()Lorg/joda/time/DateTimeZone;", "defaultZone", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C41072c implements InterfaceC41070a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC4339a nowProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4339a timeZoneProvider;

    public C41072c(InterfaceC4339a nowProvider, InterfaceC4339a timeZoneProvider) {
        AbstractC22676k.m65750j(nowProvider, "nowProvider");
        AbstractC22676k.m65750j(timeZoneProvider, "timeZoneProvider");
        this.nowProvider = nowProvider;
        this.timeZoneProvider = timeZoneProvider;
    }

    @Override // zr2.InterfaceC41070a
    /* JADX INFO: renamed from: a */
    public LocalDateTime mo133362a() {
        return new LocalDateTime(((Number) this.nowProvider.invoke()).longValue(), mo133366e());
    }

    @Override // zr2.InterfaceC41070a
    /* JADX INFO: renamed from: b */
    public long mo133363b() {
        return ((Number) this.nowProvider.invoke()).longValue();
    }

    @Override // zr2.InterfaceC41070a
    /* JADX INFO: renamed from: c */
    public DateTime mo133364c() {
        return new DateTime(((Number) this.nowProvider.invoke()).longValue(), mo133366e());
    }

    @Override // zr2.InterfaceC41070a
    /* JADX INFO: renamed from: d */
    public LocalDate mo133365d() {
        return new LocalDate(((Number) this.nowProvider.invoke()).longValue(), mo133366e());
    }

    @Override // zr2.InterfaceC41070a
    /* JADX INFO: renamed from: e */
    public DateTimeZone mo133366e() {
        return (DateTimeZone) this.timeZoneProvider.invoke();
    }

    @Override // zr2.InterfaceC41070a
    /* JADX INFO: renamed from: f */
    public Instant mo133367f() {
        return new Instant(((Number) this.nowProvider.invoke()).longValue());
    }
}
