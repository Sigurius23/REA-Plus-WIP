package d33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C11638y extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f37590E;

    /* JADX INFO: renamed from: w */
    public C11602h1 f37591w;

    /* JADX INFO: renamed from: x */
    public String f37592x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f37593y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11602h1 f37594z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11638y(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37594z = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37593y = obj;
        this.f37590E |= Integer.MIN_VALUE;
        return C11602h1.m31015a(this.f37594z, this);
    }
}
