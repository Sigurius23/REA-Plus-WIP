package p203hy;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: hy.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C17712a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C17714c f68848w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f68849x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C17714c f68850y;

    /* JADX INFO: renamed from: z */
    public int f68851z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17712a(C17714c c17714c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f68850y = c17714c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f68849x = obj;
        this.f68851z |= Integer.MIN_VALUE;
        return this.f68850y.m50709b(null, null, this);
    }
}
