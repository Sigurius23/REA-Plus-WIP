package d20;

import p664yy.C39857f;
import q30.AbstractC29894a0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C11485a extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public /* synthetic */ Object f36921E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C11487c f36922F;

    /* JADX INFO: renamed from: G */
    public int f36923G;

    /* JADX INFO: renamed from: w */
    public C11487c f36924w;

    /* JADX INFO: renamed from: x */
    public AbstractC29894a0 f36925x;

    /* JADX INFO: renamed from: y */
    public C39857f f36926y;

    /* JADX INFO: renamed from: z */
    public int f36927z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11485a(C11487c c11487c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f36922F = c11487c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f36921E = obj;
        this.f36923G |= Integer.MIN_VALUE;
        return this.f36922F.m30907a(null, null, 0, this);
    }
}
