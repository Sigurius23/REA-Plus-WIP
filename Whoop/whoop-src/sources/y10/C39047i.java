package y10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: y10.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C39047i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f168029w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39046h f168030x;

    /* JADX INFO: renamed from: y */
    public int f168031y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39047i(C39046h c39046h, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f168030x = c39046h;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f168029w = obj;
        this.f168031y |= Integer.MIN_VALUE;
        Object objM124468d = this.f168030x.m124468d(null, null, null, this);
        return objM124468d == EnumC31071a.f128113w ? objM124468d : new C23468n(objM124468d);
    }
}
