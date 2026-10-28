package p664yy;

import e93.AbstractC12889b;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;

/* JADX INFO: renamed from: yy.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C39875o implements InterfaceC39860g0 {

    /* JADX INFO: renamed from: a */
    public final long f172192a = DurationKt.toDuration(2L, DurationUnit.SECONDS);

    @Override // p664yy.InterfaceC39860g0
    /* JADX INFO: renamed from: a */
    public final long mo127936a(int i13) {
        int iM36284n = 4 - AbstractC12889b.m36284n(i13, 1, 3);
        DurationUnit durationUnit = DurationUnit.SECONDS;
        return DurationKt.toDuration(Math.pow(Duration.m134298toDoubleimpl(this.f172192a, durationUnit), iM36284n), durationUnit);
    }
}
