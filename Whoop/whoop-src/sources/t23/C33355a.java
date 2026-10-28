package t23;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: t23.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C33355a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f139174E;

    /* JADX INFO: renamed from: w */
    public C33384f f139175w;

    /* JADX INFO: renamed from: x */
    public long f139176x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f139177y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C33384f f139178z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33355a(C33384f c33384f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139178z = c33384f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139177y = obj;
        this.f139174E |= Integer.MIN_VALUE;
        return C33384f.m105841a(this.f139178z, null, this);
    }
}
