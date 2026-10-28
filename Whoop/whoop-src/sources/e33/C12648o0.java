package e33;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12648o0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C12662v0 f43208w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f43209x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12662v0 f43210y;

    /* JADX INFO: renamed from: z */
    public int f43211z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12648o0(C12662v0 c12662v0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43210y = c12662v0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43209x = obj;
        this.f43211z |= Integer.MIN_VALUE;
        Object objM35424n = this.f43210y.m35424n(null, this);
        return objM35424n == EnumC31071a.f128113w ? objM35424n : new C23468n(objM35424n);
    }
}
