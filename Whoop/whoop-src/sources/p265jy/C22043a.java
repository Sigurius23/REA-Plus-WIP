package p265jy;

import l83.C23468n;
import p715kotlin.jvm.internal.AbstractC22674j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: jy.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C22043a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f85512w;

    /* JADX INFO: renamed from: x */
    public int f85513x;

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f85512w = obj;
        this.f85513x |= Integer.MIN_VALUE;
        Object objM65708P = AbstractC22674j.m65708P(null, null, null, this);
        return objM65708P == EnumC31071a.f128113w ? objM65708P : new C23468n(objM65708P);
    }
}
