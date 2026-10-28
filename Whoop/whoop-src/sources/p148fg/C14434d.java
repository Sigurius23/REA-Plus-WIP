package p148fg;

import gg.EnumC15819f;
import mc3.C25437c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: fg.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C14434d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f52686E;

    /* JADX INFO: renamed from: w */
    public EnumC15819f f52687w;

    /* JADX INFO: renamed from: x */
    public C25437c f52688x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f52689y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C14435e f52690z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14434d(C14435e c14435e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f52690z = c14435e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f52689y = obj;
        this.f52686E |= Integer.MIN_VALUE;
        return this.f52690z.m41164c(null, this);
    }
}
