package b10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b10.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C2240j extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f8901w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C2273z0 f8902x;

    /* JADX INFO: renamed from: y */
    public int f8903y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2240j(C2273z0 c2273z0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f8902x = c2273z0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f8901w = obj;
        this.f8903y |= Integer.MIN_VALUE;
        Object objM7079a = this.f8902x.m7079a(null, null, null, null, null, this);
        return objM7079a == EnumC31071a.f128113w ? objM7079a : new C23468n(objM7079a);
    }
}
