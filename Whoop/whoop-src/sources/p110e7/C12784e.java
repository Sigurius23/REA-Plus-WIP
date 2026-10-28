package p110e7;

import java.util.List;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e7.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C12784e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public List f43758w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f43759x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12786g f43760y;

    /* JADX INFO: renamed from: z */
    public int f43761z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12784e(C12786g c12786g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43760y = c12786g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43759x = obj;
        this.f43761z |= Integer.MIN_VALUE;
        return this.f43760y.mo7839c(null, this);
    }
}
