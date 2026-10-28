package p279kd;

import p474s.C31983m2;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: kd.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C22376c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C22377d f87346E;

    /* JADX INFO: renamed from: F */
    public int f87347F;

    /* JADX INFO: renamed from: w */
    public C22375b f87348w;

    /* JADX INFO: renamed from: x */
    public C31983m2 f87349x;

    /* JADX INFO: renamed from: y */
    public C22378e f87350y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f87351z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22376c(C22377d c22377d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f87346E = c22377d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f87351z = obj;
        this.f87347F |= Integer.MIN_VALUE;
        return this.f87346E.m64295I(null, null, this);
    }
}
