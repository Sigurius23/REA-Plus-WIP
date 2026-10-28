package p045c6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: c6.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C4263f extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f17318E;

    /* JADX INFO: renamed from: w */
    public boolean f17319w;

    /* JADX INFO: renamed from: x */
    public C4260c f17320x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f17321y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C4265h f17322z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4263f(C4265h c4265h, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f17322z = c4265h;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f17321y = obj;
        this.f17318E |= Integer.MIN_VALUE;
        return this.f17322z.mo1103b(null, this);
    }
}
