package p092dh;

import mc3.InterfaceC25439e;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: dh.d */
/* JADX INFO: loaded from: classes.dex */
public final class C12017d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f39750E;

    /* JADX INFO: renamed from: w */
    public Object f39751w;

    /* JADX INFO: renamed from: x */
    public InterfaceC25439e f39752x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f39753y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C12018e f39754z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12017d(C12018e c12018e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f39754z = c12018e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f39753y = obj;
        this.f39750E |= Integer.MIN_VALUE;
        return this.f39754z.mo33148a(this);
    }
}
