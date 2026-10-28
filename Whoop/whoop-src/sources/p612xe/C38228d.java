package p612xe;

import p085d9.C11799p;
import p326mf.InterfaceC25488h;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xe.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C38228d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public InterfaceC25488h f163866w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f163867x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11799p f163868y;

    /* JADX INFO: renamed from: z */
    public int f163869z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38228d(C11799p c11799p, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f163868y = c11799p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f163867x = obj;
        this.f163869z |= Integer.MIN_VALUE;
        return this.f163868y.m31621e(null, this);
    }
}
