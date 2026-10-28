package sh;

import mc3.C25443i;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: sh.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C32478d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f134494E;

    /* JADX INFO: renamed from: w */
    public Object f134495w;

    /* JADX INFO: renamed from: x */
    public C25443i f134496x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f134497y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C32479e f134498z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32478d(C32479e c32479e, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f134498z = c32479e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f134497y = obj;
        this.f134494E |= Integer.MIN_VALUE;
        return this.f134498z.mo71006a(this);
    }
}
