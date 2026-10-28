package p33;

import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p33.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C28816i extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f116659E;

    /* JADX INFO: renamed from: w */
    public C28822o f116660w;

    /* JADX INFO: renamed from: x */
    public C22669g0 f116661x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f116662y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C28822o f116663z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28816i(C28822o c28822o, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f116663z = c28822o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116662y = obj;
        this.f116659E |= Integer.MIN_VALUE;
        return this.f116663z.setPublisher(null, this);
    }
}
