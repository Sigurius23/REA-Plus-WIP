package a30;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: a30.y */
/* JADX INFO: loaded from: classes6.dex */
public final class C0335y extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C0274a0 f1177E;

    /* JADX INFO: renamed from: F */
    public int f1178F;

    /* JADX INFO: renamed from: w */
    public C0273a f1179w;

    /* JADX INFO: renamed from: x */
    public boolean f1180x;

    /* JADX INFO: renamed from: y */
    public boolean f1181y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f1182z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0335y(C0274a0 c0274a0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1177E = c0274a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1182z = obj;
        this.f1178F |= Integer.MIN_VALUE;
        return C0274a0.m812e(this.f1177E, null, null, null, false, false, this);
    }
}
