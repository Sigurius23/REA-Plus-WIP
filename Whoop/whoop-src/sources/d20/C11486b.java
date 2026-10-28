package d20;

import p664yy.C39857f;
import q30.AbstractC29894a0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C11486b extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f36928E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C11487c f36929F;

    /* JADX INFO: renamed from: G */
    public int f36930G;

    /* JADX INFO: renamed from: w */
    public C11487c f36931w;

    /* JADX INFO: renamed from: x */
    public AbstractC29894a0 f36932x;

    /* JADX INFO: renamed from: y */
    public C39857f f36933y;

    /* JADX INFO: renamed from: z */
    public int f36934z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11486b(C11487c c11487c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f36929F = c11487c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f36928E = obj;
        this.f36930G |= Integer.MIN_VALUE;
        return this.f36929F.m30908b(null, null, 0, null, this);
    }
}
