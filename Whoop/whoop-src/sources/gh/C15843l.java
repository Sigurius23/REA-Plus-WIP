package gh;

import p117eh.C13190g;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: gh.l */
/* JADX INFO: loaded from: classes.dex */
public final class C15843l extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C15844m f59835E;

    /* JADX INFO: renamed from: F */
    public int f59836F;

    /* JADX INFO: renamed from: w */
    public C15844m f59837w;

    /* JADX INFO: renamed from: x */
    public C13190g f59838x;

    /* JADX INFO: renamed from: y */
    public Object f59839y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f59840z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15843l(C15844m c15844m, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f59835E = c15844m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f59840z = obj;
        this.f59836F |= Integer.MIN_VALUE;
        return this.f59835E.mo44670a(this);
    }
}
