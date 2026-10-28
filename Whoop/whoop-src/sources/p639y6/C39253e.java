package p639y6;

import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: y6.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C39253e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public AbstractC32275i f168768w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f168769x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C39254f f168770y;

    /* JADX INFO: renamed from: z */
    public int f168771z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39253e(C39254f c39254f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f168770y = c39254f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f168769x = obj;
        this.f168771z |= Integer.MIN_VALUE;
        return this.f168770y.m125029d(null, null, null, null, this);
    }
}
