package p715kotlin.time;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0019\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0082\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0096\u0082\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0019\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0000H¦\u0082\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0082\u0004J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\u0011H¦\u0082\u0004J\n\u0010\u0012\u001a\u00020\u000eH¦\u0080\u0004¨\u0006\u0013"}, m65681d2 = {"Lkotlin/time/ComparableTimeMark;", "Lkotlin/time/TimeMark;", "", "plus", AttachmentExtensionsKt.EXTRA_DURATION, "Lkotlin/time/Duration;", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "minus", "minus-LRDsOJo", "other", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "compareTo", "", "equals", "", "", "hashCode", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static int compareTo(ComparableTimeMark comparableTimeMark, ComparableTimeMark other) {
            AbstractC22676k.m65750j(other, "other");
            return Duration.m134261compareToLRDsOJo(comparableTimeMark.mo134252minusUwyO8pc(other), Duration.INSTANCE.m134357getZEROUwyO8pc());
        }

        public static boolean hasNotPassedNow(ComparableTimeMark comparableTimeMark) {
            return TimeMark.DefaultImpls.hasNotPassedNow(comparableTimeMark);
        }

        public static boolean hasPassedNow(ComparableTimeMark comparableTimeMark) {
            return TimeMark.DefaultImpls.hasPassedNow(comparableTimeMark);
        }

        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static ComparableTimeMark m134255minusLRDsOJo(ComparableTimeMark comparableTimeMark, long j7) {
            return comparableTimeMark.mo134253plusLRDsOJo(Duration.m134306unaryMinusUwyO8pc(j7));
        }
    }

    int compareTo(ComparableTimeMark other);

    boolean equals(Object other);

    int hashCode();

    @Override // p715kotlin.time.TimeMark
    /* JADX INFO: renamed from: minus-LRDsOJo */
    ComparableTimeMark mo134251minusLRDsOJo(long duration);

    /* JADX INFO: renamed from: minus-UwyO8pc */
    long mo134252minusUwyO8pc(ComparableTimeMark other);

    @Override // p715kotlin.time.TimeMark
    /* JADX INFO: renamed from: plus-LRDsOJo */
    ComparableTimeMark mo134253plusLRDsOJo(long duration);
}
