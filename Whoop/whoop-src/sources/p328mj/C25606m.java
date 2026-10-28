package p328mj;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: mj.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C25606m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f100454w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25609p f100455x;

    /* JADX INFO: renamed from: y */
    public int f100456y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25606m(C25609p c25609p, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f100455x = c25609p;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f100454w = obj;
        this.f100456y |= Integer.MIN_VALUE;
        return this.f100455x.m75332b(null, this);
    }
}
