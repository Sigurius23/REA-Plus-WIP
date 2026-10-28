package d33;

import e33.C12659u;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.f1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11596f1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f37403E;

    /* JADX INFO: renamed from: w */
    public C11602h1 f37404w;

    /* JADX INFO: renamed from: x */
    public C12659u f37405x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f37406y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11602h1 f37407z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11596f1(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37407z = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37406y = obj;
        this.f37403E |= Integer.MIN_VALUE;
        return this.f37407z.m31032J(this);
    }
}
