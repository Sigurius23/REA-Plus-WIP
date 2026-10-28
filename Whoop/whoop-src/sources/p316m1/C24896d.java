package p316m1;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: m1.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C24896d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f97522w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24902g f97523x;

    /* JADX INFO: renamed from: y */
    public int f97524y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24896d(C24902g c24902g, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f97523x = c24902g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f97522w = obj;
        this.f97524y |= Integer.MIN_VALUE;
        return this.f97523x.m73005a(null, null, this);
    }
}
