package p173gj;

import java.util.List;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: gj.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C15910k extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f60185E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C15912m f60186F;

    /* JADX INFO: renamed from: G */
    public int f60187G;

    /* JADX INFO: renamed from: w */
    public C15912m f60188w;

    /* JADX INFO: renamed from: x */
    public List f60189x;

    /* JADX INFO: renamed from: y */
    public long f60190y;

    /* JADX INFO: renamed from: z */
    public boolean f60191z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15910k(C15912m c15912m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f60186F = c15912m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f60185E = obj;
        this.f60187G |= Integer.MIN_VALUE;
        return this.f60186F.m44893g0(0L, this);
    }
}
