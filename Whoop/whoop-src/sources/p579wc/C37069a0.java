package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.a0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37069a0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f158588E;

    /* JADX INFO: renamed from: w */
    public C37126x f158589w;

    /* JADX INFO: renamed from: x */
    public Object f158590x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f158591y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37084f0 f158592z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37069a0(C37084f0 c37084f0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158592z = c37084f0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158591y = obj;
        this.f158588E |= Integer.MIN_VALUE;
        return this.f158592z.m119009c(null, this);
    }
}
