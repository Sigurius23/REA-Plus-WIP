package p00;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p00.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C28576m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C28578o f115617w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f115618x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28578o f115619y;

    /* JADX INFO: renamed from: z */
    public int f115620z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28576m(C28578o c28578o, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f115619y = c28578o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f115618x = obj;
        this.f115620z |= Integer.MIN_VALUE;
        return this.f115619y.m86908n(null, this);
    }
}
