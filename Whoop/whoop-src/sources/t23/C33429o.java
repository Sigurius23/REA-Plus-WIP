package t23;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: t23.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C33429o extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C33368c0 f139561w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f139562x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33368c0 f139563y;

    /* JADX INFO: renamed from: z */
    public int f139564z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33429o(C33368c0 c33368c0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139563y = c33368c0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139562x = obj;
        this.f139564z |= Integer.MIN_VALUE;
        return this.f139563y.m105813d(this);
    }
}
