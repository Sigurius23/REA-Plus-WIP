package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C12491n extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42647w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42648x;

    /* JADX INFO: renamed from: y */
    public int f42649y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12491n(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42648x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f42647w = obj;
        this.f42649y |= Integer.MIN_VALUE;
        Object objM35126n = this.f42648x.m35126n(null, null, null, null, null, null, null, null, null, this);
        return objM35126n == EnumC31071a.f128113w ? objM35126n : new C23468n(objM35126n);
    }
}
