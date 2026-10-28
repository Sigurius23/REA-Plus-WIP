package p715kotlin.time;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006J\n\u0010\u0002\u001a\u00020\u0003H¦\u0080\u0004¨\u0006\u0007"}, m65681d2 = {"Lkotlin/time/TimeSource;", "", "markNow", "Lkotlin/time/TimeMark;", "WithComparableMarks", "Monotonic", "Companion", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface TimeSource {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\bB¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lkotlin/time/TimeSource$Companion;", "", "<init>", "()V", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\bB¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u0005H\u0096\u0080\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\b\u001a\u00020\tH\u0096\u0080\u0004¨\u0006\u000b"}, m65681d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", "", "ValueTimeMark", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Monotonic implements WithComparableMarks {
        public static final Monotonic INSTANCE = new Monotonic();

        @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b@\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u00020\tH\u0096\u0080\u0004¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tH\u0096\u0082\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tH\u0096\u0082\u0004¢\u0006\u0004\b\u0010\u0010\u000eJ\u0011\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0012H\u0096\u0080\u0004¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0001H\u0096\u0082\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0082\u0004¢\u0006\u0004\b\u001a\u0010\u000eJ\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0000H\u0086\u0082\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010 HÖ\u0083\u0004J\n\u0010!\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\"\u001a\u00020#HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0084\b¢\u0006\u0004\n\u0002\u0010\u0007\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006$"}, m65681d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "J", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "plus", AttachmentExtensionsKt.EXTRA_DURATION, "plus-LRDsOJo", "(JJ)J", "minus", "minus-LRDsOJo", "hasPassedNow", "", "hasPassedNow-impl", "(J)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "other", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "minus-6eNON_k", "compareTo", "", "compareTo-6eNON_k", "(JJ)I", "equals", "", "hashCode", "toString", "", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class ValueTimeMark implements ComparableTimeMark {
            private final long reading;

            private /* synthetic */ ValueTimeMark(long j7) {
                this.reading = j7;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m134380boximpl(long j7) {
                return new ValueTimeMark(j7);
            }

            /* JADX INFO: renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m134381compareTo6eNON_k(long j7, long j13) {
                return Duration.m134261compareToLRDsOJo(m134390minus6eNON_k(j7, j13), Duration.INSTANCE.m134357getZEROUwyO8pc());
            }

            /* JADX INFO: renamed from: compareTo-impl, reason: not valid java name */
            public static int m134382compareToimpl(long j7, ComparableTimeMark other) {
                AbstractC22676k.m65750j(other, "other");
                return m134380boximpl(j7).compareTo(other);
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m134383constructorimpl(long j7) {
                return j7;
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m134385equalsimpl(long j7, Object obj) {
                return (obj instanceof ValueTimeMark) && j7 == ((ValueTimeMark) obj).getReading();
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m134386equalsimpl0(long j7, long j13) {
                return j7 == j13;
            }

            /* JADX INFO: renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m134387hasNotPassedNowimpl(long j7) {
                return Duration.m134288isNegativeimpl(m134384elapsedNowUwyO8pc(j7));
            }

            /* JADX INFO: renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m134388hasPassedNowimpl(long j7) {
                return !Duration.m134288isNegativeimpl(m134384elapsedNowUwyO8pc(j7));
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m134389hashCodeimpl(long j7) {
                return Long.hashCode(j7);
            }

            /* JADX INFO: renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m134390minus6eNON_k(long j7, long j13) {
                return MonotonicTimeSource.INSTANCE.m134372differenceBetweenfRLX17w(j7, j13);
            }

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m134394toStringimpl(long j7) {
                return "ValueTimeMark(reading=" + j7 + ')';
            }

            @Override // p715kotlin.time.TimeMark
            /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
            public long mo134250elapsedNowUwyO8pc() {
                return m134384elapsedNowUwyO8pc(this.reading);
            }

            @Override // p715kotlin.time.ComparableTimeMark
            public boolean equals(Object other) {
                return m134385equalsimpl(this.reading, other);
            }

            @Override // p715kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m134387hasNotPassedNowimpl(this.reading);
            }

            @Override // p715kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m134388hasPassedNowimpl(this.reading);
            }

            @Override // p715kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m134389hashCodeimpl(this.reading);
            }

            @Override // p715kotlin.time.ComparableTimeMark, p715kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo134251minusLRDsOJo(long j7) {
                return m134380boximpl(m134395minusLRDsOJo(j7));
            }

            @Override // p715kotlin.time.ComparableTimeMark
            /* JADX INFO: renamed from: minus-UwyO8pc */
            public long mo134252minusUwyO8pc(ComparableTimeMark other) {
                AbstractC22676k.m65750j(other, "other");
                return m134392minusUwyO8pc(this.reading, other);
            }

            @Override // p715kotlin.time.ComparableTimeMark, p715kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo134253plusLRDsOJo(long j7) {
                return m134380boximpl(m134396plusLRDsOJo(j7));
            }

            public String toString() {
                return m134394toStringimpl(this.reading);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ long getReading() {
                return this.reading;
            }

            /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m134384elapsedNowUwyO8pc(long j7) {
                return MonotonicTimeSource.INSTANCE.m134373elapsedFrom6eNON_k(j7);
            }

            /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m134392minusUwyO8pc(long j7, ComparableTimeMark other) {
                AbstractC22676k.m65750j(other, "other");
                if (other instanceof ValueTimeMark) {
                    return m134390minus6eNON_k(j7, ((ValueTimeMark) other).getReading());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m134394toStringimpl(j7)) + " and " + other);
            }

            @Override // java.lang.Comparable
            public /* bridge */ int compareTo(ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // p715kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo134251minusLRDsOJo(long j7) {
                return m134380boximpl(m134395minusLRDsOJo(j7));
            }

            @Override // p715kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo134253plusLRDsOJo(long j7) {
                return m134380boximpl(m134396plusLRDsOJo(j7));
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m134395minusLRDsOJo(long j7) {
                return m134391minusLRDsOJo(this.reading, j7);
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m134396plusLRDsOJo(long j7) {
                return m134393plusLRDsOJo(this.reading, j7);
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m134391minusLRDsOJo(long j7, long j13) {
                return MonotonicTimeSource.INSTANCE.m134371adjustReading6QKq23U(j7, Duration.m134306unaryMinusUwyO8pc(j13));
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m134393plusLRDsOJo(long j7, long j13) {
                return MonotonicTimeSource.INSTANCE.m134371adjustReading6QKq23U(j7, j13);
            }
        }

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, p715kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
            return ValueTimeMark.m134380boximpl(m134379markNowz9LOYto());
        }

        /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m134379markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m134374markNowz9LOYto();
        }

        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }

        @Override // p715kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m134380boximpl(m134379markNowz9LOYto());
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u00020\u0003H¦\u0080\u0004¨\u0006\u0004"}, m65681d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface WithComparableMarks extends TimeSource {
        @Override // p715kotlin.time.TimeSource
        ComparableTimeMark markNow();
    }

    TimeMark markNow();
}
