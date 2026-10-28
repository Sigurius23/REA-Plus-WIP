package nz;

import gm.C15990r;
import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: nz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C27300a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f109352w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15990r f109353x;

    /* JADX INFO: renamed from: y */
    public int f109354y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27300a(C15990r c15990r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f109353x = c15990r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f109352w = obj;
        this.f109354y |= Integer.MIN_VALUE;
        Object objM45140C = this.f109353x.m45140C(null, null, this);
        return objM45140C == EnumC31071a.f128113w ? objM45140C : new C23468n(objM45140C);
    }
}
