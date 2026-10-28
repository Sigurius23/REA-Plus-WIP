package v10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: v10.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C35538n extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f151195w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35539o f151196x;

    /* JADX INFO: renamed from: y */
    public int f151197y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35538n(C35539o c35539o, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f151196x = c35539o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f151195w = obj;
        this.f151197y |= Integer.MIN_VALUE;
        Object objMo112691g = this.f151196x.mo112691g(null, null, null, this);
        return objMo112691g == EnumC31071a.f128113w ? objMo112691g : new C23468n(objMo112691g);
    }
}
