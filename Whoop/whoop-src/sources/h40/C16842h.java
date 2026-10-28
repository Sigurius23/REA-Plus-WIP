package h40;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h40.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C16842h extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C16845k f64717w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f64718x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16845k f64719y;

    /* JADX INFO: renamed from: z */
    public int f64720z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16842h(C16845k c16845k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64719y = c16845k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64718x = obj;
        this.f64720z |= Integer.MIN_VALUE;
        return this.f64719y.m47441a(this);
    }
}
