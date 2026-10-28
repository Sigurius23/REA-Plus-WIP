package a30;

import kr.C22786e;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a30.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0280c0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C0332w0 f983w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f984x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C22786e f985y;

    /* JADX INFO: renamed from: z */
    public int f986z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0280c0(C22786e c22786e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f985y = c22786e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f984x = obj;
        this.f986z |= Integer.MIN_VALUE;
        return this.f985y.m65999h(null, null, this);
    }
}
