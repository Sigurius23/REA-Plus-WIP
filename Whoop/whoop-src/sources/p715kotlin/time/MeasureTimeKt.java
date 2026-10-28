package p715kotlin.time;

import c93.InterfaceC4339a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a.\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0007\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\t\u001a:\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\r\u001a>\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n*\u00020\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\u000e\u001a>\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\n*\u00020\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "block", "Lkotlin/time/Duration;", "measureTime", "(Lc93/a;)J", "Lkotlin/time/TimeSource;", "(Lkotlin/time/TimeSource;Lc93/a;)J", "Lkotlin/time/TimeSource$Monotonic;", "(Lkotlin/time/TimeSource$Monotonic;Lc93/a;)J", "T", "Lkotlin/time/TimedValue;", "measureTimedValue", "(Lc93/a;)Lkotlin/time/TimedValue;", "(Lkotlin/time/TimeSource;Lc93/a;)Lkotlin/time/TimedValue;", "(Lkotlin/time/TimeSource$Monotonic;Lc93/a;)Lkotlin/time/TimedValue;", "kotlin-stdlib"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MeasureTimeKt {
    public static final long measureTime(InterfaceC4339a block) {
        AbstractC22676k.m65750j(block, "block");
        long jM134379markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(jM134379markNowz9LOYto);
    }

    public static final <T> TimedValue<T> measureTimedValue(InterfaceC4339a block) {
        AbstractC22676k.m65750j(block, "block");
        return new TimedValue<>(block.invoke(), TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(TimeSource.Monotonic.INSTANCE.m134379markNowz9LOYto()), null);
    }

    public static final long measureTime(TimeSource timeSource, InterfaceC4339a block) {
        AbstractC22676k.m65750j(timeSource, "<this>");
        AbstractC22676k.m65750j(block, "block");
        TimeMark timeMarkMarkNow = timeSource.markNow();
        block.invoke();
        return timeMarkMarkNow.mo134250elapsedNowUwyO8pc();
    }

    public static final <T> TimedValue<T> measureTimedValue(TimeSource timeSource, InterfaceC4339a block) {
        AbstractC22676k.m65750j(timeSource, "<this>");
        AbstractC22676k.m65750j(block, "block");
        return new TimedValue<>(block.invoke(), timeSource.markNow().mo134250elapsedNowUwyO8pc(), null);
    }

    public static final long measureTime(TimeSource.Monotonic monotonic, InterfaceC4339a block) {
        AbstractC22676k.m65750j(monotonic, "<this>");
        AbstractC22676k.m65750j(block, "block");
        long jM134379markNowz9LOYto = monotonic.m134379markNowz9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(jM134379markNowz9LOYto);
    }

    public static final <T> TimedValue<T> measureTimedValue(TimeSource.Monotonic monotonic, InterfaceC4339a block) {
        AbstractC22676k.m65750j(monotonic, "<this>");
        AbstractC22676k.m65750j(block, "block");
        return new TimedValue<>(block.invoke(), TimeSource.Monotonic.ValueTimeMark.m134384elapsedNowUwyO8pc(monotonic.m134379markNowz9LOYto()), null);
    }
}
