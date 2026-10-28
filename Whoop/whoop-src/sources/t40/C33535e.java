package t40;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: t40.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C33535e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f139988w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C33536f f139989x;

    /* JADX INFO: renamed from: y */
    public int f139990y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33535e(C33536f c33536f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139989x = c33536f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139988w = obj;
        this.f139990y |= Integer.MIN_VALUE;
        Object objM105908c = this.f139989x.m105908c(this);
        return objM105908c == EnumC31071a.f128113w ? objM105908c : new C23468n(objM105908c);
    }
}
