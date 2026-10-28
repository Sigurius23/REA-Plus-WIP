package p522uf;

import ag.C0855e;
import p647yf.InterfaceC39492e;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: uf.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C34877g extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f146907E;

    /* JADX INFO: renamed from: w */
    public C34894u f146908w;

    /* JADX INFO: renamed from: x */
    public InterfaceC39492e f146909x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f146910y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0855e f146911z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34877g(C0855e c0855e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f146911z = c0855e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f146910y = obj;
        this.f146907E |= Integer.MIN_VALUE;
        return this.f146911z.m2063b(null, null, this);
    }
}
