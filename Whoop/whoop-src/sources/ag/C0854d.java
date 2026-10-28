package ag;

import p647yf.InterfaceC39492e;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ag.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C0854d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public InterfaceC39492e f3055w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f3056x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0855e f3057y;

    /* JADX INFO: renamed from: z */
    public int f3058z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0854d(C0855e c0855e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f3057y = c0855e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f3056x = obj;
        this.f3058z |= Integer.MIN_VALUE;
        return this.f3057y.mo2062a(null, null, this);
    }
}
