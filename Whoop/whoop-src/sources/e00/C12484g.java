package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C12484g extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42626w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42627x;

    /* JADX INFO: renamed from: y */
    public int f42628y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12484g(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42627x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f42626w = obj;
        this.f42628y |= Integer.MIN_VALUE;
        Object objM35119g = this.f42627x.m35119g(null, null, null, this);
        return objM35119g == EnumC31071a.f128113w ? objM35119g : new C23468n(objM35119g);
    }
}
