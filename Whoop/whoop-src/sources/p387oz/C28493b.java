package p387oz;

import l83.C23468n;
import p619xl.C38445a;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: oz.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C28493b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f115374w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38445a f115375x;

    /* JADX INFO: renamed from: y */
    public int f115376y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28493b(C38445a c38445a, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f115375x = c38445a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f115374w = obj;
        this.f115376y |= Integer.MIN_VALUE;
        Object objM123183t = this.f115375x.m123183t(null, this);
        return objM123183t == EnumC31071a.f128113w ? objM123183t : new C23468n(objM123183t);
    }
}
