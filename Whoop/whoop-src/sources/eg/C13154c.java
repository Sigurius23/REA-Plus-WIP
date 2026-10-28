package eg;

import gg.AbstractC15818e;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: eg.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C13154c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f45568E;

    /* JADX INFO: renamed from: w */
    public int f45569w;

    /* JADX INFO: renamed from: x */
    public AbstractC15818e f45570x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f45571y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C13157f f45572z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13154c(C13157f c13157f, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f45572z = c13157f;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45571y = obj;
        this.f45568E |= Integer.MIN_VALUE;
        return this.f45572z.mo36841a(0, null, this);
    }
}
