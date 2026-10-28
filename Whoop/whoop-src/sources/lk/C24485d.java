package lk;

import p255jk.C21743a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: lk.d */
/* JADX INFO: loaded from: classes.dex */
public final class C24485d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f95522E;

    /* JADX INFO: renamed from: w */
    public Object f95523w;

    /* JADX INFO: renamed from: x */
    public C21743a f95524x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f95525y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C24488g f95526z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24485d(C24488g c24488g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f95526z = c24488g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f95525y = obj;
        this.f95522E |= Integer.MIN_VALUE;
        return this.f95526z.m71258a(null, this);
    }
}
