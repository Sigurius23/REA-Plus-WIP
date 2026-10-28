package p581we;

import p014aj.C0928c;
import p551vf.InterfaceC35936a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: we.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C37203s extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f159047E;

    /* JADX INFO: renamed from: w */
    public InterfaceC35936a f159048w;

    /* JADX INFO: renamed from: x */
    public C37187g f159049x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f159050y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0928c f159051z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37203s(C0928c c0928c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f159051z = c0928c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f159050y = obj;
        this.f159047E |= Integer.MIN_VALUE;
        return this.f159051z.m2332v(null, null, this);
    }
}
