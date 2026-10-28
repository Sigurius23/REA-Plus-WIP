package y10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: y10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39040b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f168013w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39041c f168014x;

    /* JADX INFO: renamed from: y */
    public int f168015y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39040b(C39041c c39041c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f168014x = c39041c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f168013w = obj;
        this.f168015y |= Integer.MIN_VALUE;
        Object objM124463b = this.f168014x.m124463b(null, null, null, null, this);
        return objM124463b == EnumC31071a.f128113w ? objM124463b : new C23468n(objM124463b);
    }
}
