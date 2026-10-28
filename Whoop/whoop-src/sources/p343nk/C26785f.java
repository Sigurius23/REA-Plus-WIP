package p343nk;

import mc3.InterfaceC25435a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: nk.f */
/* JADX INFO: loaded from: classes.dex */
public final class C26785f extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f106679E;

    /* JADX INFO: renamed from: w */
    public C26788i f106680w;

    /* JADX INFO: renamed from: x */
    public InterfaceC25435a f106681x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f106682y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C26788i f106683z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26785f(C26788i c26788i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f106683z = c26788i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f106682y = obj;
        this.f106679E |= Integer.MIN_VALUE;
        return this.f106683z.m79819h(this);
    }
}
