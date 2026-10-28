package p033bk;

import java.util.Iterator;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bk.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C3342j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f12972E;

    /* JADX INFO: renamed from: w */
    public C3346n f12973w;

    /* JADX INFO: renamed from: x */
    public Iterator f12974x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f12975y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3346n f12976z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3342j(C3346n c3346n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12976z = c3346n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12975y = obj;
        this.f12972E |= Integer.MIN_VALUE;
        return this.f12976z.m9654e(this);
    }
}
