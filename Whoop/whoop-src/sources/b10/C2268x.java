package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C2268x extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8996w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8997x;

    /* JADX INFO: renamed from: y */
    public int f8998y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2268x(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8997x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8996w = obj;
        this.f8998y |= Integer.MIN_VALUE;
        Object objM7095r = this.f8997x.m7095r(null, null, null, this);
        return objM7095r == EnumC31071a.f128113w ? objM7095r : new C23468n(objM7095r);
    }
}
