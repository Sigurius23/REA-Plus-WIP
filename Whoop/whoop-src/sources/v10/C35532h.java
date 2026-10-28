package v10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: v10.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C35532h extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f151180w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35535k f151181x;

    /* JADX INFO: renamed from: y */
    public int f151182y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35532h(C35535k c35535k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f151181x = c35535k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f151180w = obj;
        this.f151182y |= Integer.MIN_VALUE;
        Object objMo112687c = this.f151181x.mo112687c(null, null, this, null);
        return objMo112687c == EnumC31071a.f128113w ? objMo112687c : new C23468n(objMo112687c);
    }
}
