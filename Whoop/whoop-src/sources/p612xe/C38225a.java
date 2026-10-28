package p612xe;

import p085d9.C11799p;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xe.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C38225a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f163854w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11799p f163855x;

    /* JADX INFO: renamed from: y */
    public int f163856y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38225a(C11799p c11799p, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f163855x = c11799p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f163854w = obj;
        this.f163856y |= Integer.MIN_VALUE;
        return this.f163855x.m31617a(this);
    }
}
