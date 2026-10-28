package p115ed;

import p474s.C31983m2;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ed.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C13108c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C13109d f45300E;

    /* JADX INFO: renamed from: F */
    public int f45301F;

    /* JADX INFO: renamed from: w */
    public C13107b f45302w;

    /* JADX INFO: renamed from: x */
    public C31983m2 f45303x;

    /* JADX INFO: renamed from: y */
    public C13110e f45304y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f45305z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13108c(C13109d c13109d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f45300E = c13109d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45305z = obj;
        this.f45301F |= Integer.MIN_VALUE;
        return this.f45300E.m36634I(null, null, this);
    }
}
