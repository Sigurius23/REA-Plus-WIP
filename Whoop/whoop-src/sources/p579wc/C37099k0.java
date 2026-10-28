package p579wc;

import p580wd.C37154g;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37099k0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C37105m0 f158708E;

    /* JADX INFO: renamed from: F */
    public int f158709F;

    /* JADX INFO: renamed from: w */
    public C37154g f158710w;

    /* JADX INFO: renamed from: x */
    public String f158711x;

    /* JADX INFO: renamed from: y */
    public String f158712y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f158713z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37099k0(C37105m0 c37105m0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158708E = c37105m0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158713z = obj;
        this.f158709F |= Integer.MIN_VALUE;
        return this.f158708E.m119028h(null, null, this);
    }
}
