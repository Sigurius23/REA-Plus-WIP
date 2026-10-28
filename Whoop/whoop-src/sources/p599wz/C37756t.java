package p599wz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wz.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C37756t extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C37770y f161726w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f161727x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37770y f161728y;

    /* JADX INFO: renamed from: z */
    public int f161729z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37756t(C37770y c37770y, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f161728y = c37770y;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161727x = obj;
        this.f161729z |= Integer.MIN_VALUE;
        Object objM121165g = C37770y.m121165g(this.f161728y, null, this);
        return objM121165g == EnumC31071a.f128113w ? objM121165g : new C23468n(objM121165g);
    }
}
