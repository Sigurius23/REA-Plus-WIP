package d33;

import s83.AbstractC32269c;
import v33.C35626k;

/* JADX INFO: renamed from: d33.g0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11598g0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f37409E;

    /* JADX INFO: renamed from: w */
    public C11602h1 f37410w;

    /* JADX INFO: renamed from: x */
    public C35626k f37411x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f37412y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11602h1 f37413z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11598g0(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37413z = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37412y = obj;
        this.f37409E |= Integer.MIN_VALUE;
        return this.f37413z.m31045u(null, this);
    }
}
