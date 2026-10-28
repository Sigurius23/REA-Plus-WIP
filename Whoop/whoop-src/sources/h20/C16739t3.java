package h20;

import androidx.room.C1841x;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h20.t3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16739t3 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C1841x f64294w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f64295x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1841x f64296y;

    /* JADX INFO: renamed from: z */
    public int f64297z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16739t3(C1841x c1841x, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f64296y = c1841x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64295x = obj;
        this.f64297z |= Integer.MIN_VALUE;
        return this.f64296y.m5460e(null, this);
    }
}
