package a00;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: a00.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C0075j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f235E;

    /* JADX INFO: renamed from: w */
    public C0072g f236w;

    /* JADX INFO: renamed from: x */
    public C0072g f237x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f238y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0072g f239z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075j(C0072g c0072g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f239z = c0072g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f238y = obj;
        this.f235E |= Integer.MIN_VALUE;
        return this.f239z.m193j(null, this);
    }
}
