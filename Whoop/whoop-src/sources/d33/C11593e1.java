package d33;

import e33.C12659u;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.e1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11593e1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f37391E;

    /* JADX INFO: renamed from: w */
    public C11602h1 f37392w;

    /* JADX INFO: renamed from: x */
    public C12659u f37393x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f37394y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11602h1 f37395z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11593e1(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37395z = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37394y = obj;
        this.f37391E |= Integer.MIN_VALUE;
        return this.f37395z.m31031I(this);
    }
}
