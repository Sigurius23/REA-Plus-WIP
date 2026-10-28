package a43;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: a43.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C0383e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f1320E;

    /* JADX INFO: renamed from: w */
    public C0384f f1321w;

    /* JADX INFO: renamed from: x */
    public InterfaceC0380b f1322x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f1323y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0384f f1324z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383e(C0384f c0384f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1324z = c0384f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1323y = obj;
        this.f1320E |= Integer.MIN_VALUE;
        return this.f1324z.m1052b(null, this);
    }
}
