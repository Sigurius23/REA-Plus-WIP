package p163g1;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C15165v extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f56888w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14947a0 f56889x;

    /* JADX INFO: renamed from: y */
    public int f56890y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15165v(C14947a0 c14947a0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f56889x = c14947a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f56888w = obj;
        this.f56890y |= Integer.MIN_VALUE;
        return this.f56889x.m43067b(null, null, null, this);
    }
}
