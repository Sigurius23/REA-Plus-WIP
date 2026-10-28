package h20;

import androidx.room.C1841x;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h20.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16664h0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C1841x f64077w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f64078x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1841x f64079y;

    /* JADX INFO: renamed from: z */
    public int f64080z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16664h0(C1841x c1841x, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f64079y = c1841x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64078x = obj;
        this.f64080z |= Integer.MIN_VALUE;
        return this.f64079y.m5459c(null, this);
    }
}
