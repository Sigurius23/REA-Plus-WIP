package v10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: v10.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C35533i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f151183w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35535k f151184x;

    /* JADX INFO: renamed from: y */
    public int f151185y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35533i(C35535k c35535k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f151184x = c35535k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f151183w = obj;
        this.f151185y |= Integer.MIN_VALUE;
        Object objMo112690f = this.f151184x.mo112690f(null, null, this);
        return objMo112690f == EnumC31071a.f128113w ? objMo112690f : new C23468n(objMo112690f);
    }
}
