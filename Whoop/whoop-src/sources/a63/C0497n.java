package a63;

import f63.AbstractC14155c;
import java.util.Iterator;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a63.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C0497n extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f1674E;

    /* JADX INFO: renamed from: w */
    public AbstractC14155c f1675w;

    /* JADX INFO: renamed from: x */
    public Iterator f1676x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f1677y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0498o f1678z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0497n(C0498o c0498o, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1678z = c0498o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1677y = obj;
        this.f1674E |= Integer.MIN_VALUE;
        return C0498o.m1206b(this.f1678z, null, this);
    }
}
