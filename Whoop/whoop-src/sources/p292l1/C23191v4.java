package p292l1;

import p043c4.InterfaceC3964i0;
import p636y3.C39179k;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: l1.v4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23191v4 implements InterfaceC3964i0 {

    /* JADX INFO: renamed from: w */
    public final int f91749w;

    public C23191v4(int i13) {
        this.f91749w = i13;
    }

    @Override // p043c4.InterfaceC3964i0
    /* JADX INFO: renamed from: i */
    public final long mo11994i(C39179k c39179k, long j7, EnumC39181m enumC39181m, long j13) {
        int i13 = (int) (j13 >> 32);
        int iM124798c = ((c39179k.m124798c() - i13) / 2) + c39179k.f168418a;
        if (iM124798c < 0) {
            iM124798c = c39179k.f168418a;
        } else if (iM124798c + i13 > ((int) (j7 >> 32))) {
            iM124798c = c39179k.f168420c - i13;
        }
        int i14 = c39179k.f168419b - ((int) (j13 & 4294967295L));
        int i15 = this.f91749w;
        int i16 = i14 - i15;
        if (i16 < 0) {
            i16 = c39179k.f168421d + i15;
        }
        return (((long) i16) & 4294967295L) | (((long) iM124798c) << 32);
    }
}
