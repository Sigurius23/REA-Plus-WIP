package p343nk;

import mc3.InterfaceC25435a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: nk.c */
/* JADX INFO: loaded from: classes.dex */
public final class C26782c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C26788i f106667E;

    /* JADX INFO: renamed from: F */
    public int f106668F;

    /* JADX INFO: renamed from: w */
    public C26788i f106669w;

    /* JADX INFO: renamed from: x */
    public String f106670x;

    /* JADX INFO: renamed from: y */
    public InterfaceC25435a f106671y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f106672z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26782c(C26788i c26788i, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f106667E = c26788i;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f106672z = obj;
        this.f106668F |= Integer.MIN_VALUE;
        return this.f106667E.m79815d(null, this);
    }
}
