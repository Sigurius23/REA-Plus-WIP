package p581we;

import p014aj.C0928c;
import p302lf.InterfaceC23891a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: we.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C37204t extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public InterfaceC23891a f159052w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f159053x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0928c f159054y;

    /* JADX INFO: renamed from: z */
    public int f159055z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37204t(C0928c c0928c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f159054y = c0928c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f159053x = obj;
        this.f159055z |= Integer.MIN_VALUE;
        return this.f159054y.m2310T(null, this);
    }
}
