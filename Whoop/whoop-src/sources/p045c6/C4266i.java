package p045c6;

import ne3.C26617h0;
import ne3.C26646z;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: c6.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C4266i extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C4267j f17336E;

    /* JADX INFO: renamed from: F */
    public int f17337F;

    /* JADX INFO: renamed from: w */
    public C26646z f17338w;

    /* JADX INFO: renamed from: x */
    public C26646z f17339x;

    /* JADX INFO: renamed from: y */
    public C26617h0 f17340y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f17341z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4266i(C4267j c4267j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f17336E = c4267j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f17341z = obj;
        this.f17337F |= Integer.MIN_VALUE;
        return this.f17336E.mo1120d(null, this);
    }
}
