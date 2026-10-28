package f53;

import n23.C26200c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: f53.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C14120h extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f50738E;

    /* JADX INFO: renamed from: w */
    public C14122j f50739w;

    /* JADX INFO: renamed from: x */
    public C26200c f50740x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f50741y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C14122j f50742z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14120h(C14122j c14122j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f50742z = c14122j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f50741y = obj;
        this.f50738E |= Integer.MIN_VALUE;
        return this.f50742z.m40216h(null, this);
    }
}
