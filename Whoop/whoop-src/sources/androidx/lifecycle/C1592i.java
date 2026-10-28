package androidx.lifecycle;

import l83.C23454a0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.lifecycle.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C1592i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f6245w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C1596j f6246x;

    /* JADX INFO: renamed from: y */
    public int f6247y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592i(C1596j c1596j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f6246x = c1596j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f6245w = obj;
        this.f6247y |= Integer.MIN_VALUE;
        this.f6246x.m4996d(this);
        return C23454a0.f92919a;
    }
}
