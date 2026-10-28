package d20;

import a30.C0332w0;
import s83.AbstractC32269c;
import y00.C38841g7;

/* JADX INFO: renamed from: d20.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C11498n extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f36970E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C11502r f36971F;

    /* JADX INFO: renamed from: G */
    public int f36972G;

    /* JADX INFO: renamed from: w */
    public C11502r f36973w;

    /* JADX INFO: renamed from: x */
    public C38841g7 f36974x;

    /* JADX INFO: renamed from: y */
    public C0332w0 f36975y;

    /* JADX INFO: renamed from: z */
    public int f36976z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11498n(C11502r c11502r, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f36971F = c11502r;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f36970E = obj;
        this.f36972G |= Integer.MIN_VALUE;
        return this.f36971F.m30909g(null, this);
    }
}
