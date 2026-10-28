package vg;

import mc3.InterfaceC25435a;
import p474s.C31983m2;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: vg.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C35962i extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C31983m2 f153127E;

    /* JADX INFO: renamed from: F */
    public int f153128F;

    /* JADX INFO: renamed from: w */
    public InterfaceC25435a f153129w;

    /* JADX INFO: renamed from: x */
    public C31983m2 f153130x;

    /* JADX INFO: renamed from: y */
    public int f153131y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f153132z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35962i(C31983m2 c31983m2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f153127E = c31983m2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f153132z = obj;
        this.f153128F |= Integer.MIN_VALUE;
        return this.f153127E.m99483g(this);
    }
}
