package n00;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: n00.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C26078f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C26083k f103273w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f103274x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26083k f103275y;

    /* JADX INFO: renamed from: z */
    public int f103276z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26078f(C26083k c26083k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103275y = c26083k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103274x = obj;
        this.f103276z |= Integer.MIN_VALUE;
        return C26083k.m77571g(this.f103275y, null, this);
    }
}
