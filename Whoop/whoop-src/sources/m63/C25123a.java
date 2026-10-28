package m63;

import la.C23548b;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: m63.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C25123a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f98466E;

    /* JADX INFO: renamed from: w */
    public C23548b f98467w;

    /* JADX INFO: renamed from: x */
    public C25126d f98468x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f98469y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23548b f98470z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25123a(C23548b c23548b, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f98470z = c23548b;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f98469y = obj;
        this.f98466E |= Integer.MIN_VALUE;
        return this.f98470z.m68165G(null, this);
    }
}
