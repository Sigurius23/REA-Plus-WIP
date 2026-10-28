package p715kotlin.time;

import p499t9.C33647p;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import w83.AbstractC36949a;
import w83.C36950b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0003H\u0080\u0080\u0004\u001a\u0012\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0080\u0080\u0004\"\u000f\u0010\u0000\u001a\u00020\u0001X\u0082\u0084\b¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"systemClock", "Lkotlin/time/Clock;", "systemClockNow", "Lkotlin/time/Instant;", "serializedInstant", "", "instant", "kotlin-stdlib"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class InstantJvmKt {
    private static final Clock systemClock;

    static {
        Integer num = AbstractC36949a.f158107a;
        systemClock = (num == null || num.intValue() >= 26) ? new C33647p(12) : new C36950b();
    }

    public static final Object serializedInstant(Instant instant) {
        AbstractC22676k.m65750j(instant, "instant");
        return new InstantSerialized(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
    }

    public static final Instant systemClockNow() {
        return systemClock.now();
    }
}
