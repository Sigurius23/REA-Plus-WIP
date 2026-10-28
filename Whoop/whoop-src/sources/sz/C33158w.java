package sz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: sz.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C33158w extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f138268E;

    /* JADX INFO: renamed from: w */
    public C33161z f138269w;

    /* JADX INFO: renamed from: x */
    public AbstractC33155t f138270x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f138271y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C33161z f138272z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33158w(C33161z c33161z, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f138272z = c33161z;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f138271y = obj;
        this.f138268E |= Integer.MIN_VALUE;
        Object objM105021j = this.f138272z.m105021j(null, this);
        return objM105021j == EnumC31071a.f128113w ? objM105021j : new C23468n(objM105021j);
    }
}
