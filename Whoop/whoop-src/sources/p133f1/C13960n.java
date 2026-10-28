package p133f1;

import mc3.C25437c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: f1.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C13960n extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f49760E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C13966p f49761F;

    /* JADX INFO: renamed from: G */
    public int f49762G;

    /* JADX INFO: renamed from: w */
    public CharSequence f49763w;

    /* JADX INFO: renamed from: x */
    public Object f49764x;

    /* JADX INFO: renamed from: y */
    public C25437c f49765y;

    /* JADX INFO: renamed from: z */
    public long f49766z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13960n(C13966p c13966p, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f49761F = c13966p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f49760E = obj;
        this.f49762G |= Integer.MIN_VALUE;
        return C13966p.m39743a(this.f49761F, null, 0L, null, this);
    }
}
