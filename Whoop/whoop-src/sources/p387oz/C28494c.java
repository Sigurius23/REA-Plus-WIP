package p387oz;

import l83.C23468n;
import p619xl.C38445a;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: oz.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C28494c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f115377w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38445a f115378x;

    /* JADX INFO: renamed from: y */
    public int f115379y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28494c(C38445a c38445a, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f115378x = c38445a;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f115377w = obj;
        this.f115379y |= Integer.MIN_VALUE;
        Object objM123168E = this.f115378x.m123168E(null, null, this);
        return objM123168E == EnumC31071a.f128113w ? objM123168E : new C23468n(objM123168E);
    }
}
