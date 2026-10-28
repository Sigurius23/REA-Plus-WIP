package l30;

import ai.C0904j;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: l30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C23293b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C0904j f92282w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f92283x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0904j f92284y;

    /* JADX INFO: renamed from: z */
    public int f92285z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23293b(C0904j c0904j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f92284y = c0904j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f92283x = obj;
        this.f92285z |= Integer.MIN_VALUE;
        return this.f92284y.m2221h(this);
    }
}
