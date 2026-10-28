package vg;

import bc3.InterfaceC3055s;
import p012ab.C0682h0;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: vg.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C35968o extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0682h0 f153144E;

    /* JADX INFO: renamed from: F */
    public int f153145F;

    /* JADX INFO: renamed from: w */
    public AbstractC32275i f153146w;

    /* JADX INFO: renamed from: x */
    public InterfaceC3055s f153147x;

    /* JADX INFO: renamed from: y */
    public Object f153148y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f153149z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35968o(C0682h0 c0682h0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f153144E = c0682h0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f153149z = obj;
        this.f153145F |= Integer.MIN_VALUE;
        return this.f153144E.m1706v(null, this);
    }
}
