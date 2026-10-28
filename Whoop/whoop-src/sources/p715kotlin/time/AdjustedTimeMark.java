package p715kotlin.time;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0019\bF\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\f\u001a\u00020\u0004H\u0096\u0080\u0004¢\u0006\u0004\b\r\u0010\nJ\u0019\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0096\u0082\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0002\u001a\u00020\u0001X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u0004X\u0086\u0084\b¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lkotlin/time/AdjustedTimeMark;", "Lkotlin/time/TimeMark;", "mark", "adjustment", "Lkotlin/time/Duration;", "<init>", "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMark", "()Lkotlin/time/TimeMark;", "getAdjustment-UwyO8pc", "()J", "J", "elapsedNow", "elapsedNow-UwyO8pc", "plus", AttachmentExtensionsKt.EXTRA_DURATION, "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
final class AdjustedTimeMark implements TimeMark {
    private final long adjustment;
    private final TimeMark mark;

    public /* synthetic */ AdjustedTimeMark(TimeMark timeMark, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, j7);
    }

    @Override // p715kotlin.time.TimeMark
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    public long mo134250elapsedNowUwyO8pc() {
        return Duration.m134290minusLRDsOJo(this.mark.mo134250elapsedNowUwyO8pc(), this.adjustment);
    }

    /* JADX INFO: renamed from: getAdjustment-UwyO8pc, reason: not valid java name and from getter */
    public final long getAdjustment() {
        return this.adjustment;
    }

    public final TimeMark getMark() {
        return this.mark;
    }

    @Override // p715kotlin.time.TimeMark
    public /* bridge */ boolean hasNotPassedNow() {
        return TimeMark.DefaultImpls.hasNotPassedNow(this);
    }

    @Override // p715kotlin.time.TimeMark
    public /* bridge */ boolean hasPassedNow() {
        return TimeMark.DefaultImpls.hasPassedNow(this);
    }

    @Override // p715kotlin.time.TimeMark
    /* JADX INFO: renamed from: minus-LRDsOJo */
    public /* bridge */ TimeMark mo134251minusLRDsOJo(long j7) {
        return TimeMark.DefaultImpls.m134377minusLRDsOJo(this, j7);
    }

    @Override // p715kotlin.time.TimeMark
    /* JADX INFO: renamed from: plus-LRDsOJo */
    public TimeMark mo134253plusLRDsOJo(long duration) {
        return new AdjustedTimeMark(this.mark, Duration.m134291plusLRDsOJo(this.adjustment, duration), null);
    }

    private AdjustedTimeMark(TimeMark mark, long j7) {
        AbstractC22676k.m65750j(mark, "mark");
        this.mark = mark;
        this.adjustment = j7;
    }
}
