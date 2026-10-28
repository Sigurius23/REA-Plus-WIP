package n00;

import p599wz.C37737m1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n00.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C26079g extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C26083k f103277E;

    /* JADX INFO: renamed from: F */
    public int f103278F;

    /* JADX INFO: renamed from: w */
    public C26083k f103279w;

    /* JADX INFO: renamed from: x */
    public C37737m1 f103280x;

    /* JADX INFO: renamed from: y */
    public boolean f103281y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f103282z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26079g(C26083k c26083k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f103277E = c26083k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103282z = obj;
        this.f103278F |= Integer.MIN_VALUE;
        return C26083k.m77572j(this.f103277E, this);
    }
}
