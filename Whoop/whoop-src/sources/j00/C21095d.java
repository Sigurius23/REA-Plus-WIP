package j00;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: j00.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C21095d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f79984E;

    /* JADX INFO: renamed from: w */
    public C21103h f79985w;

    /* JADX INFO: renamed from: x */
    public String f79986x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f79987y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C21103h f79988z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21095d(C21103h c21103h, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f79988z = c21103h;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f79987y = obj;
        this.f79984E |= Integer.MIN_VALUE;
        return C21103h.m58925g(this.f79988z, null, this);
    }
}
