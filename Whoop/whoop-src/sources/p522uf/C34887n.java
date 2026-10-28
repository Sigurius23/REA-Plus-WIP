package p522uf;

import ag.C0855e;
import p647yf.InterfaceC39492e;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: uf.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C34887n extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f146927E;

    /* JADX INFO: renamed from: w */
    public C34894u f146928w;

    /* JADX INFO: renamed from: x */
    public InterfaceC39492e f146929x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f146930y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0855e f146931z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34887n(C0855e c0855e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f146931z = c0855e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f146930y = obj;
        this.f146927E |= Integer.MIN_VALUE;
        return this.f146931z.m2063b(null, null, this);
    }
}
