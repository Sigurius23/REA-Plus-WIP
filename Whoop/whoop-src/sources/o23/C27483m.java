package o23;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: o23.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C27483m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C27478h f110708w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f110709x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C27478h f110710y;

    /* JADX INFO: renamed from: z */
    public int f110711z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27483m(C27478h c27478h, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f110710y = c27478h;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f110709x = obj;
        this.f110711z |= Integer.MIN_VALUE;
        return this.f110710y.await(this);
    }
}
