package p599wz;

import androidx.room.C1841x;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wz.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C37726j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f161662E;

    /* JADX INFO: renamed from: w */
    public C1841x f161663w;

    /* JADX INFO: renamed from: x */
    public AbstractC37747q f161664x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f161665y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C1841x f161666z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37726j(C1841x c1841x, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f161666z = c1841x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161665y = obj;
        this.f161662E |= Integer.MIN_VALUE;
        return this.f161666z.m5461f(null, this);
    }
}
