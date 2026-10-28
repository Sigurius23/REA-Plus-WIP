package p715kotlin.time;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦\u0080\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0082\u0004¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0096\u0082\u0004¢\u0006\u0004\b\u000b\u0010\tJ\n\u0010\f\u001a\u00020\rH\u0096\u0080\u0004J\n\u0010\u000e\u001a\u00020\rH\u0096\u0080\u0004¨\u0006\u000f"}, m65681d2 = {"Lkotlin/time/TimeMark;", "", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "()J", "plus", AttachmentExtensionsKt.EXTRA_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "minus", "minus-LRDsOJo", "hasPassedNow", "", "hasNotPassedNow", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface TimeMark {

    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        public static boolean hasNotPassedNow(TimeMark timeMark) {
            return Duration.m134288isNegativeimpl(timeMark.mo134250elapsedNowUwyO8pc());
        }

        public static boolean hasPassedNow(TimeMark timeMark) {
            return !Duration.m134288isNegativeimpl(timeMark.mo134250elapsedNowUwyO8pc());
        }

        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static TimeMark m134377minusLRDsOJo(TimeMark timeMark, long j7) {
            return timeMark.mo134253plusLRDsOJo(Duration.m134306unaryMinusUwyO8pc(j7));
        }

        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public static TimeMark m134378plusLRDsOJo(TimeMark timeMark, long j7) {
            return new AdjustedTimeMark(timeMark, j7, null);
        }
    }

    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    long mo134250elapsedNowUwyO8pc();

    boolean hasNotPassedNow();

    boolean hasPassedNow();

    /* JADX INFO: renamed from: minus-LRDsOJo */
    TimeMark mo134251minusLRDsOJo(long duration);

    /* JADX INFO: renamed from: plus-LRDsOJo */
    TimeMark mo134253plusLRDsOJo(long duration);
}
