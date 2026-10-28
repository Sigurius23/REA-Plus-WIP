package p579wc;

import mc3.C25437c;
import s83.AbstractC32269c;
import ve.C35920e;

/* JADX INFO: renamed from: wc.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C37112q extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public C25437c f158764E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f158765F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C37116s f158766G;

    /* JADX INFO: renamed from: H */
    public int f158767H;

    /* JADX INFO: renamed from: w */
    public Object f158768w;

    /* JADX INFO: renamed from: x */
    public Exception f158769x;

    /* JADX INFO: renamed from: y */
    public C35920e f158770y;

    /* JADX INFO: renamed from: z */
    public C35920e f158771z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37112q(C37116s c37116s, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158766G = c37116s;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158765F = obj;
        this.f158767H |= Integer.MIN_VALUE;
        return this.f158766G.mo79294b(null, this);
    }
}
