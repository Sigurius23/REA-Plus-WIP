package p605x6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: x6.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C38003h extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public String f162794w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f162795x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38006k f162796y;

    /* JADX INFO: renamed from: z */
    public int f162797z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38003h(C38006k c38006k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f162796y = c38006k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f162795x = obj;
        this.f162797z |= Integer.MIN_VALUE;
        return this.f162796y.m121739a(null, null, this);
    }
}
