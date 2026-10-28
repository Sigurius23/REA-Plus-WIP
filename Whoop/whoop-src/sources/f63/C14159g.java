package f63;

import bc3.InterfaceC3061u;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: f63.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C14159g extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public InterfaceC3061u f51012w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f51013x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C14162j f51014y;

    /* JADX INFO: renamed from: z */
    public int f51015z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14159g(C14162j c14162j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f51014y = c14162j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f51013x = obj;
        this.f51015z |= Integer.MIN_VALUE;
        return this.f51014y.m40346a(null, this);
    }
}
