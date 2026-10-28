package ec3;

import dc3.InterfaceC11936u;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C13018b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public InterfaceC11936u f45005w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f45006x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13022c f45007y;

    /* JADX INFO: renamed from: z */
    public int f45008z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13018b(C13022c c13022c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f45007y = c13022c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45006x = obj;
        this.f45008z |= Integer.MIN_VALUE;
        return this.f45007y.mo36558e(null, this);
    }
}
