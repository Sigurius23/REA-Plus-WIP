package p715kotlin.time;

import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H$¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0013\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0015"}, m65681d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/DurationUnit;", "unit", "<init>", "(Lkotlin/time/DurationUnit;)V", "", "adjustedRead", "()J", "read", "Lkotlin/time/ComparableTimeMark;", "markNow", "()Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/DurationUnit;", "getUnit", "()Lkotlin/time/DurationUnit;", "zero$delegate", "Ll83/h;", "getZero", "zero", "LongTimeMark", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {
    private final DurationUnit unit;

    /* JADX INFO: renamed from: zero$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h zero;

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\bF\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u00020\u0007H\u0096\u0080\u0004¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0096\u0082\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0096\u0082\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0018H\u0096\u0082\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u0096\u0080\u0004J\n\u0010\u001b\u001a\u00020\u001cH\u0096\u0080\u0004R\u000f\u0010\u0002\u001a\u00020\u0003X\u0082\u0084\b¢\u0006\u0002\n\u0000R\u000f\u0010\u0004\u001a\u00020\u0005X\u0082\u0084\b¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007X\u0082\u0084\b¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001d"}, m65681d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", MapboxMap.QFE_OFFSET, "Lkotlin/time/Duration;", "<init>", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "plus", AttachmentExtensionsKt.EXTRA_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "equals", "", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class LongTimeMark implements ComparableTimeMark {
        private final long offset;
        private final long startedAt;
        private final AbstractLongTimeSource timeSource;

        public /* synthetic */ LongTimeMark(long j7, AbstractLongTimeSource abstractLongTimeSource, long j13, DefaultConstructorMarker defaultConstructorMarker) {
            this(j7, abstractLongTimeSource, j13);
        }

        @Override // p715kotlin.time.TimeMark
        /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
        public long mo134250elapsedNowUwyO8pc() {
            return Duration.m134290minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // p715kotlin.time.ComparableTimeMark
        public boolean equals(Object other) {
            return (other instanceof LongTimeMark) && AbstractC22676k.m65745e(this.timeSource, ((LongTimeMark) other).timeSource) && Duration.m134267equalsimpl0(mo134252minusUwyO8pc((ComparableTimeMark) other), Duration.INSTANCE.m134357getZEROUwyO8pc());
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
            return Long.hashCode(this.startedAt) + (Duration.m134283hashCodeimpl(this.offset) * 37);
        }

        @Override // p715kotlin.time.TimeMark
        /* JADX INFO: renamed from: minus-LRDsOJo */
        public /* bridge */ ComparableTimeMark mo134251minusLRDsOJo(long j7) {
            return ComparableTimeMark.DefaultImpls.m134255minusLRDsOJo(this, j7);
        }

        @Override // p715kotlin.time.ComparableTimeMark
        /* JADX INFO: renamed from: minus-UwyO8pc */
        public long mo134252minusUwyO8pc(ComparableTimeMark other) {
            AbstractC22676k.m65750j(other, "other");
            if (other instanceof LongTimeMark) {
                LongTimeMark longTimeMark = (LongTimeMark) other;
                if (AbstractC22676k.m65745e(this.timeSource, longTimeMark.timeSource)) {
                    return Duration.m134291plusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, longTimeMark.startedAt, this.timeSource.getUnit()), Duration.m134290minusLRDsOJo(this.offset, longTimeMark.offset));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt__DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((Object) Duration.m134302toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }

        private LongTimeMark(long j7, AbstractLongTimeSource timeSource, long j13) {
            AbstractC22676k.m65750j(timeSource, "timeSource");
            this.startedAt = j7;
            this.timeSource = timeSource;
            this.offset = j13;
        }

        @Override // java.lang.Comparable
        public /* bridge */ int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // p715kotlin.time.TimeMark
        /* JADX INFO: renamed from: plus-LRDsOJo */
        public ComparableTimeMark mo134253plusLRDsOJo(long duration) {
            DurationUnit unit = this.timeSource.getUnit();
            if (Duration.m134287isInfiniteimpl(duration)) {
                return new LongTimeMark(LongSaturatedMathKt.m134369saturatingAddNuflL3o(this.startedAt, unit, duration), this.timeSource, Duration.INSTANCE.m134357getZEROUwyO8pc(), null);
            }
            long jM134305truncateToUwyO8pc$kotlin_stdlib = Duration.m134305truncateToUwyO8pc$kotlin_stdlib(duration, unit);
            long jM134291plusLRDsOJo = Duration.m134291plusLRDsOJo(Duration.m134290minusLRDsOJo(duration, jM134305truncateToUwyO8pc$kotlin_stdlib), this.offset);
            long jM134369saturatingAddNuflL3o = LongSaturatedMathKt.m134369saturatingAddNuflL3o(this.startedAt, unit, jM134305truncateToUwyO8pc$kotlin_stdlib);
            long jM134305truncateToUwyO8pc$kotlin_stdlib2 = Duration.m134305truncateToUwyO8pc$kotlin_stdlib(jM134291plusLRDsOJo, unit);
            long jM134369saturatingAddNuflL3o2 = LongSaturatedMathKt.m134369saturatingAddNuflL3o(jM134369saturatingAddNuflL3o, unit, jM134305truncateToUwyO8pc$kotlin_stdlib2);
            long jM134290minusLRDsOJo = Duration.m134290minusLRDsOJo(jM134291plusLRDsOJo, jM134305truncateToUwyO8pc$kotlin_stdlib2);
            long jM134275getInWholeNanosecondsimpl = Duration.m134275getInWholeNanosecondsimpl(jM134290minusLRDsOJo);
            if (jM134369saturatingAddNuflL3o2 != 0 && jM134275getInWholeNanosecondsimpl != 0 && (jM134369saturatingAddNuflL3o2 ^ jM134275getInWholeNanosecondsimpl) < 0) {
                long duration2 = DurationKt.toDuration(Long.signum(jM134275getInWholeNanosecondsimpl), unit);
                jM134369saturatingAddNuflL3o2 = LongSaturatedMathKt.m134369saturatingAddNuflL3o(jM134369saturatingAddNuflL3o2, unit, duration2);
                jM134290minusLRDsOJo = Duration.m134290minusLRDsOJo(jM134290minusLRDsOJo, duration2);
            }
            if ((1 | (jM134369saturatingAddNuflL3o2 - 1)) == Long.MAX_VALUE) {
                jM134290minusLRDsOJo = Duration.INSTANCE.m134357getZEROUwyO8pc();
            }
            return new LongTimeMark(jM134369saturatingAddNuflL3o2, this.timeSource, jM134290minusLRDsOJo, null);
        }
    }

    public AbstractLongTimeSource(DurationUnit unit) {
        AbstractC22676k.m65750j(unit, "unit");
        this.unit = unit;
        this.zero = AbstractC30060g.m92088H(new C19683b(this, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    private final long getZero() {
        return ((Number) this.zero.getValue()).longValue();
    }

    public final DurationUnit getUnit() {
        return this.unit;
    }

    public abstract long read();

    @Override // p715kotlin.time.TimeSource
    public ComparableTimeMark markNow() {
        return new LongTimeMark(adjustedRead(), this, Duration.INSTANCE.m134357getZEROUwyO8pc(), null);
    }
}
