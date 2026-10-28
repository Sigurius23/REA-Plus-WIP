package p715kotlin.time;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\fB\u0011\bF\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\b\u001a\u00020\tH¤\u0080\u0004J\n\u0010\n\u001a\u00020\u000bH\u0096\u0080\u0004R\u0015\u0010\u0002\u001a\u00020\u0003X\u0084\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m65681d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "<init>", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "read", "", "markNow", "Lkotlin/time/ComparableTimeMark;", "DoubleTimeMark", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
@ExperimentalTime
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {
    private final DurationUnit unit;

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\bF\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u00020\u0007H\u0096\u0080\u0004¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0082\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0082\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0096\u0082\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u0096\u0080\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u0096\u0080\u0004R\u000f\u0010\u0002\u001a\u00020\u0003X\u0082\u0084\b¢\u0006\u0002\n\u0000R\u000f\u0010\u0004\u001a\u00020\u0005X\u0082\u0084\b¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007X\u0082\u0084\b¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001d"}, m65681d2 = {"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractDoubleTimeSource;", MapboxMap.QFE_OFFSET, "Lkotlin/time/Duration;", "<init>", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "plus", AttachmentExtensionsKt.EXTRA_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "equals", "", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DoubleTimeMark implements ComparableTimeMark {
        private final long offset;
        private final double startedAt;
        private final AbstractDoubleTimeSource timeSource;

        public /* synthetic */ DoubleTimeMark(double d3, AbstractDoubleTimeSource abstractDoubleTimeSource, long j7, DefaultConstructorMarker defaultConstructorMarker) {
            this(d3, abstractDoubleTimeSource, j7);
        }

        @Override // p715kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
        public long mo134250elapsedNowUwyO8pc() {
            return Duration.m134290minusLRDsOJo(DurationKt.toDuration(this.timeSource.read() - this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // p715kotlin.time.ComparableTimeMark
        public boolean equals(Object other) {
            return (other instanceof DoubleTimeMark) && AbstractC22676k.m65745e(this.timeSource, ((DoubleTimeMark) other).timeSource) && Duration.m134267equalsimpl0(mo134252minusUwyO8pc((ComparableTimeMark) other), Duration.INSTANCE.m134357getZEROUwyO8pc());
        }

        @Override // p715kotlin.time.TimeMark
        public /* bridge */ boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // p715kotlin.time.TimeMark
        public /* bridge */ boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // p715kotlin.time.ComparableTimeMark
        public int hashCode() {
            return Duration.m134283hashCodeimpl(Duration.m134291plusLRDsOJo(DurationKt.toDuration(this.startedAt, this.timeSource.getUnit()), this.offset));
        }

        @Override // p715kotlin.time.TimeMark
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public /* bridge */ ComparableTimeMark mo134251minusLRDsOJo(long j7) {
            return ComparableTimeMark.DefaultImpls.m134255minusLRDsOJo(this, j7);
        }

        @Override // p715kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
        public long mo134252minusUwyO8pc(ComparableTimeMark other) {
            AbstractC22676k.m65750j(other, "other");
            if (other instanceof DoubleTimeMark) {
                DoubleTimeMark doubleTimeMark = (DoubleTimeMark) other;
                if (AbstractC22676k.m65745e(this.timeSource, doubleTimeMark.timeSource)) {
                    if (Duration.m134267equalsimpl0(this.offset, doubleTimeMark.offset) && Duration.m134287isInfiniteimpl(this.offset)) {
                        return Duration.INSTANCE.m134357getZEROUwyO8pc();
                    }
                    long jM134290minusLRDsOJo = Duration.m134290minusLRDsOJo(this.offset, doubleTimeMark.offset);
                    long duration = DurationKt.toDuration(this.startedAt - doubleTimeMark.startedAt, this.timeSource.getUnit());
                    return Duration.m134267equalsimpl0(duration, Duration.m134306unaryMinusUwyO8pc(jM134290minusLRDsOJo)) ? Duration.INSTANCE.m134357getZEROUwyO8pc() : Duration.m134291plusLRDsOJo(duration, jM134290minusLRDsOJo);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public String toString() {
            return "DoubleTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m134302toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }

        private DoubleTimeMark(double d3, AbstractDoubleTimeSource timeSource, long j7) {
            AbstractC22676k.m65750j(timeSource, "timeSource");
            this.startedAt = d3;
            this.timeSource = timeSource;
            this.offset = j7;
        }

        @Override // java.lang.Comparable
        public /* bridge */ int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // p715kotlin.time.TimeMark
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public ComparableTimeMark mo134253plusLRDsOJo(long duration) {
            return new DoubleTimeMark(this.startedAt, this.timeSource, Duration.m134291plusLRDsOJo(this.offset, duration), null);
        }
    }

    public AbstractDoubleTimeSource(DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        this.unit = unit;
    }

    public final DurationUnit getUnit() {
        return this.unit;
    }

    public abstract double read();

    @Override // p715kotlin.time.TimeSource
    public ComparableTimeMark markNow() {
        return new DoubleTimeMark(read(), this, Duration.INSTANCE.m134357getZEROUwyO8pc(), null);
    }
}
