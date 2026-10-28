package p612xe;

import p085d9.C11799p;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xe.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C38227c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public byte[] f163862w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f163863x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11799p f163864y;

    /* JADX INFO: renamed from: z */
    public int f163865z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38227c(C11799p c11799p, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f163864y = c11799p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f163863x = obj;
        this.f163865z |= Integer.MIN_VALUE;
        return this.f163864y.m31620d(null, this);
    }
}
