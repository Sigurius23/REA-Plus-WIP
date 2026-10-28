package ec3;

import ch.C4588i;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.m0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13063m0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45140w;

    /* JADX INFO: renamed from: x */
    public int f45141x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C4588i f45142y;

    /* JADX INFO: renamed from: z */
    public Object f45143z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13063m0(C4588i c4588i, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45142y = c4588i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45140w = obj;
        this.f45141x |= Integer.MIN_VALUE;
        return this.f45142y.collect(null, this);
    }
}
