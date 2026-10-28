package p522uf;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: uf.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C34872d0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C34894u f146896w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f146897x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C34873e f146898y;

    /* JADX INFO: renamed from: z */
    public int f146899z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34872d0(C34873e c34873e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f146898y = c34873e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f146897x = obj;
        this.f146899z |= Integer.MIN_VALUE;
        return this.f146898y.m110026b(null, this);
    }
}
