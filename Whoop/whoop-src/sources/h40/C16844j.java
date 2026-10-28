package h40;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h40.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C16844j extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C16845k f64725w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f64726x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16845k f64727y;

    /* JADX INFO: renamed from: z */
    public int f64728z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16844j(C16845k c16845k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64727y = c16845k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64726x = obj;
        this.f64728z |= Integer.MIN_VALUE;
        return this.f64727y.m47443c(this);
    }
}
