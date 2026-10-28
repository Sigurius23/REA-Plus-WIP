package p343nk;

import mc3.InterfaceC25435a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: nk.d */
/* JADX INFO: loaded from: classes.dex */
public final class C26783d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f106673E;

    /* JADX INFO: renamed from: w */
    public C26788i f106674w;

    /* JADX INFO: renamed from: x */
    public InterfaceC25435a f106675x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f106676y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C26788i f106677z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26783d(C26788i c26788i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f106677z = c26788i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f106676y = obj;
        this.f106673E |= Integer.MIN_VALUE;
        return C26788i.m79812a(this.f106677z, this);
    }
}
