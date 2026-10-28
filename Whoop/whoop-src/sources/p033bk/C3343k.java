package p033bk;

import java.util.Iterator;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bk.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C3343k extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f12977E;

    /* JADX INFO: renamed from: w */
    public C3346n f12978w;

    /* JADX INFO: renamed from: x */
    public Iterator f12979x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f12980y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3346n f12981z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3343k(C3346n c3346n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12981z = c3346n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12980y = obj;
        this.f12977E |= Integer.MIN_VALUE;
        return this.f12981z.m9655f(this);
    }
}
