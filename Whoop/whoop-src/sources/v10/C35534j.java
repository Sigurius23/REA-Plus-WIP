package v10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: v10.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C35534j extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f151186w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35535k f151187x;

    /* JADX INFO: renamed from: y */
    public int f151188y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35534j(C35535k c35535k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f151187x = c35535k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f151186w = obj;
        this.f151188y |= Integer.MIN_VALUE;
        Object objMo112691g = this.f151187x.mo112691g(null, null, null, this);
        return objMo112691g == EnumC31071a.f128113w ? objMo112691g : new C23468n(objMo112691g);
    }
}
